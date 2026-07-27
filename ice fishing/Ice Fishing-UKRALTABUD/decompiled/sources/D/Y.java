package D;

/* loaded from: classes.dex */
public final class Y extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public a0 f151i;

    /* renamed from: j, reason: collision with root package name */
    public U f152j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f153k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f154l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f155m;

    /* renamed from: n, reason: collision with root package name */
    public int f156n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(a0 a0Var, x0.b bVar) {
        super(bVar);
        this.f155m = a0Var;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f154l = obj;
        this.f156n |= Integer.MIN_VALUE;
        return this.f155m.a(null, this);
    }
}
