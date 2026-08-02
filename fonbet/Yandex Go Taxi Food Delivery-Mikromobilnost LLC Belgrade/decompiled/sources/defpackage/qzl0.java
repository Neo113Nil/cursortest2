package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qzl0 {
    public final String a;
    public final String b;

    public qzl0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzl0)) {
            return false;
        }
        qzl0 qzl0Var = (qzl0) obj;
        return jl40.l(this.a, qzl0Var.a) && jl40.l(this.b, qzl0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("RouteItem(name=", this.a, ", imageTag=", this.b, Extension.C_BRAKE);
    }
}
