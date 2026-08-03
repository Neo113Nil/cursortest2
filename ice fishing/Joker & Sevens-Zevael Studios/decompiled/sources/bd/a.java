package bd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public cd.w f1072g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1073h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f8.c f1074i;

    /* renamed from: j, reason: collision with root package name */
    public int f1075j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f8.c cVar, fc.d dVar) {
        super(dVar);
        this.f1074i = cVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f1073h = obj;
        this.f1075j |= Integer.MIN_VALUE;
        return this.f1074i.c(null, this);
    }
}
