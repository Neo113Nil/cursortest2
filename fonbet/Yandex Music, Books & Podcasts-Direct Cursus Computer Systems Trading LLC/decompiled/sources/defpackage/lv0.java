package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class lv0 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ pv0 b;
    public final /* synthetic */ yks c;

    public /* synthetic */ lv0(pv0 pv0Var, yks yksVar) {
        this.b = pv0Var;
        this.c = yksVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                this.b.a(this.c, hq5Var, rvf.R(1));
                break;
            default:
                int intValue = num.intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    this.b.a(this.c, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lv0(pv0 pv0Var, yks yksVar, int i) {
        this.b = pv0Var;
        this.c = yksVar;
    }
}
