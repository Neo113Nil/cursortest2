package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yxz {
    public final xxz a;

    public yxz(xxz xxzVar) {
        this.a = xxzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxz) && jl40.l(this.a, ((yxz) obj).a);
    }

    public final int hashCode() {
        xxz xxzVar = this.a;
        if (xxzVar == null) {
            return 0;
        }
        return xxzVar.hashCode();
    }

    public final String toString() {
        return "LpEditDestinationInfo(deliveryInterval=" + this.a + Extension.C_BRAKE;
    }
}
