package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;

/* loaded from: classes5.dex */
public final class tdv implements pre, h0s0 {
    public final String a;
    public final String b;
    public final int c;
    public final FormattedText d;
    public final ContentAlignment e;
    public final sbv f;
    public final ContentAlignment g;
    public final o690 h;

    public tdv(String str, String str2, int i, FormattedText formattedText, ContentAlignment contentAlignment, sbv sbvVar, ContentAlignment contentAlignment2, o690 o690Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = formattedText;
        this.e = contentAlignment;
        this.f = sbvVar;
        this.g = contentAlignment2;
        this.h = o690Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdv)) {
            return false;
        }
        tdv tdvVar = (tdv) obj;
        return jl40.l(this.a, tdvVar.a) && jl40.l(this.b, tdvVar.b) && this.c == tdvVar.c && this.d.equals(tdvVar.d) && this.e == tdvVar.e && this.f.equals(tdvVar.f) && this.g == tdvVar.g && jl40.l(this.h, tdvVar.h);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "image";
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.c(oyr.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d.a)) * 31)) * 31)) * 31;
        o690 o690Var = this.h;
        return hashCode2 + (o690Var != null ? o690Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ImageRemoteCoreWidget(id=", this.a, ", backgroundColor=", this.b, ", height=");
        v.append(this.c);
        v.append(", text=");
        v.append(this.d);
        v.append(", textAlign=");
        v.append(this.e);
        v.append(", image=");
        v.append(this.f);
        v.append(", imageAlign=");
        v.append(this.g);
        v.append(", paddings=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
