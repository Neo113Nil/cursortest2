package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class r8q0 {
    public final FormattedText a;
    public final FormattedText b;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public r8q0(FormattedText formattedText, FormattedText formattedText2) {
        this.a = formattedText;
        this.b = formattedText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8q0)) {
            return false;
        }
        r8q0 r8q0Var = (r8q0) obj;
        return this.a.equals(r8q0Var.a) && jl40.l(this.b, r8q0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        return hashCode + (formattedText == null ? 0 : formattedText.a.hashCode());
    }

    public final String toString() {
        return "SegmentTextModel(title=" + this.a + ", subtitle=" + this.b + Extension.C_BRAKE;
    }
}
