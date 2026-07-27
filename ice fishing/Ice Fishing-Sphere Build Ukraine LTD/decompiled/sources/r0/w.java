package r0;

/* loaded from: classes.dex */
public final class w extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2941h;

    /* renamed from: i, reason: collision with root package name */
    public int f2942i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0242n f2943j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C0242n c0242n, v0.d dVar) {
        super(dVar);
        this.f2943j = c0242n;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f2941h = obj;
        this.f2942i |= Integer.MIN_VALUE;
        return this.f2943j.b(null, this);
    }
}
