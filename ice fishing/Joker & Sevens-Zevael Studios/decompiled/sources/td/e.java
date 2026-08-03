package td;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public f f6554g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6555h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f6556i;

    /* renamed from: j, reason: collision with root package name */
    public int f6557j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, hc.c cVar) {
        super(cVar);
        this.f6556i = fVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f6555h = obj;
        this.f6557j |= Integer.MIN_VALUE;
        return f.e(this.f6556i, this);
    }
}
