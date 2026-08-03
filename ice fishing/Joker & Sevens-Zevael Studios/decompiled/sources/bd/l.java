package bd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public c f1117g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1118h;

    /* renamed from: i, reason: collision with root package name */
    public int f1119i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f1120j;

    /* renamed from: k, reason: collision with root package name */
    public Object f1121k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c cVar, fc.d dVar) {
        super(dVar);
        this.f1120j = cVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f1118h = obj;
        this.f1119i |= Integer.MIN_VALUE;
        return this.f1120j.a(null, this);
    }
}
