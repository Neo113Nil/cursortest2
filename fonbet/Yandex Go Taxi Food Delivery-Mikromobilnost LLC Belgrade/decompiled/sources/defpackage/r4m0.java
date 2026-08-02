package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class r4m0 extends gya1 {
    public final String a;
    public final String b;
    public final fxy0 c;
    public final String d;

    public r4m0(fxy0 fxy0Var, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = fxy0Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4m0)) {
            return false;
        }
        r4m0 r4m0Var = (r4m0) obj;
        return jl40.l(this.a, r4m0Var.a) && jl40.l(this.b, r4m0Var.b) && jl40.l(this.c, r4m0Var.c) && jl40.l(this.d, r4m0Var.d);
    }

    @Override // defpackage.gya1
    public final String f() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        fxy0 fxy0Var = this.c;
        return this.d.hashCode() + ((hashCode2 + (fxy0Var != null ? fxy0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Timeout(title=", this.a, ", subtitle=", this.b, ", image=");
        v.append(this.c);
        v.append(", requestId=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
