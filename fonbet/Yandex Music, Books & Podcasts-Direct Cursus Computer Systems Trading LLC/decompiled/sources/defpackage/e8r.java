package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class e8r extends d8r {
    public final x6r k;
    public final lzp l;
    public final qy2 m;
    public final g8r n;
    public final h8r o;
    public final by7 p;
    public final by7 q;
    public final j0q r;
    public boolean s;

    public e8r(x6r x6rVar, lzp lzpVar, qy2 qy2Var, g8r g8rVar, h8r h8rVar) {
        x6rVar.getClass();
        this.k = x6rVar;
        this.l = lzpVar;
        this.m = qy2Var;
        this.n = g8rVar;
        this.o = h8rVar;
        by7 by7Var = x6rVar.e;
        this.p = by7Var;
        this.q = asq.K(by7Var, new g5r(this));
        this.r = new j0q();
    }

    @Override // defpackage.d8r
    public final ct8 G() {
        lzp lzpVar = this.l;
        qy2 qy2Var = this.m;
        ct8 a = lzpVar.a(qy2Var);
        w7r w7rVar = (w7r) this.p.b.invoke();
        v7r v7rVar = w7rVar instanceof v7r ? (v7r) w7rVar : null;
        z6r z6rVar = v7rVar != null ? v7rVar.a : null;
        String str = z6rVar != null ? z6rVar.a : null;
        if (str == null) {
            str = "";
        }
        qy2Var.b = str;
        qy2Var.c = "SplashScreenViewModel";
        return a;
    }

    @Override // defpackage.d8r
    public final pjc H() {
        return this.r;
    }

    @Override // defpackage.d8r
    public final vdr J() {
        return this.q;
    }

    @Override // defpackage.d8r
    public final void K() {
        ox6.B(this.p, ot0.F(this), new ryp(18, this));
    }

    @Override // defpackage.d8r
    public final boolean L() {
        return this.s;
    }

    @Override // defpackage.d8r
    public final void M() {
        x97.y(ot0.F(this), null, null, new mj0(0L, this, (Continuation) null, 10), 3);
    }

    @Override // defpackage.d8r
    public final void N() {
        this.s = true;
    }

    @Override // defpackage.d8r
    public final void O() {
        s7r s7rVar = this.k.b;
        Continuation continuation = null;
        x97.y(s7rVar.c, null, null, new mj0(s7rVar, System.currentTimeMillis(), continuation, 9), 3);
        w7r w7rVar = (w7r) this.p.b.invoke();
        v7r v7rVar = w7rVar instanceof v7r ? (v7r) w7rVar : null;
        z6r z6rVar = v7rVar != null ? v7rVar.a : null;
        if (z6rVar != null) {
            x97.y(ot0.F(this), null, null, new mj0(z6rVar.c, this, continuation, 10), 3);
        } else {
            x97.y(ot0.F(this), null, null, new mj0(0L, this, continuation, 10), 3);
        }
    }
}
