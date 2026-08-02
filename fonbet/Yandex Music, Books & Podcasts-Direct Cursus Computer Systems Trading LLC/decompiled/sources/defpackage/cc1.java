package defpackage;

/* loaded from: classes4.dex */
public final class cc1 {
    public final String a;
    public final j1g b;

    public cc1(j1g j1gVar, String str) {
        this.a = str;
        this.b = j1gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc1)) {
            return false;
        }
        cc1 cc1Var = (cc1) obj;
        return this.a.equals(cc1Var.a) && this.b == cc1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistLikeState(artistId=" + this.a + ", newLikeState=" + this.b + ")";
    }
}
