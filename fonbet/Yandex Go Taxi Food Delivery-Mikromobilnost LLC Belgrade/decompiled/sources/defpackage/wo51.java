package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class wo51 extends jo51 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public wo51(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // defpackage.lea0
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo51)) {
            return false;
        }
        wo51 wo51Var = (wo51) obj;
        if (!jl40.l(this.a, wo51Var.a)) {
            return false;
        }
        String str = wo51Var.b;
        String str2 = this.b;
        if (str2 == null) {
            if (str == null) {
                l = true;
            }
            l = false;
        } else {
            if (str != null) {
                l = jl40.l(str2, str);
            }
            l = false;
        }
        return l && jl40.l(this.c, wo51Var.c) && jl40.l(this.d, wo51Var.d) && jl40.l(this.e, wo51Var.e);
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return this.e.hashCode() + ((b + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.b;
        StringBuilder v = b64.v("YangoPaySimpleIntegrationPayment(id=", this.a, ", disabled=", str == null ? "null" : of91.e(str), ", title=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", imageTag=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
