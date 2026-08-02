package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class dg1 extends bnc {
    public final u51 d;
    public final rmb e;
    public final fg1 f;
    public final kkp g;
    public final jyr h;
    public final mf1 i;
    public boolean j;
    public final xdr k;
    public final xdr l;
    public final xdr m;
    public final xdr n;

    public dg1(s63 s63Var, u51 u51Var, rmb rmbVar, fg1 fg1Var, kkp kkpVar, jyr jyrVar) {
        u51Var.getClass();
        fg1Var.getClass();
        this.d = u51Var;
        this.e = rmbVar;
        this.f = fg1Var;
        this.g = kkpVar;
        this.h = jyrVar;
        this.i = (mf1) s63Var.a;
        this.k = ydr.a(null);
        this.l = ydr.a(null);
        this.m = ydr.a(vf1.a);
        this.n = ydr.a(new ig1(true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.i;
    }

    @Override // defpackage.ufg
    public final pjc f(mm6 mm6Var, boolean z) {
        mm6Var.getClass();
        if (z) {
            this.j = false;
        }
        Continuation continuation = null;
        x97.y(mm6Var, null, null, new cg1(this, z, continuation, 0), 3);
        ox6.B(new yf1(ox6.L(zsd.Q((xdr) this.g.d, this.k, new bca(this.l, 18), zf1.a), 50L), 0), mm6Var, new ri(13, this));
        return new v81(new ub7(12, new ub7(11, new ub7(12, this.m, new bg1(this, continuation, 0)), ern.a(uf1.class)), new bg1(this, continuation, 1)), 1);
    }
}
