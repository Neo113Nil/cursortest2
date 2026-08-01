package t;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k implements N3.a {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f40531n;

    /* renamed from: u, reason: collision with root package name */
    public final j f40532u = new j(this);

    public k(h hVar) {
        this.f40531n = new WeakReference(hVar);
    }

    @Override // N3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f40532u.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        h hVar = (h) this.f40531n.get();
        boolean cancel = this.f40532u.cancel(z3);
        if (cancel && hVar != null) {
            hVar.f40526a = null;
            hVar.f40527b = null;
            hVar.f40528c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f40532u.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f40532u.f40523n instanceof C4979a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f40532u.isDone();
    }

    public final String toString() {
        return this.f40532u.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f40532u.get(j6, timeUnit);
    }
}
