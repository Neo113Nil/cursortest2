package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bn0 extends z50 {
    public final h1 X1lG3V04pd;
    public final sv0 Yi7zF1RB1;

    public bn0(sv0 sv0Var) {
        h1 h1Var;
        this.Yi7zF1RB1 = sv0Var;
        if (n4.iwATDS1i01k(sv0Var)) {
            h1Var = null;
        } else {
            h1Var = j1.GWasM1elztuh();
            h1.Yi7zF1RB1(h1Var, sv0Var);
        }
        this.X1lG3V04pd = h1Var;
    }

    @Override // defpackage.z50
    public final kt0 YmKjaVtbfp5Z() {
        sv0 sv0Var = this.Yi7zF1RB1;
        return new kt0(sv0Var.GWasM1elztuh, sv0Var.Yi7zF1RB1, sv0Var.X1lG3V04pd, sv0Var.xqGvceK5x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bn0) {
            return this.Yi7zF1RB1.equals(((bn0) obj).Yi7zF1RB1);
        }
        return false;
    }

    public final int hashCode() {
        return this.Yi7zF1RB1.hashCode();
    }
}
