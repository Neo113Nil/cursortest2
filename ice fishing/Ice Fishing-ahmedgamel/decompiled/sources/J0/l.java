package J0;

import S7.b0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements P3.a {

    /* renamed from: n, reason: collision with root package name */
    public final U0.k f1428n = new U0.k();

    public l(b0 b0Var) {
        b0Var.G(false, true, new k(0, this));
    }

    @Override // P3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f1428n.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f1428n.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f1428n.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1428n.f3276n instanceof U0.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1428n.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f1428n.get(j6, timeUnit);
    }
}
