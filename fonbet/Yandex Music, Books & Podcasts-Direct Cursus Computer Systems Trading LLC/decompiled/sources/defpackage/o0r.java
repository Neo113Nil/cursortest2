package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o0r implements m0r {
    public final fg5 a;
    public final mqs b;
    public final rhq c;
    public final vdr d;
    public final fkn e;
    public final fkn f;

    public o0r(fg5 fg5Var, mm6 mm6Var, lf5 lf5Var, mqs mqsVar, rhq rhqVar) {
        this.a = fg5Var;
        this.b = mqsVar;
        this.c = rhqVar;
        this.d = sk3.a0(mm6Var, lf5Var.g(mqsVar));
        this.e = lg3.u0(new p6o(lf5Var.e(mqsVar), 26), mm6Var, c2g.a);
        this.f = lg3.u0(lf5Var.b(mqsVar), mm6Var, lzs.a);
    }

    @Override // defpackage.m0r
    public final vdr a() {
        return this.d;
    }

    @Override // defpackage.m0r
    public final vdr b() {
        return this.e;
    }

    @Override // defpackage.m0r
    public final bg5 c() {
        return this.a;
    }

    @Override // defpackage.m0r
    public final void d() {
        boolean d = Intrinsics.d(this.e.a.getValue(), b2g.a);
        e6t e6tVar = ((h5t) this.c.b).a;
        e6tVar.getClass();
        b5t G = e6tVar.G();
        G.getClass();
        t3g t3gVar = G.h;
        mqs mqsVar = this.b;
        if (d) {
            t3gVar.A(mqsVar);
        } else {
            t3gVar.t(mqsVar);
        }
        e6tVar.a(new y20(e6tVar, mqsVar, d, 7));
    }

    @Override // defpackage.m0r
    public final vdr e() {
        return this.f;
    }
}
