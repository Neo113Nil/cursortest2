package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class v7 implements r7 {
    public final el GWasM1elztuh;
    public final long Yi7zF1RB1;

    public v7(p61 p61Var, long j) {
        this.GWasM1elztuh = p61Var;
        this.Yi7zF1RB1 = j;
    }

    @Override // defpackage.r7
    public final ie0 GWasM1elztuh(r6 r6Var) {
        return new k7(r6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7)) {
            return false;
        }
        v7 v7Var = (v7) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, v7Var.GWasM1elztuh) && eg.Yi7zF1RB1(this.Yi7zF1RB1, v7Var.Yi7zF1RB1);
    }

    public final int hashCode() {
        return Long.hashCode(this.Yi7zF1RB1) + (this.GWasM1elztuh.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.GWasM1elztuh + ", constraints=" + ((Object) eg.rQPn8YBR(this.Yi7zF1RB1)) + ')';
    }
}
