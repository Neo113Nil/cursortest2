package defpackage;

import com.yandex.go.address.models.Address;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uf50 implements xf50 {
    public final String a;
    public final Address b;

    public uf50(Address address, String str) {
        this.a = str;
        this.b = address;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf50)) {
            return false;
        }
        uf50 uf50Var = (uf50) obj;
        return jl40.l(this.a, uf50Var.a) && jl40.l(this.b, uf50Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Address address = this.b;
        return hashCode + (address == null ? 0 : address.hashCode());
    }

    public final String toString() {
        return "FixedSizeDestinationMode(headerTitle=" + this.a + ", initialAddress=" + this.b + Extension.C_BRAKE;
    }
}
