package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class v2n implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p7s b;
    public final /* synthetic */ l3n c;

    public /* synthetic */ v2n(p7s p7sVar, l3n l3nVar, int i) {
        this.a = i;
        this.b = p7sVar;
        this.c = l3nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                x2n.d(this.b, this.c, hq5Var, rvf.R(1));
                break;
            case 1:
                num.getClass();
                x2n.c(this.b, this.c, hq5Var, rvf.R(1));
                break;
            case 2:
                int intValue = num.intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    x2n.c(this.b, this.c, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                int intValue2 = num.intValue();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    x2n.d(this.b, this.c, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ v2n(p7s p7sVar, l3n l3nVar, int i, int i2) {
        this.a = i2;
        this.b = p7sVar;
        this.c = l3nVar;
    }
}
