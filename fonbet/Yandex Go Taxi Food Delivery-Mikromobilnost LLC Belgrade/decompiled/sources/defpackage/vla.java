package defpackage;

import com.yandex.go.deeplinks.generated.chargers.ChargersPaymentMethodsSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vla {
    public final ChargersPaymentMethodsSection a;

    public vla(ChargersPaymentMethodsSection chargersPaymentMethodsSection) {
        this.a = chargersPaymentMethodsSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vla) && this.a == ((vla) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChargersPaymentMethodsDeeplink(section=" + this.a + Extension.C_BRAKE;
    }
}
