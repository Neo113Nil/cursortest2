package com.gamericefishpro.space.h0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.v, com.gamericefishpro.space.h2.i {
    public static final o K = new o();
    public r H;
    public l I;
    public com.gamericefishpro.space.z.v0 J;

    public final boolean A0(k kVar, int i) {
        if (i == 5 || i == 6) {
            if (this.J == com.gamericefishpro.space.z.v0.e) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.J == com.gamericefishpro.space.z.v0.d) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (B0(i)) {
            if (kVar.b >= this.H.a() - 1) {
                return false;
            }
        } else if (kVar.a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean B0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = com.gamericefishpro.space.h2.k.s(this).T.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new com.gamericefishpro.space.oh.k();
        }
        if (i != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = com.gamericefishpro.space.h2.k.s(this).T.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new com.gamericefishpro.space.oh.k();
    }

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        com.gamericefishpro.space.f2.u0 u0VarE = k0Var.e(j);
        return n0Var.y(u0VarE.d, u0VarE.e, com.gamericefishpro.space.ph.m0.c(), new com.gamericefishpro.space.d0.k(u0VarE, 3));
    }
}
