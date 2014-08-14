package com.github.zxh.classpy.classfile;

/**
 *
 * @author zxh
 */
public class U4 extends ClassComponent {

    private int value;

    public int getValue() {
        return value;
    }
    
    @Override
    protected void readContent(ClassReader reader) {
        value = reader.getByteBuffer().getInt();
        setDesc(String.valueOf(value));
    }
    
    public void useHexDesc() {
        setDesc("0x" + Integer.toHexString(value).toUpperCase());
    }
    
}
