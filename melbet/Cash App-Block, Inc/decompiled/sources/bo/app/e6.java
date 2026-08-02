package bo.app;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class e6 extends FunctionReferenceImpl implements Function0 {
    public e6(g6 g6Var) {
        super(0, 0, g6.class, g6Var, "onConnectionSuccess", "onConnectionSuccess()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((g6) this.receiver).g();
        return Unit.INSTANCE;
    }
}
