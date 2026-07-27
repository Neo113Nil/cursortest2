package N0;

/* loaded from: classes.dex */
public final class k extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public l f774i;

    /* renamed from: j, reason: collision with root package name */
    public Object f775j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f776k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f777l;

    /* renamed from: m, reason: collision with root package name */
    public int f778m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, v0.d dVar) {
        super(dVar);
        this.f777l = lVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f776k = obj;
        this.f778m |= Integer.MIN_VALUE;
        return this.f777l.b(null, this);
    }
}
