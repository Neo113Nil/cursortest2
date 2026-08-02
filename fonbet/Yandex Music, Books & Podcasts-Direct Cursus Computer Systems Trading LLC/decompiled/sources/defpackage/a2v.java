package defpackage;

/* loaded from: classes4.dex */
public final class a2v implements f2v, e2v {
    public final nvl a;
    public final n3q b;
    public final o3q c;

    public a2v(nvl nvlVar, n3q n3qVar, o3q o3qVar) {
        o3qVar.getClass();
        this.a = nvlVar;
        this.b = n3qVar;
        this.c = o3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2v)) {
            return false;
        }
        a2v a2vVar = (a2v) obj;
        return this.a.equals(a2vVar.a) && this.b.equals(a2vVar.b) && this.c == a2vVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "Playlist(playlistId=" + this.a + ", description=" + this.b + ", subtypeSource=" + this.c + ")";
    }
}
