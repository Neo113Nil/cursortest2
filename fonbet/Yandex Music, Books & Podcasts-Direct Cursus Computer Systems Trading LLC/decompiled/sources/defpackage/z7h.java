package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class z7h implements Executor {
    public final /* synthetic */ int a = 1;
    public Executor b;
    public final Object c;

    public z7h(xhj xhjVar) {
        o2g.O(xhjVar, "executorPool");
        this.c = xhjVar;
    }

    public synchronized void a() {
        Executor executor = this.b;
        if (executor != null) {
            ((xhj) this.c).K(executor);
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        switch (this.a) {
            case 0:
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            Executor executor2 = (Executor) ((xhj) this.c).e();
                            Executor executor3 = this.b;
                            if (executor2 == null) {
                                throw new NullPointerException(zwf.R("%s.getObject()", executor3));
                            }
                            this.b = executor2;
                        }
                        executor = this.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                executor.execute(runnable);
                return;
            default:
                this.b.execute(runnable);
                return;
        }
    }

    public z7h(ExecutorService executorService, b6e b6eVar) {
        this.b = executorService;
        this.c = b6eVar;
    }
}
