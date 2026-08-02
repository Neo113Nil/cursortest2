package bo.app;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class d6 extends FunctionReferenceImpl implements Function1 {
    public d6(g6 g6Var) {
        super(1, 0, g6.class, g6Var, "ingestDustMessages", "ingestDustMessages$android_sdk_base_release(Lcom/braze/models/dust/IDustMessage;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k9 k9Var = (k9) obj;
        k9Var.getClass();
        ((g6) this.receiver).a(k9Var);
        return Unit.INSTANCE;
    }
}
