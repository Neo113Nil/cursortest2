package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zbm {
    public final ArrayList a;
    public final ArrayList b;

    public zbm(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final List a(j0s j0sVar) {
        j0sVar.getClass();
        int ordinal = j0sVar.ordinal();
        if (ordinal == 0) {
            return this.a;
        }
        if (ordinal == 1) {
            return this.b;
        }
        b6e.s();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbm)) {
            return false;
        }
        zbm zbmVar = (zbm) obj;
        return this.a.equals(zbmVar.a) && this.b.equals(zbmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PodcastScreenTabBlockList(leftBlocks=" + this.a + ", rightBlocks=" + this.b + ")";
    }
}
