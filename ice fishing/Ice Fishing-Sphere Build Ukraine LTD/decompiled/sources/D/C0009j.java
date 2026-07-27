package D;

/* renamed from: D.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public C0013n f209h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f210i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0013n f211j;

    /* renamed from: k, reason: collision with root package name */
    public int f212k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0009j(C0013n c0013n, x0.b bVar) {
        super(bVar);
        this.f211j = c0013n;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f210i = obj;
        this.f212k |= Integer.MIN_VALUE;
        return this.f211j.d(this);
    }
}
