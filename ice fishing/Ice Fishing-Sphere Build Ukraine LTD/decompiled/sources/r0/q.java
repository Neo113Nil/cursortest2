package r0;

/* loaded from: classes.dex */
public final class q extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2914h;

    /* renamed from: i, reason: collision with root package name */
    public int f2915i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O0.l f2916j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(O0.l lVar, v0.d dVar) {
        super(dVar);
        this.f2916j = lVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f2914h = obj;
        this.f2915i |= Integer.MIN_VALUE;
        return this.f2916j.b(null, this);
    }
}
