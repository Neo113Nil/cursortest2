package defpackage;

/* loaded from: classes3.dex */
public final class yts implements pt6 {
    public final bus a;
    public final tmb b;
    public final nmj c;
    public final xdr d;

    public yts(bus busVar, tmb tmbVar, nmj nmjVar) {
        busVar.getClass();
        tmbVar.getClass();
        nmjVar.getClass();
        this.a = busVar;
        this.b = tmbVar;
        this.c = nmjVar;
        this.d = busVar.n;
    }

    @Override // defpackage.pt6
    public final xdr a() {
        return this.d;
    }

    @Override // defpackage.pt6
    public final jmj f(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(2085142439);
        boolean h = oq5Var.h(this);
        Object K = oq5Var.K();
        if (h || K == gq5.a) {
            K = new ti1(11, this);
            oq5Var.k0(K);
        }
        jmj a = this.c.a((dmj) K, this.b, 2, oq5Var, ((i << 6) & 896) | 4160);
        oq5Var.p(false);
        return a;
    }
}
