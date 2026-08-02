package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class onx extends Task {
    public final Object a = new Object();
    public final fmq b = new fmq(12);
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final void a(Executor executor, spj spjVar) {
        this.b.C(new tbx(executor, spjVar));
        u();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.b.C(new tbx(j8s.a, onCompleteListener));
        u();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final void b(Executor executor, OnCompleteListener onCompleteListener) {
        this.b.C(new tbx(executor, onCompleteListener));
        u();
    }

    @Override // com.google.android.gms.tasks.Task
    public final onx c(Executor executor, zpj zpjVar) {
        this.b.C(new tbx(executor, zpjVar));
        u();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final onx d(Executor executor, tqj tqjVar) {
        this.b.C(new tbx(executor, tqjVar));
        u();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task e(Executor executor, ag6 ag6Var) {
        onx onxVar = new onx();
        this.b.C(new c7x(executor, ag6Var, onxVar, 0));
        u();
        return onxVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(Executor executor, ag6 ag6Var) {
        onx onxVar = new onx();
        this.b.C(new c7x(executor, ag6Var, onxVar, 1));
        u();
        return onxVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception g() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object h() {
        Object obj;
        synchronized (this.a) {
            try {
                y1g.I("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new njo(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object i() {
        Object obj;
        synchronized (this.a) {
            try {
                y1g.I("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                boolean isInstance = IOException.class.isInstance(this.f);
                Exception exc = this.f;
                if (isInstance) {
                    throw ((Throwable) IOException.class.cast(exc));
                }
                if (exc != null) {
                    throw new njo(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean j() {
        return this.d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task m(Executor executor, aqr aqrVar) {
        onx onxVar = new onx();
        this.b.C(new tbx(executor, aqrVar, onxVar));
        u();
        return onxVar;
    }

    public final onx n(zpj zpjVar) {
        c(j8s.a, zpjVar);
        return this;
    }

    public final onx o(tqj tqjVar) {
        d(j8s.a, tqjVar);
        return this;
    }

    public final void p(Exception exc) {
        y1g.H(exc, "Exception must not be null");
        synchronized (this.a) {
            t();
            this.c = true;
            this.f = exc;
        }
        this.b.D(this);
    }

    public final void q(Object obj) {
        synchronized (this.a) {
            t();
            this.c = true;
            this.e = obj;
        }
        this.b.D(this);
    }

    public final void r() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.D(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean s(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.D(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t() {
        if (this.c) {
            if (!k()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception g = g();
        }
    }

    public final void u() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.D(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
