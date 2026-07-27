package D;

/* loaded from: classes.dex */
public final class i0 extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public Object f204h;

    /* renamed from: i, reason: collision with root package name */
    public T0.d f205i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f206j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l0 f207k;

    /* renamed from: l, reason: collision with root package name */
    public int f208l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, x0.b bVar) {
        super(bVar);
        this.f207k = l0Var;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f206j = obj;
        this.f208l |= Integer.MIN_VALUE;
        return this.f207k.b(null, this);
    }
}
