package u1;

/* loaded from: classes.dex */
public final class w implements x, O1.b {

    /* renamed from: x, reason: collision with root package name */
    public static final Z2.e f41179x = O1.d.a(20, new M2.i(27));

    /* renamed from: n, reason: collision with root package name */
    public final O1.e f41180n = new O1.e();

    /* renamed from: u, reason: collision with root package name */
    public x f41181u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f41182v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f41183w;

    @Override // u1.x
    public final synchronized void a() {
        this.f41180n.a();
        this.f41183w = true;
        if (!this.f41182v) {
            this.f41181u.a();
            this.f41181u = null;
            f41179x.D(this);
        }
    }

    @Override // O1.b
    public final O1.e b() {
        return this.f41180n;
    }

    @Override // u1.x
    public final int c() {
        return this.f41181u.c();
    }

    @Override // u1.x
    public final Class d() {
        return this.f41181u.d();
    }

    public final synchronized void e() {
        this.f41180n.a();
        if (!this.f41182v) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f41182v = false;
        if (this.f41183w) {
            a();
        }
    }

    @Override // u1.x
    public final Object get() {
        return this.f41181u.get();
    }
}
