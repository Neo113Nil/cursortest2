package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class yq51 implements ar51 {
    public final String a;
    public final br51 b;

    public yq51(String str, br51 br51Var) {
        this.a = str;
        this.b = br51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq51)) {
            return false;
        }
        yq51 yq51Var = (yq51) obj;
        return jl40.l(this.a, yq51Var.a) && jl40.l(this.b, yq51Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        br51 br51Var = this.b;
        return hashCode + (br51Var != null ? br51Var.hashCode() : 0);
    }

    public final String toString() {
        return "NotFound(error=" + this.a + ", errorInfo=" + this.b + Extension.C_BRAKE;
    }
}
