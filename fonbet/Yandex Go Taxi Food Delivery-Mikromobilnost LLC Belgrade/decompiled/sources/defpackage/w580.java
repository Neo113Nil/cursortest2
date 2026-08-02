package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class w580 {
    public final String a;
    public final String b;
    public final x580 c;

    public w580(String str, String str2, x580 x580Var) {
        this.a = str;
        this.b = str2;
        this.c = x580Var;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w580)) {
            return false;
        }
        w580 w580Var = (w580) obj;
        return jl40.l(this.a, w580Var.a) && jl40.l(this.b, w580Var.b) && this.c.equals(w580Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderSelectorOverrides(orderEtaSubtitle=", this.a, ", orderPickupEtaSubtitle=", this.b, ", tooltip=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
