package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class bus extends bfu {
    public final nt6 k;
    public final xts l;
    public final xdr m;
    public final xdr n;
    public rar o;

    public bus(nt6 nt6Var, xts xtsVar) {
        this.k = nt6Var;
        this.l = xtsVar;
        xdr a = ydr.a(qt6.a);
        this.m = a;
        this.n = a;
        ox6.B(new mpq(12, ((z66) xtsVar.b.getValue()).c(), this), ot0.F(this), new ryp(28, this));
        G();
    }

    public final void G() {
        rar rarVar = this.o;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.o = x97.y(ot0.F(this), null, null, new lco(this, continuation, 22), 3);
    }
}
