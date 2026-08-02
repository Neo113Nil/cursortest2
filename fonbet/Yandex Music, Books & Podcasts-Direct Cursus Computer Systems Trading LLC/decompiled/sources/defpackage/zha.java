package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class zha extends bfu {
    public final jyr k;
    public final jyr l;
    public final xdr m;
    public final jyr n;
    public final xdr o;

    public zha() {
        bdt I = hag.I(zx4.class);
        l18 l18Var = l18.b;
        this.k = l18Var.b(I, true);
        this.l = l18Var.b(hag.I(cej.class), true);
        this.m = ydr.a(aia.b);
        jyr b = btf.b(new yg6(26, this));
        this.n = b;
        this.o = ydr.a(c5b.a);
        ox6.B(new bca(((yx4) ((wha) b.getValue()).a.getValue()).D(null), 7), ot0.F(this), new yha(this, 0));
        ox6.B(new u21(10, new bca(((yx4) ((wha) b.getValue()).a.getValue()).D(6), 7), new bca(((yx4) ((wha) b.getValue()).a.getValue()).B(9), 8), new v42(this, null, 6)), ot0.F(this), new yha(this, 1));
    }

    public final Object a(Continuation continuation) {
        Object value = this.o.getValue();
        if (((List) value).isEmpty()) {
            value = null;
        }
        List list = (List) value;
        return list == null ? ((wha) this.n.getValue()).a(continuation) : list;
    }
}
