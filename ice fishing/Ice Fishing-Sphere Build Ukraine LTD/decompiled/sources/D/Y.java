package D;

/* loaded from: classes.dex */
public final class Y extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public a0 f151h;

    /* renamed from: i, reason: collision with root package name */
    public U f152i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f153j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f154k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0 f155l;

    /* renamed from: m, reason: collision with root package name */
    public int f156m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(a0 a0Var, x0.b bVar) {
        super(bVar);
        this.f155l = a0Var;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f154k = obj;
        this.f156m |= Integer.MIN_VALUE;
        return this.f155l.a(null, this);
    }
}
