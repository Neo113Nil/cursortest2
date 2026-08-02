package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class n7i implements p7i {
    public final ArrayList a;
    public final boolean b;

    public n7i(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7i)) {
            return false;
        }
        n7i n7iVar = (n7i) obj;
        return this.a.equals(n7iVar.a) && this.b == n7iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(loadingItems=" + this.a + ", showShimmer=" + this.b + ")";
    }
}
