package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class trm0 {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;

    public trm0(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trm0)) {
            return false;
        }
        trm0 trm0Var = (trm0) obj;
        return jl40.l(this.a, trm0Var.a) && this.b.equals(trm0Var.b) && jl40.l(this.c, trm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(vfc.r(this.a, this.b, "Item(title=", ", subtitle=", ", leadIconTag="), this.c, Extension.C_BRAKE);
    }
}
