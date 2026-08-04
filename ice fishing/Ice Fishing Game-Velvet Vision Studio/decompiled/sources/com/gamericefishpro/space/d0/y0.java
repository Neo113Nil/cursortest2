package com.gamericefishpro.space.d0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.v {
    public u0 H;

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        float fD = this.H.d(n0Var.getLayoutDirection());
        float fB = this.H.b();
        float fC = this.H.c(n0Var.getLayoutDirection());
        float fA = this.H.a();
        float f = 0;
        if (!((com.gamericefishpro.space.c3.f.a(fA, f) >= 0) & (com.gamericefishpro.space.c3.f.a(fD, f) >= 0) & (com.gamericefishpro.space.c3.f.a(fB, f) >= 0) & (com.gamericefishpro.space.c3.f.a(fC, f) >= 0))) {
            com.gamericefishpro.space.e0.a.a("Padding must be non-negative");
        }
        int iJ = n0Var.J(fD);
        int iJ2 = n0Var.J(fC) + iJ;
        int iJ3 = n0Var.J(fB);
        int iJ4 = n0Var.J(fA) + iJ3;
        com.gamericefishpro.space.f2.u0 u0VarE = k0Var.e(com.gamericefishpro.space.c3.b.h(-iJ2, -iJ4, j));
        return n0Var.y(com.gamericefishpro.space.c3.b.f(u0VarE.d + iJ2, j), com.gamericefishpro.space.c3.b.e(u0VarE.e + iJ4, j), com.gamericefishpro.space.ph.m0.c(), new x0(u0VarE, iJ, iJ3));
    }
}
