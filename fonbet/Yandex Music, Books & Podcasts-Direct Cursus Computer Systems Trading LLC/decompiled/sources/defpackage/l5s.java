package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class l5s implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ m5s b;

    public /* synthetic */ l5s(m5s m5sVar) {
        this.b = m5sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    ngg.j(this.b, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                num.getClass();
                ngg.j(this.b, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ l5s(m5s m5sVar, int i) {
        this.b = m5sVar;
    }
}
