package D;

/* loaded from: classes.dex */
public final class j0 extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public S0.d f213i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f214j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f215k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0 f216l;

    /* renamed from: m, reason: collision with root package name */
    public int f217m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, x0.b bVar) {
        super(bVar);
        this.f216l = l0Var;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f215k = obj;
        this.f217m |= Integer.MIN_VALUE;
        return this.f216l.c(null, this);
    }
}
