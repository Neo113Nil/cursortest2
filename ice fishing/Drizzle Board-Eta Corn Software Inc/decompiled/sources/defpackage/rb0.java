package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class rb0 {
    public static final int MdtA4re8;
    public static final long NCTxEWno;
    public static final re P7K7Inc8;
    public static final long VgvYg0wo;
    public static final String qoPGr6Ce;
    public static final int wxUZMvaN;

    static {
        String str;
        int i = eb0.qoPGr6Ce;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        qoPGr6Ce = str;
        NCTxEWno = g50.eVhOlqcC("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = eb0.qoPGr6Ce;
        if (i2 < 2) {
            i2 = 2;
        }
        MdtA4re8 = g50.k3x7lurq("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        wxUZMvaN = g50.k3x7lurq("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        VgvYg0wo = TimeUnit.SECONDS.toNanos(g50.eVhOlqcC("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        P7K7Inc8 = re.P7K7Inc8;
    }
}
