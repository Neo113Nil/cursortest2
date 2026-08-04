package com.gamericefishpro.space.d0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.v {
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long A0(com.gamericefishpro.space.f2.n0 n0Var) {
        int iJ;
        int iJ2;
        int iJ3;
        int i = 0;
        if (Float.isNaN(this.J)) {
            iJ = Integer.MAX_VALUE;
        } else {
            iJ = n0Var.J(this.J);
            if (iJ < 0) {
                iJ = 0;
            }
        }
        if (Float.isNaN(this.K)) {
            iJ2 = Integer.MAX_VALUE;
        } else {
            iJ2 = n0Var.J(this.K);
            if (iJ2 < 0) {
                iJ2 = 0;
            }
        }
        if (Float.isNaN(this.H)) {
            iJ3 = 0;
        } else {
            iJ3 = n0Var.J(this.H);
            if (iJ3 < 0) {
                iJ3 = 0;
            }
            if (iJ3 > iJ) {
                iJ3 = iJ;
            }
            if (iJ3 == Integer.MAX_VALUE) {
                iJ3 = 0;
            }
        }
        if (!Float.isNaN(this.I)) {
            int iJ4 = n0Var.J(this.I);
            if (iJ4 < 0) {
                iJ4 = 0;
            }
            if (iJ4 > iJ2) {
                iJ4 = iJ2;
            }
            if (iJ4 != Integer.MAX_VALUE) {
                i = iJ4;
            }
        }
        return com.gamericefishpro.space.c3.b.a(iJ3, iJ, i, iJ2);
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int C(com.gamericefishpro.space.h2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        long jA0 = A0(n0Var);
        if (com.gamericefishpro.space.c3.a.e(jA0)) {
            return com.gamericefishpro.space.c3.a.g(jA0);
        }
        if (!this.L) {
            i = com.gamericefishpro.space.c3.b.f(i, jA0);
        }
        return com.gamericefishpro.space.c3.b.e(k0Var.f(i), jA0);
    }

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jA0 = A0(n0Var);
        if (this.L) {
            int iJ2 = com.gamericefishpro.space.c3.a.j(j);
            int iH2 = com.gamericefishpro.space.c3.a.h(j);
            int i2 = com.gamericefishpro.space.c3.a.i(j);
            int iG2 = com.gamericefishpro.space.c3.a.g(j);
            int iJ3 = com.gamericefishpro.space.c3.a.j(jA0);
            if (iJ3 < iJ2) {
                iJ3 = iJ2;
            }
            if (iJ3 > iH2) {
                iJ3 = iH2;
            }
            int iH3 = com.gamericefishpro.space.c3.a.h(jA0);
            if (iH3 >= iJ2) {
                iJ2 = iH3;
            }
            if (iJ2 <= iH2) {
                iH2 = iJ2;
            }
            int i3 = com.gamericefishpro.space.c3.a.i(jA0);
            if (i3 < i2) {
                i3 = i2;
            }
            if (i3 > iG2) {
                i3 = iG2;
            }
            int iG3 = com.gamericefishpro.space.c3.a.g(jA0);
            if (iG3 >= i2) {
                i2 = iG3;
            }
            if (i2 <= iG2) {
                iG2 = i2;
            }
            jA = com.gamericefishpro.space.c3.b.a(iJ3, iH2, i3, iG2);
        } else {
            if (Float.isNaN(this.H)) {
                iJ = com.gamericefishpro.space.c3.a.j(j);
                int iH4 = com.gamericefishpro.space.c3.a.h(jA0);
                if (iJ > iH4) {
                    iJ = iH4;
                }
            } else {
                iJ = com.gamericefishpro.space.c3.a.j(jA0);
            }
            if (Float.isNaN(this.J)) {
                iH = com.gamericefishpro.space.c3.a.h(j);
                int iJ4 = com.gamericefishpro.space.c3.a.j(jA0);
                if (iH < iJ4) {
                    iH = iJ4;
                }
            } else {
                iH = com.gamericefishpro.space.c3.a.h(jA0);
            }
            if (Float.isNaN(this.I)) {
                i = com.gamericefishpro.space.c3.a.i(j);
                int iG4 = com.gamericefishpro.space.c3.a.g(jA0);
                if (i > iG4) {
                    i = iG4;
                }
            } else {
                i = com.gamericefishpro.space.c3.a.i(jA0);
            }
            if (Float.isNaN(this.K)) {
                iG = com.gamericefishpro.space.c3.a.g(j);
                int i4 = com.gamericefishpro.space.c3.a.i(jA0);
                if (iG < i4) {
                    iG = i4;
                }
            } else {
                iG = com.gamericefishpro.space.c3.a.g(jA0);
            }
            jA = com.gamericefishpro.space.c3.b.a(iJ, iH, i, iG);
        }
        com.gamericefishpro.space.f2.u0 u0VarE = k0Var.e(jA);
        return n0Var.y(u0VarE.d, u0VarE.e, com.gamericefishpro.space.ph.m0.c(), new k(u0VarE, 2));
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int N(com.gamericefishpro.space.h2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        long jA0 = A0(n0Var);
        if (com.gamericefishpro.space.c3.a.f(jA0)) {
            return com.gamericefishpro.space.c3.a.h(jA0);
        }
        if (!this.L) {
            i = com.gamericefishpro.space.c3.b.e(i, jA0);
        }
        return com.gamericefishpro.space.c3.b.f(k0Var.L(i), jA0);
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int Z(com.gamericefishpro.space.h2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        long jA0 = A0(n0Var);
        if (com.gamericefishpro.space.c3.a.e(jA0)) {
            return com.gamericefishpro.space.c3.a.g(jA0);
        }
        if (!this.L) {
            i = com.gamericefishpro.space.c3.b.f(i, jA0);
        }
        return com.gamericefishpro.space.c3.b.e(k0Var.U(i), jA0);
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int k0(com.gamericefishpro.space.h2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        long jA0 = A0(n0Var);
        if (com.gamericefishpro.space.c3.a.f(jA0)) {
            return com.gamericefishpro.space.c3.a.h(jA0);
        }
        if (!this.L) {
            i = com.gamericefishpro.space.c3.b.e(i, jA0);
        }
        return com.gamericefishpro.space.c3.b.f(k0Var.R(i), jA0);
    }
}
