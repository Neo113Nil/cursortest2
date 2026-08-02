package defpackage;

/* loaded from: classes5.dex */
public final class r1g implements yit {
    public final lt a;
    public final int b;
    public final boolean c;

    public r1g(lt ltVar, int i, boolean z) {
        this.a = ltVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1g)) {
            return false;
        }
        r1g r1gVar = (r1g) obj;
        return this.a.equals(r1gVar.a) && this.b == r1gVar.b && this.c == r1gVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikedAlbumUniversalEntity(album=");
        sb.append(this.a);
        sb.append(", likesCount=");
        sb.append(this.b);
        sb.append(", hasTrailer=");
        return ouj.r(sb, this.c, ")");
    }
}
