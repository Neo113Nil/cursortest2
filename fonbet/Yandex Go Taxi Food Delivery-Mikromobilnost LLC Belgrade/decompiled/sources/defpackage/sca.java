package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class sca {
    public static final sca e;
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;

    static {
        FormattedText formattedText = FormattedText.c;
        e = new sca("", formattedText, formattedText, formattedText);
    }

    public sca(String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
        this.a = str;
        this.b = formattedText;
        this.c = formattedText2;
        this.d = formattedText3;
    }

    public final String a() {
        return this.a;
    }

    public final FormattedText b() {
        return this.d;
    }

    public final FormattedText c() {
        return this.c;
    }

    public final FormattedText d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sca)) {
            return false;
        }
        sca scaVar = (sca) obj;
        return jl40.l(this.a, scaVar.a) && jl40.l(this.b, scaVar.b) && jl40.l(this.c, scaVar.c) && jl40.l(this.d, scaVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c.a);
    }

    public final String toString() {
        StringBuilder q = xvz.q("ChargersOrderMultiOrder(iconTag=", this.a, ", title=", ", subtitle=", this.b);
        q.append(this.c);
        q.append(", powerBankShortNumber=");
        q.append(this.d);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
