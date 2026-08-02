package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wo01 {
    public static final wo01 d = new wo01(null, null, null);
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ wo01(String str, String str2, String str3, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo01)) {
            return false;
        }
        wo01 wo01Var = (wo01) obj;
        return jl40.l(this.a, wo01Var.a) && jl40.l(this.b, wo01Var.b) && jl40.l(this.c, wo01Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("InputState(number=", this.a, ", subtitleText=", this.b, ", errorText="), this.c, Extension.C_BRAKE);
    }

    public wo01(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
