package defpackage;

/* loaded from: classes.dex */
public abstract class zk1 {
    public final sun.misc.Unsafe IHQe1A4L2xu;

    public zk1(sun.misc.Unsafe unsafe) {
        this.IHQe1A4L2xu = unsafe;
    }

    public final long AARZUJiTa(long j, java.lang.Object obj) {
        return this.IHQe1A4L2xu.getLong(obj, j);
    }

    public abstract void DFo87pBq1E5(java.lang.Object obj, long j, float f);

    public final java.lang.Object EXtogiMhuM(long j, java.lang.Object obj) {
        return this.IHQe1A4L2xu.getObject(obj, j);
    }

    public abstract double F7NU4MC0GW(long j, java.lang.Object obj);

    public boolean G3OKOH3wZRC() {
        sun.misc.Unsafe unsafe = this.IHQe1A4L2xu;
        if (unsafe == null) {
            return false;
        }
        try {
            java.lang.Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", java.lang.Class.class);
            cls.getMethod("arrayIndexScale", java.lang.Class.class);
            java.lang.Class cls2 = java.lang.Long.TYPE;
            cls.getMethod("getInt", java.lang.Object.class, cls2);
            cls.getMethod("putInt", java.lang.Object.class, cls2, java.lang.Integer.TYPE);
            cls.getMethod("getLong", java.lang.Object.class, cls2);
            cls.getMethod("putLong", java.lang.Object.class, cls2, cls2);
            cls.getMethod("getObject", java.lang.Object.class, cls2);
            cls.getMethod("putObject", java.lang.Object.class, cls2, java.lang.Object.class);
            return true;
        } catch (java.lang.Throwable th) {
            defpackage.al1.IHQe1A4L2xu(th);
            return false;
        }
    }

    public final int IHQe1A4L2xu(java.lang.Class cls) {
        return this.IHQe1A4L2xu.arrayBaseOffset(cls);
    }

    public abstract void JlrlGoKF(java.lang.Object obj, long j, double d);

    public final void QoRHpC4k(java.lang.Object obj, long j, java.lang.Object obj2) {
        this.IHQe1A4L2xu.putObject(obj, j, obj2);
    }

    public abstract void SH1y5HwkJhh(java.lang.Object obj, long j, boolean z);

    public final void SyNS6RMn(java.lang.Object obj, long j, int i) {
        this.IHQe1A4L2xu.putInt(obj, j, i);
    }

    public abstract float adDC3e2L(long j, java.lang.Object obj);

    public final void cnag84Bm(java.lang.Object obj, long j, long j2) {
        this.IHQe1A4L2xu.putLong(obj, j, j2);
    }

    public abstract void ez2rX8ReCYw(java.lang.Object obj, long j, byte b);

    public abstract boolean kd6TUFXn();

    public final int oh6vYeIP(java.lang.Class cls) {
        return this.IHQe1A4L2xu.arrayIndexScale(cls);
    }

    public abstract boolean r1MBDhnF(long j, java.lang.Object obj);

    public final long riuEU0zW4(java.lang.reflect.Field field) {
        return this.IHQe1A4L2xu.objectFieldOffset(field);
    }

    public final int xiZrDbcSW0(long j, java.lang.Object obj) {
        return this.IHQe1A4L2xu.getInt(obj, j);
    }
}
