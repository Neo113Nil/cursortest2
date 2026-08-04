package com.gamericefishpro.space.p2;

import com.gamericefishpro.space.oh.w;
import com.gamericefishpro.space.oh.x;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final long a;
    public static final long b;
    public static final long c;

    static {
        w wVar = x.d;
        a = (((long) 1023) << 50) ^ (-1);
        b = (-1) ^ (((long) 33554431) << 25);
        long j = 33554431;
        c = j | (((long) Math.min(0, 1023)) << 50) | (j << 25);
    }
}
