package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class i26 extends g26 {
    public static final /* synthetic */ s9f[] v;
    public final gpq k;
    public final tmb l;
    public final evj m;
    public final rw5 n;
    public final boolean o;
    public final z6n p;
    public final qdc q;
    public final xdr r;
    public final j0q s;
    public final xdr t;
    public final j0q u;

    static {
        opi opiVar = new opi(i26.class, "loadScreenJob", "getLoadScreenJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        v = new s9f[]{opiVar};
    }

    public i26(gpq gpqVar, tmb tmbVar, evj evjVar, rw5 rw5Var, boolean z) {
        rw5Var.getClass();
        this.k = gpqVar;
        this.l = tmbVar;
        this.m = evjVar;
        this.n = rw5Var;
        this.o = z;
        this.p = new z6n(7);
        this.q = new qdc(ot0.F(this), new e65(0, this, i26.class, "performHeaderScroll", "performHeaderScroll()V", 0, 23));
        this.r = ydr.a(new l26(r16.a, n16.a, x06.a));
        this.s = new j0q();
        this.t = ydr.a(Boolean.FALSE);
        this.u = new j0q();
        x97.y(ot0.F(this), null, null, new vv4(rw5Var.f, (Continuation) null, this, 21), 3);
    }

    @Override // defpackage.g26
    public final tmb G() {
        return this.l;
    }

    @Override // defpackage.g26
    public final vdr H() {
        return this.r;
    }

    @Override // defpackage.g26
    public final j0q J() {
        return this.u;
    }

    @Override // defpackage.g26
    public final xqq K() {
        return this.k;
    }

    @Override // defpackage.g26
    public final xdr L() {
        return this.t;
    }

    @Override // defpackage.g26
    public final fcc M() {
        return xp3.w(this.n, this.o);
    }

    @Override // defpackage.g26
    public final void N() {
        qdc qdcVar = this.q;
        rar rarVar = (rar) qdcVar.c;
        if (rarVar != null) {
            rarVar.g(null);
        }
        qdcVar.c = null;
    }

    @Override // defpackage.g26
    public final void O() {
        Boolean bool = Boolean.TRUE;
        xdr xdrVar = this.t;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        this.k.S();
        U((rx5) this.n.f.getValue(), false);
        x97.y(ot0.F(this), null, null, new h26(this, null, 0), 3);
    }

    @Override // defpackage.g26
    public final void P() {
        this.k.S();
        U((rx5) this.n.f.getValue(), false);
    }

    @Override // defpackage.g26
    public final void R() {
        qdc qdcVar = this.q;
        rar rarVar = (rar) qdcVar.c;
        if (rarVar != null) {
            rarVar.g(null);
        }
        qdcVar.c = null;
    }

    @Override // defpackage.g26
    public final void S() {
        qdc qdcVar = this.q;
        rar rarVar = (rar) qdcVar.c;
        if (rarVar != null) {
            rarVar.g(null);
        }
        qdcVar.c = null;
    }

    @Override // defpackage.g26
    public final void T() {
        x97.y(ot0.F(this), null, null, new h26(this, null, 1), 3);
    }

    public final void U(rx5 rx5Var, boolean z) {
        Object value;
        l26 l26Var;
        s9f[] s9fVarArr = v;
        s9f s9fVar = s9fVarArr[0];
        z6n z6nVar = this.p;
        r2f r2fVar = (r2f) z6nVar.getValue(this, s9fVar);
        Continuation continuation = null;
        if (r2fVar != null) {
            r2fVar.g(null);
        }
        xdr xdrVar = this.r;
        if ((((l26) xdrVar.getValue()).b instanceof l16) || z) {
            do {
                value = xdrVar.getValue();
                l26Var = (l26) value;
            } while (!xdrVar.k(value, new l26(l26Var.a, n16.a, l26Var.c)));
        }
        z6nVar.setValue(this, s9fVarArr[0], x97.y(ot0.F(this), null, null, new vv4(this, rx5Var, continuation, 20), 3));
    }

    @Override // defpackage.g26
    public final dib h() {
        return this.s;
    }
}
