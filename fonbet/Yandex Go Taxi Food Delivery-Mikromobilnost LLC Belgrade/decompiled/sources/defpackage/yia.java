package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yia implements bja {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;

    public yia(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yia)) {
            return false;
        }
        yia yiaVar = (yia) obj;
        return jl40.l(this.a, yiaVar.a) && jl40.l(this.b, yiaVar.b) && jl40.l(this.c, yiaVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return this.c.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        return xvz.n(vfc.r(this.a, this.b, "Fail(title=", ", subtitle=", ", buttonText="), this.c, Extension.C_BRAKE);
    }
}
