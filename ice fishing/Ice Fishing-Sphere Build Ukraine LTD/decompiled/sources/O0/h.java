package O0;

/* loaded from: classes.dex */
public final class h extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f769h;

    /* renamed from: i, reason: collision with root package name */
    public int f770i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f771j;

    /* renamed from: k, reason: collision with root package name */
    public Object f772k;

    /* renamed from: l, reason: collision with root package name */
    public e f773l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, v0.d dVar) {
        super(dVar);
        this.f771j = iVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f769h = obj;
        this.f770i |= Integer.MIN_VALUE;
        return this.f771j.c(null, this);
    }
}
