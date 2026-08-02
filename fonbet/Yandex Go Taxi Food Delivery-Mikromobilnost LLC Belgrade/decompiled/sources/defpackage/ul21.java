package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ul21 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public ul21(boolean z, boolean z2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul21)) {
            return false;
        }
        ul21 ul21Var = (ul21) obj;
        return jl40.l(this.a, ul21Var.a) && jl40.l(this.b, ul21Var.b) && this.c == ul21Var.c && this.d == ul21Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return smw0.k(", isEnabled=", Extension.C_BRAKE, b64.v("UserEmailState(title=", this.a, ", subtitle=", this.b, ", higlight="), this.c, this.d);
    }
}
