package T0;

import com.google.android.gms.internal.ads.LD;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3126n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f3127u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayDeque f3128v;

    /* renamed from: w, reason: collision with root package name */
    public Runnable f3129w;

    /* renamed from: x, reason: collision with root package name */
    public final Executor f3130x;

    public l(ExecutorService executorService) {
        this.f3126n = 0;
        this.f3130x = executorService;
        this.f3128v = new ArrayDeque();
        this.f3127u = new Object();
    }

    public final void a() {
        switch (this.f3126n) {
            case 0:
                Runnable runnable = (Runnable) this.f3128v.poll();
                this.f3129w = runnable;
                if (runnable != null) {
                    ((ExecutorService) this.f3130x).execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.f3127u) {
                    try {
                        Runnable runnable2 = (Runnable) this.f3128v.poll();
                        this.f3129w = runnable2;
                        if (runnable2 != null) {
                            ((P1.f) this.f3130x).execute(runnable2);
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
        switch (this.f3126n) {
            case 0:
                synchronized (this.f3127u) {
                    try {
                        this.f3128v.add(new LD(23, this, runnable));
                        if (this.f3129w == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f3127u) {
                    try {
                        this.f3128v.add(new F.n(17, this, runnable));
                        if (this.f3129w == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public l(P1.f fVar) {
        this.f3126n = 1;
        this.f3127u = new Object();
        this.f3128v = new ArrayDeque();
        this.f3130x = fVar;
    }
}
