package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vwa {
    public final CharSequence a;
    public final CharSequence b;

    public vwa(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwa)) {
            return false;
        }
        vwa vwaVar = (vwa) obj;
        return jl40.l(this.a, vwaVar.a) && jl40.l(this.b, vwaVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "Hint(title=", ", subtitle=", Extension.C_BRAKE);
    }
}
