package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.summary.promotions.models.TextAlign;

/* loaded from: classes6.dex */
public final class wlv0 implements xlv0 {
    public final String a;
    public final Drawable b;
    public final Drawable c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final cmv0 g;
    public final List h;
    public final TextAlign i;
    public final TextAlign j;
    public final TextAlign k;

    public wlv0(String str, Drawable drawable, Drawable drawable2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, cmv0 cmv0Var, List list, TextAlign textAlign, TextAlign textAlign2, TextAlign textAlign3) {
        this.a = str;
        this.b = drawable;
        this.c = drawable2;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = charSequence3;
        this.g = cmv0Var;
        this.h = list;
        this.i = textAlign;
        this.j = textAlign2;
        this.k = textAlign3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlv0)) {
            return false;
        }
        wlv0 wlv0Var = (wlv0) obj;
        return jl40.l(this.a, wlv0Var.a) && jl40.l(this.b, wlv0Var.b) && jl40.l(this.c, wlv0Var.c) && jl40.l(this.d, wlv0Var.d) && jl40.l(this.e, wlv0Var.e) && jl40.l(this.f, wlv0Var.f) && this.g.equals(wlv0Var.g) && jl40.l(this.h, wlv0Var.h) && this.i == wlv0Var.i && this.j == wlv0Var.j && this.k == wlv0Var.k;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Drawable drawable = this.b;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.c;
        int hashCode3 = (this.g.hashCode() + smw0.b(smw0.b(smw0.b((hashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31;
        List list = this.h;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        TextAlign textAlign = this.i;
        int hashCode5 = (hashCode4 + (textAlign == null ? 0 : textAlign.hashCode())) * 31;
        TextAlign textAlign2 = this.j;
        return this.k.hashCode() + ((hashCode5 + (textAlign2 != null ? textAlign2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shown(id=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append((Object) this.d);
        sb.append(", message=");
        vfc.A(sb, this.e, ", footer=", this.f, ", widget=");
        sb.append(this.g);
        sb.append(", bullets=");
        sb.append(this.h);
        sb.append(", titleAlign=");
        sb.append(this.i);
        sb.append(", textAlign=");
        sb.append(this.j);
        sb.append(", footerAlign=");
        sb.append(this.k);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
