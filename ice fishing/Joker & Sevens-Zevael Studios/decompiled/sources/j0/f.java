package j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3326g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f3327h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u0.d f3328i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3329j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j3, h2.h0 h0Var, u0.d dVar, int i10) {
        super(2);
        this.f3327h = j3;
        this.f3329j = h0Var;
        this.f3328i = dVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3326g) {
            case 0:
                m0.r rVar = (m0.r) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar.B()) {
                    rVar.S();
                } else {
                    k0.a.a(this.f3327h, ((s0) rVar.j(t0.f3483a)).f3475m, u0.e.e(1327513942, new a1.f(5, (z.c0) this.f3329j, this.f3328i), rVar), rVar, 384);
                }
                break;
            default:
                ((Number) obj2).intValue();
                h2.h0 h0Var = (h2.h0) this.f3329j;
                k0.a.a(this.f3327h, h0Var, this.f3328i, (m0.r) obj, m0.z.y(385));
                break;
        }
        return ac.o.f277a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j3, z.c0 c0Var, u0.d dVar) {
        super(2);
        this.f3327h = j3;
        this.f3329j = c0Var;
        this.f3328i = dVar;
    }
}
