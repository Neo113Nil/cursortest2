package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class yb20 {
    public final String a;
    public final String b;

    public yb20(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb20)) {
            return false;
        }
        yb20 yb20Var = (yb20) obj;
        return jl40.l(this.a, yb20Var.a) && jl40.l(this.b, yb20Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("MetricaParameters(uuid=", this.a, ", deviceId=", this.b, Extension.C_BRAKE);
    }
}
