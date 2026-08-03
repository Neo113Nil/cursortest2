package ad;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f290g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f291h;

    /* renamed from: i, reason: collision with root package name */
    public int f292i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, hc.c cVar) {
        super(cVar);
        this.f291h = eVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f290g = obj;
        this.f292i |= Integer.MIN_VALUE;
        Object C = this.f291h.C(null, 0, 0L, this);
        return C == gc.a.f2559g ? C : new l(C);
    }
}
