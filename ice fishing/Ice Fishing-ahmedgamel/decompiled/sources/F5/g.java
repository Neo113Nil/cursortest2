package F5;

/* loaded from: classes2.dex */
public final class g extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f990n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f991u;

    /* renamed from: v, reason: collision with root package name */
    public int f992v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, B7.c cVar) {
        super(cVar);
        this.f991u = jVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f990n = obj;
        this.f992v |= Integer.MIN_VALUE;
        return j.a(this.f991u, this);
    }
}
