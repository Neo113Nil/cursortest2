package F5;

/* loaded from: classes2.dex */
public final class i extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public j f997n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f998u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f999v;

    /* renamed from: w, reason: collision with root package name */
    public int f1000w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, B7.c cVar) {
        super(cVar);
        this.f999v = jVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f998u = obj;
        this.f1000w |= Integer.MIN_VALUE;
        return this.f999v.c(this);
    }
}
