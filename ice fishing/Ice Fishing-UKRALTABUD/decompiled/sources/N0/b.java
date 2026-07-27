package N0;

/* loaded from: classes.dex */
public final class b extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public M0.p f746i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f747j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f748k;

    /* renamed from: l, reason: collision with root package name */
    public int f749l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, x0.b bVar) {
        super(bVar);
        this.f748k = cVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f747j = obj;
        this.f749l |= Integer.MIN_VALUE;
        return this.f748k.a(null, this);
    }
}
