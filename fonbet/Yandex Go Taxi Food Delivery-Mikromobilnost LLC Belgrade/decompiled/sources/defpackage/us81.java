package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class us81 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public us81(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us81)) {
            return false;
        }
        us81 us81Var = (us81) obj;
        return jl40.l(this.a, us81Var.a) && jl40.l(this.b, us81Var.b) && jl40.l(this.c, us81Var.c) && jl40.l(this.d, us81Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("BackgroundColors(top=", this.a, ", right=", this.b, ", left="), this.c, ", bottom=", this.d, Extension.C_BRAKE);
    }
}
