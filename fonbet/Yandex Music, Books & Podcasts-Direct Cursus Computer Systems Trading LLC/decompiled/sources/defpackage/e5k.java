package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e5k implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5k b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ e5k(g5k g5kVar, boolean z, int i) {
        this.a = 0;
        this.b = g5kVar;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                g0g.e(this.b, this.c, hq5Var, rvf.R(1));
                break;
            case 1:
                int intValue = num.intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-32953243, new e5k(this.b, this.c, 2, (byte) 0), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                int intValue2 = num.intValue();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    g0g.e(this.b, this.c, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ e5k(g5k g5kVar, boolean z, int i, byte b) {
        this.a = i;
        this.b = g5kVar;
        this.c = z;
    }
}
