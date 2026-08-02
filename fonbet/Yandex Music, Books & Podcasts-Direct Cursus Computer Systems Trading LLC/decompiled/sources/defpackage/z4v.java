package defpackage;

/* loaded from: classes4.dex */
public final class z4v implements b5v {
    public final pj6 a;

    public z4v(pj6 pj6Var) {
        this.a = pj6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4v) && this.a.equals(((z4v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + ")";
    }
}
