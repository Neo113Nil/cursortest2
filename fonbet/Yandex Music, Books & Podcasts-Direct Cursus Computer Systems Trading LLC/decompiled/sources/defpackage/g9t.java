package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g9t extends b2r {
    public final b2r e;
    public final boolean f;
    public Function1 g;
    public final long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9t(b2r b2rVar, Function1 function1, boolean z) {
        super(0L, f2r.e);
        Function1 e;
        sfm sfmVar = g2r.a;
        this.e = b2rVar;
        this.f = z;
        this.g = g2r.l(function1, (b2rVar == null || (e = b2rVar.e()) == null) ? g2r.i.e : e, false);
        this.h = ldg.r();
    }

    @Override // defpackage.b2r
    public final void c() {
        b2r b2rVar;
        this.c = true;
        if (!this.f || (b2rVar = this.e) == null) {
            return;
        }
        b2rVar.c();
    }

    @Override // defpackage.b2r
    public final f2r d() {
        return v().d();
    }

    @Override // defpackage.b2r
    public final Function1 e() {
        return this.g;
    }

    @Override // defpackage.b2r
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.b2r
    public final long g() {
        return v().g();
    }

    @Override // defpackage.b2r
    public final Function1 i() {
        return null;
    }

    @Override // defpackage.b2r
    public final void k() {
        wct.N();
        throw null;
    }

    @Override // defpackage.b2r
    public final void l() {
        wct.N();
        throw null;
    }

    @Override // defpackage.b2r
    public final void m() {
        v().m();
    }

    @Override // defpackage.b2r
    public final void n(mer merVar) {
        v().n(merVar);
    }

    @Override // defpackage.b2r
    public final b2r u(Function1 function1) {
        return g2r.h(v().u(null), g2r.l(function1, this.g, true), true);
    }

    public final b2r v() {
        b2r b2rVar = this.e;
        return b2rVar == null ? g2r.i : b2rVar;
    }
}
