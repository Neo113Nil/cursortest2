package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class twg {
    public final String a;
    public final String b;
    public final Boolean c;

    public twg(String str, String str2, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twg)) {
            return false;
        }
        twg twgVar = (twg) obj;
        return jl40.l(this.a, twgVar.a) && jl40.l(this.b, twgVar.b) && jl40.l(this.c, twgVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return nzs.d(b64.v("DebugSectionVo(message=", this.a, ", details=", this.b, ", isCrit="), this.c, Extension.C_BRAKE);
    }
}
