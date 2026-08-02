package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class rnf0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public rnf0(String str, String str2, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnf0)) {
            return false;
        }
        rnf0 rnf0Var = (rnf0) obj;
        return jl40.l(this.a, rnf0Var.a) && jl40.l(this.b, rnf0Var.b) && jl40.l(this.c, rnf0Var.c) && jl40.l(this.d, rnf0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return tse0.j(this.c, ", disclaimerTexts=", Extension.C_BRAKE, b64.v("PromoInfo(text=", this.a, ", textColor=", this.b, ", adText="), this.d);
    }
}
