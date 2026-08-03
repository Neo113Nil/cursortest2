package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m1 extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public oc.c f4654g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4655h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n1 f4656i;

    /* renamed from: j, reason: collision with root package name */
    public int f4657j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, hc.c cVar) {
        super(cVar);
        this.f4656i = n1Var;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f4655h = obj;
        this.f4657j |= Integer.MIN_VALUE;
        return this.f4656i.l(null, this);
    }
}
