package I5;

/* loaded from: classes2.dex */
public final class e extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public f f1337n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f1338u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f1339v;

    /* renamed from: w, reason: collision with root package name */
    public int f1340w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, B7.c cVar) {
        super(cVar);
        this.f1339v = fVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f1338u = obj;
        this.f1340w |= Integer.MIN_VALUE;
        return this.f1339v.a(this);
    }
}
