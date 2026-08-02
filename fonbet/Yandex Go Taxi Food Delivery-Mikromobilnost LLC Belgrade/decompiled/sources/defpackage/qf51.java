package defpackage;

import java.util.Date;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class qf51 {
    public final Date a;
    public final tf51 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public qf51(Date date, tf51 tf51Var, String str, String str2, String str3, String str4, String str5) {
        this.a = date;
        this.b = tf51Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf51)) {
            return false;
        }
        qf51 qf51Var = (qf51) obj;
        return this.a.equals(qf51Var.a) && this.b.equals(qf51Var.b) && jl40.l(this.c, qf51Var.c) && jl40.l(this.d, qf51Var.d) && jl40.l(this.e, qf51Var.e) && jl40.l(this.f, qf51Var.f) && jl40.l(this.g, qf51Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YBCreditLimitSplitMatchingData(purchaseTimestamp=");
        sb.append(this.a);
        sb.append(", purchaseSum=");
        sb.append(this.b);
        sb.append(", cardId=");
        g8e.D(sb, this.c, ", merchantId=", this.d, ", externalId=");
        g8e.D(sb, this.e, ", orderId=", this.f, ", splitId=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
