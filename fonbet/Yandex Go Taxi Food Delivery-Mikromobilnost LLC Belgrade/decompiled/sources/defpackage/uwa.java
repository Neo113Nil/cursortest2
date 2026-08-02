package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uwa {
    public final CharSequence a;
    public final CharSequence b;

    public uwa(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwa)) {
            return false;
        }
        uwa uwaVar = (uwa) obj;
        return jl40.l(this.a, uwaVar.a) && jl40.l(this.b, uwaVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "ChargersTariffDetailHeader(title=", ", value=", Extension.C_BRAKE);
    }
}
