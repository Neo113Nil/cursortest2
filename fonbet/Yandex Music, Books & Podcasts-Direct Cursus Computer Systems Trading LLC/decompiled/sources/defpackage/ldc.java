package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ldc implements ndc {
    public final ArrayList a;
    public final int b;
    public final boolean c;
    public final ArrayList d;
    public final List e;

    public ldc(ArrayList arrayList, int i, boolean z, ArrayList arrayList2, List list) {
        this.a = arrayList;
        this.b = i;
        this.c = z;
        this.d = arrayList2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldc)) {
            return false;
        }
        ldc ldcVar = (ldc) obj;
        return this.a.equals(ldcVar.a) && this.b == ldcVar.b && this.c == ldcVar.c && this.d.equals(ldcVar.d) && this.e.equals(ldcVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dfi.b(this.d, k5r.e(f1d.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(filters=");
        sb.append(this.a);
        sb.append(", selectedIndex=");
        sb.append(this.b);
        sb.append(", selectedByDefault=");
        sb.append(this.c);
        sb.append(", tracksUi=");
        sb.append(this.d);
        sb.append(", tracksData=");
        return vz1.u(sb, this.e, ")");
    }
}
