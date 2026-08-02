package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class u11 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b21 b;

    public /* synthetic */ u11(b21 b21Var, int i) {
        this.a = i;
        this.b = b21Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.d(false);
                return Unit.a;
            case 1:
                this.b.d(true);
                return Unit.a;
            default:
                b21 b21Var = this.b;
                c01 c01Var = b21Var.a;
                ia0 ia0Var = b21Var.b;
                return new qj1(c01Var, (w11) ((jyr) ia0Var.d).getValue(), (lwc) ((jyr) ia0Var.h).getValue(), (z66) ((jyr) ia0Var.g).getValue());
        }
    }
}
