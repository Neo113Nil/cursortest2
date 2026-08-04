package com.gamericefishpro.space.r9;

import com.gamericefishpro.space.i9.g4;
import com.gamericefishpro.space.v8.c0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Task {
    public final Object a = new Object();
    public final g4 b = new g4(3);
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final void a(Executor executor, c cVar) {
        this.b.d(new k(executor, cVar));
        p();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.b.d(new k(i.a, onCompleteListener));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final void b(Executor executor, OnCompleteListener onCompleteListener) {
        this.b.d(new k(executor, onCompleteListener));
        p();
    }

    @Override // com.google.android.gms.tasks.Task
    public final o c(Executor executor, d dVar) {
        this.b.d(new k(executor, dVar));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final o d(com.appsflyer.internal.f fVar) {
        e(i.a, fVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final o e(Executor executor, e eVar) {
        this.b.d(new k(executor, eVar));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(Executor executor, a aVar) {
        o oVar = new o();
        this.b.d(new j(executor, aVar, oVar, 0));
        p();
        return oVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task g(Executor executor, a aVar) {
        o oVar = new o();
        this.b.d(new j(executor, aVar, oVar, 1));
        p();
        return oVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.a) {
            try {
                c0.i("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object h() {
        Object obj;
        synchronized (this.a) {
            try {
                c0.i("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                if (IOException.class.isInstance(this.f)) {
                    throw ((Throwable) IOException.class.cast(this.f));
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean i() {
        return this.d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task k(Executor executor, g gVar) {
        o oVar = new o();
        this.b.d(new k(executor, gVar, oVar));
        p();
        return oVar;
    }

    public final void l(Exception exc) {
        c0.h(exc, "Exception must not be null");
        synchronized (this.a) {
            o();
            this.c = true;
            this.f = exc;
        }
        this.b.f(this);
    }

    public final void m(Object obj) {
        synchronized (this.a) {
            o();
            this.c = true;
            this.e = obj;
        }
        this.b.f(this);
    }

    public final void n() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.f(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        String strConcat;
        if (this.c) {
            int i = b.d;
            if (!j()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception exception = getException();
            if (exception != null) {
                strConcat = "failure";
            } else if (isSuccessful()) {
                strConcat = "result ".concat(String.valueOf(getResult()));
            } else {
                strConcat = this.d ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void p() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
