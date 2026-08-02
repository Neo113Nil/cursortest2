package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class if6 {
    public final s2r a = new s2r();

    public static void b(if6 if6Var, y5 y5Var, Function0 function0) {
        if6Var.a.add(new wn5(new yl0(y5Var, function0), 262103052, true));
    }

    public final void a(df6 df6Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1320309496);
        int i2 = (oq5Var.f(df6Var) ? 4 : 2) | i | (oq5Var.f(this) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            s2r s2rVar = this.a;
            int size = s2rVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((pyc) s2rVar.get(i3)).invoke(df6Var, oq5Var, Integer.valueOf(i2 & 14));
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s30(this, df6Var, i, 15);
        }
    }
}
