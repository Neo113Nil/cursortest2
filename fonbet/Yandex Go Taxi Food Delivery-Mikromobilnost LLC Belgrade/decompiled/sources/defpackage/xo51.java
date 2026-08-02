package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xo51 implements mo51 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public xo51(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo51)) {
            return false;
        }
        xo51 xo51Var = (xo51) obj;
        return jl40.l(this.a, xo51Var.a) && jl40.l(this.b, xo51Var.b) && jl40.l(this.c, xo51Var.c) && jl40.l(this.d, xo51Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return g8e.r(b64.v("YangoPaySimpleIntegrationPaymentInfoWrapper(paymentMethodId=", this.a, ", title=", this.b, ", imageTag="), this.c, ", subtitle=", this.d, Extension.C_BRAKE);
    }
}
