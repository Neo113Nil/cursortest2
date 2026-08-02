package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class iui implements hui {
    public final mm6 a;
    public final cej b;
    public final xdr c;
    public final xdr d;
    public final i00 e;
    public final fdj f;
    public final xdr g;

    public iui(cvl cvlVar, mqs mqsVar, int i, o70 o70Var, mm6 mm6Var, Context context, zri zriVar, pui puiVar, pgf pgfVar) {
        cvlVar.getClass();
        puiVar.getClass();
        this.a = mm6Var;
        l18 l18Var = l18.b;
        bdt I = hag.I(cej.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        cej cejVar = (cej) qdcVar.C(I);
        this.b = cejVar;
        this.c = ydr.a(cejVar.a(mqsVar, false));
        this.d = ydr.a(j1g.b);
        i00 i00Var = new i00(puiVar, cvlVar, pgfVar, i, o70Var);
        this.e = i00Var;
        bdt I2 = hag.I(fdj.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        fdj fdjVar = (fdj) qdcVar2.C(I2);
        this.f = fdjVar;
        this.g = ydr.a(new ydj(fdjVar, mqsVar, false, mm6Var, context, i00Var, null));
        ox6.B(zsd.b0(new njf(new kvh(zriVar.b.a.c, 6), cvlVar, 12)), mm6Var, new lrf(17, this, context));
    }

    @Override // defpackage.bg5
    public final void a() {
        ((wdj) this.g.getValue()).a();
    }

    @Override // defpackage.wdj
    public final pjc b() {
        return this.d;
    }

    @Override // defpackage.bg5
    public final vdr c() {
        return sk3.a0(this.a, zsd.M0(this.g, new tn2(3, 9, null)));
    }

    @Override // defpackage.bg5
    public final void d() {
        ((wdj) this.g.getValue()).e();
    }

    @Override // defpackage.bg5
    public final void e() {
        ((wdj) this.g.getValue()).e();
    }

    @Override // defpackage.hui
    public final xdr f() {
        return this.c;
    }

    @Override // defpackage.wdj
    public final vdr g() {
        return sk3.a0(this.a, zsd.M0(this.g, new tn2(3, 6, null)));
    }

    @Override // defpackage.bg5
    public final vdr h() {
        return sk3.a0(this.a, zsd.M0(this.g, new tn2(3, 7, null)));
    }

    @Override // defpackage.bg5
    public final void i() {
        ((wdj) this.g.getValue()).i();
    }

    @Override // defpackage.bg5
    public final boolean j() {
        return ((wdj) this.g.getValue()).j();
    }

    @Override // defpackage.bg5
    public final boolean k() {
        return ((wdj) this.g.getValue()).k();
    }

    @Override // defpackage.bg5
    public final vdr l() {
        return sk3.a0(this.a, zsd.M0(this.g, new tn2(3, 8, null)));
    }

    @Override // defpackage.wdj
    public final void m(boolean z) {
    }
}
