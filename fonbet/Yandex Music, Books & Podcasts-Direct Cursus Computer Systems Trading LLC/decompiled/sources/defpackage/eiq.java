package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class eiq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jp0 b;

    public /* synthetic */ eiq(jp0 jp0Var, int i) {
        this.a = i;
        this.b = jp0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.e();
                return Unit.a;
            case 1:
                return Boolean.valueOf(((bci) this.b.c).c() != cci.a);
            default:
                jp0 jp0Var = this.b;
                cci b = ((bci) jp0Var.c).b();
                cci cciVar = cci.a;
                return Boolean.valueOf(b == cciVar && ((bci) jp0Var.c).c() == cciVar);
        }
    }
}
