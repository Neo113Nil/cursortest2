package defpackage;

/* loaded from: classes4.dex */
public final class bvn extends a4g {
    public final String a;

    public bvn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvn) && this.a.equals(((bvn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Artist(artistId=", this.a, ")");
    }
}
