package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class tzo0 {
    public final CharSequence a;
    public final CharSequence b;

    public tzo0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzo0)) {
            return false;
        }
        tzo0 tzo0Var = (tzo0) obj;
        return jl40.l(this.a, tzo0Var.a) && this.b.equals(tzo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "Button(title=", ", subtitle=", Extension.C_BRAKE);
    }
}
