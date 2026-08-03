package m7;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import p6.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: l, reason: collision with root package name */
    public static final Logger f4961l = Logger.getLogger(k.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public final Executor f4962g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayDeque f4963h = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    public int f4964i = 1;

    /* renamed from: j, reason: collision with root package name */
    public long f4965j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final dd.i f4966k = new dd.i(this);

    public k(Executor executor) {
        u.g(executor);
        this.f4962g = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        u.g(runnable);
        synchronized (this.f4963h) {
            int i10 = this.f4964i;
            if (i10 != 4 && i10 != 3) {
                long j3 = this.f4965j;
                j jVar = new j(runnable, 0);
                this.f4963h.add(jVar);
                this.f4964i = 2;
                try {
                    this.f4962g.execute(this.f4966k);
                    if (this.f4964i != 2) {
                        return;
                    }
                    synchronized (this.f4963h) {
                        try {
                            if (this.f4965j == j3 && this.f4964i == 2) {
                                this.f4964i = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f4963h) {
                        try {
                            int i11 = this.f4964i;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f4963h.removeLastOccurrence(jVar)) {
                                z10 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f4963h.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f4962g + "}";
    }
}
