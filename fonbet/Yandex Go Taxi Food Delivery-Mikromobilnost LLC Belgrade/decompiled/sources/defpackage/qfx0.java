package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class qfx0 {
    public final vdu a;
    public final List b;

    public qfx0(vdu vduVar, List list) {
        this.a = vduVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfx0)) {
            return false;
        }
        qfx0 qfx0Var = (qfx0) obj;
        return this.a.equals(qfx0Var.a) && this.b.equals(qfx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TariffDetailsUiState(headerUiState=" + this.a + ", brandingFeaturesUiState=" + this.b + Extension.C_BRAKE;
    }
}
