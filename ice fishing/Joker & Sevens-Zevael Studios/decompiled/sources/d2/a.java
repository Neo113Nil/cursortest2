package d2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f1621g;

    /* renamed from: h, reason: collision with root package name */
    public s2.j f1622h;

    /* renamed from: i, reason: collision with root package name */
    public int f1623i;

    /* renamed from: j, reason: collision with root package name */
    public int f1624j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1625k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f1626l;

    /* renamed from: m, reason: collision with root package name */
    public int f1627m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, hc.c cVar) {
        super(cVar);
        this.f1626l = dVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f1625k = obj;
        this.f1627m |= Integer.MIN_VALUE;
        return d.a(this.f1626l, null, null, this);
    }
}
