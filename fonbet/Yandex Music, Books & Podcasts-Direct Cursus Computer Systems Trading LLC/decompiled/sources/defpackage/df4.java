package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class df4 {
    public final pas a;
    public final String b;
    public final boolean c;
    public final List d;
    public final dtq e;

    public df4(pas pasVar, String str, boolean z, List list, dtq dtqVar) {
        list.getClass();
        dtqVar.getClass();
        this.a = pasVar;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = dtqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df4)) {
            return false;
        }
        df4 df4Var = (df4) obj;
        return this.a.equals(df4Var.a) && Intrinsics.d(this.b, df4Var.b) && this.c == df4Var.c && Intrinsics.d(this.d, df4Var.d) && Intrinsics.d(this.e, df4Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + k5r.d(k5r.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "ChartFavoritesContentUiData(textFactContentUiData=" + this.a + ", description=" + this.b + ", isOrderVisible=" + this.c + ", items=" + this.d + ", align=" + this.e + ")";
    }
}
