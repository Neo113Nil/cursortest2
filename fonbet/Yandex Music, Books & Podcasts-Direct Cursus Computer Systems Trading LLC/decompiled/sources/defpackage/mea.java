package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class mea implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nea b;
    public final /* synthetic */ rp7 c;

    public /* synthetic */ mea(nea neaVar, rp7 rp7Var, int i) {
        this.a = i;
        this.b = neaVar;
        this.c = rp7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                nea neaVar = this.b;
                rp7 rp7Var = this.c;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-1433245419, new mea(neaVar, rp7Var, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                nea neaVar2 = this.b;
                rp7 rp7Var2 = this.c;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        yea yeaVar = (yea) neaVar2.k.getValue();
                        kea keaVar = (kea) neaVar2.m.getValue();
                        oda odaVar = new oda(neaVar2.d().a, neaVar2.j);
                        l18 l18Var = l18.b;
                        bdt I = hag.I(g0l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        tea teaVar = new tea(yeaVar, keaVar, rp7Var2, odaVar, (g0l) qdcVar.C(I), neaVar2.d(), neaVar2.j);
                        oq5Var2.k0(teaVar);
                        K = teaVar;
                    }
                    wct.h((tea) K, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
