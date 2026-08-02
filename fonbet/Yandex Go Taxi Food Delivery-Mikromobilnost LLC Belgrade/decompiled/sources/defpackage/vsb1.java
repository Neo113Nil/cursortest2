package defpackage;

import com.google.android.gms.internal.play_billing.l0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class vsb1 implements wp91 {
    public final WeakReference a;
    public final nqb1 b = new nqb1(this);

    public vsb1(l0 l0Var) {
        this.a = new WeakReference(l0Var);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        l0 l0Var = (l0) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (!cancel || l0Var == null) {
            return cancel;
        }
        l0Var.a = null;
        l0Var.b = null;
        l0Var.c.i(null);
        return true;
    }

    @Override // defpackage.wp91
    public final void d(Runnable runnable, Executor executor) {
        this.b.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof dx91;
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
