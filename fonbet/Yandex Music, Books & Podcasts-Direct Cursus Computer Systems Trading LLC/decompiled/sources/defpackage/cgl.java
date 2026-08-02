package defpackage;

/* loaded from: classes4.dex */
public final class cgl {
    public static final cgl c;
    public static final cgl d;
    public final long a;
    public final long b;

    static {
        nsa.b.getClass();
        c = new cgl(0L, nsa.c);
        d = new cgl(Long.MAX_VALUE, 0L);
    }

    public cgl(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgl)) {
            return false;
        }
        cgl cglVar = (cgl) obj;
        return this.a == cglVar.a && nsa.e(this.b, cglVar.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        msa msaVar = nsa.b;
        return Long.hashCode(this.b) + hashCode;
    }

    public final String toString() {
        return "ArtistRestrictions(capPerArtist=" + this.a + ", cooldownPerArtist=" + nsa.t(this.b) + ")";
    }
}
