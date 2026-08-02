package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class yt5 extends xt5 {
    public static final /* synthetic */ s9f[] u;
    public final rmb k;
    public final tmb l;
    public final it5 m;
    public final lt5 n;
    public final kt5 o;
    public final boolean p;
    public final rw5 q;
    public final z6n r;
    public final xdr s;
    public final xdr t;

    static {
        opi opiVar = new opi(yt5.class, "loadScreenJob", "getLoadScreenJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        u = new s9f[]{opiVar};
    }

    public yt5(rmb rmbVar, tmb tmbVar, it5 it5Var, lt5 lt5Var, kt5 kt5Var, boolean z, rw5 rw5Var) {
        it5Var.getClass();
        kt5Var.getClass();
        rw5Var.getClass();
        this.k = rmbVar;
        this.l = tmbVar;
        this.m = it5Var;
        this.n = lt5Var;
        this.o = kt5Var;
        this.p = z;
        this.q = rw5Var;
        this.r = new z6n(7);
        this.s = ydr.a(new zt5(new ft5()));
        this.t = ydr.a(Boolean.FALSE);
        N();
    }

    @Override // defpackage.xt5
    public final rmb G() {
        return this.k;
    }

    @Override // defpackage.xt5
    public final tmb H() {
        return this.l;
    }

    @Override // defpackage.xt5
    public final vdr J() {
        return this.s;
    }

    @Override // defpackage.xt5
    public final xdr K() {
        return this.t;
    }

    @Override // defpackage.xt5
    public final void L() {
        Boolean bool = Boolean.TRUE;
        xdr xdrVar = this.t;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        N();
    }

    @Override // defpackage.xt5
    public final void M() {
        N();
    }

    public final void N() {
        s9f[] s9fVarArr = u;
        s9f s9fVar = s9fVarArr[0];
        z6n z6nVar = this.r;
        r2f r2fVar = (r2f) z6nVar.getValue(this, s9fVar);
        if (r2fVar == null || !r2fVar.b()) {
            r2f r2fVar2 = (r2f) z6nVar.getValue(this, s9fVarArr[0]);
            Continuation continuation = null;
            if (r2fVar2 != null) {
                r2fVar2.g(null);
            }
            z6nVar.setValue(this, s9fVarArr[0], x97.y(ot0.F(this), null, null, new ja4(this, continuation, 11), 3));
        }
    }
}
