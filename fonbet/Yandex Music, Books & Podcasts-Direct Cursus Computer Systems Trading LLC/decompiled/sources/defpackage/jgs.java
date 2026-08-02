package defpackage;

/* loaded from: classes.dex */
public final class jgs implements p0o, e0o {
    public final p0o a;
    public final Object b;
    public volatile jlq c;
    public volatile e0o d;
    public int e = 3;
    public int f = 3;
    public boolean g;

    public jgs(Object obj, p0o p0oVar) {
        this.b = obj;
        this.a = p0oVar;
    }

    @Override // defpackage.p0o, defpackage.e0o
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

    @Override // defpackage.e0o
    public final void b() {
        synchronized (this.b) {
            try {
                if (!tlm.a(this.f)) {
                    this.f = 2;
                    this.d.b();
                }
                if (!tlm.a(this.e)) {
                    this.e = 2;
                    this.c.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p0o
    public final boolean c(e0o e0oVar) {
        boolean z;
        synchronized (this.b) {
            try {
                p0o p0oVar = this.a;
                z = (p0oVar == null || p0oVar.c(this)) && e0oVar.equals(this.c) && this.e != 2;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.e0o
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.e0o
    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }

    @Override // defpackage.e0o
    public final boolean e() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }

    @Override // defpackage.e0o
    public final boolean f(e0o e0oVar) {
        if (!(e0oVar instanceof jgs)) {
            return false;
        }
        jgs jgsVar = (jgs) e0oVar;
        if (this.c == null) {
            if (jgsVar.c != null) {
                return false;
            }
        } else if (!this.c.f(jgsVar.c)) {
            return false;
        }
        return this.d == null ? jgsVar.d == null : this.d.f(jgsVar.d);
    }

    @Override // defpackage.p0o
    public final void g(e0o e0oVar) {
        synchronized (this.b) {
            try {
                if (!e0oVar.equals(this.c)) {
                    this.f = 5;
                    return;
                }
                this.e = 5;
                p0o p0oVar = this.a;
                if (p0oVar != null) {
                    p0oVar.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p0o
    public final p0o getRoot() {
        p0o root;
        synchronized (this.b) {
            try {
                p0o p0oVar = this.a;
                root = p0oVar != null ? p0oVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // defpackage.p0o
    public final void h(e0o e0oVar) {
        synchronized (this.b) {
            try {
                if (e0oVar.equals(this.d)) {
                    this.f = 4;
                    return;
                }
                this.e = 4;
                p0o p0oVar = this.a;
                if (p0oVar != null) {
                    p0oVar.h(this);
                }
                if (!tlm.a(this.f)) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p0o
    public final boolean i(e0o e0oVar) {
        boolean z;
        synchronized (this.b) {
            try {
                p0o p0oVar = this.a;
                z = (p0oVar == null || p0oVar.i(this)) && e0oVar.equals(this.c) && !a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.e0o
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.p0o
    public final boolean j(e0o e0oVar) {
        boolean z;
        synchronized (this.b) {
            try {
                p0o p0oVar = this.a;
                z = (p0oVar == null || p0oVar.j(this)) && (e0oVar.equals(this.c) || this.e != 4);
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.e0o
    public final void k() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != 4 && this.f != 1) {
                        this.f = 1;
                        this.d.k();
                    }
                    if (this.g && this.e != 1) {
                        this.e = 1;
                        this.c.k();
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
}
