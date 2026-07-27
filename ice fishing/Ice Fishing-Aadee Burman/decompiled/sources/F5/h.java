package F5;

/* loaded from: classes2.dex */
public final class h extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public j f967n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f968u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f969v;

    /* renamed from: w, reason: collision with root package name */
    public int f970w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, B7.c cVar) {
        super(cVar);
        this.f969v = jVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f968u = obj;
        this.f970w |= Integer.MIN_VALUE;
        return j.b(this.f969v, this);
    }
}
