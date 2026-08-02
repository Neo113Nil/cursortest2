package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class r37 extends s4z0 {
    public final FormattedText a;
    public final hhg b;
    public final o37 c;
    public final String d;

    public r37(FormattedText formattedText, hhg hhgVar, o37 o37Var, String str) {
        this.a = formattedText;
        this.b = hhgVar;
        this.c = o37Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r37)) {
            return false;
        }
        r37 r37Var = (r37) obj;
        return this.a.equals(r37Var.a) && this.b.equals(r37Var.b) && jl40.l(this.c, r37Var.c) && jl40.l(this.d, r37Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        o37 o37Var = this.c;
        int hashCode2 = (hashCode + (o37Var == null ? 0 : o37Var.hashCode())) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ButtonTileFooterModel(title=" + this.a + ", action=" + this.b + ", buttonStyleModel=" + this.c + ", metricaLabel=" + this.d + Extension.C_BRAKE;
    }
}
