package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class sj1 {
    public static final int JhCgjQRTAOCT;
    public static final long WDYagTQQm9ns;
    public static final java.lang.String ZpBGe2uQfcn8;
    public static final int fWTAfUmVKrZq;
    public static final long giKS3J6vZuNy;
    public static final defpackage.jVUAPb5NnIYW oh71FJcDz6S2;

    static {
        java.lang.String str;
        int i = defpackage.xi1.ZpBGe2uQfcn8;
        try {
            str = java.lang.System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (java.lang.SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        ZpBGe2uQfcn8 = str;
        giKS3J6vZuNy = defpackage.m90.frSwwKIlbUhK("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = defpackage.xi1.ZpBGe2uQfcn8;
        if (i2 < 2) {
            i2 = 2;
        }
        fWTAfUmVKrZq = defpackage.m90.KrtOTfE6jiS2(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        JhCgjQRTAOCT = defpackage.m90.KrtOTfE6jiS2(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        WDYagTQQm9ns = java.util.concurrent.TimeUnit.SECONDS.toNanos(defpackage.m90.frSwwKIlbUhK("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        oh71FJcDz6S2 = defpackage.jVUAPb5NnIYW.EPEWHACkMcF1;
    }
}
