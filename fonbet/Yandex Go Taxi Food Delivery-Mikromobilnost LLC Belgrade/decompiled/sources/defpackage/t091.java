package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import androidx.loader.content.ModernAsyncTask$Status;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* loaded from: classes11.dex */
public final class t091 extends ryy {
    public Executor f;
    public volatile db3 g;
    public volatile db3 h;
    public final Semaphore i;
    public final Set j;

    public t091(Context context, Set set) {
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        context.getApplicationContext();
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void c() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        if (this.f == null) {
            this.f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        db3 db3Var = this.g;
        Executor executor = this.f;
        if (db3Var.b == ModernAsyncTask$Status.PENDING) {
            db3Var.b = ModernAsyncTask$Status.RUNNING;
            executor.execute(db3Var.a);
            return;
        }
        int i = b530.a[db3Var.b.ordinal()];
        if (i == 1) {
            ny61.r("Cannot execute task: the task is already running.");
        } else if (i != 2) {
            ny61.r("We should never reach this state");
        } else {
            ny61.r("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }
}
