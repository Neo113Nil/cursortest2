package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class tap0 {
    public final FormattedText a;
    public final FormattedText b;
    public final List c;
    public final FormattedText d;

    public tap0(FormattedText formattedText, FormattedText formattedText2, List list, FormattedText formattedText3) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = list;
        this.d = formattedText3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tap0)) {
            return false;
        }
        tap0 tap0Var = (tap0) obj;
        return jl40.l(this.a, tap0Var.a) && jl40.l(this.b, tap0Var.b) && this.c.equals(tap0Var.c) && jl40.l(this.d, tap0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        return this.d.a.hashCode() + unr0.c((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder r = n.r("ScootersZonesLegendScreen(title=", this.a, ", description=", this.b, ", zones=");
        r.append(this.c);
        r.append(", button=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
