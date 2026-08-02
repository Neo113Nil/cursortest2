package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v09 implements pre {
    public final String a;
    public final u09 b;
    public final FormattedText c;
    public final FormattedText d;
    public final FormattedText e;
    public final fws0 f;
    public final r9x0 g;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public v09(String str, u09 u09Var, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, fws0 fws0Var, r9x0 r9x0Var) {
        this.a = str;
        this.b = u09Var;
        this.c = formattedText;
        this.d = formattedText2;
        this.e = formattedText3;
        this.f = fws0Var;
        this.g = r9x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v09)) {
            return false;
        }
        v09 v09Var = (v09) obj;
        return jl40.l(this.a, v09Var.a) && jl40.l(this.b, v09Var.b) && this.c.equals(v09Var.c) && jl40.l(this.d, v09Var.d) && jl40.l(this.e, v09Var.e) && jl40.l(this.f, v09Var.f) && jl40.l(this.g, v09Var.g);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "cart";
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u09 u09Var = this.b;
        int c = unr0.c((hashCode + (u09Var == null ? 0 : u09Var.hashCode())) * 31, 31, this.c.a);
        FormattedText formattedText = this.d;
        int hashCode2 = (c + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        FormattedText formattedText2 = this.e;
        int hashCode3 = (hashCode2 + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        fws0 fws0Var = this.f;
        int hashCode4 = (hashCode3 + (fws0Var == null ? 0 : fws0Var.hashCode())) * 31;
        r9x0 r9x0Var = this.g;
        return hashCode4 + (r9x0Var != null ? r9x0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CartRemoteCoreWidget(id=" + this.a + ", lead=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", description=" + this.e + ", trail=" + this.f + ", action=" + this.g + Extension.C_BRAKE;
    }
}
