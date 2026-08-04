package com.gamericefishpro.space.f1;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends g {
    public final g e;
    public final boolean f;
    public final boolean g;
    public Function1 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(g gVar, Function1 function1, boolean z, boolean z2) {
        Function1 function1E;
        super(0L, m.w);
        com.gamericefishpro.space.d0.p pVar = p.a;
        this.e = gVar;
        this.f = z;
        this.g = z2;
        this.h = p.k(function1, (gVar == null || (function1E = gVar.e()) == null) ? p.j.e : function1E, z);
        this.i = com.gamericefishpro.space.b1.n.b();
    }

    @Override // com.gamericefishpro.space.f1.g
    public final void c() {
        g gVar;
        this.c = true;
        if (!this.g || (gVar = this.e) == null) {
            return;
        }
        gVar.c();
    }

    @Override // com.gamericefishpro.space.f1.g
    public final m d() {
        return v().d();
    }

    @Override // com.gamericefishpro.space.f1.g
    public final Function1 e() {
        return this.h;
    }

    @Override // com.gamericefishpro.space.f1.g
    public final boolean f() {
        return v().f();
    }

    @Override // com.gamericefishpro.space.f1.g
    public final long g() {
        return v().g();
    }

    @Override // com.gamericefishpro.space.f1.g
    public final Function1 i() {
        return null;
    }

    @Override // com.gamericefishpro.space.f1.g
    public final void k() {
        v.l();
        throw null;
    }

    @Override // com.gamericefishpro.space.f1.g
    public final void l() {
        v.l();
        throw null;
    }

    @Override // com.gamericefishpro.space.f1.g
    public final void m() {
        v().m();
    }

    @Override // com.gamericefishpro.space.f1.g
    public final void n(c0 c0Var) {
        v().n(c0Var);
    }

    @Override // com.gamericefishpro.space.f1.g
    public final g u(Function1 function1) {
        Function1 function1K = p.k(function1, this.h, true);
        return !this.f ? p.g(v().u(null), function1K, true) : v().u(function1K);
    }

    public final g v() {
        g gVar = this.e;
        return gVar == null ? p.j : gVar;
    }
}
