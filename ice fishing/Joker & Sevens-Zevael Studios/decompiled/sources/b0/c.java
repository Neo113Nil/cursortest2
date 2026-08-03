package b0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public fc.k f807g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f808h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f809i;

    /* renamed from: j, reason: collision with root package name */
    public int f810j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, hc.c cVar) {
        super(cVar);
        this.f809i = dVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f808h = obj;
        this.f810j |= Integer.MIN_VALUE;
        return this.f809i.f(this);
    }
}
