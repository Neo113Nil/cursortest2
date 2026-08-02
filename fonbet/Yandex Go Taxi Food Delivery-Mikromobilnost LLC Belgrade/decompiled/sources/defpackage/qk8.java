package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qk8 {
    public final String a;
    public final boolean b;
    public final b131 c;

    public qk8(String str, boolean z, b131 b131Var) {
        this.a = str;
        this.b = z;
        this.c = b131Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk8)) {
            return false;
        }
        qk8 qk8Var = (qk8) obj;
        return jl40.l(this.a, qk8Var.a) && this.b == qk8Var.b && this.c.equals(qk8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder l = oo31.l("CardNumberField(cardNumber=", oyr.p("CardNumber(value=", this.a, Extension.C_BRAKE), ", showValidationStatus=", ", validationStatus=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
