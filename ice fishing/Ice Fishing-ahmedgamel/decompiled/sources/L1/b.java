package L1;

/* loaded from: classes.dex */
public final class b implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1744a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1745b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f1746c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f1747d;

    /* renamed from: e, reason: collision with root package name */
    public int f1748e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f1749f = 3;

    public b(Object obj, d dVar) {
        this.f1744a = obj;
        this.f1745b = dVar;
    }

    @Override // L1.d, L1.c
    public final boolean a() {
        boolean z6;
        synchronized (this.f1744a) {
            try {
                z6 = this.f1746c.a() || this.f1747d.a();
            } finally {
            }
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [L1.d, java.lang.Object] */
    @Override // L1.d
    public final boolean b(c cVar) {
        boolean z6;
        synchronized (this.f1744a) {
            ?? r02 = this.f1745b;
            z6 = r02 == 0 || r02.b(this);
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [L1.d, java.lang.Object] */
    @Override // L1.d
    public final boolean c(c cVar) {
        boolean z6;
        int i;
        synchronized (this.f1744a) {
            ?? r1 = this.f1745b;
            z6 = false;
            if (r1 == 0 || r1.c(this)) {
                if (this.f1748e != 5 ? cVar.equals(this.f1746c) : cVar.equals(this.f1747d) && ((i = this.f1749f) == 4 || i == 5)) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Override // L1.c
    public final void clear() {
        synchronized (this.f1744a) {
            try {
                this.f1748e = 3;
                this.f1746c.clear();
                if (this.f1749f != 3) {
                    this.f1749f = 3;
                    this.f1747d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [L1.d, java.lang.Object] */
    @Override // L1.d
    public final void d(c cVar) {
        synchronized (this.f1744a) {
            try {
                if (cVar.equals(this.f1747d)) {
                    this.f1749f = 5;
                    ?? r32 = this.f1745b;
                    if (r32 != 0) {
                        r32.d(this);
                    }
                    return;
                }
                this.f1748e = 5;
                if (this.f1749f != 1) {
                    this.f1749f = 1;
                    this.f1747d.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [L1.d, java.lang.Object] */
    @Override // L1.d
    public final d e() {
        d e9;
        synchronized (this.f1744a) {
            try {
                ?? r1 = this.f1745b;
                e9 = r1 != 0 ? r1.e() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e9;
    }

    @Override // L1.c
    public final boolean f(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f1746c.f(bVar.f1746c) && this.f1747d.f(bVar.f1747d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [L1.d, java.lang.Object] */
    @Override // L1.d
    public final void g(c cVar) {
        synchronized (this.f1744a) {
            try {
                if (cVar.equals(this.f1746c)) {
                    this.f1748e = 4;
                } else if (cVar.equals(this.f1747d)) {
                    this.f1749f = 4;
                }
                ?? r42 = this.f1745b;
                if (r42 != 0) {
                    r42.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L1.c
    public final boolean h() {
        boolean z6;
        synchronized (this.f1744a) {
            try {
                z6 = this.f1748e == 3 && this.f1749f == 3;
            } finally {
            }
        }
        return z6;
    }

    @Override // L1.c
    public final void i() {
        synchronized (this.f1744a) {
            try {
                if (this.f1748e != 1) {
                    this.f1748e = 1;
                    this.f1746c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L1.c
    public final boolean isRunning() {
        boolean z6;
        synchronized (this.f1744a) {
            try {
                z6 = true;
                if (this.f1748e != 1 && this.f1749f != 1) {
                    z6 = false;
                }
            } finally {
            }
        }
        return z6;
    }

    @Override // L1.c
    public final boolean j() {
        boolean z6;
        synchronized (this.f1744a) {
            try {
                z6 = this.f1748e == 4 || this.f1749f == 4;
            } finally {
            }
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [L1.d, java.lang.Object] */
    @Override // L1.d
    public final boolean k(c cVar) {
        boolean z6;
        synchronized (this.f1744a) {
            ?? r1 = this.f1745b;
            z6 = (r1 == 0 || r1.k(this)) && cVar.equals(this.f1746c);
        }
        return z6;
    }

    @Override // L1.c
    public final void pause() {
        synchronized (this.f1744a) {
            try {
                if (this.f1748e == 1) {
                    this.f1748e = 2;
                    this.f1746c.pause();
                }
                if (this.f1749f == 1) {
                    this.f1749f = 2;
                    this.f1747d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
