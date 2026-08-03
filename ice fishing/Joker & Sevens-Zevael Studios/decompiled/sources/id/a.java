package id;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public i f3253g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3254h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f3255i;

    /* renamed from: j, reason: collision with root package name */
    public int f3256j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, hc.c cVar) {
        super(cVar);
        this.f3255i = iVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f3254h = obj;
        this.f3256j |= Integer.MIN_VALUE;
        return this.f3255i.c(this);
    }
}
