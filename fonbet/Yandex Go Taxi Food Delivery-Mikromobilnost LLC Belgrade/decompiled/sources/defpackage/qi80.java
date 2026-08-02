package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class qi80 implements ti80 {
    public final String a;
    public final String b;

    public qi80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ti80
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi80)) {
            return false;
        }
        qi80 qi80Var = (qi80) obj;
        return jl40.l(this.a, qi80Var.a) && jl40.l(this.b, qi80Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("OrganizationId(oid=", this.a, ", suggestReqId=", this.b, Extension.C_BRAKE);
    }
}
