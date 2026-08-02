package U3;

import N3.r;
import R2.w;
import com.google.android.gms.internal.ads.LD;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class i implements Executor {

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f3319y = Logger.getLogger(i.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final Executor f3320n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayDeque f3321u = new ArrayDeque();

    /* renamed from: v, reason: collision with root package name */
    public int f3322v = 1;

    /* renamed from: w, reason: collision with root package name */
    public long f3323w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final LD f3324x = new LD(this);

    public i(Executor executor) {
        w.h(executor);
        this.f3320n = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        w.h(runnable);
        synchronized (this.f3321u) {
            int i = this.f3322v;
            if (i != 4 && i != 3) {
                long j6 = this.f3323w;
                r rVar = new r(1, runnable);
                this.f3321u.add(rVar);
                this.f3322v = 2;
                try {
                    this.f3320n.execute(this.f3324x);
                    if (this.f3322v != 2) {
                        return;
                    }
                    synchronized (this.f3321u) {
                        try {
                            if (this.f3323w == j6 && this.f3322v == 2) {
                                this.f3322v = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e9) {
                    synchronized (this.f3321u) {
                        try {
                            int i4 = this.f3322v;
                            boolean z6 = true;
                            if ((i4 != 1 && i4 != 2) || !this.f3321u.removeLastOccurrence(rVar)) {
                                z6 = false;
                            }
                            if (!(e9 instanceof RejectedExecutionException) || z6) {
                                throw e9;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f3321u.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f3320n + "}";
    }
}
