package T0;

import B2.RunnableC0272f;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3053n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f3054u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayDeque f3055v;

    /* renamed from: w, reason: collision with root package name */
    public Runnable f3056w;

    /* renamed from: x, reason: collision with root package name */
    public final Executor f3057x;

    public l(ExecutorService executorService) {
        this.f3053n = 0;
        this.f3057x = executorService;
        this.f3055v = new ArrayDeque();
        this.f3054u = new Object();
    }

    public final void a() {
        switch (this.f3053n) {
            case 0:
                Runnable runnable = (Runnable) this.f3055v.poll();
                this.f3056w = runnable;
                if (runnable != null) {
                    ((ExecutorService) this.f3057x).execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.f3054u) {
                    try {
                        Runnable runnable2 = (Runnable) this.f3055v.poll();
                        this.f3056w = runnable2;
                        if (runnable2 != null) {
                            ((N1.f) this.f3057x).execute(runnable2);
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
        switch (this.f3053n) {
            case 0:
                synchronized (this.f3054u) {
                    try {
                        this.f3055v.add(new RunnableC0272f(20, this, runnable));
                        if (this.f3056w == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f3054u) {
                    try {
                        this.f3055v.add(new D5.b(20, this, runnable));
                        if (this.f3056w == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public l(N1.f fVar) {
        this.f3053n = 1;
        this.f3054u = new Object();
        this.f3055v = new ArrayDeque();
        this.f3057x = fVar;
    }
}
