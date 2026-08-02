package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class yvp extends bfu {
    public final zwp k;
    public final swp l;
    public final cxp m;
    public final Function2 n;
    public final Function0 o;
    public final xdr p;
    public final xdr q;
    public final fkn r;
    public final xdr s;

    public yvp(zwp zwpVar, swp swpVar, cxp cxpVar, kun kunVar, boolean z, eu0 eu0Var, Function0 function0) {
        ArrayList arrayList;
        boolean hasCover;
        swpVar.getClass();
        cxpVar.getClass();
        kunVar.getClass();
        eu0Var.getClass();
        this.k = zwpVar;
        this.l = swpVar;
        this.m = cxpVar;
        this.n = kunVar;
        this.o = function0;
        ydr.a(zwpVar);
        xdr a = ydr.a(svp.a);
        this.p = a;
        this.q = a;
        eno enoVar = new eno(new kun(this, (Continuation) null, 20));
        cq4 F = ot0.F(this);
        Boolean bool = Boolean.FALSE;
        this.r = zsd.F0(enoVar, F, lbq.b, bool);
        this.s = ydr.a(bool);
        List h = u75.h(zxp.a, zxp.b);
        if (z) {
            List h2 = u75.h(cyp.b, dyp.b);
            arrayList = new ArrayList();
            for (Object obj : h2) {
                if (eu0Var.a(((eyp) obj).a)) {
                    arrayList.add(obj);
                }
            }
        } else {
            List h3 = u75.h(byp.b, ayp.b);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : h3) {
                eyp eypVar = (eyp) obj2;
                zwp zwpVar2 = this.k;
                zwpVar2.getClass();
                jxp jxpVar = zwpVar2.a;
                if ((jxpVar instanceof hxp) || (jxpVar instanceof dxp) || (jxpVar instanceof gxp)) {
                    hasCover = zwpVar2.b.a.hasCover();
                } else {
                    if (!(jxpVar instanceof exp) && !(jxpVar instanceof ixp) && !(jxpVar instanceof fxp)) {
                        b6e.s();
                        throw null;
                    }
                    hasCover = false;
                }
                if (hasCover && eu0Var.a(eypVar.a)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        }
        xdr xdrVar = this.p;
        tvp tvpVar = new tvp(CollectionsKt.g0(arrayList, h));
        xdrVar.getClass();
        xdrVar.m(null, tvpVar);
    }
}
