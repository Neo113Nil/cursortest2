package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class sap0 {
    public final FormattedText a;
    public final rap0 b;

    public sap0(FormattedText formattedText, rap0 rap0Var) {
        this.a = formattedText;
        this.b = rap0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sap0)) {
            return false;
        }
        sap0 sap0Var = (sap0) obj;
        return jl40.l(this.a, sap0Var.a) && this.b.equals(sap0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Zone(name=" + this.a + ", style=" + this.b + Extension.C_BRAKE;
    }
}
