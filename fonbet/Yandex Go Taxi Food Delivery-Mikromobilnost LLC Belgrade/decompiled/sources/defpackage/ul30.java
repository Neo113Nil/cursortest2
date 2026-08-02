package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ul30 extends yl30 {
    public final List a;

    public ul30(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ul30) && this.a.equals(((ul30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("MtGeoPaymentVehiclesLoadingState(loadingItems=", Extension.C_BRAKE, this.a);
    }
}
