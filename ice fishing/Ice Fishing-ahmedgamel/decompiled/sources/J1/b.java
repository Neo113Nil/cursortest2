package J1;

/* loaded from: classes.dex */
public final class b implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1428a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1429b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f1430c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f1431d;

    /* renamed from: e, reason: collision with root package name */
    public int f1432e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f1433f = 3;

    public b(Object obj, d dVar) {
        this.f1428a = obj;
        this.f1429b = dVar;
    }

    @Override // J1.d, J1.c
    public final boolean a() {
        boolean z3;
        synchronized (this.f1428a) {
            try {
                z3 = this.f1430c.a() || this.f1431d.a();
            } finally {
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final boolean b(c cVar) {
        boolean z3;
        synchronized (this.f1428a) {
            ?? r12 = this.f1429b;
            z3 = (r12 == 0 || r12.b(this)) && cVar.equals(this.f1430c);
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final boolean c(c cVar) {
        boolean z3;
        synchronized (this.f1428a) {
            ?? r02 = this.f1429b;
            z3 = r02 == 0 || r02.c(this);
        }
        return z3;
    }

    @Override // J1.c
    public final void clear() {
        synchronized (this.f1428a) {
            try {
                this.f1432e = 3;
                this.f1430c.clear();
                if (this.f1433f != 3) {
                    this.f1433f = 3;
                    this.f1431d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final d d() {
        d d2;
        synchronized (this.f1428a) {
            try {
                ?? r12 = this.f1429b;
                d2 = r12 != 0 ? r12.d() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d2;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final void e(c cVar) {
        synchronized (this.f1428a) {
            try {
                if (cVar.equals(this.f1430c)) {
                    this.f1432e = 4;
                } else if (cVar.equals(this.f1431d)) {
                    this.f1433f = 4;
                }
                ?? r42 = this.f1429b;
                if (r42 != 0) {
                    r42.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.c
    public final boolean f(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f1430c.f(bVar.f1430c) && this.f1431d.f(bVar.f1431d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final void g(c cVar) {
        synchronized (this.f1428a) {
            try {
                if (cVar.equals(this.f1431d)) {
                    this.f1433f = 5;
                    ?? r32 = this.f1429b;
                    if (r32 != 0) {
                        r32.g(this);
                    }
                    return;
                }
                this.f1432e = 5;
                if (this.f1433f != 1) {
                    this.f1433f = 1;
                    this.f1431d.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.c
    public final boolean h() {
        boolean z3;
        synchronized (this.f1428a) {
            try {
                z3 = this.f1432e == 3 && this.f1433f == 3;
            } finally {
            }
        }
        return z3;
    }

    @Override // J1.c
    public final void i() {
        synchronized (this.f1428a) {
            try {
                if (this.f1432e != 1) {
                    this.f1432e = 1;
                    this.f1430c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.c
    public final boolean isRunning() {
        boolean z3;
        synchronized (this.f1428a) {
            try {
                z3 = true;
                if (this.f1432e != 1 && this.f1433f != 1) {
                    z3 = false;
                }
            } finally {
            }
        }
        return z3;
    }

    @Override // J1.c
    public final boolean j() {
        boolean z3;
        synchronized (this.f1428a) {
            try {
                z3 = this.f1432e == 4 || this.f1433f == 4;
            } finally {
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final boolean k(c cVar) {
        boolean z3;
        int i;
        synchronized (this.f1428a) {
            ?? r12 = this.f1429b;
            z3 = false;
            if (r12 == 0 || r12.k(this)) {
                if (this.f1432e != 5 ? cVar.equals(this.f1430c) : cVar.equals(this.f1431d) && ((i = this.f1433f) == 4 || i == 5)) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    @Override // J1.c
    public final void pause() {
        synchronized (this.f1428a) {
            try {
                if (this.f1432e == 1) {
                    this.f1432e = 2;
                    this.f1430c.pause();
                }
                if (this.f1433f == 1) {
                    this.f1433f = 2;
                    this.f1431d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
