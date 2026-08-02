package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uyx0 {
    public final String a;
    public final int b;
    public final List c;

    public uyx0(String str, int i, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyx0)) {
            return false;
        }
        uyx0 uyx0Var = (uyx0) obj;
        return jl40.l(this.a, uyx0Var.a) && this.b == uyx0Var.b && jl40.l(this.c, uyx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return ly3.s(b64.u(this.b, "TaxiOrderChangeDestinationsUiState(title=", this.a, ", initialAddressesHashcode=", ", changedAddresses="), this.c, Extension.C_BRAKE);
    }
}
