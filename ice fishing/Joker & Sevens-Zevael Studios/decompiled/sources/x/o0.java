package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o0 extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public long f7861g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7862h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b4.m f7863i;

    /* renamed from: j, reason: collision with root package name */
    public int f7864j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(b4.m mVar, hc.c cVar) {
        super(cVar);
        this.f7863i = mVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f7862h = obj;
        this.f7864j |= Integer.MIN_VALUE;
        return this.f7863i.a(0L, 0L, this);
    }
}
