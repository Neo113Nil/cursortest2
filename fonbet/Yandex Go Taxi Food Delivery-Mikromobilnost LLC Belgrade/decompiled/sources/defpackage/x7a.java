package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x7a {
    public final String a;
    public final String b;
    public final tn9 c;

    public x7a(String str, String str2, tn9 tn9Var) {
        this.a = str;
        this.b = str2;
        this.c = tn9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7a)) {
            return false;
        }
        x7a x7aVar = (x7a) obj;
        return jl40.l(this.a, x7aVar.a) && jl40.l(this.b, x7aVar.b) && jl40.l(this.c, x7aVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        tn9 tn9Var = this.c;
        return hashCode2 + (tn9Var != null ? tn9Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ChargersDiscountsEntryPoint(iconUrl=", this.a, ", iconTag=", this.b, ", badge=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
