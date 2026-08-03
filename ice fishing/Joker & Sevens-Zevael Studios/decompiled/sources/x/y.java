package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public s0 f7936g;

    /* renamed from: h, reason: collision with root package name */
    public p f7937h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7938i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f7939j;

    /* renamed from: k, reason: collision with root package name */
    public int f7940k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(s0 s0Var, hc.c cVar) {
        super(cVar);
        this.f7939j = s0Var;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f7938i = obj;
        this.f7940k |= Integer.MIN_VALUE;
        return s0.w0(this.f7939j, null, this);
    }
}
