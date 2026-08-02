package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vc1 {
    public final String a;
    public final String b;
    public final String c;

    public vc1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc1)) {
            return false;
        }
        vc1 vc1Var = (vc1) obj;
        return jl40.l(this.a, vc1Var.a) && jl40.l(this.b, vc1Var.b) && jl40.l(this.c, vc1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("UrbanAdsBannerSettings(page=", this.a, ", path=", this.b, ", experiments="), this.c, Extension.C_BRAKE);
    }
}
