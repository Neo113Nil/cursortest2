package u1;

/* loaded from: classes.dex */
public final class q implements x {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f41175n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f41176u;

    /* renamed from: v, reason: collision with root package name */
    public final x f41177v;

    /* renamed from: w, reason: collision with root package name */
    public final k f41178w;

    /* renamed from: x, reason: collision with root package name */
    public final p f41179x;

    /* renamed from: y, reason: collision with root package name */
    public int f41180y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f41181z;

    public q(x xVar, boolean z8, boolean z9, p pVar, k kVar) {
        N1.g.c(xVar, "Argument must not be null");
        this.f41177v = xVar;
        this.f41175n = z8;
        this.f41176u = z9;
        this.f41179x = pVar;
        N1.g.c(kVar, "Argument must not be null");
        this.f41178w = kVar;
    }

    @Override // u1.x
    public final synchronized void a() {
        if (this.f41180y > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f41181z) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f41181z = true;
        if (this.f41176u) {
            this.f41177v.a();
        }
    }

    public final synchronized void b() {
        if (this.f41181z) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f41180y++;
    }

    @Override // u1.x
    public final int c() {
        return this.f41177v.c();
    }

    @Override // u1.x
    public final Class d() {
        return this.f41177v.d();
    }

    public final void e() {
        boolean z8;
        synchronized (this) {
            int i = this.f41180y;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z8 = true;
            int i4 = i - 1;
            this.f41180y = i4;
            if (i4 != 0) {
                z8 = false;
            }
        }
        if (z8) {
            this.f41178w.e(this.f41179x, this);
        }
    }

    @Override // u1.x
    public final Object get() {
        return this.f41177v.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f41175n + ", listener=" + this.f41178w + ", key=" + this.f41179x + ", acquired=" + this.f41180y + ", isRecycled=" + this.f41181z + ", resource=" + this.f41177v + '}';
    }
}
