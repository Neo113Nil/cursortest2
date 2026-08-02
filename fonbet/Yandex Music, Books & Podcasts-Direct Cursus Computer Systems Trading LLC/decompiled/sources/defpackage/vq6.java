package defpackage;

import com.google.android.gms.tasks.Task;
import java.lang.Thread;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class vq6 implements Executor {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object d;

    public vq6(ExecutorService executorService) {
        this.a = 0;
        this.c = new Object();
        this.d = ywf.w(null);
        this.b = executorService;
    }

    public void a() {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.c;
        AtomicReference atomicReference = (AtomicReference) this.d;
        do {
            Thread currentThread = Thread.currentThread();
            while (!atomicReference.compareAndSet(null, currentThread)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            while (true) {
                try {
                    Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        ((Thread.UncaughtExceptionHandler) this.b).uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    atomicReference.set(null);
                    throw th2;
                }
            }
            atomicReference.set(null);
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public void b(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.c;
        o2g.O(runnable, "runnable is null");
        concurrentLinkedQueue.add(runnable);
    }

    public rjp c(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        gyr gyrVar = new gyr(runnable);
        return new rjp(gyrVar, (ScheduledFuture) scheduledExecutorService.schedule(new nud(19, this, gyrVar, runnable), j, timeUnit));
    }

    public Task d(Runnable runnable) {
        Task f;
        synchronized (this.c) {
            f = ((Task) this.d).f((ExecutorService) this.b, new n(23, runnable));
            this.d = f;
        }
        return f;
    }

    public void e() {
        o2g.U("Not called from the SynchronizationContext", Thread.currentThread() == ((AtomicReference) this.d).get());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                break;
            default:
                b(runnable);
                a();
                break;
        }
    }

    public vq6(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = 1;
        this.c = new ConcurrentLinkedQueue();
        this.d = new AtomicReference();
        this.b = uncaughtExceptionHandler;
    }
}
