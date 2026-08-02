package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class fb3 implements gb3 {
    public final ArrayList a;
    public final ArrayList b;

    public fb3(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    @Override // defpackage.gb3
    public final List a(j0s j0sVar) {
        int i = j0sVar == null ? -1 : eb3.a[j0sVar.ordinal()];
        if (i == -1 || i == 1) {
            return this.a;
        }
        if (i == 2) {
            return this.b;
        }
        b6e.s();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb3)) {
            return false;
        }
        fb3 fb3Var = (fb3) obj;
        return this.a.equals(fb3Var.a) && this.b.equals(fb3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoTabsBlockList(leftBlocks=" + this.a + ", rightBlocks=" + this.b + ")";
    }
}
