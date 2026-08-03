package a1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public ad.b f161g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f162h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f163i;

    /* renamed from: j, reason: collision with root package name */
    public int f164j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, hc.c cVar) {
        super(cVar);
        this.f163i = hVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f162h = obj;
        this.f164j |= Integer.MIN_VALUE;
        return this.f163i.c(this);
    }
}
