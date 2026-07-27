package F5;

/* loaded from: classes2.dex */
public final class i extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public j f971n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f972u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f973v;

    /* renamed from: w, reason: collision with root package name */
    public int f974w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, B7.c cVar) {
        super(cVar);
        this.f973v = jVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f972u = obj;
        this.f974w |= Integer.MIN_VALUE;
        return this.f973v.c(this);
    }
}
