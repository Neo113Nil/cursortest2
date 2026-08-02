package defpackage;

/* loaded from: classes4.dex */
public final class t91 {
    public final String a;

    public t91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t91) && this.a.equals(((t91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("ArtistHeaderDonation(tipUrl=", this.a, ")");
    }
}
