package j3;

import P2.w;
import com.bumptech.glide.manager.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f38369a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final p f38370b = new p(11);

    /* renamed from: c, reason: collision with root package name */
    public boolean f38371c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f38372d;

    /* renamed from: e, reason: collision with root package name */
    public Object f38373e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f38374f;

    public final void a(Executor executor, c cVar) {
        this.f38370b.f(new k(executor, cVar));
        o();
    }

    public final void b(Executor executor, d dVar) {
        this.f38370b.f(new k(executor, dVar));
        o();
    }

    public final void c(Executor executor, e eVar) {
        this.f38370b.f(new k(executor, eVar));
        o();
    }

    public final m d(Executor executor, InterfaceC4604a interfaceC4604a) {
        m mVar = new m();
        this.f38370b.f(new j(executor, interfaceC4604a, mVar, 0));
        o();
        return mVar;
    }

    public final m e(Executor executor, InterfaceC4604a interfaceC4604a) {
        m mVar = new m();
        this.f38370b.f(new j(executor, interfaceC4604a, mVar, 1));
        o();
        return mVar;
    }

    public final Exception f() {
        Exception exc;
        synchronized (this.f38369a) {
            exc = this.f38374f;
        }
        return exc;
    }

    public final Object g() {
        Object obj;
        synchronized (this.f38369a) {
            try {
                w.j("Task is not yet complete", this.f38371c);
                if (this.f38372d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f38374f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.f38373e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean h() {
        boolean z3;
        synchronized (this.f38369a) {
            z3 = this.f38371c;
        }
        return z3;
    }

    public final boolean i() {
        boolean z3;
        synchronized (this.f38369a) {
            try {
                z3 = false;
                if (this.f38371c && !this.f38372d && this.f38374f == null) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    public final m j(Executor executor, g gVar) {
        m mVar = new m();
        this.f38370b.f(new k(executor, gVar, mVar));
        o();
        return mVar;
    }

    public final void k(Exception exc) {
        w.i(exc, "Exception must not be null");
        synchronized (this.f38369a) {
            n();
            this.f38371c = true;
            this.f38374f = exc;
        }
        this.f38370b.j(this);
    }

    public final void l(Object obj) {
        synchronized (this.f38369a) {
            n();
            this.f38371c = true;
            this.f38373e = obj;
        }
        this.f38370b.j(this);
    }

    public final void m() {
        synchronized (this.f38369a) {
            try {
                if (this.f38371c) {
                    return;
                }
                this.f38371c = true;
                this.f38372d = true;
                this.f38370b.j(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        if (this.f38371c) {
            int i = U7.m.f3262n;
            if (!h()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception f3 = f();
        }
    }

    public final void o() {
        synchronized (this.f38369a) {
            try {
                if (this.f38371c) {
                    this.f38370b.j(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
