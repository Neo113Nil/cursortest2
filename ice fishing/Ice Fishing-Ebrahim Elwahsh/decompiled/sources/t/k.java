package t;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k implements J3.a {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f40556n;

    /* renamed from: u, reason: collision with root package name */
    public final j f40557u = new j(this);

    public k(h hVar) {
        this.f40556n = new WeakReference(hVar);
    }

    @Override // J3.a
    public final void c(Runnable runnable, Executor executor) {
        this.f40557u.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        h hVar = (h) this.f40556n.get();
        boolean cancel = this.f40557u.cancel(z8);
        if (cancel && hVar != null) {
            hVar.f40551a = null;
            hVar.f40552b = null;
            hVar.f40553c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f40557u.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f40557u.f40548n instanceof C5010a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f40557u.isDone();
    }

    public final String toString() {
        return this.f40557u.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        return this.f40557u.get(j9, timeUnit);
    }
}
