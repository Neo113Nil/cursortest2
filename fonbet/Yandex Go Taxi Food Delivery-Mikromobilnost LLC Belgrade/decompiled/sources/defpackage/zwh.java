package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zwh {
    public final FormattedText a;
    public final FormattedText b;

    public zwh(FormattedText formattedText, FormattedText formattedText2) {
        this.a = formattedText;
        this.b = formattedText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwh)) {
            return false;
        }
        zwh zwhVar = (zwh) obj;
        return this.a.equals(zwhVar.a) && jl40.l(this.b, zwhVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        return hashCode + (formattedText == null ? 0 : formattedText.a.hashCode());
    }

    public final String toString() {
        return "CancelButtonModel(title=" + this.a + ", price=" + this.b + Extension.C_BRAKE;
    }
}
