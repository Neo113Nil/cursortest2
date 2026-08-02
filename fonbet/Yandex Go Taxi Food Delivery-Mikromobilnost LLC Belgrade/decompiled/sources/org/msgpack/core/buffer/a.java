package org.msgpack.core.buffer;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DirectBufferAccess$DirectBufferConstructorType.values().length];
        a = iArr;
        try {
            iArr[DirectBufferAccess$DirectBufferConstructorType.ARGS_LONG_INT_REF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[DirectBufferAccess$DirectBufferConstructorType.ARGS_LONG_INT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[DirectBufferAccess$DirectBufferConstructorType.ARGS_INT_INT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[DirectBufferAccess$DirectBufferConstructorType.ARGS_MB_INT_INT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
