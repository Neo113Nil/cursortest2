package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;

/* loaded from: classes5.dex */
public final class vx8 {
    public final FormattedText a;
    public final FormattedText b;
    public final ContentAlignment c;
    public final o690 d;
    public final rh4 e;
    public final r9x0 f;
    public final x2s g;

    public vx8(FormattedText formattedText, FormattedText formattedText2, ContentAlignment contentAlignment, o690 o690Var, rh4 rh4Var, r9x0 r9x0Var, x2s x2sVar) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = contentAlignment;
        this.d = o690Var;
        this.e = rh4Var;
        this.f = r9x0Var;
        this.g = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx8)) {
            return false;
        }
        vx8 vx8Var = (vx8) obj;
        return this.a.equals(vx8Var.a) && jl40.l(this.b, vx8Var.b) && this.c == vx8Var.c && jl40.l(this.d, vx8Var.d) && jl40.l(this.e, vx8Var.e) && jl40.l(this.f, vx8Var.f) && this.g.equals(vx8Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31)) * 31;
        o690 o690Var = this.d;
        int hashCode3 = (hashCode2 + (o690Var == null ? 0 : o690Var.hashCode())) * 31;
        rh4 rh4Var = this.e;
        int hashCode4 = (hashCode3 + (rh4Var == null ? 0 : rh4Var.hashCode())) * 31;
        r9x0 r9x0Var = this.f;
        return this.g.hashCode() + ((hashCode4 + (r9x0Var != null ? r9x0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CarouselItem(title=" + this.a + ", subtitle=" + this.b + ", textAlignment=" + this.c + ", contentPaddings=" + this.d + ", background=" + this.e + ", action=" + this.f + ", analyticsData=" + this.g + Extension.C_BRAKE;
    }
}
