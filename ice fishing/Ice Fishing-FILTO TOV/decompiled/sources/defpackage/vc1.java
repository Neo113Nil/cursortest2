package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class vc1 {
    public final Unsafe GWasM1elztuh;

    public vc1(Unsafe unsafe) {
        this.GWasM1elztuh = unsafe;
    }

    public final long AvO7iQsrTN(long j, Object obj) {
        return this.GWasM1elztuh.getLong(obj, j);
    }

    public abstract void E7jCp8Ls(Object obj, long j, double d);

    public final int EljAMC1QTz(long j, Object obj) {
        return this.GWasM1elztuh.getInt(obj, j);
    }

    public final int GWasM1elztuh(Class cls) {
        return this.GWasM1elztuh.arrayBaseOffset(cls);
    }

    public abstract void JFJ3QoxA(Object obj, long j, boolean z);

    public abstract boolean Mjvvu5DE();

    public abstract float OOA6hdeuvCS(long j, Object obj);

    public final void WIEu4Ya2g8(Object obj, long j, Object obj2) {
        this.GWasM1elztuh.putObject(obj, j, obj2);
    }

    public abstract boolean X1lG3V04pd(long j, Object obj);

    public abstract void XnEVoBF0td1l(Object obj, long j, float f);

    public final int Yi7zF1RB1(Class cls) {
        return this.GWasM1elztuh.arrayIndexScale(cls);
    }

    public boolean YmKjaVtbfp5Z() {
        Unsafe unsafe = this.GWasM1elztuh;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            wc1.GWasM1elztuh(th);
            return false;
        }
    }

    public final Object encWxUiV2(long j, Object obj) {
        return this.GWasM1elztuh.getObject(obj, j);
    }

    public final void iwATDS1i01k(Object obj, long j, long j2) {
        this.GWasM1elztuh.putLong(obj, j, j2);
    }

    public final long mOu10nynGul(Field field) {
        return this.GWasM1elztuh.objectFieldOffset(field);
    }

    public abstract void rQPn8YBR(Object obj, long j, byte b);

    public final void uFEq9NpZ(Object obj, long j, int i) {
        this.GWasM1elztuh.putInt(obj, j, i);
    }

    public abstract double xqGvceK5x(long j, Object obj);
}
