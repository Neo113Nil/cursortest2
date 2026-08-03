package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t0 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pc.s f6970g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6971h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f6972i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f6973j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f6974k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f6975l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ oc.c f6976m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(pc.s sVar, Object obj, e eVar, n nVar, i iVar, float f10, oc.c cVar) {
        super(1);
        this.f6970g = sVar;
        this.f6971h = obj;
        this.f6972i = eVar;
        this.f6973j = nVar;
        this.f6974k = iVar;
        this.f6975l = f10;
        this.f6976m = cVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        e eVar = this.f6972i;
        g gVar = new g(this.f6971h, eVar.d(), this.f6973j, longValue, eVar.e(), longValue, new s0(this.f6974k, 0));
        d.f(gVar, longValue, this.f6975l, this.f6972i, this.f6974k, this.f6976m);
        this.f6970g.f5683g = gVar;
        return ac.o.f277a;
    }
}
