package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u0 extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public pc.r f7909g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7910h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z0 f7911i;

    /* renamed from: j, reason: collision with root package name */
    public int f7912j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(z0 z0Var, hc.c cVar) {
        super(cVar);
        this.f7911i = z0Var;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f7910h = obj;
        this.f7912j |= Integer.MIN_VALUE;
        return this.f7911i.b(0L, this);
    }
}
