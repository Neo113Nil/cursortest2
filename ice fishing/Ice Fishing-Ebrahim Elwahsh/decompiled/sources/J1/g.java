package J1;

import D.y;

/* loaded from: classes.dex */
public final class g implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1387a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1388b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f1389c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f1390d;

    /* renamed from: e, reason: collision with root package name */
    public int f1391e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f1392f = 3;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1393g;

    public g(Object obj, d dVar) {
        this.f1388b = obj;
        this.f1387a = dVar;
    }

    @Override // J1.d, J1.c
    public final boolean a() {
        boolean z8;
        synchronized (this.f1388b) {
            try {
                z8 = this.f1390d.a() || this.f1389c.a();
            } finally {
            }
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final boolean b(c cVar) {
        boolean z8;
        synchronized (this.f1388b) {
            try {
                ?? r12 = this.f1387a;
                z8 = (r12 == 0 || r12.b(this)) && cVar.equals(this.f1389c) && this.f1391e != 2;
            } finally {
            }
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final boolean c(c cVar) {
        boolean z8;
        synchronized (this.f1388b) {
            try {
                ?? r12 = this.f1387a;
                z8 = (r12 == 0 || r12.c(this)) && (cVar.equals(this.f1389c) || this.f1391e != 4);
            } finally {
            }
        }
        return z8;
    }

    @Override // J1.c
    public final void clear() {
        synchronized (this.f1388b) {
            this.f1393g = false;
            this.f1391e = 3;
            this.f1392f = 3;
            this.f1390d.clear();
            this.f1389c.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final d d() {
        d d2;
        synchronized (this.f1388b) {
            try {
                ?? r12 = this.f1387a;
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
        synchronized (this.f1388b) {
            try {
                if (cVar.equals(this.f1390d)) {
                    this.f1392f = 4;
                    return;
                }
                this.f1391e = 4;
                ?? r32 = this.f1387a;
                if (r32 != 0) {
                    r32.e(this);
                }
                if (!y.d(this.f1392f)) {
                    this.f1390d.clear();
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
        if (this.f1389c == null) {
            if (gVar.f1389c != null) {
                return false;
            }
        } else if (!this.f1389c.f(gVar.f1389c)) {
            return false;
        }
        return this.f1390d == null ? gVar.f1390d == null : this.f1390d.f(gVar.f1390d);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final void g(c cVar) {
        synchronized (this.f1388b) {
            try {
                if (!cVar.equals(this.f1389c)) {
                    this.f1392f = 5;
                    return;
                }
                this.f1391e = 5;
                ?? r32 = this.f1387a;
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
        boolean z8;
        synchronized (this.f1388b) {
            z8 = this.f1391e == 3;
        }
        return z8;
    }

    @Override // J1.c
    public final void i() {
        synchronized (this.f1388b) {
            try {
                this.f1393g = true;
                try {
                    if (this.f1391e != 4 && this.f1392f != 1) {
                        this.f1392f = 1;
                        this.f1390d.i();
                    }
                    if (this.f1393g && this.f1391e != 1) {
                        this.f1391e = 1;
                        this.f1389c.i();
                    }
                    this.f1393g = false;
                } catch (Throwable th) {
                    this.f1393g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // J1.c
    public final boolean isRunning() {
        boolean z8;
        synchronized (this.f1388b) {
            z8 = true;
            if (this.f1391e != 1) {
                z8 = false;
            }
        }
        return z8;
    }

    @Override // J1.c
    public final boolean j() {
        boolean z8;
        synchronized (this.f1388b) {
            z8 = this.f1391e == 4;
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final boolean k(c cVar) {
        boolean z8;
        synchronized (this.f1388b) {
            try {
                ?? r12 = this.f1387a;
                z8 = (r12 == 0 || r12.k(this)) && cVar.equals(this.f1389c) && !a();
            } finally {
            }
        }
        return z8;
    }

    @Override // J1.c
    public final void pause() {
        synchronized (this.f1388b) {
            try {
                if (!y.d(this.f1392f)) {
                    this.f1392f = 2;
                    this.f1390d.pause();
                }
                if (!y.d(this.f1391e)) {
                    this.f1391e = 2;
                    this.f1389c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
