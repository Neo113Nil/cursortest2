package com.gamericefishpro.space.wi;

import com.gamericefishpro.space.ui.s;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final g f;

    static {
        String property;
        int i = s.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = com.gamericefishpro.space.ui.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = s.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = com.gamericefishpro.space.ui.a.k("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        d = com.gamericefishpro.space.ui.a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(com.gamericefishpro.space.ui.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = g.a;
    }
}
