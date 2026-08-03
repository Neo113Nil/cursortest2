package id;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3257g;

    /* renamed from: h, reason: collision with root package name */
    public int f3258h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f3259i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, fc.d dVar) {
        super(dVar);
        this.f3259i = cVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f3257g = obj;
        this.f3258h |= Integer.MIN_VALUE;
        return this.f3259i.a(null, this);
    }
}
