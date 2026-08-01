package X;

/* loaded from: classes.dex */
public final class u extends B7.c {

    /* renamed from: A, reason: collision with root package name */
    public int f3545A;

    /* renamed from: n, reason: collision with root package name */
    public Object f3546n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3547u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3548v;

    /* renamed from: w, reason: collision with root package name */
    public kotlin.jvm.internal.r f3549w;

    /* renamed from: x, reason: collision with root package name */
    public D f3550x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f3551y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ v f3552z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, B7.c cVar) {
        super(cVar);
        this.f3552z = vVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3551y = obj;
        this.f3545A |= Integer.MIN_VALUE;
        return this.f3552z.a(null, this);
    }
}
