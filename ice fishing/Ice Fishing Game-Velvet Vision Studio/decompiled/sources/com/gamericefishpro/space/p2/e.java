package com.gamericefishpro.space.p2;

import com.gamericefishpro.space.t.m;
import com.gamericefishpro.space.t.w;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final w a;
    public d b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public e() {
        w wVar = m.a;
        this.a = new w();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(d dVar, long j, long j2, float[] fArr, long j3) {
        long j4 = dVar.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            dVar.g = j3;
            dVar.a(dVar.e, dVar.f, j, j2, fArr);
        }
    }
}
