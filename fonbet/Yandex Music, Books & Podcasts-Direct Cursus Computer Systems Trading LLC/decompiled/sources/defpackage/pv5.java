package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class pv5 {
    public final mu5 a;
    public final uy5 b;
    public final List c;
    public final qv5 d;
    public final String e;
    public final List f;

    public pv5(mu5 mu5Var, uy5 uy5Var, List list, qv5 qv5Var, String str, List list2) {
        list.getClass();
        list2.getClass();
        this.a = mu5Var;
        this.b = uy5Var;
        this.c = list;
        this.d = qv5Var;
        this.e = str;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv5)) {
            return false;
        }
        pv5 pv5Var = (pv5) obj;
        return this.a.equals(pv5Var.a) && Intrinsics.d(this.b, pv5Var.b) && Intrinsics.d(this.c, pv5Var.c) && Intrinsics.d(this.d, pv5Var.d) && Intrinsics.d(this.e, pv5Var.e) && Intrinsics.d(this.f, pv5Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        uy5 uy5Var = this.b;
        int d = k5r.d((hashCode + (uy5Var == null ? 0 : uy5Var.hashCode())) * 31, 31, this.c);
        qv5 qv5Var = this.d;
        int hashCode2 = (d + (qv5Var == null ? 0 : qv5Var.hashCode())) * 31;
        String str = this.e;
        return this.f.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ConcertHeaderData(concert=" + this.a + ", price=" + this.b + ", covers=" + this.c + ", description=" + this.d + ", leadArtistId=" + this.e + ", artists=" + this.f + ")";
    }
}
