package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class qw7 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ sw7 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qw7(sw7 sw7Var, int i) {
        super(0);
        this.r = i;
        this.s = sw7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        sw7 sw7Var = this.s;
        switch (i) {
            case 0:
                return quj.g;
            default:
                wdo wdoVar = (wdo) men.t(sw7Var, deo.b);
                ji0 ji0Var = sw7Var.v;
                if (wdoVar == null) {
                    if (ji0Var != null) {
                        sw7Var.T0(ji0Var);
                    }
                } else if (ji0Var == null) {
                    int i2 = 0;
                    pw7 pw7Var = new pw7(i2, sw7Var);
                    qw7 qw7Var = new qw7(sw7Var, i2);
                    uoi uoiVar = sw7Var.r;
                    boolean z = sw7Var.s;
                    float f = sw7Var.t;
                    act actVar = ceo.a;
                    ji0 ji0Var2 = new ji0(uoiVar, z, f, pw7Var, qw7Var);
                    sw7Var.S0(ji0Var2);
                    sw7Var.v = ji0Var2;
                }
                return Unit.a;
        }
    }
}
