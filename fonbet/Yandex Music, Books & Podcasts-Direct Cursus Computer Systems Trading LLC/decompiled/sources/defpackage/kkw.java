package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class kkw {
    public final ejw a;
    public final ArrayList b;
    public final ArrayList c;

    public kkw(ejw ejwVar, ArrayList arrayList, ArrayList arrayList2) {
        this.a = ejwVar;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkw)) {
            return false;
        }
        kkw kkwVar = (kkw) obj;
        return this.a.equals(kkwVar.a) && this.b.equals(kkwVar.b) && this.c.equals(kkwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dfi.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Completed(loadedEntity=");
        sb.append(this.a);
        sb.append(", playables=");
        sb.append(this.b);
        sb.append(", recommendedPlayables=");
        return vz1.t(sb, this.c, ")");
    }
}
