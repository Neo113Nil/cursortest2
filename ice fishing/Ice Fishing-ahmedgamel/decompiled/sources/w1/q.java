package w1;

/* loaded from: classes.dex */
public final class q implements w {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f41544n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f41545u;

    /* renamed from: v, reason: collision with root package name */
    public final w f41546v;

    /* renamed from: w, reason: collision with root package name */
    public final k f41547w;

    /* renamed from: x, reason: collision with root package name */
    public final p f41548x;

    /* renamed from: y, reason: collision with root package name */
    public int f41549y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f41550z;

    public q(w wVar, boolean z6, boolean z9, p pVar, k kVar) {
        P1.g.c(wVar, "Argument must not be null");
        this.f41546v = wVar;
        this.f41544n = z6;
        this.f41545u = z9;
        this.f41548x = pVar;
        P1.g.c(kVar, "Argument must not be null");
        this.f41547w = kVar;
    }

    @Override // w1.w
    public final synchronized void a() {
        if (this.f41549y > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f41550z) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f41550z = true;
        if (this.f41545u) {
            this.f41546v.a();
        }
    }

    @Override // w1.w
    public final int b() {
        return this.f41546v.b();
    }

    @Override // w1.w
    public final Class c() {
        return this.f41546v.c();
    }

    public final synchronized void d() {
        if (this.f41550z) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f41549y++;
    }

    public final void e() {
        boolean z6;
        synchronized (this) {
            int i = this.f41549y;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z6 = true;
            int i4 = i - 1;
            this.f41549y = i4;
            if (i4 != 0) {
                z6 = false;
            }
        }
        if (z6) {
            this.f41547w.e(this.f41548x, this);
        }
    }

    @Override // w1.w
    public final Object get() {
        return this.f41546v.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f41544n + ", listener=" + this.f41547w + ", key=" + this.f41548x + ", acquired=" + this.f41549y + ", isRecycled=" + this.f41550z + ", resource=" + this.f41546v + '}';
    }
}
