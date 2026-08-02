package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ssh extends lth {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ssh(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof ssh)) {
            return false;
        }
        ssh sshVar = (ssh) obj;
        return jl40.l(this.a, sshVar.a) && jl40.l(this.b, sshVar.b) && jl40.l(this.c, sshVar.c) && jl40.l(this.d, sshVar.d) && jl40.l(this.e, sshVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("AiPostcardGenerated(type=", this.a, ", deliveryId=", this.b, ", requestId=");
        g8e.D(v, this.c, ", generationId=", this.d, ", resultUrl=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
