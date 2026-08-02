package l3;

import R2.w;
import com.bumptech.glide.manager.o;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f38881a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final o f38882b = new o(11);

    /* renamed from: c, reason: collision with root package name */
    public boolean f38883c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f38884d;

    /* renamed from: e, reason: collision with root package name */
    public Object f38885e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f38886f;

    public final void a(Executor executor, c cVar) {
        this.f38882b.f(new k(executor, cVar));
        o();
    }

    public final void b(Executor executor, d dVar) {
        this.f38882b.f(new k(executor, dVar));
        o();
    }

    public final void c(Executor executor, e eVar) {
        this.f38882b.f(new k(executor, eVar));
        o();
    }

    public final m d(Executor executor, InterfaceC4673a interfaceC4673a) {
        m mVar = new m();
        this.f38882b.f(new j(executor, interfaceC4673a, mVar, 0));
        o();
        return mVar;
    }

    public final m e(Executor executor, InterfaceC4673a interfaceC4673a) {
        m mVar = new m();
        this.f38882b.f(new j(executor, interfaceC4673a, mVar, 1));
        o();
        return mVar;
    }

    public final Exception f() {
        Exception exc;
        synchronized (this.f38881a) {
            exc = this.f38886f;
        }
        return exc;
    }

    public final Object g() {
        Object obj;
        synchronized (this.f38881a) {
            try {
                w.j("Task is not yet complete", this.f38883c);
                if (this.f38884d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f38886f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.f38885e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean h() {
        boolean z6;
        synchronized (this.f38881a) {
            z6 = this.f38883c;
        }
        return z6;
    }

    public final boolean i() {
        boolean z6;
        synchronized (this.f38881a) {
            try {
                z6 = false;
                if (this.f38883c && !this.f38884d && this.f38886f == null) {
                    z6 = true;
                }
            } finally {
            }
        }
        return z6;
    }

    public final m j(Executor executor, g gVar) {
        m mVar = new m();
        this.f38882b.f(new k(executor, gVar, mVar));
        o();
        return mVar;
    }

    public final void k(Exception exc) {
        w.i(exc, "Exception must not be null");
        synchronized (this.f38881a) {
            n();
            this.f38883c = true;
            this.f38886f = exc;
        }
        this.f38882b.j(this);
    }

    public final void l(Object obj) {
        synchronized (this.f38881a) {
            n();
            this.f38883c = true;
            this.f38885e = obj;
        }
        this.f38882b.j(this);
    }

    public final void m() {
        synchronized (this.f38881a) {
            try {
                if (this.f38883c) {
                    return;
                }
                this.f38883c = true;
                this.f38884d = true;
                this.f38882b.j(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        if (this.f38883c) {
            int i = U7.m.f3385n;
            if (!h()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception f2 = f();
        }
    }

    public final void o() {
        synchronized (this.f38881a) {
            try {
                if (this.f38883c) {
                    this.f38882b.j(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
