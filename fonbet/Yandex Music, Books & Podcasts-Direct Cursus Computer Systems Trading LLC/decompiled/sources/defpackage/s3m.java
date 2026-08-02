package defpackage;

/* loaded from: classes5.dex */
public final class s3m implements yit {
    public final eul a;
    public final boolean b;

    public s3m(eul eulVar, boolean z) {
        this.a = eulVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3m)) {
            return false;
        }
        s3m s3mVar = (s3m) obj;
        return this.a.equals(s3mVar.a) && this.b == s3mVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistUniversalEntity(playlist=" + this.a + ", hasTrailer=" + this.b + ")";
    }
}
