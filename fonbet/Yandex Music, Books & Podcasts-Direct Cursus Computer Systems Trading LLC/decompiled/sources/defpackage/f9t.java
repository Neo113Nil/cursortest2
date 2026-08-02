package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f9t extends ypi {
    public final ypi o;
    public final boolean p;
    public final boolean q;
    public Function1 r;
    public Function1 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f9t(ypi ypiVar, Function1 function1, Function1 function12, boolean z, boolean z2) {
        super(0L, f2r.e, g2r.l(function1, (ypiVar == null || (r0 = ypiVar.e()) == null) ? g2r.i.e : r0, z), g2r.b(function12, (ypiVar == null || (r9 = ypiVar.i()) == null) ? g2r.i.f : r9));
        Function1 i;
        Function1 e;
        sfm sfmVar = g2r.a;
        this.o = ypiVar;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = ldg.r();
    }

    @Override // defpackage.ypi
    public final void B(upi upiVar) {
        wct.N();
        throw null;
    }

    @Override // defpackage.ypi
    public final ypi C(Function1 function1, Function1 function12) {
        Function1 l = g2r.l(function1, this.r, true);
        Function1 b = g2r.b(function12, this.s);
        return !this.p ? new f9t(D().C(null, b), l, b, false, true) : D().C(l, b);
    }

    public final ypi D() {
        ypi ypiVar = this.o;
        return ypiVar == null ? g2r.i : ypiVar;
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final void c() {
        ypi ypiVar;
        this.c = true;
        if (!this.q || (ypiVar = this.o) == null) {
            return;
        }
        ypiVar.c();
    }

    @Override // defpackage.b2r
    public final f2r d() {
        return D().d();
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final Function1 e() {
        return this.r;
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.b2r
    public final long g() {
        return D().g();
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final int h() {
        return D().h();
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final Function1 i() {
        return this.s;
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final void k() {
        wct.N();
        throw null;
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final void l() {
        wct.N();
        throw null;
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final void m() {
        D().m();
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final void n(mer merVar) {
        D().n(merVar);
    }

    @Override // defpackage.b2r
    public final void r(f2r f2rVar) {
        wct.N();
        throw null;
    }

    @Override // defpackage.b2r
    public final void s(long j) {
        wct.N();
        throw null;
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final b2r u(Function1 function1) {
        Function1 l = g2r.l(function1, this.r, true);
        return !this.p ? g2r.h(D().u(null), l, true) : D().u(l);
    }

    @Override // defpackage.ypi
    public final bzf w() {
        return D().w();
    }

    @Override // defpackage.ypi
    public final upi x() {
        return D().x();
    }

    @Override // defpackage.ypi
    /* renamed from: y */
    public final Function1 e() {
        return this.r;
    }
}
