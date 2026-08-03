package b0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f893g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f894h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f895i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f896j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f897k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f898l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a0.i iVar, Object obj, int i10, Object obj2, int i11) {
        super(2);
        this.f897k = iVar;
        this.f894h = obj;
        this.f895i = i10;
        this.f898l = obj2;
        this.f896j = i11;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f893g) {
            case 0:
                ((Number) obj2).intValue();
                a0.i iVar = (a0.i) this.f897k;
                i7.b.h(iVar, this.f894h, this.f895i, this.f898l, (m0.r) obj, m0.z.y(this.f896j | 1));
                break;
            default:
                ((Number) obj2).intValue();
                a0 a0Var = (a0) this.f897k;
                u0.d dVar = (u0.d) this.f898l;
                x4.f.k(this.f894h, this.f895i, a0Var, dVar, (m0.r) obj, m0.z.y(this.f896j | 1));
                break;
        }
        return ac.o.f277a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Object obj, int i10, a0 a0Var, u0.d dVar, int i11) {
        super(2);
        this.f894h = obj;
        this.f895i = i10;
        this.f897k = a0Var;
        this.f898l = dVar;
        this.f896j = i11;
    }
}
