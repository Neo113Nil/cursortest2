package defpackage;

/* loaded from: classes3.dex */
public final class yb1 {
    public final c01 a;
    public final jd1 b;

    public yb1(c01 c01Var, jd1 jd1Var) {
        this.a = c01Var;
        this.b = jd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb1)) {
            return false;
        }
        yb1 yb1Var = (yb1) obj;
        return this.a.equals(yb1Var.a) && this.b.equals(yb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistItem(artist=" + this.a + ", uiData=" + this.b + ")";
    }
}
