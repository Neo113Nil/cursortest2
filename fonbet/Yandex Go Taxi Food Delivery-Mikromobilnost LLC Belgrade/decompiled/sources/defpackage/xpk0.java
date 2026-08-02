package defpackage;

import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xpk0 {
    public final dqk0 a;
    public final String b;
    public final Calendar c;
    public final String d;
    public final String e;

    public xpk0(dqk0 dqk0Var, String str, Calendar calendar, String str2, String str3) {
        this.a = dqk0Var;
        this.b = str;
        this.c = calendar;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpk0)) {
            return false;
        }
        xpk0 xpk0Var = (xpk0) obj;
        return this.a.equals(xpk0Var.a) && jl40.l(this.b, xpk0Var.b) && jl40.l(this.c, xpk0Var.c) && jl40.l(this.d, xpk0Var.d) && jl40.l(this.e, xpk0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d);
        String str2 = this.e;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RideHistoryOrder(orderId=");
        sb.append(this.a);
        sb.append(", driverPhone=");
        sb.append(this.b);
        sb.append(", orderDate=");
        sb.append(this.c);
        sb.append(", sourcePoint=");
        sb.append(this.d);
        sb.append(", finalDestinationPoint=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
