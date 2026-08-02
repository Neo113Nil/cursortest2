package defpackage;

import com.yandex.go.chargers.offer.ChargersOfferOpenReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class s7a {
    public final tsa a;
    public final ChargersOfferOpenReason b;
    public final String c;

    public s7a(tsa tsaVar, ChargersOfferOpenReason chargersOfferOpenReason, String str) {
        this.a = tsaVar;
        this.b = chargersOfferOpenReason;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7a)) {
            return false;
        }
        s7a s7aVar = (s7a) obj;
        return jl40.l(this.a, s7aVar.a) && this.b == s7aVar.b && jl40.l(this.c, s7aVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Payload(stationNumber=");
        sb.append(this.a);
        sb.append(", openReason=");
        sb.append(this.b);
        sb.append(", deeplinkValue=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
