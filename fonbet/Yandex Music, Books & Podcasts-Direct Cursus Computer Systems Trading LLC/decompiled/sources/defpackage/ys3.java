package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ys3 implements lcg {
    public final WeakReference a;
    public final xs3 b = new xs3(this);

    public ys3(vs3 vs3Var) {
        this.a = new WeakReference(vs3Var);
    }

    @Override // defpackage.lcg
    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        vs3 vs3Var = (vs3) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (cancel && vs3Var != null) {
            vs3Var.a = null;
            vs3Var.b = null;
            vs3Var.c.l(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof y8;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
