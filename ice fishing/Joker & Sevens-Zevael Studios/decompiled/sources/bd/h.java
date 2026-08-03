package bd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public i f1102g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1103h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1104i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f1105j;

    /* renamed from: k, reason: collision with root package name */
    public int f1106k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, fc.d dVar) {
        super(dVar);
        this.f1105j = iVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f1104i = obj;
        this.f1106k |= Integer.MIN_VALUE;
        return this.f1105j.a(null, this);
    }
}
