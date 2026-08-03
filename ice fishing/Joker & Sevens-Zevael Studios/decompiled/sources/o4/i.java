package o4;

import a0.a0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import yc.e1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements h7.a {

    /* renamed from: g, reason: collision with root package name */
    public final z4.j f5213g = new z4.j();

    public i(e1 e1Var) {
        e1Var.k(new a0(16, this));
    }

    @Override // h7.a
    public final void a(Runnable runnable, Executor executor) {
        this.f5213g.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f5213g.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5213g.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5213g.f9129g instanceof z4.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5213g.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f5213g.get(j3, timeUnit);
    }
}
