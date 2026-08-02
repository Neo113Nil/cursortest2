package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ru0 implements vu0 {
    public final String a;
    public final String b;
    public final String c;
    public final bwb d;
    public final String e;

    public ru0(String str, String str2, String str3, bwb bwbVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bwbVar;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0)) {
            return false;
        }
        ru0 ru0Var = (ru0) obj;
        return jl40.l(this.a, ru0Var.a) && jl40.l(this.b, ru0Var.b) && jl40.l(this.c, ru0Var.c) && jl40.l(this.d, ru0Var.d) && jl40.l(this.e, ru0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        bwb bwbVar = this.d;
        int hashCode4 = (hashCode3 + (bwbVar == null ? 0 : bwbVar.hashCode())) * 31;
        String str4 = this.e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Intercity(currentMode=", this.a, ", selectedClass=", this.b, ", screenName=");
        v.append(this.c);
        v.append(", cityDiscoveryScreen=");
        v.append(this.d);
        v.append(", searchText=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
