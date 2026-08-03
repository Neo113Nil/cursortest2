package y1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public s.v f8663g;

    /* renamed from: h, reason: collision with root package name */
    public ad.b f8664h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f8665i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f8666j;

    /* renamed from: k, reason: collision with root package name */
    public int f8667k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, hc.c cVar) {
        super(cVar);
        this.f8666j = yVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f8665i = obj;
        this.f8667k |= Integer.MIN_VALUE;
        return this.f8666j.g(this);
    }
}
