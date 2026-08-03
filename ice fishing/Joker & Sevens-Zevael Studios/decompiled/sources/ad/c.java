package ad;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f287g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f288h;

    /* renamed from: i, reason: collision with root package name */
    public int f289i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, hc.c cVar) {
        super(cVar);
        this.f288h = eVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f287g = obj;
        this.f289i |= Integer.MIN_VALUE;
        Object B = e.B(this.f288h, this);
        return B == gc.a.f2559g ? B : new l(B);
    }
}
