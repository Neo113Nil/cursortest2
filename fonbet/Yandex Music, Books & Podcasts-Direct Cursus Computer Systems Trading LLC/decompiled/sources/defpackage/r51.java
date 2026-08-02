package defpackage;

/* loaded from: classes4.dex */
public final class r51 {
    public final String a;

    public r51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r51) && this.a.equals(((r51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("ArtistDeprecation(targetArtistId=", this.a, ")");
    }
}
