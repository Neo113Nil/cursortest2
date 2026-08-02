package com.google.common.util.concurrent;

import androidx.room.Room;
import androidx.tracing.Trace;
import com.google.common.base.Function;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractTransformFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import kotlin.jvm.internal.KotlinGenericDeclarationKt;

/* loaded from: classes.dex */
public abstract class Futures {

    public final class NonCancellationPropagatingFuture extends AbstractFuture.TrustedFuture implements Runnable {
        public ListenableFuture delegate;

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final void afterDone() {
            this.delegate = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final String pendingToString() {
            ListenableFuture listenableFuture = this.delegate;
            if (listenableFuture == null) {
                return null;
            }
            return "delegate=[" + listenableFuture + "]";
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListenableFuture listenableFuture = this.delegate;
            if (listenableFuture != null) {
                setFuture(listenableFuture);
            }
        }
    }

    public static Object getDone(Future future) {
        Trace.checkState("Future was expected to be done: %s", future, future.isDone());
        return KotlinGenericDeclarationKt.getUninterruptibly(future);
    }

    public static ImmediateFuture immediateFuture(Object obj) {
        return obj == null ? ImmediateFuture.NULL : new ImmediateFuture(obj);
    }

    public static ListenableFuture nonCancellationPropagating(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        NonCancellationPropagatingFuture nonCancellationPropagatingFuture = new NonCancellationPropagatingFuture();
        nonCancellationPropagatingFuture.delegate = listenableFuture;
        listenableFuture.addListener(nonCancellationPropagatingFuture, DirectExecutor.INSTANCE);
        return nonCancellationPropagatingFuture;
    }

    public static AbstractTransformFuture.TransformFuture transform(ListenableFuture listenableFuture, Function function, Executor executor) {
        int i = AbstractTransformFuture.$r8$clinit;
        AbstractTransformFuture.TransformFuture transformFuture = new AbstractTransformFuture.TransformFuture(listenableFuture, function);
        listenableFuture.addListener(transformFuture, Room.rejectionPropagatingExecutor(executor, transformFuture));
        return transformFuture;
    }

    public static AbstractTransformFuture.AsyncTransformFuture transformAsync(ListenableFuture listenableFuture, AsyncFunction asyncFunction, Executor executor) {
        int i = AbstractTransformFuture.$r8$clinit;
        AbstractTransformFuture.AsyncTransformFuture asyncTransformFuture = new AbstractTransformFuture.AsyncTransformFuture(listenableFuture, asyncFunction);
        listenableFuture.addListener(asyncTransformFuture, Room.rejectionPropagatingExecutor(executor, asyncTransformFuture));
        return asyncTransformFuture;
    }
}
