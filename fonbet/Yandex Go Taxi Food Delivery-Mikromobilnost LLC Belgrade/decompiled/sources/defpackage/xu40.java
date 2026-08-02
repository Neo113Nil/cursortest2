package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xu40 {
    public final String a;
    public final String b;
    public final String c;

    public xu40(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu40)) {
            return false;
        }
        xu40 xu40Var = (xu40) obj;
        return jl40.l(this.a, xu40Var.a) && jl40.l(this.b, xu40Var.b) && jl40.l(this.c, xu40Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(b64.v("MultimodalRoutesOrder(id=", this.a, ", firstMileOrderId=", this.b, ", firstMileType="), this.c, Extension.C_BRAKE);
    }
}
