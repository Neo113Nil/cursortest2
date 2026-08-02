package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class dhe {
    public final lt a;
    public final ArrayList b;
    public final boolean c;

    public dhe(lt ltVar, ArrayList arrayList, boolean z) {
        this.a = ltVar;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhe)) {
            return false;
        }
        dhe dheVar = (dhe) obj;
        return this.a.equals(dheVar.a) && this.b.equals(dheVar.b) && this.c == dheVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dfi.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InStyleBlockItem(album=");
        sb.append(this.a);
        sb.append(", artists=");
        sb.append(this.b);
        sb.append(", hasTrailer=");
        return ouj.r(sb, this.c, ")");
    }
}
