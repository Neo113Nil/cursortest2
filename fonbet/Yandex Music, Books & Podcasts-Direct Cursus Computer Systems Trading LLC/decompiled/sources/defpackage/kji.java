package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class kji {
    public final hji a;
    public final ArrayList b;

    public kji(hji hjiVar, ArrayList arrayList) {
        this.a = hjiVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kji)) {
            return false;
        }
        kji kjiVar = (kji) obj;
        return this.a.equals(kjiVar.a) && this.b.equals(kjiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MusicHistoryItem(context=" + this.a + ", tracks=" + this.b + ")";
    }
}
