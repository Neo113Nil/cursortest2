package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zma {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;

    public zma(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zma)) {
            return false;
        }
        zma zmaVar = (zma) obj;
        return jl40.l(this.a, zmaVar.a) && jl40.l(this.b, zmaVar.b) && jl40.l(this.c, zmaVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int b = smw0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        return b + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return xvz.n(ly3.t(this.b, "ChargersPopupUiState(iconUrl=", this.a, ", title=", ", body="), this.c, Extension.C_BRAKE);
    }
}
