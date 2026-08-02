package defpackage;

/* loaded from: classes.dex */
public final class yl6 implements tkd {
    public final n38 a;

    public yl6(n38 n38Var) {
        this.a = n38Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl6) && this.a.equals(((yl6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CornerRadiusModifier(radius=" + this.a + ')';
    }
}
