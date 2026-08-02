package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tox0 {
    public final String a;
    public final String b;
    public final sgx0 c;
    public final boolean d;

    public tox0(String str, String str2, sgx0 sgx0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = sgx0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tox0)) {
            return false;
        }
        tox0 tox0Var = (tox0) obj;
        return jl40.l(this.a, tox0Var.a) && jl40.l(this.b, tox0Var.b) && jl40.l(this.c, tox0Var.c) && this.d == tox0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MetaInfo(tariffClass=", this.a, ", verticalId=", this.b, ", offer=");
        v.append(this.c);
        v.append(", isAlternative=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
