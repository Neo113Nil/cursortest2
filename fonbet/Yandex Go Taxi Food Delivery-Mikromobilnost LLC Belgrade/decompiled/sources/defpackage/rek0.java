package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rek0 {
    public final CharSequence a;
    public final CharSequence b;

    public rek0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rek0)) {
            return false;
        }
        rek0 rek0Var = (rek0) obj;
        return jl40.l(this.a, rek0Var.a) && jl40.l(this.b, rek0Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        return hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "RideCardCompanionItemBody(title=", ", subtitle=", Extension.C_BRAKE);
    }
}
