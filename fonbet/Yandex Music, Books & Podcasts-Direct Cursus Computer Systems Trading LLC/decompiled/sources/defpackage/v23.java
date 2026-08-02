package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class v23 implements Executor {
    public final u23 a;
    public final /* synthetic */ rdc b;

    public v23(u23 u23Var) {
        this.a = u23Var;
        this.b = new rdc(new ThreadPoolExecutor(1, 1, 1000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), u23Var), 0);
    }

    public final Thread a() {
        Thread thread = this.a.a;
        Thread thread2 = null;
        if (thread == null || !thread.isAlive()) {
            thread = null;
        }
        if (thread != null) {
            return thread;
        }
        execute(new jq(5));
        Thread thread3 = this.a.a;
        if (thread3 != null && thread3.isAlive()) {
            thread2 = thread3;
        }
        if (thread2 != null) {
            return thread2;
        }
        xq0.q("Binding thread is not created");
        return null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.execute(runnable);
    }
}
