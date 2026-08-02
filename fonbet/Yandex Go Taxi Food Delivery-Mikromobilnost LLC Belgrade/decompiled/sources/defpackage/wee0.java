package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wee0 {
    public final String a;
    public final String b;

    public wee0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wee0)) {
            return false;
        }
        wee0 wee0Var = (wee0) obj;
        return jl40.l(this.a, wee0Var.a) && jl40.l(this.b, wee0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("HeaderLayout(headline=", this.a, ", description=", this.b, Extension.C_BRAKE);
    }
}
