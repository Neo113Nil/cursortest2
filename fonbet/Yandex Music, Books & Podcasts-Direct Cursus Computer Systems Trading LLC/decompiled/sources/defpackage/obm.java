package defpackage;

import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class obm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qbm b;

    public /* synthetic */ obm(qbm qbmVar, int i) {
        this.a = i;
        this.b = qbmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-1517912436, new obm(this.b, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                qbm qbmVar = this.b;
                ybf ybfVar = qbmVar.j;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = gld.R(g.a, oq5Var2);
                        oq5Var2.k0(K);
                    }
                    mm6 mm6Var = (mm6) K;
                    Object K2 = oq5Var2.K();
                    if (K2 == kjnVar) {
                        jbm jbmVar = new jbm((gcm) ybfVar.getValue(), (qbj) qbmVar.m.getValue(), qbmVar.A(), mm6Var, (tmb) ((vbj) qbmVar.l.getValue()).b.getValue());
                        oq5Var2.k0(jbmVar);
                        K2 = jbmVar;
                    }
                    ldg.b((jbm) K2, qbmVar.x(), oq5Var2, 64);
                    rzf.j(((gcm) ybfVar.getValue()).D, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
