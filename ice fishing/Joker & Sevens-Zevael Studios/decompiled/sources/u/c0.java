package u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6571g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f6572h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f6573i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6574j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6575k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, long j3, long j6, Object obj2, int i10) {
        super(1);
        this.f6571g = i10;
        this.f6574j = obj;
        this.f6572h = j3;
        this.f6573i = j6;
        this.f6575k = obj2;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f6571g) {
            case 0:
                v1.i0 i0Var = (v1.i0) obj;
                v1.j0 j0Var = (v1.j0) this.f6574j;
                long j3 = this.f6572h;
                long j6 = this.f6573i;
                a0.r rVar = (a0.r) this.f6575k;
                i0Var.getClass();
                v1.i0.a(i0Var, j0Var);
                j0Var.P(s2.i.c(((((int) (j3 >> 32)) + ((int) (j6 >> 32))) << 32) | ((((int) (j3 & 4294967295L)) + ((int) (j6 & 4294967295L))) & 4294967295L), j0Var.f7089k), 0.0f, rVar);
                break;
            default:
                x1.i0 i0Var2 = (x1.i0) obj;
                i0Var2.a();
                f1.d0 d0Var = (f1.d0) this.f6574j;
                h1.c cVar = (h1.c) this.f6575k;
                long j10 = (104 & 2) != 0 ? 0L : this.f6572h;
                long e02 = (104 & 4) != 0 ? h1.d.e0(i0Var2.f8081g.d(), j10) : this.f6573i;
                float f10 = (104 & 8) != 0 ? 1.0f : 0.0f;
                if ((104 & 16) != 0) {
                    cVar = h1.f.f2601b;
                }
                h1.b bVar = i0Var2.f8081g;
                int i10 = (int) (j10 >> 32);
                int i11 = (int) (j10 & 4294967295L);
                bVar.f2595g.f2593c.c(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (e02 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (e02 & 4294967295L)) + Float.intBitsToFloat(i11), bVar.b(d0Var, cVar, f10, null, 3, 1));
                break;
        }
        return ac.o.f277a;
    }
}
