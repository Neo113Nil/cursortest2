package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    public final CoroutineContext coroutineContext;
    public final Lifecycle lifecycle;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        lifecycle.getClass();
        coroutineContext.getClass();
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            JobKt.cancel(coroutineContext, (CancellationException) null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            lifecycle.removeObserver(this);
            JobKt.cancel(this.coroutineContext, (CancellationException) null);
        }
    }
}
