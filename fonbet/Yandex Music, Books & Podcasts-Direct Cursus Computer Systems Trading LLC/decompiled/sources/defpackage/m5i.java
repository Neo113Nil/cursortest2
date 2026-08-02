package defpackage;

/* loaded from: classes.dex */
public final class m5i {
    public static m5i h;
    public final xof a;
    public final ges b;
    public final kx7 c;
    public final ppc d;
    public final ges e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public m5i(xof xofVar, ges gesVar, kx7 kx7Var, ppc ppcVar) {
        this.a = xofVar;
        this.b = gesVar;
        this.c = kx7Var;
        this.d = ppcVar;
        this.e = u7g.T(gesVar, xofVar);
    }

    public final long a(int i, long j) {
        int j2;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = n5i.a;
            long b = ia6.b(0, 0, 15);
            ges gesVar = this.e;
            kx7 kx7Var = this.c;
            float b2 = cb0.e(str, gesVar, b, kx7Var, this.d, null, 1, 96).b();
            float b3 = cb0.e(n5i.b, this.e, ia6.b(0, 0, 15), kx7Var, this.d, null, 2, 96).b() - b2;
            this.g = b2;
            this.f = b3;
            f2 = b3;
            f = b2;
        }
        if (i != 1) {
            int round = Math.round((f2 * (i - 1)) + f);
            j2 = round >= 0 ? round : 0;
            int h2 = ga6.h(j);
            if (j2 > h2) {
                j2 = h2;
            }
        } else {
            j2 = ga6.j(j);
        }
        return ia6.a(ga6.k(j), ga6.i(j), j2, ga6.h(j));
    }
}
