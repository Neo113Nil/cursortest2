package com.gamericefishpro.space.d0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.v {
    public f0 H;
    public float I;

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!com.gamericefishpro.space.c3.a.d(j) || this.H == f0.d) {
            iJ = com.gamericefishpro.space.c3.a.j(j);
            iH = com.gamericefishpro.space.c3.a.h(j);
        } else {
            int iRound = Math.round(com.gamericefishpro.space.c3.a.h(j) * this.I);
            int iJ2 = com.gamericefishpro.space.c3.a.j(j);
            iJ = com.gamericefishpro.space.c3.a.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!com.gamericefishpro.space.c3.a.c(j) || this.H == f0.e) {
            int i = com.gamericefishpro.space.c3.a.i(j);
            iG = com.gamericefishpro.space.c3.a.g(j);
            iG2 = i;
        } else {
            int iRound2 = Math.round(com.gamericefishpro.space.c3.a.g(j) * this.I);
            int i2 = com.gamericefishpro.space.c3.a.i(j);
            iG2 = com.gamericefishpro.space.c3.a.g(j);
            if (iRound2 < i2) {
                iRound2 = i2;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        com.gamericefishpro.space.f2.u0 u0VarE = k0Var.e(com.gamericefishpro.space.c3.b.a(iJ, iH, iG2, iG));
        return n0Var.y(u0VarE.d, u0VarE.e, com.gamericefishpro.space.ph.m0.c(), new k(u0VarE, 1));
    }
}
