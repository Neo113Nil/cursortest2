package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vos0 {
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final ips0 d;
    public final boolean e;

    public vos0(FormattedText formattedText, FormattedText formattedText2, String str, ips0 ips0Var, boolean z) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = str;
        this.d = ips0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vos0)) {
            return false;
        }
        vos0 vos0Var = (vos0) obj;
        return this.a.equals(vos0Var.a) && jl40.l(this.b, vos0Var.b) && jl40.l(this.c, vos0Var.c) && jl40.l(this.d, vos0Var.d) && this.e == vos0Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ips0 ips0Var = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (ips0Var != null ? ips0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SliderButtonContent(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append(", handler=");
        sb.append(this.d);
        sb.append(", isShimmering=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
