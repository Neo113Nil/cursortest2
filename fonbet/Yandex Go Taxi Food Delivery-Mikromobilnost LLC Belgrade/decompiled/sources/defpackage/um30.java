package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.model.MtCheckoutDeeplinkStatus;

/* loaded from: classes6.dex */
public final class um30 implements bn30 {
    public final String a;
    public final String b;
    public final String c;
    public final pj40 d;
    public final MtCheckoutDeeplinkStatus e;

    public um30(String str, String str2, String str3, pj40 pj40Var, MtCheckoutDeeplinkStatus mtCheckoutDeeplinkStatus) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = pj40Var;
        this.e = mtCheckoutDeeplinkStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um30)) {
            return false;
        }
        um30 um30Var = (um30) obj;
        return jl40.l(this.a, um30Var.a) && jl40.l(this.b, um30Var.b) && jl40.l(this.c, um30Var.c) && this.d.equals(um30Var.d) && this.e == um30Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.d.hashCode() + unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c)) * 31;
        MtCheckoutDeeplinkStatus mtCheckoutDeeplinkStatus = this.e;
        return hashCode2 + (mtCheckoutDeeplinkStatus != null ? mtCheckoutDeeplinkStatus.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Checkout(vehicleId=", this.a, ", qrUrl=", this.b, ", fullDeeplinkUrl=");
        v.append(this.c);
        v.append(", utmParams=");
        v.append(this.d);
        v.append(", deeplinkStatus=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
