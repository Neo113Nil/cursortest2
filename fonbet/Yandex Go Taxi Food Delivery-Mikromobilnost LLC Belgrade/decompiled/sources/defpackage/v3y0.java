package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class v3y0 {
    public final ZoneAddress a;
    public final Address b;
    public final String c;

    public v3y0(ZoneAddress zoneAddress, Address address, String str) {
        this.a = zoneAddress;
        this.b = address;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v3y0) {
            v3y0 v3y0Var = (v3y0) obj;
            if (this.a == v3y0Var.a && this.b.equals(v3y0Var.b) && jl40.l(this.c, v3y0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxiOrderPayload(taxiSrcAddress=");
        sb.append(this.a);
        sb.append(", taxiDestAddress=");
        sb.append(this.b);
        sb.append(", mmOfferId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
