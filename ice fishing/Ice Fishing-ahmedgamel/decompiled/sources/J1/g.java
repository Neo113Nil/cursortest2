package J1;

import D.y;

/* loaded from: classes.dex */
public final class g implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1462a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1463b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f1464c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f1465d;

    /* renamed from: e, reason: collision with root package name */
    public int f1466e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f1467f = 3;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1468g;

    public g(Object obj, d dVar) {
        this.f1463b = obj;
        this.f1462a = dVar;
    }

    @Override // J1.d, J1.c
    public final boolean a() {
        boolean z3;
        synchronized (this.f1463b) {
            try {
                z3 = this.f1465d.a() || this.f1464c.a();
            } finally {
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final boolean b(c cVar) {
        boolean z3;
        synchronized (this.f1463b) {
            try {
                ?? r12 = this.f1462a;
                z3 = (r12 == 0 || r12.b(this)) && cVar.equals(this.f1464c) && this.f1466e != 2;
            } finally {
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final boolean c(c cVar) {
        boolean z3;
        synchronized (this.f1463b) {
            try {
                ?? r12 = this.f1462a;
                z3 = (r12 == 0 || r12.c(this)) && (cVar.equals(this.f1464c) || this.f1466e != 4);
            } finally {
            }
        }
        return z3;
    }

    @Override // J1.c
    public final void clear() {
        synchronized (this.f1463b) {
            this.f1468g = false;
            this.f1466e = 3;
            this.f1467f = 3;
            this.f1465d.clear();
            this.f1464c.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final d d() {
        d d2;
        synchronized (this.f1463b) {
            try {
                ?? r12 = this.f1462a;
                d2 = r12 != 0 ? r12.d() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final void e(c cVar) {
        synchronized (this.f1463b) {
            try {
                if (cVar.equals(this.f1465d)) {
                    this.f1467f = 4;
                    return;
                }
                this.f1466e = 4;
                ?? r32 = this.f1462a;
                if (r32 != 0) {
                    r32.e(this);
                }
                if (!y.d(this.f1467f)) {
                    this.f1465d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.c
    public final boolean f(c cVar) {
        if (!(cVar instanceof g)) {
            return false;
        }
        g gVar = (g) cVar;
        if (this.f1464c == null) {
            if (gVar.f1464c != null) {
                return false;
            }
        } else if (!this.f1464c.f(gVar.f1464c)) {
            return false;
        }
        return this.f1465d == null ? gVar.f1465d == null : this.f1465d.f(gVar.f1465d);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final void g(c cVar) {
        synchronized (this.f1463b) {
            try {
                if (!cVar.equals(this.f1464c)) {
                    this.f1467f = 5;
                    return;
                }
                this.f1466e = 5;
                ?? r32 = this.f1462a;
                if (r32 != 0) {
                    r32.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.c
    public final boolean h() {
        boolean z3;
        synchronized (this.f1463b) {
            z3 = this.f1466e == 3;
        }
        return z3;
    }

    @Override // J1.c
    public final void i() {
        synchronized (this.f1463b) {
            try {
                this.f1468g = true;
                try {
                    if (this.f1466e != 4 && this.f1467f != 1) {
                        this.f1467f = 1;
                        this.f1465d.i();
                    }
                    if (this.f1468g && this.f1466e != 1) {
                        this.f1466e = 1;
                        this.f1464c.i();
                    }
                    this.f1468g = false;
                } catch (Throwable th) {
                    this.f1468g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // J1.c
    public final boolean isRunning() {
        boolean z3;
        synchronized (this.f1463b) {
            z3 = true;
            if (this.f1466e != 1) {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // J1.c
    public final boolean j() {
        boolean z3;
        synchronized (this.f1463b) {
            z3 = this.f1466e == 4;
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final boolean k(c cVar) {
        boolean z3;
        synchronized (this.f1463b) {
            try {
                ?? r12 = this.f1462a;
                z3 = (r12 == 0 || r12.k(this)) && cVar.equals(this.f1464c) && !a();
            } finally {
            }
        }
        return z3;
    }

    @Override // J1.c
    public final void pause() {
        synchronized (this.f1463b) {
            try {
                if (!y.d(this.f1467f)) {
                    this.f1467f = 2;
                    this.f1465d.pause();
                }
                if (!y.d(this.f1466e)) {
                    this.f1466e = 2;
                    this.f1464c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
