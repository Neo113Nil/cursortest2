package t;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k implements P3.a {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f40584n;

    /* renamed from: u, reason: collision with root package name */
    public final j f40585u = new j(this);

    public k(h hVar) {
        this.f40584n = new WeakReference(hVar);
    }

    @Override // P3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f40585u.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        h hVar = (h) this.f40584n.get();
        boolean cancel = this.f40585u.cancel(z6);
        if (cancel && hVar != null) {
            hVar.f40579a = null;
            hVar.f40580b = null;
            hVar.f40581c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f40585u.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f40585u.f40576n instanceof C4978a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f40585u.isDone();
    }

    public final String toString() {
        return this.f40585u.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f40585u.get(j6, timeUnit);
    }
}
