package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rsh extends lth {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public rsh(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsh)) {
            return false;
        }
        rsh rshVar = (rsh) obj;
        return jl40.l(this.a, rshVar.a) && jl40.l(this.b, rshVar.b) && jl40.l(this.c, rshVar.c) && jl40.l(this.d, rshVar.d) && jl40.l(this.e, rshVar.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("AiPostcardFailed(type=", this.a, ", deliveryId=", this.b, ", requestId=");
        g8e.D(v, this.c, ", generationId=", this.d, ", failureReason=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
