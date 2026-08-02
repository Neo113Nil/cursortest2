package defpackage;

import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class xxc {
    public final wxc a;
    public final String b;
    public final String c;

    public xxc(wxc wxcVar, String str, String str2) {
        this.a = wxcVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean a() {
        return !b() || evu0.J(this.a.a);
    }

    public final boolean b() {
        return new BigDecimal(this.b).signum() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxc)) {
            return false;
        }
        xxc xxcVar = (xxc) obj;
        return this.a.equals(xxcVar.a) && jl40.l(this.b, xxcVar.b) && jl40.l(this.c, xxcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComplementPaymentInfo(complementPayment=");
        sb.append(this.a);
        sb.append(", balance=");
        sb.append(this.b);
        sb.append(", name=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
