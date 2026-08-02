package defpackage;

/* loaded from: classes4.dex */
public final class g7u implements l7u {
    public final pj6 a;

    public g7u(pj6 pj6Var) {
        this.a = pj6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7u) && this.a.equals(((g7u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.a + ")";
    }
}
