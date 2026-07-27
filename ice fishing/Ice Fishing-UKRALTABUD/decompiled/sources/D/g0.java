package D;

/* loaded from: classes.dex */
public final class g0 extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public C0013n f190i;

    /* renamed from: j, reason: collision with root package name */
    public S0.a f191j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f192k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0013n f193l;

    /* renamed from: m, reason: collision with root package name */
    public int f194m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(C0013n c0013n, x0.b bVar) {
        super(bVar);
        this.f193l = c0013n;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f192k = obj;
        this.f194m |= Integer.MIN_VALUE;
        return this.f193l.h(this);
    }
}
