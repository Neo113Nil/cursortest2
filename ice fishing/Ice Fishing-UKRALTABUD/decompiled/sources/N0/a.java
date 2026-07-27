package N0;

/* loaded from: classes.dex */
public final class a extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public O0.n f742i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f743j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A.j f744k;

    /* renamed from: l, reason: collision with root package name */
    public int f745l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(A.j jVar, v0.d dVar) {
        super(dVar);
        this.f744k = jVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f743j = obj;
        this.f745l |= Integer.MIN_VALUE;
        return this.f744k.n(null, this);
    }
}
