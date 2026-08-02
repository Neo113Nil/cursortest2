package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class u93 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ y93 b;

    public /* synthetic */ u93(y93 y93Var, int i) {
        this.a = i;
        this.b = y93Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                y93 y93Var = this.b;
                y93Var.b.a((oq) obj, y93Var.c.g, new m5(1, y93Var.d.b(), tnb.class, "reportDomainObjectDeeplinkStarted", "reportDomainObjectDeeplinkStarted(Ljava/lang/String;)V", 0, 25));
                break;
            case 1:
                final y93 y93Var2 = this.b;
                final int i = 0;
                final int i2 = 1;
                y93Var2.b.c((oq) obj, new Function0() { // from class: w93
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                y93Var2.a.L(true);
                                break;
                            default:
                                y93Var2.a.L(false);
                                break;
                        }
                        return Unit.a;
                    }
                }, new Function0() { // from class: w93
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                y93Var2.a.L(true);
                                break;
                            default:
                                y93Var2.a.L(false);
                                break;
                        }
                        return Unit.a;
                    }
                });
                break;
            default:
                this.b.b.a.finish();
                break;
        }
        return Unit.a;
    }
}
