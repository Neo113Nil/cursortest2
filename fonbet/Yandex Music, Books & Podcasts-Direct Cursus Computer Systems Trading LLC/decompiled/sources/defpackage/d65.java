package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class d65 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ k65 b;

    public /* synthetic */ d65(k65 k65Var) {
        this.b = k65Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                qwp.h(this.b, hq5Var, rvf.R(1));
                break;
            default:
                int intValue = num.intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    qwp.h(this.b, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ d65(k65 k65Var, int i) {
        this.b = k65Var;
    }
}
