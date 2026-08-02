package defpackage;

/* loaded from: classes4.dex */
public final class bu {
    public final String a;
    public final j1g b;

    public bu(j1g j1gVar, String str) {
        this.a = str;
        this.b = j1gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu)) {
            return false;
        }
        bu buVar = (bu) obj;
        return this.a.equals(buVar.a) && this.b == buVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumLikeState(albumId=" + this.a + ", newLikeState=" + this.b + ")";
    }
}
