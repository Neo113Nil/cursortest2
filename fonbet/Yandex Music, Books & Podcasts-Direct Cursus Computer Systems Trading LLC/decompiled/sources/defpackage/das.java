package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class das {
    public final mn0 a;
    public final ges b;
    public final boolean e;
    public final jx7 g;
    public final ppc h;
    public final List i;
    public dn9 j;
    public xof k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;

    public das(mn0 mn0Var, ges gesVar, boolean z, jx7 jx7Var, ppc ppcVar, List list) {
        this.a = mn0Var;
        this.b = gesVar;
        this.e = z;
        this.g = jx7Var;
        this.h = ppcVar;
        this.i = list;
    }

    public final void a(xof xofVar) {
        dn9 dn9Var = this.j;
        if (dn9Var == null || xofVar != this.k || dn9Var.a()) {
            this.k = xofVar;
            dn9Var = new dn9(this.a, u7g.T(this.b, xofVar), this.i, this.g, this.h);
        }
        this.j = dn9Var;
    }
}
