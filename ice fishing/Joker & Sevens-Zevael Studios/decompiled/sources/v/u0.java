package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u0 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pc.s f6977g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f6978h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f6979i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f6980j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ oc.c f6981k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(pc.s sVar, float f10, e eVar, i iVar, oc.c cVar) {
        super(1);
        this.f6977g = sVar;
        this.f6978h = f10;
        this.f6979i = eVar;
        this.f6980j = iVar;
        this.f6981k = cVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f6977g.f5683g;
        pc.j.b(obj2);
        d.f((g) obj2, longValue, this.f6978h, this.f6979i, this.f6980j, this.f6981k);
        return ac.o.f277a;
    }
}
