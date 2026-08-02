package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CallbackToFutureAdapter$Completer {
    public boolean attemptedSetting;
    public ResolvableFuture cancellationFuture;
    public CallbackToFutureAdapter$SafeFuture future;
    public Object tag;

    public final void addCancellationListener(Runnable runnable, Executor executor) {
        ResolvableFuture resolvableFuture = this.cancellationFuture;
        if (resolvableFuture != null) {
            resolvableFuture.addListener(runnable, executor);
        }
    }

    public final void finalize() {
        ResolvableFuture resolvableFuture;
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = this.future;
        if (callbackToFutureAdapter$SafeFuture != null && !callbackToFutureAdapter$SafeFuture.delegate.isDone()) {
            final String str = "The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.tag;
            callbackToFutureAdapter$SafeFuture.setException(new Throwable(str) { // from class: androidx.concurrent.futures.CallbackToFutureAdapter$FutureGarbageCollectedException
                @Override // java.lang.Throwable
                public final synchronized Throwable fillInStackTrace() {
                    return this;
                }
            });
        }
        if (this.attemptedSetting || (resolvableFuture = this.cancellationFuture) == null) {
            return;
        }
        resolvableFuture.set(null);
    }

    public final boolean set(Object obj) {
        this.attemptedSetting = true;
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = this.future;
        boolean z = callbackToFutureAdapter$SafeFuture != null && callbackToFutureAdapter$SafeFuture.delegate.set(obj);
        if (z) {
            this.tag = null;
            this.future = null;
            this.cancellationFuture = null;
        }
        return z;
    }

    public final void setCancelled() {
        this.attemptedSetting = true;
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = this.future;
        if (callbackToFutureAdapter$SafeFuture == null || !callbackToFutureAdapter$SafeFuture.delegate.cancel(true)) {
            return;
        }
        this.tag = null;
        this.future = null;
        this.cancellationFuture = null;
    }

    public final boolean setException(Throwable th) {
        this.attemptedSetting = true;
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = this.future;
        boolean z = callbackToFutureAdapter$SafeFuture != null && callbackToFutureAdapter$SafeFuture.delegate.setException(th);
        if (z) {
            this.tag = null;
            this.future = null;
            this.cancellationFuture = null;
        }
        return z;
    }
}
