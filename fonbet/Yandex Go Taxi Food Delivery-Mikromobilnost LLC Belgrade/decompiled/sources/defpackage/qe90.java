package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qe90 extends d5b1 {
    public final String a;
    public final String b;
    public final ih21 c;
    public final String d;
    public final boolean e;

    public qe90(String str, String str2, ih21 ih21Var, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = ih21Var;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe90)) {
            return false;
        }
        qe90 qe90Var = (qe90) obj;
        return jl40.l(this.a, qe90Var.a) && jl40.l(this.b, qe90Var.b) && jl40.l(this.c, qe90Var.c) && jl40.l(this.d, qe90Var.d) && this.e == qe90Var.e;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        ih21 ih21Var = this.c;
        return Boolean.hashCode(this.e) + unr0.b((b + (ih21Var == null ? 0 : ih21Var.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("ParkViewModel(id=", this.a, ", name=", this.b, ", tariffUrlParts=");
        v.append(this.c);
        v.append(", tariffUrl=");
        v.append(this.d);
        v.append(", excluded=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
