package defpackage;

import com.ybsdk.feature.qr.payments.api.data.ProductType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yj1 {
    public final String a;
    public final ProductType b;
    public final String c;
    public final String d;

    public yj1(String str, ProductType productType, String str2, String str3) {
        this.a = str;
        this.b = productType;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj1)) {
            return false;
        }
        yj1 yj1Var = (yj1) obj;
        return jl40.l(this.a, yj1Var.a) && this.b == yj1Var.b && jl40.l(this.c, yj1Var.c) && jl40.l(this.d, yj1Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AgreementIdEntity(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", autopaymentId=");
        return g8e.r(sb, this.c, ", memberId=", this.d, Extension.C_BRAKE);
    }
}
