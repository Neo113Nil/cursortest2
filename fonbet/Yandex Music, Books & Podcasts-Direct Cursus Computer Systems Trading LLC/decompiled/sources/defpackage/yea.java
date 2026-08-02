package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class yea extends bfu {
    public final jyr k;
    public final jyr l;
    public final xdr m;
    public final jyr n;
    public final xdr o;

    public yea() {
        bdt I = hag.I(zx4.class);
        l18 l18Var = l18.b;
        this.k = l18Var.b(I, true);
        this.l = l18Var.b(hag.I(cej.class), true);
        this.m = ydr.a(uea.b);
        jyr b = btf.b(new yg6(23, this));
        this.n = b;
        this.o = ydr.a(c5b.a);
        ox6.B(new bca(((yx4) ((jea) b.getValue()).a.getValue()).e(null), 1), ot0.F(this), new xea(this, 0));
        ox6.B(new u21(10, new bca(((yx4) ((jea) b.getValue()).a.getValue()).e(6), 1), new bca(((yx4) ((jea) b.getValue()).a.getValue()).c(9), 2), new v42(this, null, 5)), ot0.F(this), new xea(this, 1));
    }

    public final Object a(Continuation continuation) {
        Object value = this.o.getValue();
        if (((List) value).isEmpty()) {
            value = null;
        }
        List list = (List) value;
        return list == null ? ((jea) this.n.getValue()).a(continuation) : list;
    }
}
