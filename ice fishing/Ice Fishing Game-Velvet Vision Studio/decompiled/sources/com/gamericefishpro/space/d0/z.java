package com.gamericefishpro.space.d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final b0 a = new b0(h.b, com.gamericefishpro.space.h1.b.F);

    public static final b0 a(g gVar, com.gamericefishpro.space.h1.c cVar, com.gamericefishpro.space.t0.r rVar, int i) {
        if (Intrinsics.a(gVar, h.b) && cVar.equals(com.gamericefishpro.space.h1.b.F)) {
            rVar.a0(-1446604504);
            rVar.p(false);
            return a;
        }
        rVar.a0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && rVar.f(gVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !rVar.f(cVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objP = rVar.P();
        if (z3 || objP == com.gamericefishpro.space.t0.n.a) {
            objP = new b0(gVar, cVar);
            rVar.k0(objP);
        }
        b0 b0Var = (b0) objP;
        rVar.p(false);
        return b0Var;
    }
}
