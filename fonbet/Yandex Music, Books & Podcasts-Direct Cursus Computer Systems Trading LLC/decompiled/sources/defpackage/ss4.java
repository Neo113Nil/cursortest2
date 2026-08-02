package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ss4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys4 b;

    public /* synthetic */ ss4(ys4 ys4Var, int i) {
        this.a = 0;
        this.b = ys4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                x97.e(this.b, hq5Var, rvf.R(1));
                break;
            case 1:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                x97.e(this.b, hq5Var, 0);
            default:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                x97.e(this.b, hq5Var, 0);
        }
        return Unit.a;
    }

    public /* synthetic */ ss4(ys4 ys4Var, int i, byte b) {
        this.a = i;
        this.b = ys4Var;
    }
}
