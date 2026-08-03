package q1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public long f5736g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5737h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f5738i;

    /* renamed from: j, reason: collision with root package name */
    public int f5739j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, hc.c cVar) {
        super(cVar);
        this.f5738i = eVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f5737h = obj;
        this.f5739j |= Integer.MIN_VALUE;
        return this.f5738i.u0(0L, this);
    }
}
