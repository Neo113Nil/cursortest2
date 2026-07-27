package X;

/* loaded from: classes.dex */
public final class z extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public D f3570n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3571u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3572v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ D f3573w;

    /* renamed from: x, reason: collision with root package name */
    public int f3574x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(D d2, B7.c cVar) {
        super(cVar);
        this.f3573w = d2;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3572v = obj;
        this.f3574x |= Integer.MIN_VALUE;
        return this.f3573w.g(this);
    }
}
