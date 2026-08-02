package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ut4 implements st4 {
    public final wjl a;
    public final xil b;
    public final by7 c;
    public final hjl d;
    public final osh e;
    public boolean f;

    public ut4(wjl wjlVar, xil xilVar) {
        xilVar.getClass();
        this.a = wjlVar;
        this.b = xilVar;
        this.c = asq.K(wjlVar.d, new v5(23, this));
        hjl a = xilVar.a(new jab(qkb.Player, 1, 1, 0));
        this.d = a;
        this.e = new osh(wjlVar, new r93(20, this), a);
    }

    public static ajl a(me5 me5Var) {
        if (Intrinsics.d(me5Var, ke5.a)) {
            return ajl.d;
        }
        if (!(me5Var instanceof le5)) {
            b6e.s();
            return null;
        }
        ne5 ne5Var = ((le5) me5Var).c;
        ajl ajlVar = ajl.d;
        zil zilVar = ne5Var.a;
        ime imeVar = ne5Var.b;
        ajl ajlVar2 = new ajl(zilVar, "");
        ajlVar2.c = imeVar;
        return ajlVar2;
    }

    @Override // defpackage.st4
    public final void d() {
        this.e.K();
    }

    @Override // defpackage.st4
    public final void f() {
        this.e.L();
    }

    @Override // defpackage.st4
    public final void g() {
        if (this.f) {
            this.b.b();
            this.f = false;
        }
    }

    @Override // defpackage.st4
    public final void h() {
        this.b.e(a((me5) this.a.d.a.getValue()));
        this.f = true;
    }

    @Override // defpackage.st4
    public final void i(xur xurVar) {
        xurVar.getClass();
        this.e.N(xurVar);
    }

    @Override // defpackage.st4
    public final void j(float f) {
        this.e.M(f, rap.b);
    }

    @Override // defpackage.st4
    public final cvo k() {
        return this.b.c().d();
    }

    @Override // defpackage.st4
    public final vdr l() {
        return this.c;
    }
}
