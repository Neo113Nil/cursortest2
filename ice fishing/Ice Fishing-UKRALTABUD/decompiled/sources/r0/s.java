package r0;

/* loaded from: classes.dex */
public final class s extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2915i;

    /* renamed from: j, reason: collision with root package name */
    public int f2916j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ N0.l f2917k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(N0.l lVar, v0.d dVar) {
        super(dVar);
        this.f2917k = lVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f2915i = obj;
        this.f2916j |= Integer.MIN_VALUE;
        return this.f2917k.b(null, this);
    }
}
