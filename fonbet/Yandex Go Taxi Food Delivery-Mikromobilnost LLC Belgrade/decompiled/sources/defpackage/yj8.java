package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class yj8 {
    public final String a;
    public final String b;

    public yj8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj8)) {
            return false;
        }
        yj8 yj8Var = (yj8) obj;
        return this.a.equals(yj8Var.a) && jl40.l(this.b, yj8Var.b);
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
