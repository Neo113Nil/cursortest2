package com.google.common.util.concurrent;

import androidx.tracing.Trace;
import com.google.common.base.Function;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.io.ByteStreamsKt;

/* loaded from: classes.dex */
public abstract class AbstractTransformFuture extends FluentFuture.TrustedFuture implements Runnable {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Object function;
    public ListenableFuture inputFuture;

    public final class AsyncTransformFuture extends AbstractTransformFuture {
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final Object doTransform(Object obj, Object obj2) {
            AsyncFunction asyncFunction = (AsyncFunction) obj;
            ListenableFuture apply = asyncFunction.apply(obj2);
            Trace.checkNotNull("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", apply, asyncFunction);
            return apply;
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final void setResult(Object obj) {
            setFuture((ListenableFuture) obj);
        }
    }

    /* loaded from: classes4.dex */
    public final class TransformFuture extends AbstractTransformFuture {
        public TransformFuture(ListenableFuture listenableFuture, Function function) {
            super(listenableFuture, function);
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final Object doTransform(Object obj, Object obj2) {
            return ((Function) obj).apply(obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final void setResult(Object obj) {
            set(obj);
        }
    }

    public AbstractTransformFuture(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.inputFuture = listenableFuture;
        obj.getClass();
        this.function = obj;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        ListenableFuture listenableFuture = this.inputFuture;
        if ((listenableFuture != null) & (this.valueField instanceof AbstractFuture.Cancellation)) {
            listenableFuture.cancel(wasInterrupted());
        }
        this.inputFuture = null;
        this.function = null;
    }

    public abstract Object doTransform(Object obj, Object obj2);

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String pendingToString() {
        String str;
        ListenableFuture listenableFuture = this.inputFuture;
        Object obj = this.function;
        String pendingToString = super.pendingToString();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (pendingToString != null) {
                return str.concat(pendingToString);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.inputFuture;
        Object obj = this.function;
        if (((this.valueField instanceof AbstractFuture.Cancellation) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.inputFuture = null;
        if (listenableFuture.isCancelled()) {
            setFuture(listenableFuture);
            return;
        }
        try {
            try {
                Object doTransform = doTransform(obj, Futures.getDone(listenableFuture));
                this.function = null;
                setResult(doTransform);
            } catch (Throwable th) {
                try {
                    ByteStreamsKt.restoreInterruptIfIsInterruptedException(th);
                    setException(th);
                } finally {
                    this.function = null;
                }
            }
        } catch (Error e) {
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            setException(e2.getCause());
        } catch (Exception e3) {
            setException(e3);
        }
    }

    public abstract void setResult(Object obj);
}
