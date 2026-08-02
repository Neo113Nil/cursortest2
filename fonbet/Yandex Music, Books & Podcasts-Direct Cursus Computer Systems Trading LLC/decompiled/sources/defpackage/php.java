package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class php implements Executor {
    public final Executor a;
    public final ArrayDeque b;
    public Runnable c;

    public php(Executor executor) {
        executor.getClass();
        this.a = executor;
        this.b = new ArrayDeque();
    }

    public final void a() {
        synchronized (this.b) {
            Object poll = this.b.poll();
            Runnable runnable = (Runnable) poll;
            this.c = runnable;
            if (poll != null) {
                this.a.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.b) {
            this.b.offer(new zvh(23, runnable, this));
            if (this.c == null) {
                a();
            }
        }
    }
}
