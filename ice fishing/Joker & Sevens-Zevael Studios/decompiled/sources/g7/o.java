package g7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p6.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2552a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final m f2553b = new m();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2554c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f2555d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2556e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f2557f;

    public final void a(Executor executor, c cVar) {
        this.f2553b.b(new k(executor, cVar));
        o();
    }

    public final void b(Executor executor, d dVar) {
        this.f2553b.b(new k(executor, dVar));
        o();
    }

    public final void c(Executor executor, e eVar) {
        this.f2553b.b(new k(executor, eVar));
        o();
    }

    public final o d(Executor executor, a aVar) {
        o oVar = new o();
        this.f2553b.b(new j(executor, aVar, oVar, 0));
        o();
        return oVar;
    }

    public final o e(Executor executor, a aVar) {
        o oVar = new o();
        this.f2553b.b(new j(executor, aVar, oVar, 1));
        o();
        return oVar;
    }

    public final Exception f() {
        Exception exc;
        synchronized (this.f2552a) {
            exc = this.f2557f;
        }
        return exc;
    }

    public final Object g() {
        Object obj;
        synchronized (this.f2552a) {
            try {
                u.i("Task is not yet complete", this.f2554c);
                if (this.f2555d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f2557f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.f2556e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f2552a) {
            z10 = this.f2554c;
        }
        return z10;
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f2552a) {
            try {
                z10 = false;
                if (this.f2554c && !this.f2555d && this.f2557f == null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final o j(Executor executor, g gVar) {
        o oVar = new o();
        this.f2553b.b(new k(executor, gVar, oVar));
        o();
        return oVar;
    }

    public final void k(Exception exc) {
        u.h(exc, "Exception must not be null");
        synchronized (this.f2552a) {
            n();
            this.f2554c = true;
            this.f2557f = exc;
        }
        this.f2553b.c(this);
    }

    public final void l(Object obj) {
        synchronized (this.f2552a) {
            n();
            this.f2554c = true;
            this.f2556e = obj;
        }
        this.f2553b.c(this);
    }

    public final void m() {
        synchronized (this.f2552a) {
            try {
                if (this.f2554c) {
                    return;
                }
                this.f2554c = true;
                this.f2555d = true;
                this.f2553b.c(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        if (this.f2554c) {
            int i10 = ad.o.f331g;
            if (!h()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception f10 = f();
        }
    }

    public final void o() {
        synchronized (this.f2552a) {
            try {
                if (this.f2554c) {
                    this.f2553b.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
