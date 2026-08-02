package defpackage;

/* loaded from: classes4.dex */
public final class mn6 extends saf {
    public final String n;

    public mn6(String str) {
        this.n = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mn6) && this.n.equals(((mn6) obj).n);
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return hrg.q("Single(cover=", this.n, ")");
    }
}
