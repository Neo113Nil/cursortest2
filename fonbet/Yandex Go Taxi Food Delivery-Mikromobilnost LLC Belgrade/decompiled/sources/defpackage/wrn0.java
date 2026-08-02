package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wrn0 {
    public final boolean a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final String e;

    public wrn0(CharSequence charSequence, CharSequence charSequence2, String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrn0)) {
            return false;
        }
        wrn0 wrn0Var = (wrn0) obj;
        return this.a == wrn0Var.a && jl40.l(this.b, wrn0Var.b) && jl40.l(this.c, wrn0Var.c) && jl40.l(this.d, wrn0Var.d) && jl40.l(this.e, wrn0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + smw0.b(smw0.b(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = ly3.v("StartEntryPoint(enabled=", ", iconTag=", this.b, ", title=", this.a);
        vfc.A(v, this.c, ", subtitle=", this.d, ", promotionId=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
