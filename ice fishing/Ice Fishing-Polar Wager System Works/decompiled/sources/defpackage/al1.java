package defpackage;

/* loaded from: classes.dex */
public abstract class al1 {
    public static final boolean AARZUJiTa;
    public static final boolean F7NU4MC0GW;
    public static final sun.misc.Unsafe IHQe1A4L2xu;
    public static final boolean adDC3e2L;
    public static final java.lang.Class oh6vYeIP;
    public static final defpackage.zk1 r1MBDhnF;
    public static final long xiZrDbcSW0;

    static {
        sun.misc.Unsafe riuEU0zW4 = riuEU0zW4();
        IHQe1A4L2xu = riuEU0zW4;
        oh6vYeIP = defpackage.v.IHQe1A4L2xu;
        boolean EXtogiMhuM = EXtogiMhuM(java.lang.Long.TYPE);
        boolean EXtogiMhuM2 = EXtogiMhuM(java.lang.Integer.TYPE);
        char c = 1;
        int i = 0;
        defpackage.zk1 zk1Var = null;
        if (riuEU0zW4 != null) {
            if (!defpackage.v.IHQe1A4L2xu()) {
                zk1Var = new defpackage.yk1(riuEU0zW4);
            } else if (EXtogiMhuM) {
                zk1Var = new defpackage.xk1(riuEU0zW4, c == true ? 1 : 0);
            } else if (EXtogiMhuM2) {
                zk1Var = new defpackage.xk1(riuEU0zW4, i);
            }
        }
        r1MBDhnF = zk1Var;
        F7NU4MC0GW = zk1Var == null ? false : zk1Var.kd6TUFXn();
        adDC3e2L = zk1Var == null ? false : zk1Var.G3OKOH3wZRC();
        xiZrDbcSW0 = adDC3e2L(byte[].class);
        adDC3e2L(boolean[].class);
        xiZrDbcSW0(boolean[].class);
        adDC3e2L(int[].class);
        xiZrDbcSW0(int[].class);
        adDC3e2L(long[].class);
        xiZrDbcSW0(long[].class);
        adDC3e2L(float[].class);
        xiZrDbcSW0(float[].class);
        adDC3e2L(double[].class);
        xiZrDbcSW0(double[].class);
        adDC3e2L(java.lang.Object[].class);
        xiZrDbcSW0(java.lang.Object[].class);
        java.lang.reflect.Field AARZUJiTa2 = AARZUJiTa();
        if (AARZUJiTa2 != null && zk1Var != null) {
            zk1Var.riuEU0zW4(AARZUJiTa2);
        }
        AARZUJiTa = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    public static java.lang.reflect.Field AARZUJiTa() {
        java.lang.reflect.Field field;
        java.lang.reflect.Field field2;
        if (defpackage.v.IHQe1A4L2xu()) {
            try {
                field2 = java.nio.Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (java.lang.Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = java.nio.Buffer.class.getDeclaredField("address");
        } catch (java.lang.Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return field;
    }

    public static void DFo87pBq1E5(java.lang.Object obj, long j, int i) {
        r1MBDhnF.SyNS6RMn(obj, j, i);
    }

    public static boolean EXtogiMhuM(java.lang.Class cls) {
        if (!defpackage.v.IHQe1A4L2xu()) {
            return false;
        }
        try {
            java.lang.Class cls2 = oh6vYeIP;
            java.lang.Class cls3 = java.lang.Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, cls3);
            java.lang.Class cls4 = java.lang.Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static java.lang.Object F7NU4MC0GW(java.lang.Class cls) {
        try {
            return IHQe1A4L2xu.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public static void IHQe1A4L2xu(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(defpackage.al1.class.getName()).log(java.util.logging.Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void JlrlGoKF(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        DFo87pBq1E5(obj, j2, ((255 & b) << i) | (r1MBDhnF.xiZrDbcSW0(j2, obj) & (~(255 << i))));
    }

    public static void SH1y5HwkJhh(byte[] bArr, long j, byte b) {
        r1MBDhnF.ez2rX8ReCYw(bArr, xiZrDbcSW0 + j, b);
    }

    public static void SyNS6RMn(java.lang.Object obj, long j, long j2) {
        r1MBDhnF.cnag84Bm(obj, j, j2);
    }

    public static int adDC3e2L(java.lang.Class cls) {
        if (adDC3e2L) {
            return r1MBDhnF.IHQe1A4L2xu(cls);
        }
        return -1;
    }

    public static void cnag84Bm(java.lang.Object obj, long j, java.lang.Object obj2) {
        r1MBDhnF.QoRHpC4k(obj, j, obj2);
    }

    public static void ez2rX8ReCYw(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int xiZrDbcSW02 = r1MBDhnF.xiZrDbcSW0(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        DFo87pBq1E5(obj, j2, ((255 & b) << i) | (xiZrDbcSW02 & (~(255 << i))));
    }

    public static boolean oh6vYeIP(long j, java.lang.Object obj) {
        return ((byte) ((r1MBDhnF.xiZrDbcSW0((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean r1MBDhnF(long j, java.lang.Object obj) {
        return ((byte) ((r1MBDhnF.xiZrDbcSW0((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static sun.misc.Unsafe riuEU0zW4() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new defpackage.wk1());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static void xiZrDbcSW0(java.lang.Class cls) {
        if (adDC3e2L) {
            r1MBDhnF.oh6vYeIP(cls);
        }
    }
}
