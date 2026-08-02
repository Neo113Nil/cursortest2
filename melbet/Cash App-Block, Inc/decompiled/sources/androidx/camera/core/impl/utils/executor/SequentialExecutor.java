package androidx.camera.core.impl.utils.executor;

import com.bugsnag.android.Client;
import com.bumptech.glide.load.engine.ActiveResources$1$1;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public final class SequentialExecutor implements Executor {
    public final Executor mExecutor;
    public final ArrayDeque mQueue = new ArrayDeque();
    public final Client.AnonymousClass7 mWorker = new Client.AnonymousClass7(this, 7);
    public int mWorkerRunningState = 1;
    public long mWorkerRunCount = 0;

    public SequentialExecutor(Executor executor) {
        executor.getClass();
        this.mExecutor = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.mQueue) {
            int i = this.mWorkerRunningState;
            if (i != 4 && i != 3) {
                long j = this.mWorkerRunCount;
                boolean z = true;
                ActiveResources$1$1 activeResources$1$1 = new ActiveResources$1$1(1, runnable);
                this.mQueue.add(activeResources$1$1);
                this.mWorkerRunningState = 2;
                try {
                    this.mExecutor.execute(this.mWorker);
                    if (this.mWorkerRunningState != 2) {
                        return;
                    }
                    synchronized (this.mQueue) {
                        try {
                            if (this.mWorkerRunCount == j && this.mWorkerRunningState == 2) {
                                this.mWorkerRunningState = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.mQueue) {
                        try {
                            int i2 = this.mWorkerRunningState;
                            if ((i2 != 1 && i2 != 2) || !this.mQueue.removeLastOccurrence(activeResources$1$1)) {
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
            this.mQueue.add(runnable);
        }
    }
}
