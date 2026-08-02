package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vji extends ha91 {
    public final String b;
    public final String c;
    public final String d;

    public vji(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vji)) {
            return false;
        }
        vji vjiVar = (vji) obj;
        return jl40.l(this.b, vjiVar.b) && jl40.l(this.c, vjiVar.c) && jl40.l(this.d, vjiVar.d);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("Bubble(title=", this.b, ", subtitle=", this.c, ", imageTag="), this.d, Extension.C_BRAKE);
    }
}
