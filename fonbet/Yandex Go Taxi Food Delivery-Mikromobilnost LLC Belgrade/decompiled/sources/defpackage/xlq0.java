package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xlq0 {
    public final Object a;
    public final boolean b;
    public final FormattedText c;
    public final FormattedText d;
    public final String e;
    public final FormattedText f;
    public final FormattedText g;
    public final r9x0 h;

    public xlq0(Object obj, boolean z, FormattedText formattedText, FormattedText formattedText2, String str, FormattedText formattedText3, FormattedText formattedText4, r9x0 r9x0Var) {
        this.a = obj;
        this.b = z;
        this.c = formattedText;
        this.d = formattedText2;
        this.e = str;
        this.f = formattedText3;
        this.g = formattedText4;
        this.h = r9x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlq0)) {
            return false;
        }
        xlq0 xlq0Var = (xlq0) obj;
        return jl40.l(this.a, xlq0Var.a) && this.b == xlq0Var.b && this.c.equals(xlq0Var.c) && jl40.l(this.d, xlq0Var.d) && jl40.l(this.e, xlq0Var.e) && jl40.l(this.f, xlq0Var.f) && jl40.l(this.g, xlq0Var.g) && jl40.l(this.h, xlq0Var.h);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c.a);
        FormattedText formattedText = this.d;
        int hashCode = (c + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        FormattedText formattedText2 = this.f;
        int hashCode3 = (hashCode2 + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        FormattedText formattedText3 = this.g;
        int hashCode4 = (hashCode3 + (formattedText3 == null ? 0 : formattedText3.a.hashCode())) * 31;
        r9x0 r9x0Var = this.h;
        return hashCode4 + (r9x0Var != null ? r9x0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Option(value=" + this.a + ", isAvailable=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", imageTag=" + this.e + ", bottomText=" + this.f + ", bottomSubtitle=" + this.g + ", action=" + this.h + Extension.C_BRAKE;
    }
}
