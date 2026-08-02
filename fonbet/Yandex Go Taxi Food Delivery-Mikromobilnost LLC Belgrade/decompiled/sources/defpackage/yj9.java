package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yj9 {
    public final String a;
    public final String b;
    public final xoj c;

    public yj9(xoj xojVar, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = xojVar;
    }

    public static yj9 a(yj9 yj9Var, String str) {
        String str2 = yj9Var.b;
        xoj xojVar = yj9Var.c;
        yj9Var.getClass();
        return new yj9(xojVar, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj9)) {
            return false;
        }
        yj9 yj9Var = (yj9) obj;
        return jl40.l(this.a, yj9Var.a) && jl40.l(this.b, yj9Var.b) && jl40.l(this.c, yj9Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        xoj xojVar = this.c;
        return hashCode2 + (xojVar != null ? xojVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ChargersActivateDiscount(promocodeName=", this.a, ", offerId=", this.b, ", station=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
