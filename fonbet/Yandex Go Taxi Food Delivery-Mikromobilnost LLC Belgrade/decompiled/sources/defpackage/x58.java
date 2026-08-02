package defpackage;

import com.yandex.go.address.models.Address;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x58 implements a68 {
    public final String a;
    public final String b;
    public final Address c;
    public final String d;
    public final String e;

    public x58(String str, String str2, Address address, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = address;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x58)) {
            return false;
        }
        x58 x58Var = (x58) obj;
        return jl40.l(this.a, x58Var.a) && jl40.l(this.b, x58Var.b) && jl40.l(this.c, x58Var.c) && jl40.l(this.d, x58Var.d) && jl40.l(this.e, x58Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.c.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Content(title=", this.a, ", distance=", this.b, ", address=");
        v.append(this.c);
        v.append(", timeDescription=");
        v.append(this.d);
        v.append(", paymentDescription=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
