package defpackage;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class ej3 implements Cloneable, Serializable {
    private static final long serialVersionUID = -2768352615787625448L;
    public final String a;
    public final pd4 b;
    public final int c;

    public ej3(pd4 pd4Var) {
        bg3.P(pd4Var, "Char array buffer");
        int e = pd4Var.e(58, 0, pd4Var.b);
        if (e == -1) {
            throw new e7k("Invalid header: ".concat(pd4Var.toString()));
        }
        String g = pd4Var.g(0, e);
        if (g.length() == 0) {
            throw new e7k("Invalid header: ".concat(pd4Var.toString()));
        }
        this.b = pd4Var;
        this.a = g;
        this.c = e + 1;
    }

    public final Object clone() {
        return super.clone();
    }

    public final String toString() {
        return this.b.toString();
    }
}
