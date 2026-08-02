package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class za31 {
    public final oa31 a;
    public final List b;
    public final mi31 c;
    public final String d;

    public za31(oa31 oa31Var, List list, mi31 mi31Var) {
        this.a = oa31Var;
        this.b = list;
        this.c = mi31Var;
        this.d = oa31Var.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static za31 a(za31 za31Var, ArrayList arrayList, mi31 mi31Var, int i) {
        oa31 oa31Var = za31Var.a;
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = za31Var.b;
        }
        if ((i & 4) != 0) {
            mi31Var = za31Var.c;
        }
        return new za31(oa31Var, arrayList2, mi31Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za31)) {
            return false;
        }
        za31 za31Var = (za31) obj;
        return this.a.equals(za31Var.a) && jl40.l(this.b, za31Var.b) && jl40.l(this.c, za31Var.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        mi31 mi31Var = this.c;
        return c + (mi31Var == null ? 0 : mi31Var.hashCode());
    }

    public final String toString() {
        return "VerticalDescription(vertical=" + this.a + ", verticalTariffs=" + this.b + ", selected=" + this.c + Extension.C_BRAKE;
    }
}
