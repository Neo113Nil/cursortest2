package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class az1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bz1 b;

    public /* synthetic */ az1(bz1 bz1Var, int i) {
        this.a = i;
        this.b = bz1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                bz1 bz1Var = this.b;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(20255014, new az1(bz1Var, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                bz1 bz1Var2 = this.b;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        kz1 kz1Var = (kz1) bz1Var2.j.getValue();
                        le3 le3Var = bz1Var2.o;
                        gw4 gw4Var = (gw4) bz1Var2.m.getValue();
                        hw4 hw4Var = (hw4) bz1Var2.l.getValue();
                        l18 l18Var = l18.b;
                        bdt I = hag.I(g0l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        dz1 dz1Var = new dz1(kz1Var, le3Var, gw4Var, hw4Var, (g0l) qdcVar.C(I), bz1Var2.d(), bz1Var2.getJ());
                        oq5Var2.k0(dz1Var);
                        K = dz1Var;
                    }
                    bkp.I((dz1) K, oq5Var2, 0);
                    rzf.j(((kz1) bz1Var2.j.getValue()).o, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
