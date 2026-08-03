package bd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1078g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f1079h;

    /* renamed from: i, reason: collision with root package name */
    public int f1080i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, fc.d dVar) {
        super(dVar);
        this.f1079h = cVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f1078g = obj;
        this.f1080i |= Integer.MIN_VALUE;
        return this.f1079h.a(null, this);
    }
}
