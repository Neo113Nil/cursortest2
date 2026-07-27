package u1;

/* loaded from: classes.dex */
public final class r implements x {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f41158n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f41159u;

    /* renamed from: v, reason: collision with root package name */
    public final x f41160v;

    /* renamed from: w, reason: collision with root package name */
    public final l f41161w;

    /* renamed from: x, reason: collision with root package name */
    public final q f41162x;

    /* renamed from: y, reason: collision with root package name */
    public int f41163y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f41164z;

    public r(x xVar, boolean z3, boolean z6, q qVar, l lVar) {
        N1.g.c(xVar, "Argument must not be null");
        this.f41160v = xVar;
        this.f41158n = z3;
        this.f41159u = z6;
        this.f41162x = qVar;
        N1.g.c(lVar, "Argument must not be null");
        this.f41161w = lVar;
    }

    @Override // u1.x
    public final synchronized void a() {
        if (this.f41163y > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f41164z) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f41164z = true;
        if (this.f41159u) {
            this.f41160v.a();
        }
    }

    public final synchronized void b() {
        if (this.f41164z) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f41163y++;
    }

    @Override // u1.x
    public final int c() {
        return this.f41160v.c();
    }

    @Override // u1.x
    public final Class d() {
        return this.f41160v.d();
    }

    public final void e() {
        boolean z3;
        synchronized (this) {
            int i = this.f41163y;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z3 = true;
            int i6 = i - 1;
            this.f41163y = i6;
            if (i6 != 0) {
                z3 = false;
            }
        }
        if (z3) {
            this.f41161w.e(this.f41162x, this);
        }
    }

    @Override // u1.x
    public final Object get() {
        return this.f41160v.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f41158n + ", listener=" + this.f41161w + ", key=" + this.f41162x + ", acquired=" + this.f41163y + ", isRecycled=" + this.f41164z + ", resource=" + this.f41160v + '}';
    }
}
