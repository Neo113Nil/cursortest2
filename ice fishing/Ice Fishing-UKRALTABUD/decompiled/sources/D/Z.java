package D;

/* loaded from: classes.dex */
public final class Z extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public a0 f157i;

    /* renamed from: j, reason: collision with root package name */
    public Object f158j;

    /* renamed from: k, reason: collision with root package name */
    public Object f159k;

    /* renamed from: l, reason: collision with root package name */
    public c0 f160l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f161m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0 f162n;

    /* renamed from: o, reason: collision with root package name */
    public int f163o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(a0 a0Var, x0.b bVar) {
        super(bVar);
        this.f162n = a0Var;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f161m = obj;
        this.f163o |= Integer.MIN_VALUE;
        return this.f162n.b(null, this);
    }
}
