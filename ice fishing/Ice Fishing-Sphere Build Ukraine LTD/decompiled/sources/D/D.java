package D;

/* loaded from: classes.dex */
public final class D extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public S f65h;

    /* renamed from: i, reason: collision with root package name */
    public m0 f66i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f67j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f68k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f69l;

    /* renamed from: m, reason: collision with root package name */
    public int f70m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(S s2, v0.d dVar) {
        super(dVar);
        this.f69l = s2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f68k = obj;
        this.f70m |= Integer.MIN_VALUE;
        return S.d(this.f69l, false, this);
    }
}
