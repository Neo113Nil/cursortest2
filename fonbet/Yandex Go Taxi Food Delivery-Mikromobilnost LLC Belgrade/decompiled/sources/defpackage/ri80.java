package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ri80 implements ti80 {
    public final String a;
    public final String b;

    public ri80(String str, String str2) {
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
        if (!(obj instanceof ri80)) {
            return false;
        }
        ri80 ri80Var = (ri80) obj;
        return jl40.l(this.a, ri80Var.a) && jl40.l(this.b, ri80Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("OrganizationUri(uri=", this.a, ", suggestReqId=", this.b, Extension.C_BRAKE);
    }
}
