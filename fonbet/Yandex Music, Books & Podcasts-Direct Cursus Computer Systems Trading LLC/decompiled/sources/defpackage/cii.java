package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class cii implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ eii b;

    public /* synthetic */ cii(eii eiiVar) {
        this.b = eiiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                this.b.a(rvf.R(7), hq5Var);
                break;
            default:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                this.b.a(6, hq5Var);
        }
        return Unit.a;
    }

    public /* synthetic */ cii(eii eiiVar, int i) {
        this.b = eiiVar;
    }
}
