package L1;

import D.x;

/* loaded from: classes.dex */
public final class g implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1778a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1779b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f1780c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f1781d;

    /* renamed from: e, reason: collision with root package name */
    public int f1782e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f1783f = 3;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1784g;

    public g(Object obj, d dVar) {
        this.f1779b = obj;
        this.f1778a = dVar;
    }

    @Override // L1.d, L1.c
    public final boolean a() {
        boolean z6;
        synchronized (this.f1779b) {
            try {
                z6 = this.f1781d.a() || this.f1780c.a();
            } finally {
            }
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [L1.d, java.lang.Object] */
    @Override // L1.d
    public final boolean b(c cVar) {
        boolean z6;
        synchronized (this.f1779b) {
            try {
                ?? r1 = this.f1778a;
                z6 = (r1 == 0 || r1.b(this)) && (cVar.equals(this.f1780c) || this.f1782e != 4);
            } finally {
            }
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [L1.d, java.lang.Object] */
    @Override // L1.d
    public final boolean c(c cVar) {
        boolean z6;
        synchronized (this.f1779b) {
            try {
                ?? r1 = this.f1778a;
                z6 = (r1 == 0 || r1.c(this)) && cVar.equals(this.f1780c) && !a();
            } finally {
            }
        }
        return z6;
    }

    @Override // L1.c
    public final void clear() {
        synchronized (this.f1779b) {
            this.f1784g = false;
            this.f1782e = 3;
            this.f1783f = 3;
            this.f1781d.clear();
            this.f1780c.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [L1.d, java.lang.Object] */
    @Override // L1.d
    public final void d(c cVar) {
        synchronized (this.f1779b) {
            try {
                if (!cVar.equals(this.f1780c)) {
                    this.f1783f = 5;
                    return;
                }
                this.f1782e = 5;
                ?? r32 = this.f1778a;
                if (r32 != 0) {
                    r32.d(this);
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
        synchronized (this.f1779b) {
            try {
                ?? r1 = this.f1778a;
                e9 = r1 != 0 ? r1.e() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e9;
    }

    @Override // L1.c
    public final boolean f(c cVar) {
        if (!(cVar instanceof g)) {
            return false;
        }
        g gVar = (g) cVar;
        if (this.f1780c == null) {
            if (gVar.f1780c != null) {
                return false;
            }
        } else if (!this.f1780c.f(gVar.f1780c)) {
            return false;
        }
        return this.f1781d == null ? gVar.f1781d == null : this.f1781d.f(gVar.f1781d);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [L1.d, java.lang.Object] */
    @Override // L1.d
    public final void g(c cVar) {
        synchronized (this.f1779b) {
            try {
                if (cVar.equals(this.f1781d)) {
                    this.f1783f = 4;
                    return;
                }
                this.f1782e = 4;
                ?? r32 = this.f1778a;
                if (r32 != 0) {
                    r32.g(this);
                }
                if (!x.d(this.f1783f)) {
                    this.f1781d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L1.c
    public final boolean h() {
        boolean z6;
        synchronized (this.f1779b) {
            z6 = this.f1782e == 3;
        }
        return z6;
    }

    @Override // L1.c
    public final void i() {
        synchronized (this.f1779b) {
            try {
                this.f1784g = true;
                try {
                    if (this.f1782e != 4 && this.f1783f != 1) {
                        this.f1783f = 1;
                        this.f1781d.i();
                    }
                    if (this.f1784g && this.f1782e != 1) {
                        this.f1782e = 1;
                        this.f1780c.i();
                    }
                    this.f1784g = false;
                } catch (Throwable th) {
                    this.f1784g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // L1.c
    public final boolean isRunning() {
        boolean z6;
        synchronized (this.f1779b) {
            z6 = true;
            if (this.f1782e != 1) {
                z6 = false;
            }
        }
        return z6;
    }

    @Override // L1.c
    public final boolean j() {
        boolean z6;
        synchronized (this.f1779b) {
            z6 = this.f1782e == 4;
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [L1.d, java.lang.Object] */
    @Override // L1.d
    public final boolean k(c cVar) {
        boolean z6;
        synchronized (this.f1779b) {
            try {
                ?? r1 = this.f1778a;
                z6 = (r1 == 0 || r1.k(this)) && cVar.equals(this.f1780c) && this.f1782e != 2;
            } finally {
            }
        }
        return z6;
    }

    @Override // L1.c
    public final void pause() {
        synchronized (this.f1779b) {
            try {
                if (!x.d(this.f1783f)) {
                    this.f1783f = 2;
                    this.f1781d.pause();
                }
                if (!x.d(this.f1782e)) {
                    this.f1782e = 2;
                    this.f1780c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
