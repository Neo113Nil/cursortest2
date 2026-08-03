package u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1.j0 f6611g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f6612h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, v1.j0 j0Var, long j3) {
        super(1);
        this.f6611g = j0Var;
        this.f6612h = j3;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        v1.j0 j0Var = this.f6611g;
        long e10 = i7.b.e(j0Var.f7085g, j0Var.f7086h);
        long j3 = this.f6612h;
        float f10 = 1;
        float f11 = (f10 - 1.0f) * ((((int) (j3 >> 32)) - ((int) (e10 >> 32))) / 2.0f);
        float f12 = (f10 - 1.0f) * ((((int) (j3 & 4294967295L)) - ((int) (e10 & 4294967295L))) / 2.0f);
        v1.i0.h((v1.i0) obj, j0Var, (Math.round(f12) & 4294967295L) | (Math.round(f11) << 32));
        return ac.o.f277a;
    }
}
