package X;

/* loaded from: classes.dex */
public final class x extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public D f3723n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3724u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ D f3725v;

    /* renamed from: w, reason: collision with root package name */
    public int f3726w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(D d9, B7.c cVar) {
        super(cVar);
        this.f3725v = d9;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3724u = obj;
        this.f3726w |= Integer.MIN_VALUE;
        return this.f3725v.e(this);
    }
}
