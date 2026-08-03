package b0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f920g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f921h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f922i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f923j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ac.c f924k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(j5.j jVar, u0.d dVar, u0.d dVar2, p0 p0Var) {
        super(2);
        this.f921h = jVar;
        this.f922i = dVar;
        this.f923j = dVar2;
        this.f924k = p0Var;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f920g) {
            case 0:
                ((Number) obj2).intValue();
                v6.a.e((oc.a) this.f921h, (y0.n) this.f922i, (d0) this.f923j, (oc.e) this.f924k, (m0.r) obj, m0.z.y(1));
                break;
            default:
                m0.r rVar = (m0.r) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && rVar.B()) {
                    rVar.S();
                } else {
                    j5.d.c((j5.j) this.f921h, (u0.d) this.f922i, (u0.d) this.f923j, (p0) this.f924k, rVar, 0);
                }
                break;
        }
        return ac.o.f277a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(oc.a aVar, y0.n nVar, d0 d0Var, oc.e eVar, int i10) {
        super(2);
        this.f921h = aVar;
        this.f922i = nVar;
        this.f923j = d0Var;
        this.f924k = eVar;
    }
}
