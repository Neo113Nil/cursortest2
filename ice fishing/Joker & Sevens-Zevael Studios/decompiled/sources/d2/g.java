package d2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f1644h;

    /* renamed from: i, reason: collision with root package name */
    public int f1645i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, hc.c cVar) {
        super(cVar);
        this.f1644h = hVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f1643g = obj;
        this.f1645i |= Integer.MIN_VALUE;
        return this.f1644h.a(0.0f, this);
    }
}
