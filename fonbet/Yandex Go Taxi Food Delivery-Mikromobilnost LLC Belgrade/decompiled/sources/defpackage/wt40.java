package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class wt40 {
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final FormattedText d;

    public wt40(String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = str;
        this.d = formattedText3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt40)) {
            return false;
        }
        wt40 wt40Var = (wt40) obj;
        return jl40.l(this.a, wt40Var.a) && jl40.l(this.b, wt40Var.b) && jl40.l(this.c, wt40Var.c) && jl40.l(this.d, wt40Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        String str = this.c;
        return this.d.a.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = n.r("MultimodalRouteOnboardingScreenConfig(title=", this.a, ", subtitle=", this.b, ", imageTag=");
        r.append(this.c);
        r.append(", buttonText=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
