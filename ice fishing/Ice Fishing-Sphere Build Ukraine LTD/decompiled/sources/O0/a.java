package O0;

/* loaded from: classes.dex */
public final class a extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public P0.n f750h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f751i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A.j f752j;

    /* renamed from: k, reason: collision with root package name */
    public int f753k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(A.j jVar, v0.d dVar) {
        super(dVar);
        this.f752j = jVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f751i = obj;
        this.f753k |= Integer.MIN_VALUE;
        return this.f752j.c(null, this);
    }
}
