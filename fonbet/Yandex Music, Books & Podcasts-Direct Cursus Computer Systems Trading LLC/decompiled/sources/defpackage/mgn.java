package defpackage;

/* loaded from: classes4.dex */
public final class mgn implements rgn {
    public final pj6 a;

    public mgn(pj6 pj6Var) {
        this.a = pj6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mgn) && this.a.equals(((mgn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(reason=" + this.a + ")";
    }
}
