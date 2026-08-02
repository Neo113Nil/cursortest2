package defpackage;

/* loaded from: classes4.dex */
public final class rxu implements txu {
    public final pj6 a;

    public rxu(pj6 pj6Var) {
        this.a = pj6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxu) && this.a.equals(((rxu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Network(error=" + this.a + ")";
    }
}
