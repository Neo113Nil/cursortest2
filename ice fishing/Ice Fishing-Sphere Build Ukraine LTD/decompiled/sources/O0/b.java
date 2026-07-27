package O0;

/* loaded from: classes.dex */
public final class b extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public N0.p f754h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f755i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f756j;

    /* renamed from: k, reason: collision with root package name */
    public int f757k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, x0.b bVar) {
        super(bVar);
        this.f756j = cVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f755i = obj;
        this.f757k |= Integer.MIN_VALUE;
        return this.f756j.a(null, this);
    }
}
