package defpackage;

import com.bumptech.glide.request.RequestCoordinator$RequestState;
import com.bumptech.glide.request.a;

/* loaded from: classes10.dex */
public final class r0z0 implements s5j0, e5j0 {
    public final s5j0 a;
    public final Object b;
    public volatile a c;
    public volatile e5j0 d;
    public RequestCoordinator$RequestState e;
    public RequestCoordinator$RequestState f;
    public boolean g;

    public r0z0(Object obj, s5j0 s5j0Var) {
        RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
        this.e = requestCoordinator$RequestState;
        this.f = requestCoordinator$RequestState;
        this.b = obj;
        this.a = s5j0Var;
    }

    @Override // defpackage.s5j0, defpackage.e5j0
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.a() || this.c.a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.e5j0
    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator$RequestState.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.e5j0
    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator$RequestState.CLEARED;
        }
        return z;
    }

    @Override // defpackage.e5j0
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
            this.e = requestCoordinator$RequestState;
            this.f = requestCoordinator$RequestState;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.e5j0
    public final boolean d(e5j0 e5j0Var) {
        if (!(e5j0Var instanceof r0z0)) {
            return false;
        }
        r0z0 r0z0Var = (r0z0) e5j0Var;
        if (this.c == null) {
            if (r0z0Var.c != null) {
                return false;
            }
        } else if (!this.c.d(r0z0Var.c)) {
            return false;
        }
        return this.d == null ? r0z0Var.d == null : this.d.d(r0z0Var.d);
    }

    @Override // defpackage.s5j0
    public final void e(e5j0 e5j0Var) {
        synchronized (this.b) {
            try {
                if (e5j0Var.equals(this.d)) {
                    this.f = RequestCoordinator$RequestState.SUCCESS;
                    return;
                }
                this.e = RequestCoordinator$RequestState.SUCCESS;
                s5j0 s5j0Var = this.a;
                if (s5j0Var != null) {
                    s5j0Var.e(this);
                }
                if (!this.f.a()) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.s5j0
    public final boolean f(e5j0 e5j0Var) {
        boolean z;
        synchronized (this.b) {
            try {
                s5j0 s5j0Var = this.a;
                z = (s5j0Var == null || s5j0Var.f(this)) && e5j0Var.equals(this.c) && !a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.s5j0
    public final boolean g(e5j0 e5j0Var) {
        boolean z;
        synchronized (this.b) {
            try {
                s5j0 s5j0Var = this.a;
                z = (s5j0Var == null || s5j0Var.g(this)) && (e5j0Var.equals(this.c) || this.e != RequestCoordinator$RequestState.SUCCESS);
            } finally {
            }
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
        synchronized (this.b) {
            try {
                s5j0 s5j0Var = this.a;
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
        synchronized (this.b) {
            try {
                s5j0 s5j0Var = this.a;
                z = (s5j0Var == null || s5j0Var.h(this)) && e5j0Var.equals(this.c) && this.e != RequestCoordinator$RequestState.PAUSED;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.s5j0
    public final void i(e5j0 e5j0Var) {
        synchronized (this.b) {
            try {
                if (!e5j0Var.equals(this.c)) {
                    this.f = RequestCoordinator$RequestState.FAILED;
                    return;
                }
                this.e = RequestCoordinator$RequestState.FAILED;
                s5j0 s5j0Var = this.a;
                if (s5j0Var != null) {
                    s5j0Var.i(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.e5j0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator$RequestState.RUNNING;
        }
        return z;
    }

    @Override // defpackage.e5j0
    public final void j() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != RequestCoordinator$RequestState.SUCCESS) {
                        RequestCoordinator$RequestState requestCoordinator$RequestState = this.f;
                        RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                        if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                            this.f = requestCoordinator$RequestState2;
                            this.d.j();
                        }
                    }
                    if (this.g) {
                        RequestCoordinator$RequestState requestCoordinator$RequestState3 = this.e;
                        RequestCoordinator$RequestState requestCoordinator$RequestState4 = RequestCoordinator$RequestState.RUNNING;
                        if (requestCoordinator$RequestState3 != requestCoordinator$RequestState4) {
                            this.e = requestCoordinator$RequestState4;
                            this.c.j();
                        }
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.e5j0
    public final void pause() {
        synchronized (this.b) {
            try {
                if (!this.f.a()) {
                    this.f = RequestCoordinator$RequestState.PAUSED;
                    this.d.pause();
                }
                if (!this.e.a()) {
                    this.e = RequestCoordinator$RequestState.PAUSED;
                    this.c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
