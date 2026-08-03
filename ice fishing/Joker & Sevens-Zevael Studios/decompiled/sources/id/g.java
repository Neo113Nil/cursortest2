package id;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public i f3273g;

    /* renamed from: h, reason: collision with root package name */
    public int f3274h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3275i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f3276j;

    /* renamed from: k, reason: collision with root package name */
    public int f3277k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, hc.c cVar) {
        super(cVar);
        this.f3276j = iVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f3275i = obj;
        this.f3277k |= Integer.MIN_VALUE;
        return this.f3276j.h(0, this);
    }
}
