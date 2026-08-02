package defpackage;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class m8r {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final uf7 a(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        boolean c = oq5Var.c(jx7Var.getDensity());
        Object K = oq5Var.K();
        if (c || K == gq5.a) {
            K = new uf7(new gao(jx7Var));
            oq5Var.k0(K);
        }
        return (uf7) K;
    }
}
