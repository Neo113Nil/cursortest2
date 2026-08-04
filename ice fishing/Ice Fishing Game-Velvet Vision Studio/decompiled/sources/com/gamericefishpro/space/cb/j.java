package com.gamericefishpro.space.cb;

import com.gamericefishpro.space.v8.c0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Executor {
    public static final Logger y = Logger.getLogger(j.class.getName());
    public final Executor d;
    public final ArrayDeque e = new ArrayDeque();
    public int i = 1;
    public long v = 0;
    public final com.gamericefishpro.space.va.a w = new com.gamericefishpro.space.va.a(this);

    public j(Executor executor) {
        c0.g(executor);
        this.d = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c0.g(runnable);
        synchronized (this.e) {
            int i = this.i;
            if (i != 4 && i != 3) {
                long j = this.v;
                com.gamericefishpro.space.a9.c cVar = new com.gamericefishpro.space.a9.c(runnable, 2);
                this.e.add(cVar);
                this.i = 2;
                try {
                    this.d.execute(this.w);
                    if (this.i != 2) {
                        return;
                    }
                    synchronized (this.e) {
                        try {
                            if (this.v == j && this.i == 2) {
                                this.i = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.e) {
                        try {
                            int i2 = this.i;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.e.removeLastOccurrence(cVar)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.e.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.d + "}";
    }
}
