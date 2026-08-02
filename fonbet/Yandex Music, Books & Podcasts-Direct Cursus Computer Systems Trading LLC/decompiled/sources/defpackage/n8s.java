package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class n8s {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final rwd f;

    static {
        String str;
        int i = f0s.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = hag.z("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = f0s.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = hag.A(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = hag.A(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(hag.z("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = rwd.f;
    }
}
