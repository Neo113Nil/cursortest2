package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class wva {
    public final String a;
    public final FormattedText b;
    public final FormattedText c;

    public wva(String str, FormattedText formattedText, FormattedText formattedText2) {
        this.a = str;
        this.b = formattedText;
        this.c = formattedText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wva)) {
            return false;
        }
        wva wvaVar = (wva) obj;
        return jl40.l(this.a, wvaVar.a) && jl40.l(this.b, wvaVar.b) && jl40.l(this.c, wvaVar.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b.a);
        FormattedText formattedText = this.c;
        return c + (formattedText == null ? 0 : formattedText.a.hashCode());
    }

    public final String toString() {
        return tse0.m(xvz.q("ChargersSurgeInfoItem(imageTag=", this.a, ", title=", ", subtitle=", this.b), this.c, Extension.C_BRAKE);
    }
}
