package D;

/* renamed from: D.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018t extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f262h;

    /* renamed from: i, reason: collision with root package name */
    public int f263i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0019u f264j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0018t(C0019u c0019u, v0.d dVar) {
        super(dVar);
        this.f264j = c0019u;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f262h = obj;
        this.f263i |= Integer.MIN_VALUE;
        return this.f264j.b(null, this);
    }
}
