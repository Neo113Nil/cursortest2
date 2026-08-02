package bo.app;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class f6 extends FunctionReferenceImpl implements Function1 {
    public f6(g6 g6Var) {
        super(1, 0, g6.class, g6Var, "onConnectionFailed", "onConnectionFailed(Ljava/lang/Integer;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((g6) this.receiver).a((Integer) obj);
        return Unit.INSTANCE;
    }
}
