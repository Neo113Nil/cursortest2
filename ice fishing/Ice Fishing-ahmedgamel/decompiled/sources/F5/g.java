package F5;

/* loaded from: classes2.dex */
public final class g extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f964n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f965u;

    /* renamed from: v, reason: collision with root package name */
    public int f966v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, B7.c cVar) {
        super(cVar);
        this.f965u = jVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f964n = obj;
        this.f966v |= Integer.MIN_VALUE;
        return j.a(this.f965u, this);
    }
}
