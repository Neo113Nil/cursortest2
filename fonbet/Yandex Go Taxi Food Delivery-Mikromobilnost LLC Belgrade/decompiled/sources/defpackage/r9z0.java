package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class r9z0 {
    public final String a;
    public final String b;
    public final String c;
    public final aqb1 d;

    public r9z0(String str, String str2, String str3, aqb1 aqb1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aqb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9z0)) {
            return false;
        }
        r9z0 r9z0Var = (r9z0) obj;
        return jl40.l(this.a, r9z0Var.a) && jl40.l(this.b, r9z0Var.b) && jl40.l(this.c, r9z0Var.c) && jl40.l(this.d, r9z0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TimelineBubbleButtonModel(title=", this.a, ", textColor=", this.b, ", backgroundColor=");
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
