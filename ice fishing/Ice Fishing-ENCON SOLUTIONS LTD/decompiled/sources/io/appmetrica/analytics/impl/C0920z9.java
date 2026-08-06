package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0920z9 implements IHandlerExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final Looper f7270a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f7271b;

    /* renamed from: c, reason: collision with root package name */
    public final HandlerThreadC0327cb f7272c;

    public C0920z9(String str) {
        this(a(str));
    }

    public static HandlerThreadC0327cb a(String str) {
        HandlerThreadC0327cb handlerThreadC0327cb = new HandlerThreadC0327cb(str + "-" + ThreadFactoryC0924zd.f7275a.incrementAndGet());
        handlerThreadC0327cb.start();
        return handlerThreadC0327cb;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f7271b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j2) {
        this.f7271b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j2));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Handler getHandler() {
        return this.f7271b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Looper getLooper() {
        return this.f7270a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z2;
        HandlerThreadC0327cb handlerThreadC0327cb = this.f7272c;
        synchronized (handlerThreadC0327cb) {
            z2 = handlerThreadC0327cb.f5735a;
        }
        return z2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(Runnable runnable) {
        this.f7271b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f7271b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC0327cb handlerThreadC0327cb = this.f7272c;
        synchronized (handlerThreadC0327cb) {
            handlerThreadC0327cb.f5735a = false;
            handlerThreadC0327cb.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f7271b.post(futureTask);
        return futureTask;
    }

    public C0920z9(HandlerThreadC0327cb handlerThreadC0327cb) {
        this(handlerThreadC0327cb, handlerThreadC0327cb.getLooper(), new Handler(handlerThreadC0327cb.getLooper()));
    }

    public C0920z9(HandlerThreadC0327cb handlerThreadC0327cb, Looper looper, Handler handler) {
        this.f7272c = handlerThreadC0327cb;
        this.f7270a = looper;
        this.f7271b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j2, TimeUnit timeUnit) {
        this.f7271b.postDelayed(runnable, timeUnit.toMillis(j2));
    }
}
