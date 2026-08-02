package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wjp0 {
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final sbv d;
    public final r9x0 e;
    public final xjp0 f;
    public final x2s g;

    public wjp0(FormattedText formattedText, FormattedText formattedText2, String str, sbv sbvVar, r9x0 r9x0Var, xjp0 xjp0Var, x2s x2sVar) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = str;
        this.d = sbvVar;
        this.e = r9x0Var;
        this.f = xjp0Var;
        this.g = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjp0)) {
            return false;
        }
        wjp0 wjp0Var = (wjp0) obj;
        return this.a.equals(wjp0Var.a) && jl40.l(this.b, wjp0Var.b) && jl40.l(this.c, wjp0Var.c) && this.d.equals(wjp0Var.d) && jl40.l(this.e, wjp0Var.e) && jl40.l(this.f, wjp0Var.f) && this.g.equals(wjp0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        r9x0 r9x0Var = this.e;
        int hashCode4 = (hashCode3 + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31;
        xjp0 xjp0Var = this.f;
        return this.g.hashCode() + ((hashCode4 + (xjp0Var != null ? xjp0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ScrollableItem(title=" + this.a + ", subtitle=" + this.b + ", backgroundColor=" + this.c + ", image=" + this.d + ", action=" + this.e + ", badge=" + this.f + ", analyticsData=" + this.g + Extension.C_BRAKE;
    }
}
