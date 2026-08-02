package defpackage;

/* loaded from: classes5.dex */
public final class hm1 implements yit {
    public final u51 a;
    public final boolean b;

    public hm1(u51 u51Var, boolean z) {
        this.a = u51Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm1)) {
            return false;
        }
        hm1 hm1Var = (hm1) obj;
        return this.a.equals(hm1Var.a) && this.b == hm1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistUniversalEntity(artist=" + this.a + ", hasTrailer=" + this.b + ")";
    }
}
