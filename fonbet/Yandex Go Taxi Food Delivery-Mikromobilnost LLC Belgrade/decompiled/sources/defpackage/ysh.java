package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ysh extends lth {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;

    public ysh(String str, String str2, String str3, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysh)) {
            return false;
        }
        ysh yshVar = (ysh) obj;
        return jl40.l(this.a, yshVar.a) && jl40.l(this.b, yshVar.b) && jl40.l(this.c, yshVar.c) && jl40.l(this.d, yshVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderCreateFailed(type=", this.a, ", deliveryId=", this.b, ", failureDescription=");
        v.append(this.c);
        v.append(", revision=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
