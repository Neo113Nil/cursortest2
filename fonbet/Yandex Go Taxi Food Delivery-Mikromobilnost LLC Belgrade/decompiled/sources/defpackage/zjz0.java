package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zjz0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public zjz0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjz0)) {
            return false;
        }
        zjz0 zjz0Var = (zjz0) obj;
        return this.a.equals(zjz0Var.a) && jl40.l(this.b, zjz0Var.b) && this.c.equals(zjz0Var.c) && this.d.equals(zjz0Var.d) && this.e.equals(zjz0Var.e) && jl40.l(this.f, zjz0Var.f) && jl40.l(this.g, zjz0Var.g) && jl40.l(this.h, zjz0Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b(unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str2 = this.f;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Toggle(title=", this.a, ", summarySubtitle=", this.b, ", multipointsDisabledSubtitle=");
        g8e.D(v, this.c, ", prohibitedPaymentMethodSubtitle=", this.d, ", prohibitedAlternativeSubtitle=");
        g8e.D(v, this.e, ", leadImageTag=", this.f, ", contactsTrailImageTag=");
        return g8e.r(v, this.g, ", summaryTrailImageTag=", this.h, Extension.C_BRAKE);
    }
}
