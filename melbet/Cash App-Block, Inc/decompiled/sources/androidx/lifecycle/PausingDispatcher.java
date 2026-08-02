package androidx.lifecycle;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes3.dex */
public final class PausingDispatcher extends CoroutineDispatcher {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        coroutineContext.getClass();
        runnable.getClass();
        DispatchQueue dispatchQueue = this.dispatchQueue;
        dispatchQueue.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        HandlerContext handlerContext = MainDispatcherLoader.dispatcher.immediate;
        if (handlerContext.isDispatchNeeded(coroutineContext) || dispatchQueue.finished || !dispatchQueue.paused) {
            handlerContext.dispatch(coroutineContext, new DispatchQueue$$ExternalSyntheticLambda0(0, dispatchQueue, runnable));
        } else if (((ArrayDeque) dispatchQueue.queue).offer(runnable)) {
            dispatchQueue.drainQueue();
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("cannot enqueue any more runnables");
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        if (MainDispatcherLoader.dispatcher.immediate.isDispatchNeeded(coroutineContext)) {
            return true;
        }
        DispatchQueue dispatchQueue = this.dispatchQueue;
        return !(dispatchQueue.finished || !dispatchQueue.paused);
    }
}
