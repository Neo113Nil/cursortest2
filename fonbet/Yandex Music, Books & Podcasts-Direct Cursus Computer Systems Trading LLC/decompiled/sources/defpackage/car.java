package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class car implements Continuation, om6 {
    public final Continuation a;
    public final CoroutineContext b;

    public car(Continuation continuation, CoroutineContext coroutineContext) {
        this.a = continuation;
        this.b = coroutineContext;
    }

    @Override // defpackage.om6
    public final om6 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof om6) {
            return (om6) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.b;
    }

    @Override // defpackage.om6
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
