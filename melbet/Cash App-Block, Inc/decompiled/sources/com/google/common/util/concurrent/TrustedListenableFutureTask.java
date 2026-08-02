package com.google.common.util.concurrent;

import androidx.tracing.Trace;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes.dex */
public final class TrustedListenableFutureTask extends FluentFuture.TrustedFuture implements RunnableFuture {
    public volatile InterruptibleTask task;

    /* loaded from: classes4.dex */
    public final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask {
        public final AsyncCallable callable;

        public TrustedFutureInterruptibleAsyncTask(AsyncCallable asyncCallable) {
            this.callable = asyncCallable;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblyFailure(Throwable th) {
            TrustedListenableFutureTask.this.setException(th);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblySuccess(Object obj) {
            TrustedListenableFutureTask.this.setFuture((ListenableFuture) obj);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final Object runInterruptibly() {
            AsyncCallable asyncCallable = this.callable;
            ListenableFuture call = asyncCallable.call();
            Trace.checkNotNull("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", call, asyncCallable);
            return call;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final String toPendingString() {
            return this.callable.toString();
        }
    }

    public final class TrustedFutureInterruptibleTask extends InterruptibleTask {
        public final Callable callable;

        public TrustedFutureInterruptibleTask(Callable callable) {
            callable.getClass();
            this.callable = callable;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblyFailure(Throwable th) {
            TrustedListenableFutureTask.this.setException(th);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblySuccess(Object obj) {
            TrustedListenableFutureTask.this.set(obj);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final Object runInterruptibly() {
            return this.callable.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final String toPendingString() {
            return this.callable.toString();
        }
    }

    public TrustedListenableFutureTask(Callable callable) {
        this.task = new TrustedFutureInterruptibleTask(callable);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        InterruptibleTask interruptibleTask;
        if (wasInterrupted() && (interruptibleTask = this.task) != null) {
            interruptibleTask.interruptTask();
        }
        this.task = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String pendingToString() {
        InterruptibleTask interruptibleTask = this.task;
        if (interruptibleTask == null) {
            return super.pendingToString();
        }
        return "task=[" + interruptibleTask + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        InterruptibleTask interruptibleTask = this.task;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.task = null;
    }
}
