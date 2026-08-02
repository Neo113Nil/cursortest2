package F5;

/* loaded from: classes2.dex */
public final class h extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public j f993n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f994u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f995v;

    /* renamed from: w, reason: collision with root package name */
    public int f996w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, B7.c cVar) {
        super(cVar);
        this.f995v = jVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f994u = obj;
        this.f996w |= Integer.MIN_VALUE;
        return j.b(this.f995v, this);
    }
}
