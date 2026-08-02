package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s8q0 {
    public final CharSequence a;
    public final CharSequence b;

    public s8q0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8q0)) {
            return false;
        }
        s8q0 s8q0Var = (s8q0) obj;
        return jl40.l(this.a, s8q0Var.a) && jl40.l(this.b, s8q0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "SegmentTextState(title=", ", subtitle=", Extension.C_BRAKE);
    }
}
