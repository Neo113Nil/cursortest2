package com.gamericefishpro.space.u0;

import com.gamericefishpro.space.t0.h2;
import com.gamericefishpro.space.t0.p1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends j0 {
    public static final d0 c = new d0(0, 1, 1);

    @Override // com.gamericefishpro.space.u0.j0
    public final void a(com.gamericefishpro.space.d4.z zVar, com.gamericefishpro.space.t0.c cVar, h2 h2Var, com.gamericefishpro.space.u6.q qVar, k0 k0Var) {
        p1 p1Var = (p1) zVar.d(0);
        com.gamericefishpro.space.t.h0 h0Var = (com.gamericefishpro.space.t.h0) qVar.i;
        com.gamericefishpro.space.b1.j jVar = h0Var != null ? (com.gamericefishpro.space.b1.j) h0Var.g(p1Var) : null;
        if (jVar != null) {
            ArrayList arrayList = (ArrayList) qVar.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                qVar.j = arrayList;
            }
            arrayList.add((com.gamericefishpro.space.v0.e) qVar.e);
            qVar.e = jVar.e;
        }
    }
}
