package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class y3m0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Boolean g;

    public y3m0(String str, String str2, boolean z, String str3, String str4, String str5, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3m0)) {
            return false;
        }
        y3m0 y3m0Var = (y3m0) obj;
        return jl40.l(this.a, y3m0Var.a) && jl40.l(this.b, y3m0Var.b) && this.c == y3m0Var.c && jl40.l(this.d, y3m0Var.d) && jl40.l(this.e, y3m0Var.e) && jl40.l(this.f, y3m0Var.f) && jl40.l(this.g, y3m0Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int e = unr0.e((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        String str3 = this.d;
        int hashCode2 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.g;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SavingsAccountCloseState(title=", this.a, ", subtitle=", this.b, ", closingInProgress=");
        unr0.A(", imageUrl=", this.d, ", actionButtonTitle=", v, this.c);
        g8e.D(v, this.e, ", secondaryButtonTitle=", this.f, ", showSecondary=");
        return nzs.d(v, this.g, Extension.C_BRAKE);
    }
}
