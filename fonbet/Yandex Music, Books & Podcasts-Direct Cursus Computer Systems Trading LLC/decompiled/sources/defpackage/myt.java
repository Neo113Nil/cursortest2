package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class myt implements pyt {
    public final xc5 a;
    public final n3q b;
    public final List c;

    public myt(xc5 xc5Var, n3q n3qVar, List list) {
        this.a = xc5Var;
        this.b = n3qVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myt)) {
            return false;
        }
        myt mytVar = (myt) obj;
        return this.a.equals(mytVar.a) && this.b.equals(mytVar.b) && this.c.equals(mytVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonCollectionAlbum(albumId=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", originalAlbumTracks=");
        return vz1.u(sb, this.c, ")");
    }
}
