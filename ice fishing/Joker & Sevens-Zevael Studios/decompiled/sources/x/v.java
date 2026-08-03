package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7913g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s0 f7914h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(s0 s0Var, int i10) {
        super(2);
        this.f7913g = i10;
        this.f7914h = s0Var;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7913g) {
            case 0:
                r1.n nVar = (r1.n) obj;
                long j3 = ((e1.b) obj2).f1929a;
                s0 s0Var = this.f7914h;
                if (((Boolean) s0Var.f7895x.invoke(nVar)).booleanValue()) {
                    if (!s0Var.C) {
                        if (s0Var.A == null) {
                            s0Var.A = a.a.a(Integer.MAX_VALUE, 6, null);
                        }
                        s0Var.C = true;
                        yc.a0.q(s0Var.f0(), null, new z(s0Var, null), 3);
                    }
                    long j6 = nVar.f5965c;
                    long f10 = e1.b.f(j6, v6.a.h(e1.b.d(j3) * Math.signum(e1.b.d(j6)), e1.b.e(j3) * Math.signum(e1.b.e(j6))));
                    ad.e eVar = s0Var.A;
                    if (eVar != null) {
                        eVar.s(new o(f10));
                    }
                }
                return ac.o.f277a;
            default:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                s0 s0Var2 = this.f7914h;
                yc.a0.q(s0Var2.f0(), null, new r0(s0Var2, floatValue, floatValue2, null), 3);
                return Boolean.TRUE;
        }
    }
}
