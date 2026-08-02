package defpackage;

import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ha3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ja3 b;

    public /* synthetic */ ha3(ja3 ja3Var, int i) {
        this.a = i;
        this.b = ja3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(1794820065, new ha3(this.b, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ja3 ja3Var = this.b;
                ybf ybfVar = ja3Var.j;
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
                        y93 y93Var = new y93((ob3) ybfVar.getValue(), (qbj) ja3Var.m.getValue(), ja3Var.A(), mm6Var, (tmb) ((vbj) ja3Var.l.getValue()).b.getValue());
                        oq5Var2.k0(y93Var);
                        K2 = y93Var;
                    }
                    n7w.b((y93) K2, ja3Var.x(), oq5Var2, 64);
                    rzf.j(((ob3) ybfVar.getValue()).E, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
