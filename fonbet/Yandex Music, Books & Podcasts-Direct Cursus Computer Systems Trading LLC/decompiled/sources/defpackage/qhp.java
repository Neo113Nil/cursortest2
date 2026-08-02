package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qhp implements Executor {
    public final /* synthetic */ int a;
    public final Executor b;
    public final ArrayDeque c;
    public Runnable d;
    public final Object e;

    public qhp(Executor executor, int i) {
        this.a = i;
        switch (i) {
            case 1:
                executor.getClass();
                this.b = executor;
                this.c = new ArrayDeque();
                this.e = new Object();
                break;
            default:
                this.b = executor;
                this.c = new ArrayDeque();
                this.e = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.c.poll();
                this.d = runnable;
                if (runnable != null) {
                    this.b.execute(runnable);
                    return;
                }
                return;
            case 1:
                synchronized (this.e) {
                    Object poll = this.c.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.d = runnable2;
                    if (poll != null) {
                        this.b.execute(runnable2);
                    }
                }
                return;
            default:
                synchronized (this.e) {
                    try {
                        Runnable runnable3 = (Runnable) this.c.poll();
                        this.d = runnable3;
                        if (runnable3 != null) {
                            ((f48) this.b).execute(runnable3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.e) {
                    try {
                        this.c.add(new e8h(this, runnable, false, 19));
                        if (this.d == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                runnable.getClass();
                synchronized (this.e) {
                    this.c.offer(new xlr(8, runnable, this));
                    if (this.d == null) {
                        a();
                    }
                }
                return;
            default:
                synchronized (this.e) {
                    try {
                        this.c.add(new qf0(1, this, runnable));
                        if (this.d == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public qhp(f48 f48Var) {
        this.a = 2;
        this.e = new Object();
        this.c = new ArrayDeque();
        this.b = f48Var;
    }
}
