package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tsh extends lth {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public tsh(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsh)) {
            return false;
        }
        tsh tshVar = (tsh) obj;
        return jl40.l(this.a, tshVar.a) && jl40.l(this.b, tshVar.b) && jl40.l(this.c, tshVar.c) && jl40.l(this.d, tshVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("AiPostcardRequested(type=", this.a, ", deliveryId=", this.b, ", requestId="), this.c, ", generationId=", this.d, Extension.C_BRAKE);
    }
}
