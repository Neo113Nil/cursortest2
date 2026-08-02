package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class k3u extends bfu {
    public final nt6 k;
    public final h3u l;
    public final xdr m;
    public final xdr n;
    public rar o;

    public k3u(nt6 nt6Var, h3u h3uVar) {
        this.k = nt6Var;
        this.l = h3uVar;
        xdr a = ydr.a(qt6.a);
        this.m = a;
        this.n = a;
        ox6.B(new mpq(21, ((z66) h3uVar.b.getValue()).c(), this), ot0.F(this), new lot(5, this));
        G();
    }

    public final void G() {
        rar rarVar = this.o;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.o = x97.y(ot0.F(this), null, null, new lco(this, continuation, 26), 3);
    }
}
