package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class ljo implements RunnableFuture {
    public final n20 a = new n20();
    public final n20 b = new n20();
    public final Object c = new Object();
    public Exception d;
    public Object e;
    public Thread f;
    public boolean g;

    public final void c() {
        this.b.c();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        synchronized (this.c) {
            try {
                if (!this.g) {
                    n20 n20Var = this.b;
                    synchronized (n20Var) {
                        z2 = n20Var.a;
                    }
                    if (!z2) {
                        this.g = true;
                        d();
                        Thread thread = this.f;
                        if (thread == null) {
                            this.a.h();
                            this.b.h();
                        } else if (z) {
                            thread.interrupt();
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public abstract Object e();

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        n20 n20Var = this.b;
        synchronized (n20Var) {
            if (convert <= 0) {
                z = n20Var.a;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = convert + elapsedRealtime;
                if (j2 < elapsedRealtime) {
                    n20Var.b();
                } else {
                    while (!n20Var.a && elapsedRealtime < j2) {
                        n20Var.wait(j2 - elapsedRealtime);
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z = n20Var.a;
            }
        }
        if (!z) {
            throw new TimeoutException();
        }
        if (this.g) {
            throw new CancellationException();
        }
        Exception exc = this.d;
        if (exc == null) {
            return this.e;
        }
        throw new ExecutionException(exc);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        n20 n20Var = this.b;
        synchronized (n20Var) {
            z = n20Var.a;
        }
        return z;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            try {
                if (this.g) {
                    return;
                }
                this.f = Thread.currentThread();
                this.a.h();
                try {
                    try {
                        this.e = e();
                        synchronized (this.c) {
                            this.b.h();
                            this.f = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.c) {
                            this.b.h();
                            this.f = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    this.d = e;
                    synchronized (this.c) {
                        this.b.h();
                        this.f = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        this.b.b();
        if (!this.g) {
            Exception exc = this.d;
            if (exc == null) {
                return this.e;
            }
            throw new ExecutionException(exc);
        }
        throw new CancellationException();
    }
}
