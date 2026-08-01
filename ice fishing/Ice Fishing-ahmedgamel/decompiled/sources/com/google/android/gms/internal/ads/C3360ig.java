package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ig, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3360ig extends AbstractExecutorService implements RD {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31069n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f31070u;

    public C3360ig(Executor executor) {
        this.f31070u = executor;
    }

    public final N3.a a(Runnable runnable) {
        return (N3.a) super.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j6, TimeUnit timeUnit) {
        switch (this.f31069n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f31070u).awaitTermination(j6, timeUnit);
        }
    }

    public final N3.a b(Callable callable) {
        return (N3.a) super.submit(callable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f31069n) {
            case 0:
                this.f31070u.execute(runnable);
                break;
            default:
                ((ExecutorService) this.f31070u).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f31069n) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f31070u).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f31069n) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f31070u).isTerminated();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC2966bE(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.f31069n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.f31070u).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f31069n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f31070u).shutdownNow();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (N3.a) super.submit(runnable);
    }

    public String toString() {
        switch (this.f31069n) {
            case 1:
                String obj = super.toString();
                String valueOf = String.valueOf((ExecutorService) this.f31070u);
                return com.anythink.basead.exoplayer.f.f.o(new StringBuilder(String.valueOf(obj).length() + 1 + valueOf.length() + 1), obj, "[", valueOf, "]");
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC2966bE(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (N3.a) super.submit(runnable, obj);
    }

    public C3360ig(ExecutorService executorService) {
        executorService.getClass();
        this.f31070u = executorService;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (N3.a) super.submit(callable);
    }
}
