package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sn extends nr {
    public final String a;
    public final String b;

    public sn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn)) {
            return false;
        }
        sn snVar = (sn) obj;
        return jl40.l(this.a, snVar.a) && jl40.l(this.b, snVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("ActionExtendDeliveryExpirationDate(title=", this.a, ", badgeText=", this.b, Extension.C_BRAKE);
    }
}
