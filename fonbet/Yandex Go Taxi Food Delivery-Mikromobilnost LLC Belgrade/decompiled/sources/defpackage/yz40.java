package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yz40 {
    public final lx40 a;
    public final dtr0 b;
    public final int c;

    public yz40(lx40 lx40Var, dtr0 dtr0Var, int i) {
        this.a = lx40Var;
        this.b = dtr0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz40)) {
            return false;
        }
        yz40 yz40Var = (yz40) obj;
        return jl40.l(this.a, yz40Var.a) && jl40.l(this.b, yz40Var.b) && this.c == yz40Var.c;
    }

    public final int hashCode() {
        lx40 lx40Var = this.a;
        int hashCode = (lx40Var == null ? 0 : lx40Var.hashCode()) * 31;
        dtr0 dtr0Var = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (dtr0Var != null ? Integer.hashCode(dtr0Var.a) : 0)) * 31);
    }

    public final String toString() {
        String a = dtr0.a(this.c);
        StringBuilder sb = new StringBuilder("MutableVerticalSummaryAnchor(mutable=");
        sb.append(this.a);
        sb.append(", nullable=");
        sb.append(this.b);
        sb.append(", required=");
        return oyr.t(sb, a, Extension.C_BRAKE);
    }
}
