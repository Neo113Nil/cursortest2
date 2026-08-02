package androidx.compose.runtime;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface MonotonicFrameClock extends CoroutineContext.Element {
    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.Key getKey() {
        return NeverEqualPolicy.$$INSTANCE;
    }

    Object withFrameNanos(Continuation continuation, Function1 function1);
}
