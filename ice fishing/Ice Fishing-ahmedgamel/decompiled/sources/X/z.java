package X;

/* loaded from: classes.dex */
public final class z extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public D f3732n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3733u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3734v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ D f3735w;

    /* renamed from: x, reason: collision with root package name */
    public int f3736x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(D d9, B7.c cVar) {
        super(cVar);
        this.f3735w = d9;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3734v = obj;
        this.f3736x |= Integer.MIN_VALUE;
        return this.f3735w.g(this);
    }
}
