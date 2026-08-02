package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class si80 implements ti80 {
    public final String a;
    public final String b;
    public final String c;

    public si80(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.ti80
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si80)) {
            return false;
        }
        si80 si80Var = (si80) obj;
        return jl40.l(this.a, si80Var.a) && jl40.l(this.b, si80Var.b) && jl40.l(this.c, si80Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("RedundantOrganizationId(uri=", this.a, ", oid=", this.b, ", suggestReqId="), this.c, Extension.C_BRAKE);
    }
}
