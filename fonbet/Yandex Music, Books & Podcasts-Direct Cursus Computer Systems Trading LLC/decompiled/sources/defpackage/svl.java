package defpackage;

/* loaded from: classes4.dex */
public final class svl {
    public final nvl a;
    public final j1g b;

    public svl(nvl nvlVar, j1g j1gVar) {
        this.a = nvlVar;
        this.b = j1gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svl)) {
            return false;
        }
        svl svlVar = (svl) obj;
        return this.a.equals(svlVar.a) && this.b == svlVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistLikeState(playlistId=" + this.a + ", newLikeState=" + this.b + ")";
    }
}
