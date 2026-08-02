package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes10.dex */
public abstract class skl0 implements RunnableFuture {
    private boolean canceled;
    private Exception exception;
    private Object result;
    private Thread workThread;
    private final cyd started = new cyd();
    private final cyd finished = new cyd();
    private final Object cancelLock = new Object();

    public final void blockUntilFinished() {
        this.finished.b();
    }

    public final void blockUntilStarted() {
        this.started.b();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        synchronized (this.cancelLock) {
            try {
                if (!this.canceled) {
                    cyd cydVar = this.finished;
                    synchronized (cydVar) {
                        z2 = cydVar.a;
                    }
                    if (!z2) {
                        this.canceled = true;
                        cancelWork();
                        Thread thread = this.workThread;
                        if (thread == null) {
                            this.started.d();
                            this.finished.d();
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

    public void cancelWork() {
    }

    public abstract Object doWork();

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        cyd cydVar = this.finished;
        synchronized (cydVar) {
            if (convert <= 0) {
                z = cydVar.a;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = convert + elapsedRealtime;
                if (j2 < elapsedRealtime) {
                    cydVar.a();
                } else {
                    while (!cydVar.a && elapsedRealtime < j2) {
                        cydVar.wait(j2 - elapsedRealtime);
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z = cydVar.a;
            }
        }
        if (!z) {
            throw new TimeoutException();
        }
        if (this.canceled) {
            throw new CancellationException();
        }
        Exception exc = this.exception;
        if (exc == null) {
            return this.result;
        }
        throw new ExecutionException(exc);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.canceled;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        cyd cydVar = this.finished;
        synchronized (cydVar) {
            z = cydVar.a;
        }
        return z;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.cancelLock) {
            try {
                if (this.canceled) {
                    return;
                }
                this.workThread = Thread.currentThread();
                this.started.d();
                try {
                    try {
                        this.result = doWork();
                        synchronized (this.cancelLock) {
                            this.finished.d();
                            this.workThread = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.cancelLock) {
                            this.finished.d();
                            this.workThread = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    this.exception = e;
                    synchronized (this.cancelLock) {
                        this.finished.d();
                        this.workThread = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        this.finished.a();
        if (!this.canceled) {
            Exception exc = this.exception;
            if (exc == null) {
                return this.result;
            }
            throw new ExecutionException(exc);
        }
        throw new CancellationException();
    }
}
