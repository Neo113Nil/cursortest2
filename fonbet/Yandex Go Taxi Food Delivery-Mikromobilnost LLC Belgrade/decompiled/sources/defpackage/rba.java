package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class rba implements tba {
    public final FormattedText a;
    public final FormattedText b;

    public rba(FormattedText formattedText, FormattedText formattedText2) {
        this.a = formattedText;
        this.b = formattedText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rba)) {
            return false;
        }
        rba rbaVar = (rba) obj;
        return this.a.equals(rbaVar.a) && this.b.equals(rbaVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(title=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }
}
