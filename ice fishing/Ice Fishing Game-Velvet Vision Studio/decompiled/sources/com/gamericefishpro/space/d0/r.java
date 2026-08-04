package com.gamericefishpro.space.d0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final com.gamericefishpro.space.t.h0 a = c(true);
    public static final com.gamericefishpro.space.t.h0 b = c(false);
    public static final q c = q.b;

    public static final void a(com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.t0.r rVar, int i) {
        int i2;
        rVar.b0(-211209833);
        if ((i & 6) == 0) {
            i2 = (rVar.f(mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (rVar.S(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(rVar.T);
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVar, rVar);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar.l();
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, c, com.gamericefishpro.space.h2.f.e);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF, com.gamericefishpro.space.h2.f.c);
            com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
            rVar.p(true);
        } else {
            rVar.V();
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new o(mVar, i);
        }
    }

    public static final void b(com.gamericefishpro.space.f2.t0 t0Var, com.gamericefishpro.space.f2.u0 u0Var, com.gamericefishpro.space.f2.k0 k0Var, com.gamericefishpro.space.c3.l lVar, int i, int i2, com.gamericefishpro.space.h1.e eVar) {
        com.gamericefishpro.space.h1.e eVar2;
        Object objI = k0Var.i();
        n nVar = objI instanceof n ? (n) objI : null;
        com.gamericefishpro.space.f2.t0.k(t0Var, u0Var, ((nVar == null || (eVar2 = nVar.H) == null) ? eVar : eVar2).a((((long) u0Var.d) << 32) | (((long) u0Var.e) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), lVar));
    }

    public static final com.gamericefishpro.space.t.h0 c(boolean z) {
        com.gamericefishpro.space.t.h0 h0Var = new com.gamericefishpro.space.t.h0(9);
        com.gamericefishpro.space.h1.e eVar = com.gamericefishpro.space.h1.b.d;
        h0Var.m(eVar, new u(eVar, z));
        com.gamericefishpro.space.h1.e eVar2 = com.gamericefishpro.space.h1.b.e;
        h0Var.m(eVar2, new u(eVar2, z));
        com.gamericefishpro.space.h1.e eVar3 = com.gamericefishpro.space.h1.b.i;
        h0Var.m(eVar3, new u(eVar3, z));
        com.gamericefishpro.space.h1.e eVar4 = com.gamericefishpro.space.h1.b.v;
        h0Var.m(eVar4, new u(eVar4, z));
        com.gamericefishpro.space.h1.e eVar5 = com.gamericefishpro.space.h1.b.w;
        h0Var.m(eVar5, new u(eVar5, z));
        com.gamericefishpro.space.h1.e eVar6 = com.gamericefishpro.space.h1.b.y;
        h0Var.m(eVar6, new u(eVar6, z));
        com.gamericefishpro.space.h1.e eVar7 = com.gamericefishpro.space.h1.b.z;
        h0Var.m(eVar7, new u(eVar7, z));
        com.gamericefishpro.space.h1.e eVar8 = com.gamericefishpro.space.h1.b.A;
        h0Var.m(eVar8, new u(eVar8, z));
        com.gamericefishpro.space.h1.e eVar9 = com.gamericefishpro.space.h1.b.B;
        h0Var.m(eVar9, new u(eVar9, z));
        return h0Var;
    }

    public static final com.gamericefishpro.space.f2.l0 d(com.gamericefishpro.space.h1.e eVar, boolean z) {
        com.gamericefishpro.space.f2.l0 l0Var = (com.gamericefishpro.space.f2.l0) (z ? a : b).g(eVar);
        return l0Var == null ? new u(eVar, z) : l0Var;
    }
}
