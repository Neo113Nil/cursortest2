package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public g f7406g;

    /* renamed from: h, reason: collision with root package name */
    public long f7407h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7408i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f7409j;

    /* renamed from: k, reason: collision with root package name */
    public int f7410k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, hc.c cVar) {
        super(cVar);
        this.f7409j = gVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f7408i = obj;
        this.f7410k |= Integer.MIN_VALUE;
        return this.f7409j.e(0L, null, this);
    }
}
