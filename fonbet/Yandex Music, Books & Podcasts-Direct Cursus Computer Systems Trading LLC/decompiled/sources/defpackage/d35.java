package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class d35 extends bfu {
    public final jyr k;
    public final ime l;
    public final imp m;
    public final xdr n;
    public final fkn o;
    public final xdr p;
    public final xdr q;
    public final j0q r;
    public final yk3 s;
    public final xdr t;
    public final xdr u;
    public final fkn v;

    public d35(fnb fnbVar, cvo cvoVar) {
        cvoVar.getClass();
        l18 l18Var = l18.b;
        this.k = l18Var.b(hag.I(vxr.class), true);
        jyr b = l18Var.b(hag.I(z66.class), true);
        bdt I = hag.I(nwl.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.l = new ime(27);
        this.m = new imp();
        xdr a = ydr.a(w25.a);
        this.n = a;
        this.o = new fkn(a);
        Continuation continuation = null;
        this.p = ydr.a(null);
        this.q = ydr.a(Boolean.FALSE);
        this.r = new j0q();
        cvoVar.getClass();
        yk3 yk3Var = new yk3();
        yk3Var.b = cvoVar;
        yk3Var.c = l18.b.b(hag.I(frt.class), true);
        yk3Var.d = new pwl(fnbVar, 0);
        yk3Var.a = true;
        this.s = yk3Var;
        c5b c5bVar = c5b.a;
        this.t = ydr.a(c5bVar);
        this.u = ydr.a(c5bVar);
        vdr c = ((z66) b.getValue()).c();
        this.v = zsd.F0(new d64(c, 4), ot0.F(this), lbq.a, Boolean.valueOf(((x66) c.getValue()).b == u0j.a));
        x97.y(ot0.F(this), null, null, new vv4(this, continuation, 3), 3);
    }

    public static final void G(d35 d35Var, s0m s0mVar) {
        xdr xdrVar = d35Var.u;
        d35Var.m.getClass();
        s0mVar.getClass();
        xdrVar.l(u75.h(new nbc(s0mVar == s0m.e), new sbc(s0mVar == s0m.b), new kbc(s0mVar == s0m.d)));
    }

    public static final void H(d35 d35Var, s0m s0mVar) {
        xdr xdrVar = d35Var.t;
        d35Var.m.getClass();
        s0mVar.getClass();
        xdrVar.l(u75.h(new obc(s0mVar == s0m.a), new mbc(s0mVar == s0m.c), new sbc(s0mVar == s0m.b), new kbc(s0mVar == s0m.d)));
    }

    public static final List a(d35 d35Var, List list, s0m s0mVar) {
        int ordinal = s0mVar.ordinal();
        if (ordinal == 0) {
            return CollectionsKt.o0(list, new dl4(8));
        }
        if (ordinal == 1) {
            return CollectionsKt.o0(list, new dl4(10));
        }
        if (ordinal == 2) {
            return CollectionsKt.o0(list, new dl4(11));
        }
        if (ordinal == 3) {
            return CollectionsKt.o0(list, new dl4(9));
        }
        if (ordinal == 4) {
            return CollectionsKt.o0(list, new dl4(12));
        }
        b6e.s();
        return null;
    }

    public final ArrayList J(List list) {
        List<cvl> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (cvl cvlVar : list2) {
            iwl iwlVar = iwl.a;
            arrayList.add(new dwl(iwl.a(cvlVar, ((Boolean) this.v.a.getValue()).booleanValue()), cvlVar));
        }
        return arrayList;
    }
}
