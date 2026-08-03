package cd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1368g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f1369h;

    /* renamed from: i, reason: collision with root package name */
    public int f1370i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, fc.d dVar) {
        super(dVar);
        this.f1369h = nVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f1368g = obj;
        this.f1370i |= Integer.MIN_VALUE;
        return this.f1369h.a(null, this);
    }
}
