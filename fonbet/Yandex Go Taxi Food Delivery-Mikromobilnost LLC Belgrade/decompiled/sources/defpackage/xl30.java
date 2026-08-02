package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xl30 extends zl30 {
    public final ArrayList a;

    public xl30(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xl30) && this.a.equals(((xl30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.q("MtGeoPaymentVehiclesSuccessState(items=", Extension.C_BRAKE, this.a);
    }
}
