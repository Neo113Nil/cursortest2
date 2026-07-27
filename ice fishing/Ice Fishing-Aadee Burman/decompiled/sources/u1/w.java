package u1;

/* loaded from: classes.dex */
public final class w implements x, O1.b {

    /* renamed from: x, reason: collision with root package name */
    public static final Z2.e f41176x = O1.d.a(20, new M2.i(27));

    /* renamed from: n, reason: collision with root package name */
    public final O1.e f41177n = new O1.e();

    /* renamed from: u, reason: collision with root package name */
    public x f41178u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f41179v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f41180w;

    @Override // u1.x
    public final synchronized void a() {
        this.f41177n.a();
        this.f41180w = true;
        if (!this.f41179v) {
            this.f41178u.a();
            this.f41178u = null;
            f41176x.D(this);
        }
    }

    @Override // O1.b
    public final O1.e b() {
        return this.f41177n;
    }

    @Override // u1.x
    public final int c() {
        return this.f41178u.c();
    }

    @Override // u1.x
    public final Class d() {
        return this.f41178u.d();
    }

    public final synchronized void e() {
        this.f41177n.a();
        if (!this.f41179v) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f41179v = false;
        if (this.f41180w) {
            a();
        }
    }

    @Override // u1.x
    public final Object get() {
        return this.f41178u.get();
    }
}
