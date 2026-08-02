package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ps8 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qs8 b;

    public /* synthetic */ ps8(qs8 qs8Var, int i) {
        this.a = i;
        this.b = qs8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                boolean z = true;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    qs8 qs8Var = this.b;
                    if (qs8Var.d) {
                        oq5Var.Z(-1153017896);
                    } else {
                        oq5Var.Z(378448175);
                        z = pd.N(oq5Var);
                    }
                    oq5Var.p(false);
                    pd.b(new qzm[0], z, ild.C(-1618993092, new ps8(qs8Var, 1), oq5Var), oq5Var, 384, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    y2n.c(this.b.c, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
