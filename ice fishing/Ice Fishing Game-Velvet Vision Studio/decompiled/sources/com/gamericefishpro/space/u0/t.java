package com.gamericefishpro.space.u0;

import com.gamericefishpro.space.t0.e2;
import com.gamericefishpro.space.t0.h2;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends j0 {
    public static final t c = new t(0, 3, 1);

    @Override // com.gamericefishpro.space.u0.j0
    public final void a(com.gamericefishpro.space.d4.z zVar, com.gamericefishpro.space.t0.c cVar, h2 h2Var, com.gamericefishpro.space.u6.q qVar, k0 k0Var) {
        com.gamericefishpro.space.u6.c cVar2;
        e2 e2Var = (e2) zVar.d(1);
        com.gamericefishpro.space.t0.a aVar = (com.gamericefishpro.space.t0.a) zVar.d(0);
        c cVar3 = (c) zVar.d(2);
        h2 h2VarF = e2Var.f();
        if (k0Var != null) {
            try {
                cVar2 = new com.gamericefishpro.space.u6.c(k0Var, h2Var);
            } catch (Throwable th) {
                h2VarF.e(false);
                throw th;
            }
        } else {
            cVar2 = null;
        }
        if (!cVar3.d.u0()) {
            com.gamericefishpro.space.t0.s.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar3.c.t0(cVar, h2VarF, qVar, cVar2);
        Unit unit = Unit.a;
        h2VarF.e(true);
        h2Var.d();
        aVar.getClass();
        h2Var.A(e2Var, e2Var.b(aVar));
        h2Var.k();
    }
}
