package defpackage;

import io.reactivex.internal.schedulers.b;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class oye implements Runnable {
    public final long a;
    public final ConcurrentLinkedQueue b;
    public final uq5 c;
    public final ScheduledExecutorService d;
    public final ScheduledFuture e;
    public final ThreadFactory f;

    public oye(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        oye oyeVar;
        ScheduledExecutorService scheduledExecutorService;
        ScheduledFuture<?> scheduledFuture;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.a = nanos;
        this.b = new ConcurrentLinkedQueue();
        this.c = new uq5(0);
        this.f = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, b.c);
            oyeVar = this;
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(oyeVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            oyeVar = this;
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        oyeVar.d = scheduledExecutorService;
        oyeVar.e = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long nanoTime = System.nanoTime();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            qye qyeVar = (qye) it.next();
            if (qyeVar.c > nanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(qyeVar)) {
                this.c.e(qyeVar);
            }
        }
    }
}
