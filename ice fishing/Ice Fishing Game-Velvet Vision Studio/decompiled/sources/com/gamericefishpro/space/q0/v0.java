package com.gamericefishpro.space.q0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.v {
    public com.gamericefishpro.space.b0.i H;
    public boolean I;
    public com.gamericefishpro.space.w.u J;
    public boolean K;
    public com.gamericefishpro.space.w.b L;
    public com.gamericefishpro.space.w.b M;
    public float N;
    public float O;

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        float f;
        boolean z = (k0Var.f(com.gamericefishpro.space.c3.a.h(j)) == 0 || k0Var.R(com.gamericefishpro.space.c3.a.g(j)) == 0) ? false : true;
        if (this.K) {
            f = com.gamericefishpro.space.s0.h.n;
        } else {
            f = (z || this.I) ? p0.a : p0.b;
        }
        float fR = n0Var.r(f);
        com.gamericefishpro.space.w.b bVar = this.M;
        int iFloatValue = (int) (bVar != null ? ((Number) bVar.c()).floatValue() : fR);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            com.gamericefishpro.space.c3.h.a("width and height must be >= 0");
        }
        com.gamericefishpro.space.f2.u0 u0VarE = k0Var.e(com.gamericefishpro.space.c3.b.g(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fR2 = n0Var.r((p0.d - n0Var.i0(fR)) / 2.0f);
        float fR3 = n0Var.r((p0.c - p0.a) - p0.e);
        boolean z2 = this.K;
        if (z2 && this.I) {
            fR2 = fR3 - n0Var.r(com.gamericefishpro.space.s0.h.s);
        } else if (z2 && !this.I) {
            fR2 = n0Var.r(com.gamericefishpro.space.s0.h.s);
        } else if (this.I) {
            fR2 = fR3;
        }
        com.gamericefishpro.space.w.b bVar2 = this.M;
        com.gamericefishpro.space.th.a aVar = null;
        Float f2 = bVar2 != null ? (Float) bVar2.e.getValue() : null;
        if (f2 == null || f2.floatValue() != fR) {
            com.gamericefishpro.space.pi.a0.u(o0(), null, new u0(this, fR, aVar, 0), 3);
        }
        com.gamericefishpro.space.w.b bVar3 = this.L;
        Float f3 = bVar3 != null ? (Float) bVar3.e.getValue() : null;
        if (f3 == null || f3.floatValue() != fR2) {
            com.gamericefishpro.space.pi.a0.u(o0(), null, new u0(this, fR2, aVar, 1), 3);
        }
        if (Float.isNaN(this.O) && Float.isNaN(this.N)) {
            this.O = fR;
            this.N = fR2;
        }
        return n0Var.y(iFloatValue, iFloatValue, com.gamericefishpro.space.ph.m0.c(), new t0(u0VarE, this, fR2));
    }

    @Override // com.gamericefishpro.space.h1.l
    public final boolean p0() {
        return false;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void s0() {
        com.gamericefishpro.space.pi.a0.u(o0(), null, new com.gamericefishpro.space.b2.e0(this, null, 8), 3);
    }
}
