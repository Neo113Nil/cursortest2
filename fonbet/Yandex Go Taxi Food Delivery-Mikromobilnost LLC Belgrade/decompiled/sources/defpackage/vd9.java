package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vd9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public vd9(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd9)) {
            return false;
        }
        vd9 vd9Var = (vd9) obj;
        return jl40.l(this.a, vd9Var.a) && jl40.l(this.b, vd9Var.b) && jl40.l(this.c, vd9Var.c) && jl40.l(this.d, vd9Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("Content(title=", this.a, ", subtitle=", this.b, ", buttonText="), this.c, ", iconTag=", this.d, Extension.C_BRAKE);
    }
}
