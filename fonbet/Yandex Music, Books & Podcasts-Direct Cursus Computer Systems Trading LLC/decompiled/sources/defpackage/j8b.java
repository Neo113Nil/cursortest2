package defpackage;

/* loaded from: classes.dex */
public final class j8b implements k2o {
    public final boolean a;
    public final boolean b;
    public final k2o c;
    public final q7b d;
    public final daf e;
    public int f;
    public boolean g;

    public j8b(k2o k2oVar, boolean z, boolean z2, daf dafVar, q7b q7bVar) {
        w1g.s(k2oVar, "Argument must not be null");
        this.c = k2oVar;
        this.a = z;
        this.b = z2;
        this.e = dafVar;
        w1g.s(q7bVar, "Argument must not be null");
        this.d = q7bVar;
    }

    public final synchronized void a() {
        if (this.g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    public final void b() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.d.e(this.e, this);
        }
    }

    @Override // defpackage.k2o
    public final int f() {
        return this.c.f();
    }

    @Override // defpackage.k2o
    public final synchronized void g() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.g = true;
        if (this.b) {
            this.c.g();
        }
    }

    @Override // defpackage.k2o
    public final Object get() {
        return this.c.get();
    }

    @Override // defpackage.k2o
    public final Class h() {
        return this.c.h();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.g + ", resource=" + this.c + '}';
    }
}
