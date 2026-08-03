package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public h0 f7779g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7780h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f7781i;

    /* renamed from: j, reason: collision with root package name */
    public int f7782j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, hc.c cVar) {
        super(cVar);
        this.f7781i = h0Var;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f7780h = obj;
        this.f7782j |= Integer.MIN_VALUE;
        return this.f7781i.a(this);
    }
}
