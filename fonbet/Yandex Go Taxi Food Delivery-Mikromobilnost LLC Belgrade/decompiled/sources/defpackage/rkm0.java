package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;

/* loaded from: classes5.dex */
public final class rkm0 {
    public final String a;
    public final String b;
    public final String c;
    public final qa6 d;
    public final o690 e;
    public final ContentAlignment f;
    public final ContentAlignment g;

    public rkm0(String str, String str2, String str3, qa6 qa6Var, o690 o690Var, ContentAlignment contentAlignment, ContentAlignment contentAlignment2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qa6Var;
        this.e = o690Var;
        this.f = contentAlignment;
        this.g = contentAlignment2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkm0)) {
            return false;
        }
        rkm0 rkm0Var = (rkm0) obj;
        return jl40.l(this.a, rkm0Var.a) && jl40.l(this.b, rkm0Var.b) && jl40.l(this.c, rkm0Var.c) && jl40.l(this.d, rkm0Var.d) && jl40.l(this.e, rkm0Var.e) && this.f == rkm0Var.f && this.g == rkm0Var.g;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        qa6 qa6Var = this.d;
        int hashCode4 = (hashCode3 + (qa6Var == null ? 0 : qa6Var.hashCode())) * 31;
        o690 o690Var = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((hashCode4 + (o690Var != null ? o690Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ScalableSelectorStyle(selectedBackgroundColor=", this.a, ", unselectedBackgroundColor=", this.b, ", disabledBackgroundColor=");
        v.append(this.c);
        v.append(", selectedOptionBorder=");
        v.append(this.d);
        v.append(", contentPaddings=");
        v.append(this.e);
        v.append(", textHorizontalAlignment=");
        v.append(this.f);
        v.append(", badgeHorizontalAlignment=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
