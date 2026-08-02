package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xmi implements hai {
    public final List a;

    public xmi(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmi) && jl40.l(this.a, ((xmi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("DeliveryRequirementsBlockModel(requirements=", Extension.C_BRAKE, this.a);
    }
}
