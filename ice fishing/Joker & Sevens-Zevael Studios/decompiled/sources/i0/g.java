package i0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public j f2952g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2953h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f2954i;

    /* renamed from: j, reason: collision with root package name */
    public int f2955j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, hc.c cVar) {
        super(cVar);
        this.f2954i = jVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f2953h = obj;
        this.f2955j |= Integer.MIN_VALUE;
        return this.f2954i.a(this);
    }
}
