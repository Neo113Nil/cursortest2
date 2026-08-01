package u1;

/* loaded from: classes.dex */
public final class r implements x {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f41161n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f41162u;

    /* renamed from: v, reason: collision with root package name */
    public final x f41163v;

    /* renamed from: w, reason: collision with root package name */
    public final l f41164w;

    /* renamed from: x, reason: collision with root package name */
    public final q f41165x;

    /* renamed from: y, reason: collision with root package name */
    public int f41166y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f41167z;

    public r(x xVar, boolean z3, boolean z6, q qVar, l lVar) {
        N1.g.c(xVar, "Argument must not be null");
        this.f41163v = xVar;
        this.f41161n = z3;
        this.f41162u = z6;
        this.f41165x = qVar;
        N1.g.c(lVar, "Argument must not be null");
        this.f41164w = lVar;
    }

    @Override // u1.x
    public final synchronized void a() {
        if (this.f41166y > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f41167z) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f41167z = true;
        if (this.f41162u) {
            this.f41163v.a();
        }
    }

    public final synchronized void b() {
        if (this.f41167z) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f41166y++;
    }

    @Override // u1.x
    public final int c() {
        return this.f41163v.c();
    }

    @Override // u1.x
    public final Class d() {
        return this.f41163v.d();
    }

    public final void e() {
        boolean z3;
        synchronized (this) {
            int i = this.f41166y;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z3 = true;
            int i6 = i - 1;
            this.f41166y = i6;
            if (i6 != 0) {
                z3 = false;
            }
        }
        if (z3) {
            this.f41164w.e(this.f41165x, this);
        }
    }

    @Override // u1.x
    public final Object get() {
        return this.f41163v.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f41161n + ", listener=" + this.f41164w + ", key=" + this.f41165x + ", acquired=" + this.f41166y + ", isRecycled=" + this.f41167z + ", resource=" + this.f41163v + '}';
    }
}
