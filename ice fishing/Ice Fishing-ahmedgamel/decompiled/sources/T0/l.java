package T0;

import com.google.android.gms.internal.ads.LD;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3043n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f3044u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayDeque f3045v;

    /* renamed from: w, reason: collision with root package name */
    public Runnable f3046w;

    /* renamed from: x, reason: collision with root package name */
    public final Executor f3047x;

    public l(ExecutorService executorService) {
        this.f3043n = 0;
        this.f3047x = executorService;
        this.f3045v = new ArrayDeque();
        this.f3044u = new Object();
    }

    public final void a() {
        switch (this.f3043n) {
            case 0:
                Runnable runnable = (Runnable) this.f3045v.poll();
                this.f3046w = runnable;
                if (runnable != null) {
                    ((ExecutorService) this.f3047x).execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.f3044u) {
                    try {
                        Runnable runnable2 = (Runnable) this.f3045v.poll();
                        this.f3046w = runnable2;
                        if (runnable2 != null) {
                            ((N1.f) this.f3047x).execute(runnable2);
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
        switch (this.f3043n) {
            case 0:
                synchronized (this.f3044u) {
                    try {
                        this.f3045v.add(new LD(24, this, runnable));
                        if (this.f3046w == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f3044u) {
                    try {
                        this.f3045v.add(new F.n(18, this, runnable));
                        if (this.f3046w == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public l(N1.f fVar) {
        this.f3043n = 1;
        this.f3044u = new Object();
        this.f3045v = new ArrayDeque();
        this.f3047x = fVar;
    }
}
