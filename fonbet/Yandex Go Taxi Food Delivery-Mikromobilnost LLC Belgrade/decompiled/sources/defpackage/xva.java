package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xva {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;

    public xva(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xva)) {
            return false;
        }
        xva xvaVar = (xva) obj;
        return jl40.l(this.a, xvaVar.a) && jl40.l(this.b, xvaVar.b) && jl40.l(this.c, xvaVar.c);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        return b + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return xvz.n(ly3.t(this.b, "ChargersSurgeInfoItemUiState(icon=", this.a, ", title=", ", subtitle="), this.c, Extension.C_BRAKE);
    }
}
