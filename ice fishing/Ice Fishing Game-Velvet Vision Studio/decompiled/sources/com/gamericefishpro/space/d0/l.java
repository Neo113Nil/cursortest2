package com.gamericefishpro.space.d0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.v {
    public float H;

    public final long A0(boolean z, long j) {
        int iRound;
        int iG = com.gamericefishpro.space.c3.a.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.H)) <= 0) {
            return 0L;
        }
        if (!z || j.g(iRound, iG, j)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long B0(boolean z, long j) {
        int iRound;
        int iH = com.gamericefishpro.space.c3.a.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.H)) <= 0) {
            return 0L;
        }
        if (!z || j.g(iH, iRound, j)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int C(com.gamericefishpro.space.h2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.H) : k0Var.f(i);
    }

    public final long C0(boolean z, long j) {
        int i = com.gamericefishpro.space.c3.a.i(j);
        int iRound = Math.round(i * this.H);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || j.g(iRound, i, j)) {
            return (((long) iRound) << 32) | (((long) i) & 4294967295L);
        }
        return 0L;
    }

    public final long D0(boolean z, long j) {
        int iJ = com.gamericefishpro.space.c3.a.j(j);
        int iRound = Math.round(iJ / this.H);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || j.g(iJ, iRound, j)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        long jB0 = B0(true, j);
        if (com.gamericefishpro.space.c3.k.a(jB0, 0L)) {
            jB0 = A0(true, j);
            if (com.gamericefishpro.space.c3.k.a(jB0, 0L)) {
                jB0 = D0(true, j);
                if (com.gamericefishpro.space.c3.k.a(jB0, 0L)) {
                    jB0 = C0(true, j);
                    if (com.gamericefishpro.space.c3.k.a(jB0, 0L)) {
                        jB0 = B0(false, j);
                        if (com.gamericefishpro.space.c3.k.a(jB0, 0L)) {
                            jB0 = A0(false, j);
                            if (com.gamericefishpro.space.c3.k.a(jB0, 0L)) {
                                jB0 = D0(false, j);
                                if (com.gamericefishpro.space.c3.k.a(jB0, 0L)) {
                                    jB0 = C0(false, j);
                                    if (com.gamericefishpro.space.c3.k.a(jB0, 0L)) {
                                        jB0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!com.gamericefishpro.space.c3.k.a(jB0, 0L)) {
            int i = (int) (jB0 >> 32);
            int i2 = (int) (jB0 & 4294967295L);
            if (!((i2 >= 0) & (i >= 0))) {
                com.gamericefishpro.space.c3.h.a("width and height must be >= 0");
            }
            j = com.gamericefishpro.space.c3.b.g(i, i, i2, i2);
        }
        com.gamericefishpro.space.f2.u0 u0VarE = k0Var.e(j);
        return n0Var.y(u0VarE.d, u0VarE.e, com.gamericefishpro.space.ph.m0.c(), new k(u0VarE, 0));
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int N(com.gamericefishpro.space.h2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.H) : k0Var.L(i);
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int Z(com.gamericefishpro.space.h2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.H) : k0Var.U(i);
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int k0(com.gamericefishpro.space.h2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.H) : k0Var.R(i);
    }
}
