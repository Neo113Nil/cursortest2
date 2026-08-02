package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class t19 extends lea0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public t19(String str, String str2, String str3, String str4, String str5) {
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

    @Override // defpackage.lea0
    public final PaymentMethod$Type c() {
        return PaymentMethod$Type.CASH_LIKE;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t19)) {
            return false;
        }
        t19 t19Var = (t19) obj;
        if (!jl40.l(this.a, t19Var.a)) {
            return false;
        }
        String str = t19Var.b;
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
        return l && jl40.l(this.c, t19Var.c) && jl40.l(this.d, t19Var.d) && jl40.l(this.e, t19Var.e);
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.c;
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return this.a;
    }

    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        String str = this.b;
        StringBuilder v = b64.v("CashLikePayment(id=", this.a, ", disabled=", str == null ? "null" : of91.e(str), ", name=");
        g8e.D(v, this.c, ", imageTag=", this.d, ", subtitle=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
