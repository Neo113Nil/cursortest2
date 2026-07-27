package X;

/* loaded from: classes.dex */
public final class x extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public D f3561n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3562u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ D f3563v;

    /* renamed from: w, reason: collision with root package name */
    public int f3564w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(D d2, B7.c cVar) {
        super(cVar);
        this.f3563v = d2;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3562u = obj;
        this.f3564w |= Integer.MIN_VALUE;
        return this.f3563v.e(this);
    }
}
