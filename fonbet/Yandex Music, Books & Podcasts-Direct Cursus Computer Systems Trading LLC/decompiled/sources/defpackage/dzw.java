package defpackage;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class dzw {
    public sgg a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f;
    public volatile it1 g;
    public volatile it1 h;
    public final Semaphore i;
    public final Set j;

    public dzw(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.g != null) {
            boolean z = this.b;
            if (!z) {
                if (z) {
                    c();
                } else {
                    this.e = true;
                }
            }
            it1 it1Var = this.h;
            it1 it1Var2 = this.g;
            if (it1Var != null) {
                it1Var2.getClass();
                this.g = null;
                return;
            }
            it1Var2.getClass();
            it1 it1Var3 = this.g;
            it1Var3.c.set(true);
            if (it1Var3.a.cancel(false)) {
                this.h = this.g;
            }
            this.g = null;
        }
    }

    public final void b() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        if (this.f == null) {
            this.f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        it1 it1Var = this.g;
        Executor executor = this.f;
        if (it1Var.b == 1) {
            it1Var.b = 2;
            executor.execute(it1Var.a);
            return;
        }
        int D = ouj.D(it1Var.b);
        if (D == 1) {
            xq0.q("Cannot execute task: the task is already running.");
        } else if (D != 2) {
            xq0.q("We should never reach this state");
        } else {
            xq0.q("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public final void c() {
        a();
        this.g = new it1(this);
        b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
