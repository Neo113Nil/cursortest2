package D;

/* renamed from: D.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018t extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f261i;

    /* renamed from: j, reason: collision with root package name */
    public int f262j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0019u f263k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0018t(C0019u c0019u, v0.d dVar) {
        super(dVar);
        this.f263k = c0019u;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f261i = obj;
        this.f262j |= Integer.MIN_VALUE;
        return this.f263k.b(null, this);
    }
}
