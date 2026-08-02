package defpackage;

import com.yandex.go.chargers.passes.data.ChargersPassesOfferResponseScreenDto$Offer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uga implements vga {
    public final ChargersPassesOfferResponseScreenDto$Offer a;
    public final hfa0 b;

    public uga(ChargersPassesOfferResponseScreenDto$Offer chargersPassesOfferResponseScreenDto$Offer, hfa0 hfa0Var) {
        this.a = chargersPassesOfferResponseScreenDto$Offer;
        this.b = hfa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uga)) {
            return false;
        }
        uga ugaVar = (uga) obj;
        return jl40.l(this.a, ugaVar.a) && this.b.equals(ugaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(screen=" + this.a + ", paymentOptions=" + this.b + Extension.C_BRAKE;
    }
}
