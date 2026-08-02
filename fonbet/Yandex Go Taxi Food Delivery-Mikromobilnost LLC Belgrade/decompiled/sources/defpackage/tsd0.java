package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tsd0 {
    public final String a;
    public final String b;

    public tsd0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsd0)) {
            return false;
        }
        tsd0 tsd0Var = (tsd0) obj;
        return this.a.equals(tsd0Var.a) && jl40.l(this.b, tsd0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("Point(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
