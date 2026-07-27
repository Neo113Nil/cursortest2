package D;

/* renamed from: D.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024z extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public S f283i;

    /* renamed from: j, reason: collision with root package name */
    public S0.d f284j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f285k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f286l;

    /* renamed from: m, reason: collision with root package name */
    public int f287m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024z(S s2, x0.b bVar) {
        super(bVar);
        this.f286l = s2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f285k = obj;
        this.f287m |= Integer.MIN_VALUE;
        return S.c(this.f286l, this);
    }
}
