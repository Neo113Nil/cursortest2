package defpackage;

/* loaded from: classes10.dex */
public final class zb70 extends gc70 {
    public static final zb70 c = new zb70(1, 0, 2);

    @Override // defpackage.gc70
    public final void a(vc70 vc70Var, o13 o13Var, ows0 ows0Var, zti0 zti0Var, jc70 jc70Var) {
        int a = vc70Var.a(0);
        int i = ows0Var.v;
        int P = ows0Var.P(ows0Var.r(i), ows0Var.b);
        int g = ows0Var.g(ows0Var.r(i + 1), ows0Var.b);
        for (int max = Math.max(P, g - a); max < g; max++) {
            Object obj = ows0Var.c[ows0Var.h(max)];
            if (obj instanceof gts) {
                zti0Var.e((gts) obj);
            } else if (obj instanceof aii0) {
                ((aii0) obj).c();
            }
        }
        if (a <= 0) {
            lid.a("Check failed");
        }
        int i2 = ows0Var.v;
        int P2 = ows0Var.P(ows0Var.r(i2), ows0Var.b);
        int g2 = ows0Var.g(ows0Var.r(i2 + 1), ows0Var.b) - a;
        if (g2 < P2) {
            lid.a("Check failed");
        }
        ows0Var.L(g2, a, i2);
        int i3 = ows0Var.i;
        if (i3 >= P2) {
            ows0Var.i = i3 - a;
        }
    }
}
