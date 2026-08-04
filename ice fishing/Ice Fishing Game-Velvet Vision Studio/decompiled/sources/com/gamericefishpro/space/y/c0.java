package com.gamericefishpro.space.y;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.l {
    public final com.gamericefishpro.space.b0.i H;
    public boolean I;
    public boolean J;
    public boolean K;

    public c0(com.gamericefishpro.space.b0.i iVar) {
        this.H = iVar;
    }

    @Override // com.gamericefishpro.space.h2.l
    public final void f(com.gamericefishpro.space.h2.h0 h0Var) {
        h0Var.a();
        com.gamericefishpro.space.q1.b bVar = h0Var.d;
        if (this.I) {
            com.gamericefishpro.space.q1.d.w(h0Var, com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.3f), bVar.c(), 122);
        } else if (this.J || this.K) {
            com.gamericefishpro.space.q1.d.w(h0Var, com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.1f), bVar.c(), 122);
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void s0() {
        com.gamericefishpro.space.pi.a0.u(o0(), null, new com.gamericefishpro.space.b2.e0(this, null, 15), 3);
    }
}
