package D;

/* loaded from: classes.dex */
public final class j0 extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public T0.d f213h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f214i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f215j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l0 f216k;

    /* renamed from: l, reason: collision with root package name */
    public int f217l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, x0.b bVar) {
        super(bVar);
        this.f216k = l0Var;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f215j = obj;
        this.f217l |= Integer.MIN_VALUE;
        return this.f216k.c(null, this);
    }
}
