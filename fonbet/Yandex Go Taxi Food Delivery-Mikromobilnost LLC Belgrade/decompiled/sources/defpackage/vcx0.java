package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vcx0 {
    public final nvi0 a;
    public final boolean b;
    public final String c;

    public vcx0(pvi0 pvi0Var, boolean z, String str) {
        this.a = pvi0Var;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcx0)) {
            return false;
        }
        vcx0 vcx0Var = (vcx0) obj;
        return jl40.l(this.a, vcx0Var.a) && this.b == vcx0Var.b && jl40.l(this.c, vcx0Var.c);
    }

    public final int hashCode() {
        nvi0 nvi0Var = this.a;
        int e = unr0.e((nvi0Var == null ? 0 : nvi0Var.hashCode()) * 31, 31, this.b);
        String str = this.c;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffCardLeadState(leadImage=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", plusValue=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
