package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class rw7 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ sw7 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rw7(sw7 sw7Var, int i) {
        super(0);
        this.r = i;
        this.s = sw7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        udo udoVar;
        int i = this.r;
        sw7 sw7Var = this.s;
        switch (i) {
            case 0:
                xdo xdoVar = (xdo) men.t(sw7Var, eeo.a);
                if (xdoVar == null || (udoVar = xdoVar.b) == null) {
                    return ((ma5) men.t(sw7Var, pa5.a)).g() ? ((double) c3x.N(((d85) men.t(sw7Var, sb6.a)).a)) > 0.5d ? eeo.d : eeo.e : eeo.f;
                }
                return udoVar;
            default:
                xdo xdoVar2 = (xdo) men.t(sw7Var, eeo.a);
                ji0 ji0Var = sw7Var.v;
                if (xdoVar2 == null) {
                    if (ji0Var != null) {
                        sw7Var.T0(ji0Var);
                    }
                    sw7Var.v = null;
                } else if (ji0Var == null) {
                    pw7 pw7Var = new pw7(1, sw7Var);
                    rw7 rw7Var = new rw7(sw7Var, 0);
                    uoi uoiVar = sw7Var.r;
                    boolean z = sw7Var.s;
                    float f = sw7Var.t;
                    act actVar = ceo.a;
                    ji0 ji0Var2 = new ji0(uoiVar, z, f, pw7Var, rw7Var);
                    sw7Var.S0(ji0Var2);
                    sw7Var.v = ji0Var2;
                }
                return Unit.a;
        }
    }
}
