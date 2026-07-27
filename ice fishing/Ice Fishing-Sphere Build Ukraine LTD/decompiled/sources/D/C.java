package D;

/* loaded from: classes.dex */
public final class C extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public S f60h;

    /* renamed from: i, reason: collision with root package name */
    public int f61i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f62j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f63k;

    /* renamed from: l, reason: collision with root package name */
    public int f64l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(S s2, x0.b bVar) {
        super(bVar);
        this.f63k = s2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f62j = obj;
        this.f64l |= Integer.MIN_VALUE;
        return this.f63k.g(this);
    }
}
