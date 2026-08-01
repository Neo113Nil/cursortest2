package J0;

import S7.b0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m implements N3.a {

    /* renamed from: n, reason: collision with root package name */
    public final U0.k f1400n = new U0.k();

    public m(b0 b0Var) {
        b0Var.G(false, true, new l(0, this));
    }

    @Override // N3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f1400n.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.f1400n.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f1400n.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1400n.f3159n instanceof U0.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1400n.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f1400n.get(j6, timeUnit);
    }
}
