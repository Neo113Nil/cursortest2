package com.google.common.util.concurrent;

import androidx.room.Room;
import androidx.tracing.Trace;
import com.google.common.base.Function;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import kotlin.io.ByteStreamsKt;

/* loaded from: classes4.dex */
public abstract class AbstractCatchingFuture extends FluentFuture.TrustedFuture implements Runnable {
    public Class exceptionType;
    public Object fallback;
    public ListenableFuture inputFuture;

    public final class AsyncCatchingFuture extends AbstractCatchingFuture {
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public final Object doFallback(Object obj, Throwable th) {
            AsyncFunction asyncFunction = (AsyncFunction) obj;
            ListenableFuture apply = asyncFunction.apply(th);
            Trace.checkNotNull("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", apply, asyncFunction);
            return apply;
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public final void setResult(Object obj) {
            setFuture((ListenableFuture) obj);
        }
    }

    public final class CatchingFuture extends AbstractCatchingFuture {
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public final Object doFallback(Object obj, Throwable th) {
            return ((Function) obj).apply(th);
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public final void setResult(Object obj) {
            set(obj);
        }
    }

    public AbstractCatchingFuture(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.inputFuture = listenableFuture;
        this.exceptionType = cls;
        this.fallback = obj;
    }

    public static CatchingFuture create(FluentFuture fluentFuture, Class cls, Function function, MoreExecutors$ScheduledListeningDecorator moreExecutors$ScheduledListeningDecorator) {
        CatchingFuture catchingFuture = new CatchingFuture(fluentFuture, cls, function);
        fluentFuture.addListener(catchingFuture, Room.rejectionPropagatingExecutor(moreExecutors$ScheduledListeningDecorator, catchingFuture));
        return catchingFuture;
    }

    public static AsyncCatchingFuture createAsync(ListenableFuture listenableFuture, Class cls, AsyncFunction asyncFunction, Executor executor) {
        AsyncCatchingFuture asyncCatchingFuture = new AsyncCatchingFuture(listenableFuture, cls, asyncFunction);
        listenableFuture.addListener(asyncCatchingFuture, Room.rejectionPropagatingExecutor(executor, asyncCatchingFuture));
        return asyncCatchingFuture;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        ListenableFuture listenableFuture = this.inputFuture;
        if ((listenableFuture != null) & (this.valueField instanceof AbstractFuture.Cancellation)) {
            listenableFuture.cancel(wasInterrupted());
        }
        this.inputFuture = null;
        this.exceptionType = null;
        this.fallback = null;
    }

    public abstract Object doFallback(Object obj, Throwable th);

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String pendingToString() {
        String str;
        ListenableFuture listenableFuture = this.inputFuture;
        Class cls = this.exceptionType;
        Object obj = this.fallback;
        String pendingToString = super.pendingToString();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (pendingToString != null) {
                return str.concat(pendingToString);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        ListenableFuture listenableFuture = this.inputFuture;
        Class cls = this.exceptionType;
        Object obj2 = this.fallback;
        if (((obj2 == null) || ((listenableFuture == null) | (cls == null))) || (this.valueField instanceof AbstractFuture.Cancellation)) {
            return;
        }
        this.inputFuture = null;
        try {
            th = listenableFuture instanceof AbstractFutureState ? ((AbstractFutureState) listenableFuture).tryInternalFastPathGetFailure() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = Futures.getDone(listenableFuture);
            if (th != null) {
                set(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                setFuture(listenableFuture);
                return;
            }
            try {
                Object doFallback = doFallback(obj2, th);
                this.exceptionType = null;
                this.fallback = null;
                setResult(doFallback);
                return;
            } catch (Throwable th2) {
                try {
                    ByteStreamsKt.restoreInterruptIfIsInterruptedException(th2);
                    setException(th2);
                    return;
                } finally {
                    this.exceptionType = null;
                    this.fallback = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }

    public abstract void setResult(Object obj);
}
