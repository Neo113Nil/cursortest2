package com.gamericefishpro.space.d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {
    public static final d1 a = new d1(h.a, com.gamericefishpro.space.h1.b.C);

    public static final d1 a(d dVar, com.gamericefishpro.space.h1.d dVar2, com.gamericefishpro.space.t0.r rVar, int i) {
        if (Intrinsics.a(dVar, h.a) && dVar2.equals(com.gamericefishpro.space.h1.b.C)) {
            rVar.a0(-1073830487);
            rVar.p(false);
            return a;
        }
        rVar.a0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && rVar.f(dVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !rVar.f(dVar2)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objP = rVar.P();
        if (z3 || objP == com.gamericefishpro.space.t0.n.a) {
            objP = new d1(dVar, dVar2);
            rVar.k0(objP);
        }
        d1 d1Var = (d1) objP;
        rVar.p(false);
        return d1Var;
    }
}
