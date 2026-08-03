package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public s0 f7917g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7918h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s0 f7919i;

    /* renamed from: j, reason: collision with root package name */
    public int f7920j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(s0 s0Var, hc.c cVar) {
        super(cVar);
        this.f7919i = s0Var;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f7918h = obj;
        this.f7920j |= Integer.MIN_VALUE;
        return s0.u0(this.f7919i, this);
    }
}
