package defpackage;

/* loaded from: classes3.dex */
public final class i3u implements pt6 {
    public final k3u a;
    public final tmb b;
    public final nmj c;
    public final xdr d;

    public i3u(k3u k3uVar, tmb tmbVar, nmj nmjVar) {
        k3uVar.getClass();
        tmbVar.getClass();
        nmjVar.getClass();
        this.a = k3uVar;
        this.b = tmbVar;
        this.c = nmjVar;
        this.d = k3uVar.n;
    }

    @Override // defpackage.pt6
    public final xdr a() {
        return this.d;
    }

    @Override // defpackage.pt6
    public final jmj f(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(1682149543);
        boolean h = oq5Var.h(this);
        Object K = oq5Var.K();
        if (h || K == gq5.a) {
            K = new ti1(13, this);
            oq5Var.k0(K);
        }
        jmj a = this.c.a((dmj) K, this.b, 2, oq5Var, ((i << 6) & 896) | 4160);
        oq5Var.p(false);
        return a;
    }
}
