package defpackage;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class b77 {
    public static final Logger c = Logger.getLogger(b77.class.getName());
    public final String a;
    public final ConcurrentHashMap b = new ConcurrentHashMap(50);

    public b77(String str) {
        this.a = str;
    }

    public final void a() {
        Collection<Semaphore> values = this.b.values();
        for (Semaphore semaphore : values) {
            semaphore.release();
            values.remove(semaphore);
        }
    }

    public final void b(long j) {
        Thread currentThread = Thread.currentThread();
        ConcurrentHashMap concurrentHashMap = this.b;
        if (((Semaphore) concurrentHashMap.get(currentThread)) == null) {
            Semaphore semaphore = new Semaphore(1, true);
            semaphore.drainPermits();
            concurrentHashMap.putIfAbsent(currentThread, semaphore);
        }
        try {
            ((Semaphore) concurrentHashMap.get(currentThread)).tryAcquire(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            c.log(Level.FINER, "Exception ", (Throwable) e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("Semaphore: ");
        sb.append(this.a);
        ConcurrentHashMap concurrentHashMap = this.b;
        if (concurrentHashMap.size() == 0) {
            sb.append(" no semaphores.");
        } else {
            sb.append(" semaphores:\n");
            for (Thread thread : concurrentHashMap.keySet()) {
                sb.append("\tThread: ");
                sb.append(thread.getName());
                sb.append(' ');
                sb.append(concurrentHashMap.get(thread));
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}
