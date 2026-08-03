package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public s0 f7929g;

    /* renamed from: h, reason: collision with root package name */
    public o f7930h;

    /* renamed from: i, reason: collision with root package name */
    public y.b f7931i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f7932j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s0 f7933k;

    /* renamed from: l, reason: collision with root package name */
    public int f7934l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(s0 s0Var, hc.c cVar) {
        super(cVar);
        this.f7933k = s0Var;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f7932j = obj;
        this.f7934l |= Integer.MIN_VALUE;
        return s0.v0(this.f7933k, null, this);
    }
}
