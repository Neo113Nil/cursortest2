package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class o20 implements yit {
    public final lt a;
    public final ArrayList b;
    public final boolean c;

    public o20(lt ltVar, ArrayList arrayList, boolean z) {
        this.a = ltVar;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o20)) {
            return false;
        }
        o20 o20Var = (o20) obj;
        return this.a.equals(o20Var.a) && this.b.equals(o20Var.b) && this.c == o20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dfi.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumUniversalEntity(album=");
        sb.append(this.a);
        sb.append(", artists=");
        sb.append(this.b);
        sb.append(", hasTrailer=");
        return ouj.r(sb, this.c, ")");
    }
}
