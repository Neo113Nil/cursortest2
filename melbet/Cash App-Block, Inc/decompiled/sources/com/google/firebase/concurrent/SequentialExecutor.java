package com.google.firebase.concurrent;

import com.bumptech.glide.load.engine.ActiveResources$1$1;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.tasks.zzi;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class SequentialExecutor implements Executor {
    public static final Logger log = Logger.getLogger(SequentialExecutor.class.getName());
    public final Executor executor;
    public final ArrayDeque queue = new ArrayDeque();
    public int workerRunningState = 1;
    public long workerRunCount = 0;
    public final zzi worker = new zzi(this);

    public SequentialExecutor(Executor executor) {
        zzae.checkNotNull(executor);
        this.executor = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zzae.checkNotNull(runnable);
        synchronized (this.queue) {
            int i = this.workerRunningState;
            if (i != 4 && i != 3) {
                long j = this.workerRunCount;
                ActiveResources$1$1 activeResources$1$1 = new ActiveResources$1$1(4, runnable);
                this.queue.add(activeResources$1$1);
                this.workerRunningState = 2;
                try {
                    this.executor.execute(this.worker);
                    if (this.workerRunningState != 2) {
                        return;
                    }
                    synchronized (this.queue) {
                        try {
                            if (this.workerRunCount == j && this.workerRunningState == 2) {
                                this.workerRunningState = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.queue) {
                        try {
                            int i2 = this.workerRunningState;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.queue.removeLastOccurrence(activeResources$1$1)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                            return;
                        } finally {
                        }
                    }
                }
            }
            this.queue.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.executor + "}";
    }
}
