package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class ya70 extends gc70 {
    public static final ya70 c = new ya70(0, 4, 1);

    @Override // defpackage.gc70
    public final void a(vc70 vc70Var, o13 o13Var, ows0 ows0Var, zti0 zti0Var, jc70 jc70Var) {
        kb30 kb30Var = (kb30) vc70Var.b(2);
        kb30 kb30Var2 = (kb30) vc70Var.b(3);
        ttd ttdVar = (ttd) vc70Var.b(1);
        jb30 jb30Var = (jb30) vc70Var.b(0);
        if (jb30Var == null && (jb30Var = ttdVar.p(kb30Var)) == null) {
            lid.b("Could not resolve state for movable content");
            ny61.A();
            return;
        }
        sus0 f = uus0.f(jb30Var.a);
        if (ows0Var.n > 0 || ows0Var.u(ows0Var.t + 1) != 1) {
            lid.a("Check failed");
        }
        int i = ows0Var.t;
        int i2 = ows0Var.i;
        int i3 = ows0Var.j;
        ows0Var.a(1);
        ows0Var.R();
        ows0Var.d();
        ows0 k = f.k();
        try {
            List H = qje.H(k, 2, ows0Var, false, true, true);
            k.e(true);
            ows0Var.k();
            ows0Var.j();
            ows0Var.t = i;
            ows0Var.i = i2;
            ows0Var.j = i3;
            qke.c(ows0Var, H, kb30Var2.c);
        } catch (Throwable th) {
            k.e(false);
            throw th;
        }
    }
}
