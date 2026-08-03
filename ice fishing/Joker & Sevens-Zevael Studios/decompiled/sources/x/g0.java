package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g0 extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public h0 f7790g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7791h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f7792i;

    /* renamed from: j, reason: collision with root package name */
    public int f7793j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, hc.c cVar) {
        super(cVar);
        this.f7792i = h0Var;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f7791h = obj;
        this.f7793j |= Integer.MIN_VALUE;
        return this.f7792i.b(this);
    }
}
