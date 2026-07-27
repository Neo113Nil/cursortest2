package r0;

/* renamed from: r0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241m extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2900h;

    /* renamed from: i, reason: collision with root package name */
    public int f2901i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0242n f2902j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0241m(C0242n c0242n, v0.d dVar) {
        super(dVar);
        this.f2902j = c0242n;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f2900h = obj;
        this.f2901i |= Integer.MIN_VALUE;
        return this.f2902j.b(null, this);
    }
}
