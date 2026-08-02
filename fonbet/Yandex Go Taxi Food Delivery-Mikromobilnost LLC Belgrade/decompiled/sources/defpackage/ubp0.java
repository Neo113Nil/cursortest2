package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ubp0 implements xbp0 {
    public final String a;
    public final String b;

    public ubp0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubp0)) {
            return false;
        }
        ubp0 ubp0Var = (ubp0) obj;
        return jl40.l(this.a, ubp0Var.a) && jl40.l(this.b, ubp0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("Form(mode=", this.a, ", metricaLabel=", this.b, Extension.C_BRAKE);
    }
}
