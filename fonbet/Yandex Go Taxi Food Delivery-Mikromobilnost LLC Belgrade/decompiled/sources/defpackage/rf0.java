package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class rf0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public rf0(String str, String str2, String str3, String str4, String str5, String str6) {
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
        if (!(obj instanceof rf0)) {
            return false;
        }
        rf0 rf0Var = (rf0) obj;
        return jl40.l(this.a, rf0Var.a) && jl40.l(this.b, rf0Var.b) && jl40.l(this.c, rf0Var.c) && jl40.l(this.d, rf0Var.d) && jl40.l(this.e, rf0Var.e) && jl40.l(this.f, rf0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("AddMemberPageTexts(title=", this.a, ", contactPickPermissionErrorMessage=", this.b, ", nameInputFieldTitle=");
        g8e.D(v, this.c, ", phoneInputFieldTitle=", this.d, ", pickFromContactsItem=");
        return g8e.r(v, this.e, ", inviteButtonTitle=", this.f, Extension.C_BRAKE);
    }
}
