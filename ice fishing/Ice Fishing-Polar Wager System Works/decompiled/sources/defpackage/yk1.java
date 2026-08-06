package defpackage;

/* loaded from: classes.dex */
public final class yk1 extends defpackage.zk1 {
    @Override // defpackage.zk1
    public final void DFo87pBq1E5(java.lang.Object obj, long j, float f) {
        this.IHQe1A4L2xu.putFloat(obj, j, f);
    }

    @Override // defpackage.zk1
    public final double F7NU4MC0GW(long j, java.lang.Object obj) {
        return this.IHQe1A4L2xu.getDouble(obj, j);
    }

    @Override // defpackage.zk1
    public final boolean G3OKOH3wZRC() {
        if (!super.G3OKOH3wZRC()) {
            return false;
        }
        try {
            java.lang.Class<?> cls = this.IHQe1A4L2xu.getClass();
            java.lang.Class cls2 = java.lang.Long.TYPE;
            cls.getMethod("getByte", java.lang.Object.class, cls2);
            cls.getMethod("putByte", java.lang.Object.class, cls2, java.lang.Byte.TYPE);
            cls.getMethod("getBoolean", java.lang.Object.class, cls2);
            cls.getMethod("putBoolean", java.lang.Object.class, cls2, java.lang.Boolean.TYPE);
            cls.getMethod("getFloat", java.lang.Object.class, cls2);
            cls.getMethod("putFloat", java.lang.Object.class, cls2, java.lang.Float.TYPE);
            cls.getMethod("getDouble", java.lang.Object.class, cls2);
            cls.getMethod("putDouble", java.lang.Object.class, cls2, java.lang.Double.TYPE);
            return true;
        } catch (java.lang.Throwable th) {
            defpackage.al1.IHQe1A4L2xu(th);
            return false;
        }
    }

    @Override // defpackage.zk1
    public final void JlrlGoKF(java.lang.Object obj, long j, double d) {
        this.IHQe1A4L2xu.putDouble(obj, j, d);
    }

    @Override // defpackage.zk1
    public final void SH1y5HwkJhh(java.lang.Object obj, long j, boolean z) {
        this.IHQe1A4L2xu.putBoolean(obj, j, z);
    }

    @Override // defpackage.zk1
    public final float adDC3e2L(long j, java.lang.Object obj) {
        return this.IHQe1A4L2xu.getFloat(obj, j);
    }

    @Override // defpackage.zk1
    public final void ez2rX8ReCYw(java.lang.Object obj, long j, byte b) {
        this.IHQe1A4L2xu.putByte(obj, j, b);
    }

    @Override // defpackage.zk1
    public final boolean kd6TUFXn() {
        sun.misc.Unsafe unsafe = this.IHQe1A4L2xu;
        if (unsafe != null) {
            try {
                java.lang.Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                java.lang.Class cls2 = java.lang.Long.TYPE;
                cls.getMethod("getLong", java.lang.Object.class, cls2);
                if (defpackage.al1.AARZUJiTa() != null) {
                    try {
                        java.lang.Class<?> cls3 = this.IHQe1A4L2xu.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, java.lang.Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, java.lang.Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", java.lang.Object.class, cls2, java.lang.Object.class, cls2, cls2);
                        return true;
                    } catch (java.lang.Throwable th) {
                        defpackage.al1.IHQe1A4L2xu(th);
                        return false;
                    }
                }
            } catch (java.lang.Throwable th2) {
                defpackage.al1.IHQe1A4L2xu(th2);
            }
        }
        return false;
    }

    @Override // defpackage.zk1
    public final boolean r1MBDhnF(long j, java.lang.Object obj) {
        return this.IHQe1A4L2xu.getBoolean(obj, j);
    }
}
