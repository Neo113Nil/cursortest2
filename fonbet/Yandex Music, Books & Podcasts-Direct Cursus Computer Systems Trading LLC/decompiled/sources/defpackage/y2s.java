package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class y2s implements a3s {
    public final ArrayList a;
    public final boolean b;

    public y2s(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    @Override // defpackage.a3s
    public final List c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2s)) {
            return false;
        }
        y2s y2sVar = (y2s) obj;
        return this.a.equals(y2sVar.a) && this.b == y2sVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Placeholder(tabs=" + this.a + ", isLoading=" + this.b + ")";
    }
}
