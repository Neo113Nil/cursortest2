package defpackage;

/* loaded from: classes3.dex */
public final class ggq {
    public final jd1 a;
    public final c01 b;

    public ggq(c01 c01Var, jd1 jd1Var) {
        this.a = jd1Var;
        this.b = c01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggq)) {
            return false;
        }
        ggq ggqVar = (ggq) obj;
        return this.a.equals(ggqVar.a) && this.b.equals(ggqVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimilarArtistListItem(uiData=" + this.a + ", artist=" + this.b + ")";
    }
}
