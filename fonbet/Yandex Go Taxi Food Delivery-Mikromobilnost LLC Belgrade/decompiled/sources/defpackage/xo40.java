package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xo40 {
    public final int a;
    public final l8v b;
    public final List c;
    public final List d;
    public final ArrayList e;

    public xo40(int i, l8v l8vVar, List list, List list2, ArrayList arrayList) {
        this.a = i;
        this.b = l8vVar;
        this.c = list;
        this.d = list2;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo40)) {
            return false;
        }
        xo40 xo40Var = (xo40) obj;
        return this.a == xo40Var.a && jl40.l(this.b, xo40Var.b) && this.c.equals(xo40Var.c) && this.d.equals(xo40Var.d) && this.e.equals(xo40Var.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        l8v l8vVar = this.b;
        return this.e.hashCode() + unr0.c(unr0.c((hashCode + (l8vVar == null ? 0 : l8vVar.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MulticlassMapUiState(backgroundMapRes=");
        sb.append(this.a);
        sb.append(", pinImage=");
        sb.append(this.b);
        sb.append(", foregroundRoutes=");
        nnm.w(sb, this.c, ", backgroundRoutes=", this.d, ", cars=");
        return b64.n(Extension.C_BRAKE, sb, this.e);
    }
}
