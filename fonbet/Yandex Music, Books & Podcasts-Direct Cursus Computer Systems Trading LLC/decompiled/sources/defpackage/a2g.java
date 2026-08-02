package defpackage;

/* loaded from: classes5.dex */
public final class a2g implements yit {
    public final eul a;
    public final int b;
    public final boolean c;

    public a2g(eul eulVar, int i, boolean z) {
        this.a = eulVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2g)) {
            return false;
        }
        a2g a2gVar = (a2g) obj;
        return this.a.equals(a2gVar.a) && this.b == a2gVar.b && this.c == a2gVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikedPlaylistUniversalEntity(playlist=");
        sb.append(this.a);
        sb.append(", likesCount=");
        sb.append(this.b);
        sb.append(", hasTrailer=");
        return ouj.r(sb, this.c, ")");
    }
}
