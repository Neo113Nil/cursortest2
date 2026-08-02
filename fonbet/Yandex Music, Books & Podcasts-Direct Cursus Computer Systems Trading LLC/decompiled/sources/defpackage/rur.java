package defpackage;

/* loaded from: classes4.dex */
public final class rur implements sur {
    public final wn5 a;

    public rur(wn5 wn5Var) {
        this.a = wn5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rur) && this.a.equals(((rur) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Stay(content=" + this.a + ")";
    }
}
