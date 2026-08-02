package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tzz {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;

    public tzz(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzz)) {
            return false;
        }
        tzz tzzVar = (tzz) obj;
        return jl40.l(this.a, tzzVar.a) && jl40.l(this.b, tzzVar.b) && jl40.l(this.c, tzzVar.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.c;
        return hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public final String toString() {
        return xvz.n(vfc.r(this.a, this.b, "LuggageBubbleModalUiState(title=", ", text=", ", buttonText="), this.c, Extension.C_BRAKE);
    }
}
