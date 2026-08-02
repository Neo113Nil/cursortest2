package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bf4 {
    public final String a;
    public final boolean b;
    public final ArrayList c;
    public final etq d;
    public final dtq e;

    public bf4(String str, boolean z, ArrayList arrayList, etq etqVar, dtq dtqVar) {
        dtqVar.getClass();
        this.a = str;
        this.b = z;
        this.c = arrayList;
        this.d = etqVar;
        this.e = dtqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf4)) {
            return false;
        }
        bf4 bf4Var = (bf4) obj;
        return Intrinsics.d(this.a, bf4Var.a) && this.b == bf4Var.b && this.c.equals(bf4Var.c) && this.d == bf4Var.d && Intrinsics.d(this.e, bf4Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        return this.e.hashCode() + ((this.d.hashCode() + dfi.b(this.c, k5r.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = v3w.h("ChartContentUiData(description=", this.a, ", isOrderVisible=", ", items=", this.b);
        h.append(this.c);
        h.append(", coverType=");
        h.append(this.d);
        h.append(", align=");
        h.append(this.e);
        h.append(")");
        return h.toString();
    }
}
