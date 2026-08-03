package x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m0 extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f8111g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f8112h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8113i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q1 f8114j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, long j3, long j6, q1 q1Var) {
        super(0);
        this.f8111g = o0Var;
        this.f8112h = j3;
        this.f8113i = j6;
        this.f8114j = q1Var;
    }

    @Override // oc.a
    public final Object invoke() {
        o0 o0Var = this.f8111g;
        o0Var.m0().f8105g = false;
        o0Var.m0().f8106h = this.f8112h;
        o0Var.m0().f8107i = this.f8113i;
        oc.c d10 = this.f8114j.f8154g.d();
        if (d10 != null) {
            d10.invoke(o0Var.m0());
        }
        return ac.o.f277a;
    }
}
