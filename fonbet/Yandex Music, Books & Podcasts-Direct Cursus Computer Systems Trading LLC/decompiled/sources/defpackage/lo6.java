package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class lo6 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ po6 b;
    public final /* synthetic */ frs c;
    public final /* synthetic */ lzs d;

    public /* synthetic */ lo6(po6 po6Var, frs frsVar, lzs lzsVar) {
        this.b = po6Var;
        this.c = frsVar;
        this.d = lzsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                vut.r(this.b.a, this.d, null, null, 0.0f, this.c == frs.c, hq5Var, 0, 28);
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    float f = 8;
                    vut.r(this.b.a, this.d, null, new q0k(16, f, 0, f), 80, this.c == frs.c, oq5Var2, 27648, 4);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lo6(po6 po6Var, lzs lzsVar, frs frsVar) {
        this.b = po6Var;
        this.d = lzsVar;
        this.c = frsVar;
    }
}
