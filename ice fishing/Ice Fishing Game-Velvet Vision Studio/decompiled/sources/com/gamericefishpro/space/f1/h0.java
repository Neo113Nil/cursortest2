package com.gamericefishpro.space.f1;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends c {
    public final c o;
    public final boolean p;
    public final boolean q;
    public Function1 r;
    public Function1 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public h0(c cVar, Function1 function1, Function1 function2, boolean z, boolean z2) {
        Function1 function1I;
        Function1 function1E;
        com.gamericefishpro.space.d0.p pVar = p.a;
        super(0L, m.w, p.k(function1, (cVar == null || (function1E = cVar.e()) == null) ? p.j.e : function1E, z), p.l(function2, (cVar == null || (function1I = cVar.i()) == null) ? p.j.f : function1I));
        this.o = cVar;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = com.gamericefishpro.space.b1.n.b();
    }

    @Override // com.gamericefishpro.space.f1.c
    public final void B(com.gamericefishpro.space.t.i0 i0Var) {
        v.l();
        throw null;
    }

    @Override // com.gamericefishpro.space.f1.c
    public final c C(Function1 function1, Function1 function2) {
        Function1 function1K = p.k(function1, this.r, true);
        Function1 function1L = p.l(function2, this.s);
        return !this.p ? new h0(D().C(null, function1L), function1K, function1L, false, true) : D().C(function1K, function1L);
    }

    public final c D() {
        c cVar = this.o;
        return cVar == null ? p.j : cVar;
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final void c() {
        c cVar;
        this.c = true;
        if (!this.q || (cVar = this.o) == null) {
            return;
        }
        cVar.c();
    }

    @Override // com.gamericefishpro.space.f1.g
    public final m d() {
        return D().d();
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final Function1 e() {
        return this.r;
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final boolean f() {
        return D().f();
    }

    @Override // com.gamericefishpro.space.f1.g
    public final long g() {
        return D().g();
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final int h() {
        return D().h();
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final Function1 i() {
        return this.s;
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final void k() {
        v.l();
        throw null;
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final void l() {
        v.l();
        throw null;
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final void m() {
        D().m();
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final void n(c0 c0Var) {
        D().n(c0Var);
    }

    @Override // com.gamericefishpro.space.f1.g
    public final void r(m mVar) {
        v.l();
        throw null;
    }

    @Override // com.gamericefishpro.space.f1.g
    public final void s(long j) {
        v.l();
        throw null;
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final void t(int i) {
        D().t(i);
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final g u(Function1 function1) {
        Function1 function1K = p.k(function1, this.r, true);
        return !this.p ? p.g(D().u(null), function1K, true) : D().u(function1K);
    }

    @Override // com.gamericefishpro.space.f1.c
    public final v w() {
        return D().w();
    }

    @Override // com.gamericefishpro.space.f1.c
    public final com.gamericefishpro.space.t.i0 x() {
        return D().x();
    }

    @Override // com.gamericefishpro.space.f1.c
    /* JADX INFO: renamed from: y */
    public final Function1 e() {
        return this.r;
    }
}
