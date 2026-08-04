package com.gamericefishpro.space.f2;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements e1 {
    public final com.gamericefishpro.space.t.x a;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ Object c;

    public f0(h0 h0Var, Object obj) {
        this.b = h0Var;
        this.c = obj;
        int[] iArr = com.gamericefishpro.space.t.n.a;
        this.a = new com.gamericefishpro.space.t.x();
    }

    @Override // com.gamericefishpro.space.f2.e1
    public final void a() {
        h0.a(this.b, this.c);
    }

    @Override // com.gamericefishpro.space.f2.e1
    public final int b() {
        com.gamericefishpro.space.h2.f0 f0Var = (com.gamericefishpro.space.h2.f0) this.b.C.g(this.c);
        if (f0Var != null) {
            return ((com.gamericefishpro.space.v0.b) f0Var.n()).d.i;
        }
        return 0;
    }

    @Override // com.gamericefishpro.space.f2.e1
    public final void c(com.gamericefishpro.space.f5.b0 b0Var) {
        com.gamericefishpro.space.h2.a1 a1Var;
        com.gamericefishpro.space.h1.l lVar;
        com.gamericefishpro.space.h2.f0 f0Var = (com.gamericefishpro.space.h2.f0) this.b.C.g(this.c);
        if (f0Var == null || (a1Var = f0Var.Z) == null || (lVar = a1Var.f) == null) {
            return;
        }
        com.gamericefishpro.space.h2.k.w(lVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", b0Var);
    }

    @Override // com.gamericefishpro.space.f2.e1
    public final long d(int i) {
        com.gamericefishpro.space.h2.f0 f0Var = (com.gamericefishpro.space.h2.f0) this.b.C.g(this.c);
        if (f0Var == null || !f0Var.H()) {
            return 0L;
        }
        int i2 = ((com.gamericefishpro.space.v0.b) f0Var.n()).d.i;
        if (i < 0 || i >= i2) {
            com.gamericefishpro.space.e2.a.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (!this.a.b(i)) {
            return 0L;
        }
        return (((long) ((com.gamericefishpro.space.h2.f0) ((com.gamericefishpro.space.v0.b) f0Var.n()).get(i)).a0.p.d) << 32) | (((long) ((com.gamericefishpro.space.h2.f0) ((com.gamericefishpro.space.v0.b) f0Var.n()).get(i)).a0.p.e) & 4294967295L);
    }

    @Override // com.gamericefishpro.space.f2.e1
    public final void e(int i, long j) {
        h0 h0Var = this.b;
        com.gamericefishpro.space.h2.f0 f0Var = (com.gamericefishpro.space.h2.f0) h0Var.C.g(this.c);
        if (f0Var == null || !f0Var.H()) {
            return;
        }
        int i2 = ((com.gamericefishpro.space.v0.b) f0Var.n()).d.i;
        if (i < 0 || i >= i2) {
            com.gamericefishpro.space.e2.a.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (f0Var.I()) {
            com.gamericefishpro.space.e2.a.a("Pre-measure called on node that is not placed");
        }
        com.gamericefishpro.space.h2.f0 f0Var2 = h0Var.d;
        f0Var2.K = true;
        ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.i0.a(f0Var)).v((com.gamericefishpro.space.h2.f0) ((com.gamericefishpro.space.v0.b) f0Var.n()).get(i), j);
        Unit unit = Unit.a;
        f0Var2.K = false;
        this.a.a(i);
    }
}
