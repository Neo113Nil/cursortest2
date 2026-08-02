package defpackage;

import com.yandex.go.loyalty.api.data.model.common.ColorSettings;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class qvz implements ovz {
    public final FormattedText a;
    public final String b;
    public final ColorSettings c;

    public qvz(FormattedText formattedText, String str, ColorSettings colorSettings) {
        this.a = formattedText;
        this.b = str;
        this.c = colorSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvz)) {
            return false;
        }
        qvz qvzVar = (qvz) obj;
        return jl40.l(this.a, qvzVar.a) && jl40.l(this.b, qvzVar.b) && jl40.l(this.c, qvzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LoyaltyProgramSelectorStateButton(text=" + this.a + ", deeplink=" + this.b + ", color=" + this.c + Extension.C_BRAKE;
    }
}
