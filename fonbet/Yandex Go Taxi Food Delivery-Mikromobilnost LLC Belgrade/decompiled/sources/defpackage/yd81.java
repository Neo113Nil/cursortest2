package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class yd81 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public yd81(String str, String str2, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd81)) {
            return false;
        }
        yd81 yd81Var = (yd81) obj;
        return this.a.equals(yd81Var.a) && jl40.l(this.b, yd81Var.b) && jl40.l(this.c, yd81Var.c) && jl40.l(this.d, yd81Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return tse0.j(this.c, ", creatives=", Extension.C_BRAKE, b64.v("CoreAdInfo(adUnitId=", this.a, ", extraData=", this.b, ", additionalText="), this.d);
    }
}
