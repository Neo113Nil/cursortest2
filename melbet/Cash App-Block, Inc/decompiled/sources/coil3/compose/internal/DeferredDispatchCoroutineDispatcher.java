package coil3.compose.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes3.dex */
public final class DeferredDispatchCoroutineDispatcher extends CoroutineDispatcher {
    public static final /* synthetic */ AtomicIntegerFieldUpdater _unconfined$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(DeferredDispatchCoroutineDispatcher.class, "_unconfined$volatile");
    public volatile /* synthetic */ int _unconfined$volatile = 1;
    public final CoroutineDispatcher delegate;

    public DeferredDispatchCoroutineDispatcher(CoroutineDispatcher coroutineDispatcher) {
        this.delegate = coroutineDispatcher;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        getCurrentDispatcher().dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        getCurrentDispatcher().dispatchYield(coroutineContext, runnable);
    }

    public final CoroutineDispatcher getCurrentDispatcher() {
        return _unconfined$volatile$FU.get(this) == 1 ? Dispatchers.Unconfined : this.delegate;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return getCurrentDispatcher().isDispatchNeeded(coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i) {
        return getCurrentDispatcher().limitedParallelism(i);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.delegate + ")";
    }
}
