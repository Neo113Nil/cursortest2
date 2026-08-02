package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class q7i implements s7i {
    public final ArrayList a;
    public final boolean b;

    public q7i(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7i)) {
            return false;
        }
        q7i q7iVar = (q7i) obj;
        return this.a.equals(q7iVar.a) && this.b == q7iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(loadingItems=" + this.a + ", showShimmer=" + this.b + ")";
    }
}
