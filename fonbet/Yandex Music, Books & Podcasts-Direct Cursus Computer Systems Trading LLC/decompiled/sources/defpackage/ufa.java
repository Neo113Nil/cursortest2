package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ufa extends bfu {
    public final jyr k = l18.b.b(hag.I(zx4.class), true);
    public final xdr l = ydr.a(vfa.b);
    public final jyr m;
    public final xdr n;

    public ufa() {
        jyr b = btf.b(new yg6(24, this));
        this.m = b;
        this.n = ydr.a(c5b.a);
        ox6.B(new bca(((yx4) ((qfa) b.getValue()).a.getValue()).x(null), 5), ot0.F(this), new sfa(this, 0));
        ox6.B(zsd.Q(new bca(((yx4) ((qfa) b.getValue()).a.getValue()).x(6), 5), new bca(((yx4) ((qfa) b.getValue()).a.getValue()).A(null, 9, null, Boolean.TRUE), 4), new bca(((yx4) ((qfa) b.getValue()).a.getValue()).w(9), 3), new tfa(4, 0, null)), ot0.F(this), new sfa(this, 1));
    }

    public final Object a(Continuation continuation) {
        Object value = this.n.getValue();
        if (((List) value).isEmpty()) {
            value = null;
        }
        List list = (List) value;
        return list == null ? ((qfa) this.m.getValue()).a(continuation) : list;
    }
}
