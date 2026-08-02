package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class sip implements Executor, Runnable {
    public static final Logger d = Logger.getLogger(sip.class.getName());
    public static final zwf e;
    public final Executor a;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public volatile int c = 0;

    static {
        zwf ripVar;
        try {
            ripVar = new qip(AtomicIntegerFieldUpdater.newUpdater(sip.class, "c"));
        } catch (Throwable th) {
            d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            ripVar = new rip();
        }
        e = ripVar;
    }

    public sip(Executor executor) {
        o2g.O(executor, "'executor' must not be null.");
        this.a = executor;
    }

    public final void a(Runnable runnable) {
        zwf zwfVar = e;
        if (zwfVar.Y(this)) {
            try {
                this.a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.b.remove(runnable);
                }
                zwfVar.Z(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        o2g.O(runnable, "'r' must not be null.");
        this.b.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Runnable runnable;
        zwf zwfVar = e;
        try {
            Executor executor = this.a;
            while (true) {
                Executor executor2 = this.a;
                concurrentLinkedQueue = this.b;
                if (executor != executor2 || (runnable = (Runnable) concurrentLinkedQueue.poll()) == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e2) {
                    d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e2);
                }
            }
            zwfVar.Z(this);
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            a(null);
        } catch (Throwable th) {
            zwfVar.Z(this);
            throw th;
        }
    }
}
