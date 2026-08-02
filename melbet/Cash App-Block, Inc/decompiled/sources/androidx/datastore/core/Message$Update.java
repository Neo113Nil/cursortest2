package androidx.datastore.core;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferredImpl;

/* loaded from: classes.dex */
public final class Message$Update {
    public final CompletableDeferredImpl ack;
    public final CoroutineContext callerContext;
    public final State lastState;
    public final Function2 transform;

    public Message$Update(Function2 function2, CompletableDeferredImpl completableDeferredImpl, State state, CoroutineContext coroutineContext) {
        function2.getClass();
        coroutineContext.getClass();
        this.transform = function2;
        this.ack = completableDeferredImpl;
        this.lastState = state;
        this.callerContext = coroutineContext;
    }
}
