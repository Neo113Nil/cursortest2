package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7460g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f1.d0 f7461h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7462i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f7463j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f7464k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f7465l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f7466m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h1.g f7467n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z10, f1.i0 i0Var, long j3, float f10, float f11, long j6, long j10, h1.g gVar) {
        super(1);
        this.f7460g = z10;
        this.f7461h = i0Var;
        this.f7462i = j3;
        this.f7463j = f10;
        this.f7464k = f11;
        this.f7465l = j6;
        this.f7466m = j10;
        this.f7467n = gVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        x1.i0 i0Var = (x1.i0) obj;
        i0Var.a();
        h1.b bVar = i0Var.f8081g;
        if (this.f7460g) {
            h1.d.q(i0Var, this.f7461h, 0L, 0L, this.f7462i, null, 246);
        } else {
            long j3 = this.f7462i;
            float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            float f10 = this.f7463j;
            if (intBitsToFloat < f10) {
                float f11 = this.f7464k;
                float d10 = e1.e.d(bVar.d());
                float f12 = this.f7464k;
                float f13 = d10 - f12;
                float b2 = e1.e.b(bVar.d()) - f12;
                f1.d0 d0Var = this.f7461h;
                long j6 = this.f7462i;
                a5.c cVar = bVar.f2596h;
                long x10 = cVar.x();
                cVar.t().k();
                try {
                    ((a5.c) ((f8.c) cVar.f262h).f2340h).t().d(f11, f11, f13, b2, 0);
                    h1.d.q(i0Var, d0Var, 0L, 0L, j6, null, 246);
                } finally {
                    cVar.t().g();
                    cVar.Q(x10);
                }
            } else {
                h1.d.q(i0Var, this.f7461h, this.f7465l, this.f7466m, u5.d.j(j3, f10), this.f7467n, 208);
            }
        }
        return ac.o.f277a;
    }
}
