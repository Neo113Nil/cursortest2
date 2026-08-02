package org.msgpack.core.buffer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class DirectBufferAccess$DirectBufferConstructorType {
    private static final /* synthetic */ DirectBufferAccess$DirectBufferConstructorType[] $VALUES;
    public static final DirectBufferAccess$DirectBufferConstructorType ARGS_INT_INT;
    public static final DirectBufferAccess$DirectBufferConstructorType ARGS_LONG_INT;
    public static final DirectBufferAccess$DirectBufferConstructorType ARGS_LONG_INT_REF;
    public static final DirectBufferAccess$DirectBufferConstructorType ARGS_MB_INT_INT;

    static {
        DirectBufferAccess$DirectBufferConstructorType directBufferAccess$DirectBufferConstructorType = new DirectBufferAccess$DirectBufferConstructorType("ARGS_LONG_INT_REF", 0);
        ARGS_LONG_INT_REF = directBufferAccess$DirectBufferConstructorType;
        DirectBufferAccess$DirectBufferConstructorType directBufferAccess$DirectBufferConstructorType2 = new DirectBufferAccess$DirectBufferConstructorType("ARGS_LONG_INT", 1);
        ARGS_LONG_INT = directBufferAccess$DirectBufferConstructorType2;
        DirectBufferAccess$DirectBufferConstructorType directBufferAccess$DirectBufferConstructorType3 = new DirectBufferAccess$DirectBufferConstructorType("ARGS_INT_INT", 2);
        ARGS_INT_INT = directBufferAccess$DirectBufferConstructorType3;
        DirectBufferAccess$DirectBufferConstructorType directBufferAccess$DirectBufferConstructorType4 = new DirectBufferAccess$DirectBufferConstructorType("ARGS_MB_INT_INT", 3);
        ARGS_MB_INT_INT = directBufferAccess$DirectBufferConstructorType4;
        $VALUES = new DirectBufferAccess$DirectBufferConstructorType[]{directBufferAccess$DirectBufferConstructorType, directBufferAccess$DirectBufferConstructorType2, directBufferAccess$DirectBufferConstructorType3, directBufferAccess$DirectBufferConstructorType4};
    }

    public static DirectBufferAccess$DirectBufferConstructorType valueOf(String str) {
        return (DirectBufferAccess$DirectBufferConstructorType) Enum.valueOf(DirectBufferAccess$DirectBufferConstructorType.class, str);
    }

    public static DirectBufferAccess$DirectBufferConstructorType[] values() {
        return (DirectBufferAccess$DirectBufferConstructorType[]) $VALUES.clone();
    }
}
