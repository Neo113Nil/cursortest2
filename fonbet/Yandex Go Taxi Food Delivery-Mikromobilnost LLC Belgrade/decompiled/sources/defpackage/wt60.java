package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wt60 {
    public final is60 a;
    public final String b;
    public final String c;

    public wt60(is60 is60Var, String str, String str2) {
        this.a = is60Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt60)) {
            return false;
        }
        wt60 wt60Var = (wt60) obj;
        return jl40.l(this.a, wt60Var.a) && jl40.l(this.b, wt60Var.b) && jl40.l(this.c, wt60Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferWithTariffInfo(offer=");
        sb.append(this.a);
        sb.append(", tariffClass=");
        sb.append(this.b);
        sb.append(", altType=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
