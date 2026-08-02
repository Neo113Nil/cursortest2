package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import defpackage.oyr;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class Pa implements IHandlerExecutor {
    public final Looper a;
    public final Handler b;
    public final Rc c;

    public Pa(Rc rc) {
        this(rc, rc.getLooper(), new Handler(rc.getLooper()));
    }

    public static Rc a(String str) {
        StringBuilder v = oyr.v(str, "-");
        v.append(ThreadFactoryC0450jg.a.incrementAndGet());
        Rc rc = new Rc(v.toString());
        rc.start();
        return rc;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j, TimeUnit timeUnit) {
        this.b.postDelayed(runnable, timeUnit.toMillis(j));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Handler getHandler() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Looper getLooper() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z;
        Rc rc = this.c;
        synchronized (rc) {
            z = rc.a;
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(Runnable runnable) {
        this.b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        Rc rc = this.c;
        synchronized (rc) {
            rc.a = false;
            rc.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.b.post(futureTask);
        return futureTask;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j) {
        this.b.postDelayed(runnable, j);
    }

    public Pa(String str) {
        this(a(str));
    }

    public Pa(Rc rc, Looper looper, Handler handler) {
        this.c = rc;
        this.a = looper;
        this.b = handler;
    }
}
