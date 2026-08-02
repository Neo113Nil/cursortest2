package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class aea extends bfu {
    public final List k;
    public final xdr l = ydr.a(cea.a);
    public final xdr m = ydr.a(c5b.a);
    public final j6e n;
    public final fkn o;
    public final jyr p;
    public final jyr q;
    public final jyr r;

    public aea(ArrayList arrayList) {
        this.k = arrayList;
        j6e j6eVar = new j6e(25);
        this.n = j6eVar;
        this.o = (fkn) j6eVar.b;
        this.p = l18.b.b(hag.I(zx4.class), true);
        this.q = btf.b(new yg6(22, this));
        this.r = btf.b(new bv7(19));
        x97.y(ot0.F(this), null, null, new f98(this, null, 10), 3);
    }

    public static final void G(aea aeaVar, qda qdaVar) {
        xdr xdrVar = aeaVar.m;
        aeaVar.H().getClass();
        qdaVar.getClass();
        xdrVar.l(u75.h(new pbc(qdaVar == qda.a), new kbc(qdaVar == qda.b)));
    }

    public static xb1 J(c01 c01Var) {
        c01Var.getClass();
        String w = vz1.w(c01Var.q.a);
        String str = c01Var.b;
        int i = c01Var.g;
        w3g w3gVar = new w3g(tt0.C(i), dag.A(i, false), false);
        if (i <= 0) {
            w3gVar = null;
        }
        return new xb1(c01Var, new jd1(w, str, false, w3gVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(aea aeaVar) {
        xdr xdrVar = aeaVar.m;
        yx4 yx4Var = (yx4) ((rda) aeaVar.q.getValue()).a.getValue();
        ox6.B(new u21(10, xdrVar, yx4.y(new pjc[]{((e6q) yx4Var.a).e}, new vw4(yx4Var, null, 0 == true ? 1 : 0, 1)), new v42(aeaVar, 0 == true ? 1 : 0, 4)), ot0.F(aeaVar), new u58(8, aeaVar));
    }

    public final bea H() {
        return (bea) this.r.getValue();
    }
}
