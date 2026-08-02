package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q4m0 extends gya1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public q4m0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4m0)) {
            return false;
        }
        q4m0 q4m0Var = (q4m0) obj;
        return jl40.l(this.a, q4m0Var.a) && jl40.l(this.b, q4m0Var.b) && jl40.l(this.c, q4m0Var.c) && jl40.l(this.d, q4m0Var.d);
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
        String str3 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return g8e.r(b64.v("Failure(title=", this.a, ", subtitle=", this.b, ", supportUrl="), this.c, ", requestId=", this.d, Extension.C_BRAKE);
    }
}
