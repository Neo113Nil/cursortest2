package r0;

/* loaded from: classes.dex */
public final class u extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2923i;

    /* renamed from: j, reason: collision with root package name */
    public int f2924j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0255p f2925k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C0255p c0255p, v0.d dVar) {
        super(dVar);
        this.f2925k = c0255p;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f2923i = obj;
        this.f2924j |= Integer.MIN_VALUE;
        return this.f2925k.b(null, this);
    }
}
