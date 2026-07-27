package D;

/* loaded from: classes.dex */
public final class i0 extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public Object f204i;

    /* renamed from: j, reason: collision with root package name */
    public S0.d f205j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f206k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0 f207l;

    /* renamed from: m, reason: collision with root package name */
    public int f208m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, x0.b bVar) {
        super(bVar);
        this.f207l = l0Var;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f206k = obj;
        this.f208m |= Integer.MIN_VALUE;
        return this.f207l.b(null, this);
    }
}
