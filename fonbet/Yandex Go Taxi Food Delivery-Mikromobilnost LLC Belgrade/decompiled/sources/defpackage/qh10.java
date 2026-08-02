package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class qh10 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public qh10(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof qh10)) {
            return false;
        }
        qh10 qh10Var = (qh10) obj;
        return jl40.l(this.a, qh10Var.a) && jl40.l(this.b, qh10Var.b) && jl40.l(this.c, qh10Var.c) && jl40.l(this.d, qh10Var.d) && jl40.l(this.e, qh10Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("MemberListPageTexts(title=", this.a, ", memberYou=", this.b, ", inviteButtonTitle=");
        g8e.D(v, this.c, ", toolbarTrailEditButtonTitle=", this.d, ", toolbarTrailDoneButtonTitle=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
