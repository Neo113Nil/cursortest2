package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class zo5 {
    public final String a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;
    public final FormattedText e;
    public final boolean f;

    public zo5(String str, String str2, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = formattedText;
        this.d = formattedText2;
        this.e = formattedText3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo5)) {
            return false;
        }
        zo5 zo5Var = (zo5) obj;
        return jl40.l(this.a, zo5Var.a) && jl40.l(this.b, zo5Var.b) && jl40.l(this.c, zo5Var.c) && jl40.l(this.d, zo5Var.d) && jl40.l(this.e, zo5Var.e) && this.f == zo5Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.c(unr0.c(unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c.a), 31, this.d.a), 31, this.e.a);
    }

    public final String toString() {
        StringBuilder v = b64.v("BidInfo(driverName=", this.a, ", driverAvatarUrl=", this.b, ", subtitle=");
        n.C(v, this.c, ", price=", this.d, ", eta=");
        v.append(this.e);
        v.append(", isFastest=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
