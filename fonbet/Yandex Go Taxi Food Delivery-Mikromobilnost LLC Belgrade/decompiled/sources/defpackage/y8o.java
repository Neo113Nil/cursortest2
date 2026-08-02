package defpackage;

import com.bumptech.glide.request.RequestCoordinator$RequestState;

/* loaded from: classes10.dex */
public final class y8o implements s5j0, e5j0 {
    public final Object a;
    public final s5j0 b;
    public volatile e5j0 c;
    public volatile e5j0 d;
    public RequestCoordinator$RequestState e;
    public RequestCoordinator$RequestState f;

    public y8o(Object obj, s5j0 s5j0Var) {
        RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
        this.e = requestCoordinator$RequestState;
        this.f = requestCoordinator$RequestState;
        this.a = obj;
        this.b = s5j0Var;
    }

    @Override // defpackage.s5j0, defpackage.e5j0
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.a() || this.d.a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.e5j0
    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.e;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.SUCCESS;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 || this.f == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.e5j0
    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.e;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.CLEARED;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 && this.f == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.e5j0
    public final void clear() {
        synchronized (this.a) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
                this.e = requestCoordinator$RequestState;
                this.c.clear();
                if (this.f != requestCoordinator$RequestState) {
                    this.f = requestCoordinator$RequestState;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.e5j0
    public final boolean d(e5j0 e5j0Var) {
        if (e5j0Var instanceof y8o) {
            y8o y8oVar = (y8o) e5j0Var;
            if (this.c.d(y8oVar.c) && this.d.d(y8oVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.s5j0
    public final void e(e5j0 e5j0Var) {
        synchronized (this.a) {
            try {
                if (e5j0Var.equals(this.c)) {
                    this.e = RequestCoordinator$RequestState.SUCCESS;
                } else if (e5j0Var.equals(this.d)) {
                    this.f = RequestCoordinator$RequestState.SUCCESS;
                }
                s5j0 s5j0Var = this.b;
                if (s5j0Var != null) {
                    s5j0Var.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.s5j0
    public final boolean f(e5j0 e5j0Var) {
        boolean z;
        RequestCoordinator$RequestState requestCoordinator$RequestState;
        synchronized (this.a) {
            s5j0 s5j0Var = this.b;
            z = false;
            if (s5j0Var == null || s5j0Var.f(this)) {
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = this.e;
                RequestCoordinator$RequestState requestCoordinator$RequestState3 = RequestCoordinator$RequestState.FAILED;
                if (requestCoordinator$RequestState2 != requestCoordinator$RequestState3 ? e5j0Var.equals(this.c) : e5j0Var.equals(this.d) && ((requestCoordinator$RequestState = this.f) == RequestCoordinator$RequestState.SUCCESS || requestCoordinator$RequestState == requestCoordinator$RequestState3)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.s5j0
    public final boolean g(e5j0 e5j0Var) {
        boolean z;
        synchronized (this.a) {
            s5j0 s5j0Var = this.b;
            z = s5j0Var == null || s5j0Var.g(this);
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [s5j0] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.s5j0
    public final s5j0 getRoot() {
        ?? r2;
        synchronized (this.a) {
            try {
                s5j0 s5j0Var = this.b;
                this = this;
                if (s5j0Var != null) {
                    r2 = s5j0Var.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r2;
    }

    @Override // defpackage.s5j0
    public final boolean h(e5j0 e5j0Var) {
        boolean z;
        synchronized (this.a) {
            s5j0 s5j0Var = this.b;
            z = (s5j0Var == null || s5j0Var.h(this)) && e5j0Var.equals(this.c);
        }
        return z;
    }

    @Override // defpackage.s5j0
    public final void i(e5j0 e5j0Var) {
        synchronized (this.a) {
            try {
                if (e5j0Var.equals(this.d)) {
                    this.f = RequestCoordinator$RequestState.FAILED;
                    s5j0 s5j0Var = this.b;
                    if (s5j0Var != null) {
                        s5j0Var.i(this);
                    }
                    return;
                }
                this.e = RequestCoordinator$RequestState.FAILED;
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                    this.f = requestCoordinator$RequestState2;
                    this.d.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.e5j0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.e;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 || this.f == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.e5j0
    public final void j() {
        synchronized (this.a) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.e;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                    this.e = requestCoordinator$RequestState2;
                    this.c.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.e5j0
    public final void pause() {
        synchronized (this.a) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.e;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState == requestCoordinator$RequestState2) {
                    this.e = RequestCoordinator$RequestState.PAUSED;
                    this.c.pause();
                }
                if (this.f == requestCoordinator$RequestState2) {
                    this.f = RequestCoordinator$RequestState.PAUSED;
                    this.d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
