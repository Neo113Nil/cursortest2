package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ffa implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hfa b;
    public final /* synthetic */ rp7 c;

    public /* synthetic */ ffa(hfa hfaVar, rp7 rp7Var, int i) {
        this.a = i;
        this.b = hfaVar;
        this.c = rp7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hfa hfaVar = this.b;
                rp7 rp7Var = this.c;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-364448024, new ffa(hfaVar, rp7Var, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hfa hfaVar2 = this.b;
                rp7 rp7Var2 = this.c;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        ufa ufaVar = (ufa) hfaVar2.k.getValue();
                        efa efaVar = (efa) hfaVar2.m.getValue();
                        oda odaVar = new oda(hfaVar2.d().a, hfaVar2.j);
                        l18 l18Var = l18.b;
                        bdt I = hag.I(g0l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        rfa rfaVar = new rfa(ufaVar, efaVar, rp7Var2, odaVar, (g0l) qdcVar.C(I), hfaVar2.d(), hfaVar2.j);
                        oq5Var2.k0(rfaVar);
                        K = rfaVar;
                    }
                    leu.m((rfa) K, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
