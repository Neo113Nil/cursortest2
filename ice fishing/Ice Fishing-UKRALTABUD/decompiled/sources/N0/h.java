package N0;

/* loaded from: classes.dex */
public final class h extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f761i;

    /* renamed from: j, reason: collision with root package name */
    public int f762j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f763k;

    /* renamed from: l, reason: collision with root package name */
    public Object f764l;

    /* renamed from: m, reason: collision with root package name */
    public e f765m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, v0.d dVar) {
        super(dVar);
        this.f763k = iVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f761i = obj;
        this.f762j |= Integer.MIN_VALUE;
        return this.f763k.n(null, this);
    }
}
