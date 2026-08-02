package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class us0 {
    public final FormattedText a;
    public final FormattedText b;
    public final String c;

    public us0(FormattedText formattedText, FormattedText formattedText2, String str) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us0)) {
            return false;
        }
        us0 us0Var = (us0) obj;
        return this.a.equals(us0Var.a) && jl40.l(this.b, us0Var.b) && jl40.l(this.c, us0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressDetailsHeader(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
