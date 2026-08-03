package id;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3262g;

    /* renamed from: h, reason: collision with root package name */
    public int f3263h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f3264i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, fc.d dVar) {
        super(dVar);
        this.f3264i = cVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f3262g = obj;
        this.f3263h |= Integer.MIN_VALUE;
        return this.f3264i.a(null, this);
    }
}
