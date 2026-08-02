package defpackage;

/* loaded from: classes.dex */
public final class ogb implements p0o, e0o {
    public final Object a;
    public final p0o b;
    public volatile e0o c;
    public volatile e0o d;
    public int e = 3;
    public int f = 3;

    public ogb(Object obj, p0o p0oVar) {
        this.a = obj;
        this.b = p0oVar;
    }

    @Override // defpackage.p0o, defpackage.e0o
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

    @Override // defpackage.e0o
    public final void b() {
        synchronized (this.a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.c.b();
                }
                if (this.f == 1) {
                    this.f = 2;
                    this.d.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p0o
    public final boolean c(e0o e0oVar) {
        boolean z;
        synchronized (this.a) {
            p0o p0oVar = this.b;
            z = (p0oVar == null || p0oVar.c(this)) && e0oVar.equals(this.c);
        }
        return z;
    }

    @Override // defpackage.e0o
    public final void clear() {
        synchronized (this.a) {
            try {
                this.e = 3;
                this.c.clear();
                if (this.f != 3) {
                    this.f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.e0o
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 3 && this.f == 3;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.e0o
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 4 || this.f == 4;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.e0o
    public final boolean f(e0o e0oVar) {
        if (e0oVar instanceof ogb) {
            ogb ogbVar = (ogb) e0oVar;
            if (this.c.f(ogbVar.c) && this.d.f(ogbVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.p0o
    public final void g(e0o e0oVar) {
        synchronized (this.a) {
            try {
                if (e0oVar.equals(this.d)) {
                    this.f = 5;
                    p0o p0oVar = this.b;
                    if (p0oVar != null) {
                        p0oVar.g(this);
                    }
                    return;
                }
                this.e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.d.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p0o
    public final p0o getRoot() {
        p0o root;
        synchronized (this.a) {
            try {
                p0o p0oVar = this.b;
                root = p0oVar != null ? p0oVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // defpackage.p0o
    public final void h(e0o e0oVar) {
        synchronized (this.a) {
            try {
                if (e0oVar.equals(this.c)) {
                    this.e = 4;
                } else if (e0oVar.equals(this.d)) {
                    this.f = 4;
                }
                p0o p0oVar = this.b;
                if (p0oVar != null) {
                    p0oVar.h(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p0o
    public final boolean i(e0o e0oVar) {
        boolean z;
        int i;
        synchronized (this.a) {
            p0o p0oVar = this.b;
            z = false;
            if (p0oVar == null || p0oVar.i(this)) {
                if (this.e != 5 ? e0oVar.equals(this.c) : e0oVar.equals(this.d) && ((i = this.f) == 4 || i == 5)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.e0o
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                z = true;
                if (this.e != 1 && this.f != 1) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.p0o
    public final boolean j(e0o e0oVar) {
        boolean z;
        synchronized (this.a) {
            p0o p0oVar = this.b;
            z = p0oVar == null || p0oVar.j(this);
        }
        return z;
    }

    @Override // defpackage.e0o
    public final void k() {
        synchronized (this.a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.c.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
