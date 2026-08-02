package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class z2p0 implements e3p0 {
    public final double a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public z2p0(double d, Integer num, String str, String str2, String str3, String str4, boolean z) {
        this.a = d;
        this.b = num;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2p0)) {
            return false;
        }
        z2p0 z2p0Var = (z2p0) obj;
        return Double.compare(this.a, z2p0Var.a) == 0 && jl40.l(this.b, z2p0Var.b) && jl40.l(this.c, z2p0Var.c) && jl40.l(this.d, z2p0Var.d) && jl40.l(this.e, z2p0Var.e) && jl40.l(this.f, z2p0Var.f) && this.g == z2p0Var.g;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return Boolean.hashCode(this.g) + unr0.b(unr0.b(unr0.b((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Balance(balance=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        g8e.D(sb, ", text=", this.c, ", targetIconUrl=", this.d);
        g8e.D(sb, ", leadingIconUrl=", this.e, ", trailingIconUrl=", this.f);
        return xra1.a(sb, ", withBottomDivider=", this.g, Extension.C_BRAKE);
    }
}
