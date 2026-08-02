package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class sj6 {
    public final FormattedText a;
    public final String b;

    public sj6(String str, FormattedText formattedText) {
        this.a = formattedText;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj6)) {
            return false;
        }
        sj6 sj6Var = (sj6) obj;
        return this.a.equals(sj6Var.a) && jl40.l(this.b, sj6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrandingResolvedFormat(text=" + this.a + ", accessibilityText=" + this.b + Extension.C_BRAKE;
    }
}
