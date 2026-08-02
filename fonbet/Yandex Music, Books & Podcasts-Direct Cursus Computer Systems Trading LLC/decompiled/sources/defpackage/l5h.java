package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class l5h implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n5h b;
    public final /* synthetic */ ix6 c;

    public /* synthetic */ l5h(n5h n5hVar, ix6 ix6Var, int i) {
        this.a = i;
        this.b = n5hVar;
        this.c = ix6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                n5h n5hVar = this.b;
                ix6 ix6Var = this.c;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(1270221961, new l5h(n5hVar, ix6Var, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                n5h n5hVar2 = this.b;
                ix6 ix6Var2 = this.c;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        t5h t5hVar = (t5h) n5hVar2.k.getValue();
                        uy4 uy4Var = (uy4) n5hVar2.m.getValue();
                        iwe iweVar = new iwe(n5hVar2.d().a);
                        l18 l18Var = l18.b;
                        bdt I = hag.I(g0l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        r5h r5hVar = new r5h(t5hVar, uy4Var, ix6Var2, iweVar, (g0l) qdcVar.C(I), n5hVar2.d(), n5hVar2.j);
                        oq5Var2.k0(r5hVar);
                        K = r5hVar;
                    }
                    s7g.a((r5h) K, oq5Var2, 0);
                    rzf.j(((t5h) n5hVar2.k.getValue()).p, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
