package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* loaded from: classes5.dex */
public abstract class g7o extends kq2 {
    public g7o(Continuation continuation) {
        super(continuation);
        if (continuation == null || continuation.getContext() == g.a) {
            return;
        }
        xq0.x("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return g.a;
    }
}
