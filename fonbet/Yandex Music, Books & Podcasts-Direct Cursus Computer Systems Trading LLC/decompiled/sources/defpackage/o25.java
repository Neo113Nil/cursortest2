package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class o25 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p25 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ o25(p25 p25Var, Integer num, int i) {
        this.a = i;
        this.b = p25Var;
        this.c = num;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(587359832, new o25(this.b, this.c, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                p25 p25Var = this.b;
                ybf ybfVar = p25Var.k;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        K = new v25((xbc) p25Var.l.getValue(), (d35) ybfVar.getValue(), (mwl) p25Var.m.getValue());
                        oq5Var2.k0(K);
                    }
                    v25 v25Var = (v25) K;
                    tmb x = p25Var.x();
                    Integer num = this.c;
                    wdp.M(v25Var, x, num != null ? num.intValue() : 0, oq5Var2, 64);
                    rzf.j(((d35) ybfVar.getValue()).r, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
