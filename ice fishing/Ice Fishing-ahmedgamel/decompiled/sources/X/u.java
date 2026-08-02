package X;

/* loaded from: classes.dex */
public final class u extends B7.c {

    /* renamed from: A, reason: collision with root package name */
    public int f3707A;

    /* renamed from: n, reason: collision with root package name */
    public Object f3708n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3709u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3710v;

    /* renamed from: w, reason: collision with root package name */
    public kotlin.jvm.internal.r f3711w;

    /* renamed from: x, reason: collision with root package name */
    public D f3712x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f3713y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ v f3714z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, B7.c cVar) {
        super(cVar);
        this.f3714z = vVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3713y = obj;
        this.f3707A |= Integer.MIN_VALUE;
        return this.f3714z.a(null, this);
    }
}
