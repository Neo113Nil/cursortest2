package D;

/* loaded from: classes.dex */
public final class Z extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public a0 f157h;

    /* renamed from: i, reason: collision with root package name */
    public Object f158i;

    /* renamed from: j, reason: collision with root package name */
    public Object f159j;

    /* renamed from: k, reason: collision with root package name */
    public c0 f160k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f161l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f162m;

    /* renamed from: n, reason: collision with root package name */
    public int f163n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(a0 a0Var, x0.b bVar) {
        super(bVar);
        this.f162m = a0Var;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f161l = obj;
        this.f163n |= Integer.MIN_VALUE;
        return this.f162m.b(null, this);
    }
}
