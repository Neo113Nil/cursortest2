package D;

/* renamed from: D.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021w extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public S f270i;

    /* renamed from: j, reason: collision with root package name */
    public S0.d f271j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f272k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f273l;

    /* renamed from: m, reason: collision with root package name */
    public int f274m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0021w(S s2, x0.b bVar) {
        super(bVar);
        this.f273l = s2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f272k = obj;
        this.f274m |= Integer.MIN_VALUE;
        return S.a(this.f273l, this);
    }
}
