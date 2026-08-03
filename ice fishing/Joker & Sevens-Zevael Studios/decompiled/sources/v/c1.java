package v;

import m0.p2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c1 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1 f6808g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f6809h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e1 e1Var, float f10) {
        super(1);
        this.f6808g = e1Var;
        this.f6809h = f10;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        e1 e1Var = this.f6808g;
        boolean g8 = e1Var.g();
        m0.j1 j1Var = e1Var.f6829g;
        if (!g8) {
            if (((p2) w0.m.t(j1Var.f4630h, j1Var)).f4710c == Long.MIN_VALUE) {
                j1Var.g(longValue);
                ((m0.l1) e1Var.f6823a.f8312h).setValue(Boolean.TRUE);
            }
            long j3 = longValue - ((p2) w0.m.t(j1Var.f4630h, j1Var)).f4710c;
            float f10 = this.f6809h;
            if (f10 != 0.0f) {
                double d10 = j3 / f10;
                if (Double.isNaN(d10)) {
                    throw new IllegalArgumentException("Cannot round NaN value.");
                }
                j3 = Math.round(d10);
            }
            if (e1Var.f6824b == null) {
                e1Var.f6828f.g(j3);
            }
            e1Var.h(f10 == 0.0f, j3);
        }
        return ac.o.f277a;
    }
}
