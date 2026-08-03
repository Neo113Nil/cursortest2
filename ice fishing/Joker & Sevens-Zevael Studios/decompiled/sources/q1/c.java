package q1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public long f5731g;

    /* renamed from: h, reason: collision with root package name */
    public long f5732h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f5733i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f5734j;

    /* renamed from: k, reason: collision with root package name */
    public int f5735k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, hc.c cVar) {
        super(cVar);
        this.f5734j = eVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f5733i = obj;
        this.f5735k |= Integer.MIN_VALUE;
        return this.f5734j.s0(0L, 0L, this);
    }
}
