package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xi30 implements yi30 {
    public final jr30 a;
    public final String b;
    public final String c;
    public final String d;

    public xi30(jr30 jr30Var, String str, String str2, String str3) {
        this.a = jr30Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi30)) {
            return false;
        }
        xi30 xi30Var = (xi30) obj;
        return this.a.equals(xi30Var.a) && jl40.l(this.b, xi30Var.b) && jl40.l(this.c, xi30Var.c) && jl40.l(this.d, xi30Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RetryPayment(mtPaymentAction=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", cardsDescription=");
        return g8e.r(sb, this.c, ", noCardsDescription=", this.d, Extension.C_BRAKE);
    }
}
