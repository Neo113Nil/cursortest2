package id;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3265g;

    /* renamed from: h, reason: collision with root package name */
    public int f3266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f3267i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, fc.d dVar) {
        super(dVar);
        this.f3267i = cVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f3265g = obj;
        this.f3266h |= Integer.MIN_VALUE;
        return this.f3267i.a(null, this);
    }
}
