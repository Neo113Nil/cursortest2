package S3;

import L3.u;
import P2.w;
import com.google.android.gms.internal.ads.LD;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class j implements Executor {

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f2880y = Logger.getLogger(j.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final Executor f2881n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayDeque f2882u = new ArrayDeque();

    /* renamed from: v, reason: collision with root package name */
    public int f2883v = 1;

    /* renamed from: w, reason: collision with root package name */
    public long f2884w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final LD f2885x = new LD(this);

    public j(Executor executor) {
        w.h(executor);
        this.f2881n = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        w.h(runnable);
        synchronized (this.f2882u) {
            int i = this.f2883v;
            if (i != 4 && i != 3) {
                long j6 = this.f2884w;
                u uVar = new u(1, runnable);
                this.f2882u.add(uVar);
                this.f2883v = 2;
                try {
                    this.f2881n.execute(this.f2885x);
                    if (this.f2883v != 2) {
                        return;
                    }
                    synchronized (this.f2882u) {
                        try {
                            if (this.f2884w == j6 && this.f2883v == 2) {
                                this.f2883v = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e9) {
                    synchronized (this.f2882u) {
                        try {
                            int i6 = this.f2883v;
                            boolean z3 = true;
                            if ((i6 != 1 && i6 != 2) || !this.f2882u.removeLastOccurrence(uVar)) {
                                z3 = false;
                            }
                            if (!(e9 instanceof RejectedExecutionException) || z3) {
                                throw e9;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f2882u.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f2881n + "}";
    }
}
