package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class nyt implements pyt {
    public final zc5 a;
    public final n3q b;
    public final List c;

    public nyt(zc5 zc5Var, n3q n3qVar, List list) {
        this.a = zc5Var;
        this.b = n3qVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyt)) {
            return false;
        }
        nyt nytVar = (nyt) obj;
        return this.a.equals(nytVar.a) && this.b.equals(nytVar.b) && this.c.equals(nytVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonCollectionPlaylist(playlistId=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", originalPlaylistTracks=");
        return vz1.u(sb, this.c, ")");
    }
}
