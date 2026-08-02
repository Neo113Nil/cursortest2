package defpackage;

import com.yandex.go.address.models.Address;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class zu1 implements ex1 {
    public final pex0 a;
    public final Address b;

    public zu1(pex0 pex0Var, Address address) {
        this.a = pex0Var;
        this.b = address;
    }

    @Override // defpackage.ex1
    public final pex0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu1)) {
            return false;
        }
        zu1 zu1Var = (zu1) obj;
        return jl40.l(this.a, zu1Var.a) && jl40.l(this.b, zu1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AltPinAOption(tariff=" + this.a + ", alternativeAddress=" + this.b + Extension.C_BRAKE;
    }
}
