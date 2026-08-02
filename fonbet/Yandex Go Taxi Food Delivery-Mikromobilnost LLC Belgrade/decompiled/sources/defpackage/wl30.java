package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wl30 extends yl30 {
    public final List a;

    public wl30(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wl30) && jl40.l(this.a, ((wl30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("MtGeoPaymentVehiclesSuccessState(items=", Extension.C_BRAKE, this.a);
    }
}
