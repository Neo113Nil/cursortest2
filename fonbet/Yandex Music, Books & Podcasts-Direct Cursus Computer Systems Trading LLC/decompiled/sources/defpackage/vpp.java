package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class vpp implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ypp b;

    public /* synthetic */ vpp(ypp yppVar, int i) {
        this.a = i;
        this.b = yppVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(546591335, new vpp(this.b, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    u7g.s(0, oq5Var2);
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        ypp yppVar = this.b;
                        eqp eqpVar = new eqp((pqp) yppVar.k.getValue(), (tpp) yppVar.m.getValue(), (hsp) yppVar.n.getValue(), (jsp) yppVar.o.getValue(), ((Boolean) ((qqp) yppVar.l.getValue()).f.getValue()).booleanValue(), yppVar.q, (ofj) yppVar.p.getValue());
                        oq5Var2.k0(eqpVar);
                        K = eqpVar;
                    }
                    cb0.n((eqp) K, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
