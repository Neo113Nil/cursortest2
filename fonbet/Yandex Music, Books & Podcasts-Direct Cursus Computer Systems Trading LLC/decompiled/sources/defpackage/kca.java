package defpackage;

/* loaded from: classes5.dex */
public final class kca {
    public final oq a;
    public final long b;

    public kca(oq oqVar, long j) {
        this.a = oqVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kca)) {
            return false;
        }
        kca kcaVar = (kca) obj;
        return this.a.equals(kcaVar.a) && this.b == kcaVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "DownloadedAlbumItem(album=" + this.a + ", timestampMs=" + this.b + ")";
    }
}
