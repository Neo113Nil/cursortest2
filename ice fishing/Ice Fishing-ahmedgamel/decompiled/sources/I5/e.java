package I5;

/* loaded from: classes2.dex */
public final class e extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public f f1307n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f1308u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f1309v;

    /* renamed from: w, reason: collision with root package name */
    public int f1310w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, B7.c cVar) {
        super(cVar);
        this.f1309v = fVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f1308u = obj;
        this.f1310w |= Integer.MIN_VALUE;
        return this.f1309v.a(this);
    }
}
