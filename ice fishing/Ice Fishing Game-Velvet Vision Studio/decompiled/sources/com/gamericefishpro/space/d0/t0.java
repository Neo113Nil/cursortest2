package com.gamericefishpro.space.d0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.v {
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        int iJ = n0Var.J(this.J) + n0Var.J(this.H);
        int iJ2 = n0Var.J(this.K) + n0Var.J(this.I);
        com.gamericefishpro.space.f2.u0 u0VarE = k0Var.e(com.gamericefishpro.space.c3.b.h(-iJ, -iJ2, j));
        return n0Var.y(com.gamericefishpro.space.c3.b.f(u0VarE.d + iJ, j), com.gamericefishpro.space.c3.b.e(u0VarE.e + iJ2, j), com.gamericefishpro.space.ph.m0.c(), new q0(1, this, u0VarE));
    }
}
