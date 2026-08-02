package defpackage;

import java.util.Set;

/* loaded from: classes10.dex */
public final class qb70 extends gc70 {
    public static final qb70 c = new qb70(0, 1, 1);

    @Override // defpackage.gc70
    public final void a(vc70 vc70Var, o13 o13Var, ows0 ows0Var, zti0 zti0Var, jc70 jc70Var) {
        aii0 aii0Var = (aii0) vc70Var.b(0);
        Set set = zti0Var.a;
        if (set == null) {
            return;
        }
        hs90 hs90Var = new hs90(set);
        hz40 hz40Var = zti0Var.i;
        if (hz40Var == null) {
            hz40Var = cmm0.b();
            zti0Var.i = hz40Var;
        }
        hz40Var.o(aii0Var, hs90Var);
        zti0Var.e.b(new gts(hs90Var, -1));
    }
}
