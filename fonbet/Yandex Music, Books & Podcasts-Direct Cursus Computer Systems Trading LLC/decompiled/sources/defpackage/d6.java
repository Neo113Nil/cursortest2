package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class d6 extends AtomicReference implements ka8 {
    public static final FutureTask c;
    public static final FutureTask d;
    private static final long serialVersionUID = 1811839108042568751L;
    public final Runnable a;
    public Thread b;

    static {
        q qVar = etn.p;
        c = new FutureTask(qVar, null);
        d = new FutureTask(qVar, null);
    }

    public d6(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.ka8
    public final void a() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == c || future == (futureTask = d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.b != Thread.currentThread());
    }

    public final void b(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == c) {
                return;
            }
            if (future2 == d) {
                future.cancel(this.b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
