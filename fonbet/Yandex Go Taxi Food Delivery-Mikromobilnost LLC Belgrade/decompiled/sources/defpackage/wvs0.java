package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wvs0 implements fws0 {
    public final String a;
    public final String b;
    public final String c;

    public wvs0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvs0)) {
            return false;
        }
        wvs0 wvs0Var = (wvs0) obj;
        return jl40.l(this.a, wvs0Var.a) && jl40.l(this.b, wvs0Var.b) && jl40.l(this.c, wvs0Var.c);
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
        return oyr.t(b64.v("TrailNav(tintColor=", this.a, ", metricaLabel=", this.b, ", presentationId="), this.c, Extension.C_BRAKE);
    }
}
