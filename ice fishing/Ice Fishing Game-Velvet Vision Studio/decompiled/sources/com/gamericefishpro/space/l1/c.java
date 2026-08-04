package com.gamericefishpro.space.l1;

import com.gamericefishpro.space.h2.h0;
import com.gamericefishpro.space.h2.j1;
import com.gamericefishpro.space.w.m1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.gamericefishpro.space.h1.l implements j1, b, com.gamericefishpro.space.h2.l {
    public final d H;
    public boolean I;
    public final m1 J;

    public c(d dVar, m1 m1Var) {
        this.H = dVar;
        this.J = m1Var;
        dVar.d = this;
    }

    public final void A0() {
        this.I = false;
        this.H.e = null;
        com.gamericefishpro.space.h2.k.j(this);
    }

    @Override // com.gamericefishpro.space.h2.j1
    public final void E() {
        A0();
    }

    @Override // com.gamericefishpro.space.h2.i, com.gamericefishpro.space.h2.t1
    public final void a() {
        A0();
    }

    @Override // com.gamericefishpro.space.l1.b
    public final com.gamericefishpro.space.c3.c b() {
        return com.gamericefishpro.space.h2.k.s(this).S;
    }

    @Override // com.gamericefishpro.space.l1.b
    public final long c() {
        return com.gamericefishpro.space.d9.h.Q(com.gamericefishpro.space.h2.k.q(this, 4).i);
    }

    @Override // com.gamericefishpro.space.h2.l
    public final void e0() {
        A0();
    }

    @Override // com.gamericefishpro.space.h2.l
    public final void f(h0 h0Var) {
        boolean z = this.I;
        d dVar = this.H;
        if (!z) {
            dVar.e = null;
            com.gamericefishpro.space.h2.k.p(this, new com.gamericefishpro.space.b2.b(7, this, dVar));
            if (dVar.e == null) {
                throw com.gamericefishpro.space.m5.a.e("DrawResult not defined, did you forget to call onDraw?");
            }
            this.I = true;
        }
        com.gamericefishpro.space.vb.c cVar = dVar.e;
        Intrinsics.b(cVar);
        ((Function1) cVar.e).invoke(h0Var);
    }

    @Override // com.gamericefishpro.space.l1.b
    public final com.gamericefishpro.space.c3.l getLayoutDirection() {
        return com.gamericefishpro.space.h2.k.s(this).T;
    }

    @Override // com.gamericefishpro.space.h2.i
    public final void h0() {
        A0();
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void u0() {
        A0();
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void t0() {
    }
}
