package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class er {
    public final Object GWasM1elztuh;
    public final jd Yi7zF1RB1;

    public er(m31 m31Var, jd jdVar) {
        this.GWasM1elztuh = m31Var;
        this.Yi7zF1RB1 = jdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof er) {
            er erVar = (er) obj;
            return o30.rQPn8YBR(this.GWasM1elztuh, erVar.GWasM1elztuh) && this.Yi7zF1RB1 == erVar.Yi7zF1RB1;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.GWasM1elztuh;
        return this.Yi7zF1RB1.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.GWasM1elztuh + ", transition=" + this.Yi7zF1RB1 + ')';
    }
}
