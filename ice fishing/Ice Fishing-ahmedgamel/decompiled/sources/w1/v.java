package w1;

/* loaded from: classes.dex */
public final class v implements w, Q1.b {

    /* renamed from: x, reason: collision with root package name */
    public static final b3.e f41562x = Q1.d.a(20, new G3.e(29));

    /* renamed from: n, reason: collision with root package name */
    public final Q1.e f41563n = new Q1.e();

    /* renamed from: u, reason: collision with root package name */
    public w f41564u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f41565v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f41566w;

    @Override // w1.w
    public final synchronized void a() {
        this.f41563n.a();
        this.f41566w = true;
        if (!this.f41565v) {
            this.f41564u.a();
            this.f41564u = null;
            f41562x.D(this);
        }
    }

    @Override // w1.w
    public final int b() {
        return this.f41564u.b();
    }

    @Override // w1.w
    public final Class c() {
        return this.f41564u.c();
    }

    @Override // Q1.b
    public final Q1.e d() {
        return this.f41563n;
    }

    public final synchronized void e() {
        this.f41563n.a();
        if (!this.f41565v) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f41565v = false;
        if (this.f41566w) {
            a();
        }
    }

    @Override // w1.w
    public final Object get() {
        return this.f41564u.get();
    }
}
