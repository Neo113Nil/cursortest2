package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class bs7 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ w1u c;
    public final /* synthetic */ hvq d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ bs7(int i, w1u w1uVar, hvq hvqVar, Function0 function0) {
        this.b = i;
        this.c = w1uVar;
        this.d = hvqVar;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                wct.g(this.b, this.c, this.d, this.e, (hq5) obj, R);
                break;
            default:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                wct.g(this.b, this.c, this.d, this.e, hq5Var, 0);
        }
        return Unit.a;
    }

    public /* synthetic */ bs7(int i, w1u w1uVar, hvq hvqVar, Function0 function0, int i2) {
        this.b = i;
        this.c = w1uVar;
        this.d = hvqVar;
        this.e = function0;
    }
}
