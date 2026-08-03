package cd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public j f1357g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1358h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1359i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f1360j;

    /* renamed from: k, reason: collision with root package name */
    public int f1361k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, fc.d dVar) {
        super(dVar);
        this.f1360j = jVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f1359i = obj;
        this.f1361k |= Integer.MIN_VALUE;
        return this.f1360j.a(null, this);
    }
}
