package androidx.concurrent.futures;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.concurrent.futures.AbstractResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CallbackToFutureAdapter$SafeFuture implements ListenableFuture {
    public final WeakReference completerWeakReference;
    public final AnonymousClass1 delegate = new AbstractResolvableFuture() { // from class: androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture.1
        @Override // androidx.concurrent.futures.AbstractResolvableFuture
        public final String pendingToString() {
            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) CallbackToFutureAdapter$SafeFuture.this.completerWeakReference.get();
            return callbackToFutureAdapter$Completer == null ? "Completer object has been garbage collected, future will fail soon" : Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("tag=["), callbackToFutureAdapter$Completer.tag, "]");
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture$1] */
    public CallbackToFutureAdapter$SafeFuture(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
        this.completerWeakReference = new WeakReference(callbackToFutureAdapter$Completer);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) this.completerWeakReference.get();
        boolean cancel = cancel(z);
        if (cancel && callbackToFutureAdapter$Completer != null) {
            callbackToFutureAdapter$Completer.tag = null;
            callbackToFutureAdapter$Completer.future = null;
            callbackToFutureAdapter$Completer.cancellationFuture.set(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.delegate.value instanceof AbstractResolvableFuture.Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return isDone();
    }

    public final boolean setException(Throwable th) {
        return setException(th);
    }

    public final String toString() {
        return toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return get(j, timeUnit);
    }
}
