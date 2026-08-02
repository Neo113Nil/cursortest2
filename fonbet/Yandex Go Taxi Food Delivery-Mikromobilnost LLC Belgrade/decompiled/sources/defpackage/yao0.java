package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class yao0 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final String e;
    public final String f;
    public final CharSequence g;
    public final CharSequence h;
    public final String i;
    public final String j;

    public yao0(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, String str, String str2, CharSequence charSequence5, CharSequence charSequence6, String str3, String str4) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
        this.e = str;
        this.f = str2;
        this.g = charSequence5;
        this.h = charSequence6;
        this.i = str3;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yao0)) {
            return false;
        }
        yao0 yao0Var = (yao0) obj;
        return jl40.l(this.a, yao0Var.a) && jl40.l(this.b, yao0Var.b) && jl40.l(this.c, yao0Var.c) && jl40.l(this.d, yao0Var.d) && jl40.l(this.e, yao0Var.e) && jl40.l(this.f, yao0Var.f) && jl40.l(this.g, yao0Var.g) && jl40.l(this.h, yao0Var.h) && this.i.equals(yao0Var.i) && this.j.equals(yao0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + unr0.b(smw0.b(smw0.b(unr0.b(unr0.b(smw0.b(smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ScootersPackagesUpsaleOnBookUiState(title=", ", subtitle=", ", price=");
        vfc.A(r, this.c, ", aboutText=", this.d, ", aboutIconTag=");
        g8e.D(r, this.e, ", imageTag=", this.f, ", rejectButtonText=");
        vfc.A(r, this.g, ", confirmButtonText=", this.h, ", legalTermsText=");
        return g8e.r(r, this.i, ", legalTermsLink=", this.j, Extension.C_BRAKE);
    }
}
