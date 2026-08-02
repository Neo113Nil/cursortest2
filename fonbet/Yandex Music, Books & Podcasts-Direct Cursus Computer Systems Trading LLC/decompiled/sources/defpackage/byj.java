package defpackage;

/* loaded from: classes.dex */
public final class byj extends ocg {
    public final jgo j;
    public final nh0 k;

    public byj(jgo jgoVar) {
        nh0 nh0Var;
        this.j = jgoVar;
        if (cb0.B(jgoVar)) {
            nh0Var = null;
        } else {
            nh0Var = ph0.a();
            eak.a(nh0Var, jgoVar);
        }
        this.k = nh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof byj) {
            return this.j.equals(((byj) obj).j);
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode();
    }
}
