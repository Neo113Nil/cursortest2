package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xfb0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public xfb0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfb0)) {
            return false;
        }
        xfb0 xfb0Var = (xfb0) obj;
        return this.a.equals(xfb0Var.a) && this.b.equals(xfb0Var.b) && jl40.l(this.c, xfb0Var.c) && jl40.l(this.d, xfb0Var.d) && jl40.l(this.e, xfb0Var.e) && jl40.l(this.f, xfb0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PhoneSelectionScreenConfig(readContactsPermission=", this.a, ", title=", this.b, ", description=");
        g8e.D(v, this.c, ", userContactName=", this.d, ", emptyContactTitle=");
        return g8e.r(v, this.e, ", emptyContactSubtitle=", this.f, Extension.C_BRAKE);
    }
}
