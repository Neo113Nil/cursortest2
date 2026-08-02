package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class tv51 {
    public final String a;
    public final String b;
    public final Object c;
    public final boolean d;
    public final String e;

    public tv51(String str, String str2, Object obj, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv51)) {
            return false;
        }
        tv51 tv51Var = (tv51) obj;
        return jl40.l(this.a, tv51Var.a) && jl40.l(this.b, tv51Var.b) && this.c.equals(tv51Var.c) && this.d == tv51Var.d && jl40.l(this.e, tv51Var.e);
    }

    public final int hashCode() {
        int e = unr0.e(smw0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("YbSdkPaymentMethodAction(title=", this.a, ", contentDescription=", this.b, ", intent=");
        v.append(this.c);
        v.append(", isPromoAction=");
        v.append(this.d);
        v.append(", deeplink=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
