package defpackage;

/* loaded from: classes.dex */
public abstract class bf1 {
    public static final int F7NU4MC0GW;
    public static final java.lang.String IHQe1A4L2xu;
    public static final long adDC3e2L;
    public static final long oh6vYeIP;
    public static final int r1MBDhnF;
    public static final defpackage.n xiZrDbcSW0;

    static {
        java.lang.String str;
        int i = defpackage.oe1.IHQe1A4L2xu;
        try {
            str = java.lang.System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (java.lang.SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        IHQe1A4L2xu = str;
        oh6vYeIP = defpackage.x80.lpprD5VAS("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = defpackage.oe1.IHQe1A4L2xu;
        if (i2 < 2) {
            i2 = 2;
        }
        r1MBDhnF = defpackage.x80.hkbnNdmy(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        F7NU4MC0GW = defpackage.x80.hkbnNdmy(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        adDC3e2L = java.util.concurrent.TimeUnit.SECONDS.toNanos(defpackage.x80.lpprD5VAS("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        xiZrDbcSW0 = defpackage.n.WLpAkxCo;
    }
}
