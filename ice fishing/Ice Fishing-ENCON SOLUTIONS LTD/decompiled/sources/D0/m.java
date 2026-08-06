package D0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p0.AbstractC1021r;

/* loaded from: classes.dex */
public final class m extends Task {

    /* renamed from: a, reason: collision with root package name */
    public final Object f229a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final j f230b = new j();

    /* renamed from: c, reason: collision with root package name */
    public boolean f231c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f232d;

    /* renamed from: e, reason: collision with root package name */
    public Object f233e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f234f;

    @Override // com.google.android.gms.tasks.Task
    public final m a(Executor executor, b bVar) {
        this.f230b.c(new g(executor, bVar));
        h();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception b() {
        Exception exc;
        synchronized (this.f229a) {
            exc = this.f234f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object c() {
        Object obj;
        synchronized (this.f229a) {
            try {
                if (!this.f231c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.f232d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f234f;
                if (exc != null) {
                    throw new c(exc);
                }
                obj = this.f233e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean d() {
        boolean z2;
        synchronized (this.f229a) {
            try {
                z2 = false;
                if (this.f231c && !this.f232d && this.f234f == null) {
                    z2 = true;
                }
            } finally {
            }
        }
        return z2;
    }

    public final void e(Exception exc) {
        AbstractC1021r.d(exc, "Exception must not be null");
        synchronized (this.f229a) {
            g();
            this.f231c = true;
            this.f234f = exc;
        }
        this.f230b.d(this);
    }

    public final void f(Object obj) {
        synchronized (this.f229a) {
            g();
            this.f231c = true;
            this.f233e = obj;
        }
        this.f230b.d(this);
    }

    public final void g() {
        boolean z2;
        if (this.f231c) {
            int i2 = C1.m.f188a;
            synchronized (this.f229a) {
                z2 = this.f231c;
            }
            if (!z2) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception b2 = b();
        }
    }

    public final void h() {
        synchronized (this.f229a) {
            try {
                if (this.f231c) {
                    this.f230b.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
