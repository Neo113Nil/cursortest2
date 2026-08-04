package com.gamericefishpro.space.u0;

import com.gamericefishpro.space.t0.h2;
import com.gamericefishpro.space.t0.y1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j0 {
    public static final e c = new e(0, 2, 1);

    @Override // com.gamericefishpro.space.u0.j0
    public final void a(com.gamericefishpro.space.d4.z zVar, com.gamericefishpro.space.t0.c cVar, h2 h2Var, com.gamericefishpro.space.u6.q qVar, k0 k0Var) {
        com.gamericefishpro.space.t0.a aVar = (com.gamericefishpro.space.t0.a) zVar.d(0);
        Object objD = zVar.d(1);
        if (objD instanceof y1) {
            y1 y1Var = (y1) objD;
            ((com.gamericefishpro.space.v0.e) qVar.e).b(y1Var);
            ((com.gamericefishpro.space.t.i0) qVar.d).a(y1Var);
        }
        if (h2Var.n != 0) {
            com.gamericefishpro.space.t0.s.a("Can only append a slot if not current inserting");
        }
        int i = h2Var.i;
        int i2 = h2Var.j;
        int iC = h2Var.c(aVar);
        int iG = h2Var.g(h2Var.b, h2Var.r(iC + 1));
        h2Var.i = iG;
        h2Var.j = iG;
        h2Var.x(1, iC);
        if (i >= iG) {
            i++;
            i2++;
        }
        h2Var.c[iG] = objD;
        h2Var.i = i;
        h2Var.j = i2;
    }
}
