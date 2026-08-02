package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class kam implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lam b;

    public /* synthetic */ kam(lam lamVar, int i) {
        this.a = i;
        this.b = lamVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                lam lamVar = this.b;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-1562626185, new kam(lamVar, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                lam lamVar2 = this.b;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        tam tamVar = (tam) lamVar2.j.getValue();
                        nnd nndVar = lamVar2.o;
                        f35 f35Var = (f35) lamVar2.m.getValue();
                        g35 g35Var = (g35) lamVar2.l.getValue();
                        l18 l18Var = l18.b;
                        bdt I = hag.I(g0l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        mam mamVar = new mam(tamVar, nndVar, f35Var, g35Var, (g0l) qdcVar.C(I), lamVar2.d(), lamVar2.getK());
                        oq5Var2.k0(mamVar);
                        K = mamVar;
                    }
                    gdg.k((mam) K, oq5Var2, 0);
                    rzf.j(((tam) lamVar2.j.getValue()).o, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
