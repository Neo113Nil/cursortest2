package defpackage;

/* loaded from: classes3.dex */
public final class r21 {
    public final us5 a;
    public final pw5 b;

    public r21(us5 us5Var, pw5 pw5Var) {
        this.a = us5Var;
        this.b = pw5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r21)) {
            return false;
        }
        r21 r21Var = (r21) obj;
        return this.a.equals(r21Var.a) && this.b.equals(r21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistConcertBundle(concert=" + this.a + ", concertViewState=" + this.b + ")";
    }
}
