package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vl30 extends zl30 {
    public final List a;

    public vl30(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vl30) && this.a.equals(((vl30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("MtGeoPaymentVehiclesLoadingState(loadingItems=", Extension.C_BRAKE, this.a);
    }
}
