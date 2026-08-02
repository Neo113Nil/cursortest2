package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class r1p0 {
    public final CharSequence a;
    public final CharSequence b;

    public r1p0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1p0)) {
            return false;
        }
        r1p0 r1p0Var = (r1p0) obj;
        return jl40.l(this.a, r1p0Var.a) && this.b.equals(r1p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "Title(primaryText=", ", secondaryText=", Extension.C_BRAKE);
    }
}
