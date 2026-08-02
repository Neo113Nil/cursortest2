package com.google.common.util.concurrent;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import com.google.common.util.concurrent.AbstractFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class ImmediateFuture implements ListenableFuture {
    public static final ImmediateFuture NULL = new ImmediateFuture(null);
    public static final LazyLogger log = new LazyLogger(ImmediateFuture.class);
    public final Object value;

    /* loaded from: classes4.dex */
    public final class ImmediateCancelledFuture extends AbstractFuture.TrustedFuture {
        public static final ImmediateCancelledFuture INSTANCE;

        static {
            INSTANCE = AbstractFutureState.GENERATE_CANCELLATION_CAUSES ? null : new ImmediateCancelledFuture();
        }

        public ImmediateCancelledFuture() {
            cancel(false);
        }
    }

    /* loaded from: classes4.dex */
    public final class ImmediateFailedFuture extends AbstractFuture.TrustedFuture {
        public ImmediateFailedFuture(Exception exc) {
            setException(exc);
        }
    }

    public ImmediateFuture(Object obj) {
        this.value = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        Trace.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            log.get().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.value;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=SUCCESS, result=[");
        return Recorder$$ExternalSyntheticOutline1.m(sb, this.value, "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.value;
    }
}
