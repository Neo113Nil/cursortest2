package com.gamericefishpro.space.ni;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements TimeMark, Comparable {
    public static long a(long j) {
        f.a.getClass();
        long jA = f.a();
        d unit = d.NANOSECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j - 1)) == Long.MAX_VALUE ? b.f(com.gamericefishpro.space.wa.b.F(j)) : com.gamericefishpro.space.wa.b.M(jA, j, unit);
    }
}
