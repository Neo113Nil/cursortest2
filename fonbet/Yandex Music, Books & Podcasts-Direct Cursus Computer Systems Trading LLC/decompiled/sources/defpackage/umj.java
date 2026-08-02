package defpackage;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class umj extends pmj {
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final fkn n;

    public umj(jyr jyrVar) {
        cq4 F = ot0.F(this);
        bdt I = hag.I(z66.class);
        l18 l18Var = l18.b;
        jyr b = l18Var.b(I, true);
        this.k = b;
        jyr b2 = l18Var.b(hag.I(uaa.class), true);
        jyr b3 = l18Var.b(hag.I(c72.class), true);
        this.l = b3;
        this.m = jyrVar;
        vdr c = ((z66) b.getValue()).c();
        xdr xdrVar = ((e6q) ((uaa) b2.getValue())).e;
        int i = 0;
        fkn F0 = zsd.F0(new njf(xdrVar, this, 21), F, lbq.a, Boolean.valueOf((((lja) xdrVar.getValue()).b.isEmpty() || ((lwc) jyrVar.getValue()).a()) ? false : true));
        u21 u21Var = new u21(10, c, F0, smj.a);
        jyr jyrVar2 = dvu.e;
        this.n = lg3.u0(zsd.b0(zsd.M0(new u21(10, u21Var, kwl.d() ? ((z22) ((c72) b3.getValue())).l() : new fs(15, Unit.a), new tmj(3, i, null)), new qmj(null, this))), F, J(((Boolean) F0.a.getValue()).booleanValue(), (x66) c.getValue(), false));
    }

    public static mmj J(boolean z, x66 x66Var, boolean z2) {
        jyr jyrVar = dvu.e;
        boolean z3 = false;
        boolean z4 = kwl.d() && z;
        boolean z5 = x66Var.b == u0j.a;
        if (z2 && !z) {
            z3 = true;
        }
        return new mmj(z4, z, z5, z3);
    }

    @Override // defpackage.pmj
    public final void G() {
        ((z66) this.k.getValue()).i(u0j.b);
    }

    @Override // defpackage.pmj
    public final vdr H() {
        return this.n;
    }

    @Override // defpackage.pmj
    public final Object a(m1i m1iVar) {
        Object h0 = zsd.h0(((z66) this.k.getValue()).c(), new z0i(2, 7, null), m1iVar);
        return h0 == nm6.a ? h0 : Unit.a;
    }
}
