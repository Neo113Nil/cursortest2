package defpackage;

/* loaded from: classes4.dex */
public final class w4v implements y4v {
    public final pj6 a;

    public w4v(pj6 pj6Var) {
        this.a = pj6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4v) && this.a.equals(((w4v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + ")";
    }
}
