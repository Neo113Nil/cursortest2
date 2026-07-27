package t;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k implements N3.a {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f40528n;

    /* renamed from: u, reason: collision with root package name */
    public final j f40529u = new j(this);

    public k(h hVar) {
        this.f40528n = new WeakReference(hVar);
    }

    @Override // N3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f40529u.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        h hVar = (h) this.f40528n.get();
        boolean cancel = this.f40529u.cancel(z3);
        if (cancel && hVar != null) {
            hVar.f40523a = null;
            hVar.f40524b = null;
            hVar.f40525c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f40529u.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f40529u.f40520n instanceof C4979a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f40529u.isDone();
    }

    public final String toString() {
        return this.f40529u.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f40529u.get(j6, timeUnit);
    }
}
