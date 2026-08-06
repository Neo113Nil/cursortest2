package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class uc1 extends vc1 {
    @Override // defpackage.vc1
    public final void E7jCp8Ls(Object obj, long j, double d) {
        this.GWasM1elztuh.putDouble(obj, j, d);
    }

    @Override // defpackage.vc1
    public final void JFJ3QoxA(Object obj, long j, boolean z) {
        this.GWasM1elztuh.putBoolean(obj, j, z);
    }

    @Override // defpackage.vc1
    public final boolean Mjvvu5DE() {
        Unsafe unsafe = this.GWasM1elztuh;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (wc1.AvO7iQsrTN() != null) {
                    try {
                        Class<?> cls3 = this.GWasM1elztuh.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        wc1.GWasM1elztuh(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                wc1.GWasM1elztuh(th2);
            }
        }
        return false;
    }

    @Override // defpackage.vc1
    public final float OOA6hdeuvCS(long j, Object obj) {
        return this.GWasM1elztuh.getFloat(obj, j);
    }

    @Override // defpackage.vc1
    public final boolean X1lG3V04pd(long j, Object obj) {
        return this.GWasM1elztuh.getBoolean(obj, j);
    }

    @Override // defpackage.vc1
    public final void XnEVoBF0td1l(Object obj, long j, float f) {
        this.GWasM1elztuh.putFloat(obj, j, f);
    }

    @Override // defpackage.vc1
    public final boolean YmKjaVtbfp5Z() {
        if (!super.YmKjaVtbfp5Z()) {
            return false;
        }
        try {
            Class<?> cls = this.GWasM1elztuh.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            wc1.GWasM1elztuh(th);
            return false;
        }
    }

    @Override // defpackage.vc1
    public final void rQPn8YBR(Object obj, long j, byte b) {
        this.GWasM1elztuh.putByte(obj, j, b);
    }

    @Override // defpackage.vc1
    public final double xqGvceK5x(long j, Object obj) {
        return this.GWasM1elztuh.getDouble(obj, j);
    }
}
