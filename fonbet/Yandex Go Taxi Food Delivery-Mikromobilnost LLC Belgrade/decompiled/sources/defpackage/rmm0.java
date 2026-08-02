package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rmm0 {
    public final FormattedText a;
    public final String b;
    public final String c;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public rmm0(FormattedText formattedText, String str, String str2) {
        this.a = formattedText;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmm0)) {
            return false;
        }
        rmm0 rmm0Var = (rmm0) obj;
        return this.a.equals(rmm0Var.a) && jl40.l(this.b, rmm0Var.b) && jl40.l(this.c, rmm0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScenarioSelectorButtonModel(text=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
