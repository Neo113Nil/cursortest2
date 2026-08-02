package androidx.room;

import bo.app.q4$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.zzi;
import com.google.android.gms.tasks.zzt;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class TransactionExecutor implements Executor {
    public final /* synthetic */ int $r8$classId;
    public Runnable active;
    public final Executor executor;
    public final Object syncLock;
    public final ArrayDeque tasks;

    public TransactionExecutor(Executor executor, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.executor = executor;
                this.tasks = new ArrayDeque();
                this.syncLock = new Object();
                break;
            default:
                executor.getClass();
                this.executor = executor;
                this.tasks = new ArrayDeque();
                this.syncLock = new Object();
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.$r8$classId) {
            case 0:
                runnable.getClass();
                synchronized (this.syncLock) {
                    this.tasks.offer(new q4$$ExternalSyntheticLambda0(8, runnable, this));
                    if (this.active == null) {
                        scheduleNext();
                    }
                }
                return;
            case 1:
                synchronized (this.syncLock) {
                    try {
                        this.tasks.add(new zzi(this, runnable, false, 3));
                        if (this.active == null) {
                            scheduleNext();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.syncLock) {
                    try {
                        this.tasks.add(new MainActivity$$ExternalSyntheticLambda8(2, this, runnable));
                        if (this.active == null) {
                            scheduleNext();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public final void scheduleNext() {
        switch (this.$r8$classId) {
            case 0:
                synchronized (this.syncLock) {
                    Object poll = this.tasks.poll();
                    Runnable runnable = (Runnable) poll;
                    this.active = runnable;
                    if (poll != null) {
                        this.executor.execute(runnable);
                    }
                }
                return;
            case 1:
                Runnable runnable2 = (Runnable) this.tasks.poll();
                this.active = runnable2;
                if (runnable2 != null) {
                    this.executor.execute(runnable2);
                    return;
                }
                return;
            default:
                synchronized (this.syncLock) {
                    try {
                        Runnable runnable3 = (Runnable) this.tasks.poll();
                        this.active = runnable3;
                        if (runnable3 != null) {
                            ((zzt) this.executor).execute(runnable3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public TransactionExecutor(zzt zztVar) {
        this.$r8$classId = 2;
        this.syncLock = new Object();
        this.tasks = new ArrayDeque();
        this.executor = zztVar;
    }
}
