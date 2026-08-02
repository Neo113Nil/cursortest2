package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class pha implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qha b;
    public final /* synthetic */ rp7 c;

    public /* synthetic */ pha(qha qhaVar, rp7 rp7Var, int i) {
        this.a = i;
        this.b = qhaVar;
        this.c = rp7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qha qhaVar = this.b;
                rp7 rp7Var = this.c;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(45298594, new pha(qhaVar, rp7Var, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                qha qhaVar2 = this.b;
                rp7 rp7Var2 = this.c;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        zha zhaVar = (zha) qhaVar2.k.getValue();
                        mha mhaVar = (mha) qhaVar2.m.getValue();
                        oda odaVar = new oda(qhaVar2.d().a, qhaVar2.j);
                        l18 l18Var = l18.b;
                        bdt I = hag.I(g0l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        xha xhaVar = new xha(zhaVar, mhaVar, rp7Var2, odaVar, (g0l) qdcVar.C(I), qhaVar2.d(), qhaVar2.j);
                        oq5Var2.k0(xhaVar);
                        K = xhaVar;
                    }
                    ksw.u((xha) K, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
