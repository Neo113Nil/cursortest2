package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.requirements.ui.selector.usual.OptionViewType;

/* loaded from: classes6.dex */
public final class tf70 {
    public final String a;
    public final String b;
    public final String c;
    public final OptionViewType d;
    public final int e;
    public final int f;

    public tf70(String str, String str2, String str3, OptionViewType optionViewType, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = optionViewType;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf70)) {
            return false;
        }
        tf70 tf70Var = (tf70) obj;
        return jl40.l(this.a, tf70Var.a) && jl40.l(this.b, tf70Var.b) && jl40.l(this.c, tf70Var.c) && this.d == tf70Var.d && this.e == tf70Var.e && this.f == tf70Var.f;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.f) + oyr.b(this.e, (this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("OptionViewModel(optionId=", this.a, ", title=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", viewType=");
        v.append(this.d);
        v.append(", selectedCount=");
        return ly3.k(this.e, this.f, ", maxCount=", Extension.C_BRAKE, v);
    }
}
