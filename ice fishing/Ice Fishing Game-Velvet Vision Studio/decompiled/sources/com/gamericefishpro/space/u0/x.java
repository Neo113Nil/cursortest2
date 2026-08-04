package com.gamericefishpro.space.u0;

import com.gamericefishpro.space.t.p0;
import com.gamericefishpro.space.t0.h2;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.y1;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends j0 {
    public static final x c = new x(0, 1, 1);

    @Override // com.gamericefishpro.space.u0.j0
    public final void a(com.gamericefishpro.space.d4.z zVar, com.gamericefishpro.space.t0.c cVar, h2 h2Var, com.gamericefishpro.space.u6.q qVar, k0 k0Var) {
        p1 p1Var = (p1) zVar.d(0);
        Set set = (Set) qVar.a;
        if (set == null) {
            return;
        }
        com.gamericefishpro.space.b1.j jVar = new com.gamericefishpro.space.b1.j(set);
        com.gamericefishpro.space.t.h0 h0Var = (com.gamericefishpro.space.t.h0) qVar.i;
        if (h0Var == null) {
            long[] jArr = p0.a;
            h0Var = new com.gamericefishpro.space.t.h0();
            qVar.i = h0Var;
        }
        h0Var.m(p1Var, jVar);
        ((com.gamericefishpro.space.v0.e) qVar.e).b(new y1(jVar, -1));
    }
}
