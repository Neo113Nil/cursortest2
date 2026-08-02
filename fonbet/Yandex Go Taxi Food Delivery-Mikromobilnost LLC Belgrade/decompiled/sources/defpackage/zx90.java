package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zx90 {
    public final List a;

    public zx90(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zx90) && jl40.l(this.a, ((zx90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("PaymentClickPayload(availablePaymentTypes=", Extension.C_BRAKE, this.a);
    }
}
