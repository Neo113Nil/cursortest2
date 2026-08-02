package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class tcf implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ycf b;
    public final /* synthetic */ ix6 c;

    public /* synthetic */ tcf(ycf ycfVar, ix6 ix6Var, int i) {
        this.a = i;
        this.b = ycfVar;
        this.c = ix6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-1664213720, new tcf(this.b, this.c, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ycf ycfVar = this.b;
                ybf ybfVar = ycfVar.k;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        K = new cdf((xbc) ycfVar.o.getValue(), (gdf) ybfVar.getValue(), (oy4) ycfVar.m.getValue(), this.c);
                        oq5Var2.k0(K);
                    }
                    kg5.h((cdf) K, oq5Var2, 0);
                    rzf.j(((gdf) ybfVar.getValue()).p, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
