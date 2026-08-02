package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zj8 {
    public final String a;
    public final String b;

    public zj8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj8)) {
            return false;
        }
        zj8 zj8Var = (zj8) obj;
        return jl40.l(this.a, zj8Var.a) && jl40.l(this.b, zj8Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("CardNetworkNumberInterval(start=", this.a, ", end=", this.b, Extension.C_BRAKE);
    }
}
