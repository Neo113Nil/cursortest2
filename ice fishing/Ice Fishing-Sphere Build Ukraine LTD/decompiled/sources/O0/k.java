package O0;

/* loaded from: classes.dex */
public final class k extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public l f782h;

    /* renamed from: i, reason: collision with root package name */
    public Object f783i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f784j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f785k;

    /* renamed from: l, reason: collision with root package name */
    public int f786l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, v0.d dVar) {
        super(dVar);
        this.f785k = lVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f784j = obj;
        this.f786l |= Integer.MIN_VALUE;
        return this.f785k.b(null, this);
    }
}
