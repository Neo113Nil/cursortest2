package defpackage;

import java.math.BigDecimal;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class tf51 {
    public final BigDecimal a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    static {
        new tf51(BigDecimal.ZERO, "", "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tf51(BigDecimal bigDecimal, String str, String str2) {
        this(bigDecimal, str, str2, r5, r6);
        String c;
        Locale locale = tm60.a;
        String f = tm60.f(str);
        c = tm60.c(bigDecimal, str, false, Locale.getDefault(), false, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf51)) {
            return false;
        }
        tf51 tf51Var = (tf51) obj;
        return jl40.l(this.a, tf51Var.a) && jl40.l(this.b, tf51Var.b) && jl40.l(this.c, tf51Var.c) && jl40.l(this.d, tf51Var.d) && jl40.l(this.e, tf51Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YBMoney(amount=");
        sb.append(this.a);
        sb.append(", currency=");
        sb.append(this.b);
        sb.append(", formattedAmount=");
        g8e.D(sb, this.c, ", currencySymbol=", this.d, ", formattedAmountWithoutCurrency=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public tf51(BigDecimal bigDecimal, String str, String str2, String str3, String str4) {
        this.a = bigDecimal;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
