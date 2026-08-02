package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wi30 implements yi30 {
    public final String a;
    public final String b;
    public final String c;
    public final Object d;

    public wi30(String str, String str2, String str3, Object obj) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi30)) {
            return false;
        }
        wi30 wi30Var = (wi30) obj;
        return jl40.l(this.a, wi30Var.a) && jl40.l(this.b, wi30Var.b) && jl40.l(this.c, wi30Var.c) && jl40.l(this.d, wi30Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.d;
        return hashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return tse0.l(b64.v("RetryCheckout(startingStopId=", this.a, ", destinationStopId=", this.b, ", directionId="), this.c, ", metaCheckoutInfo=", this.d, Extension.C_BRAKE);
    }

    public wi30() {
        this(null, null, null, null);
    }
}
