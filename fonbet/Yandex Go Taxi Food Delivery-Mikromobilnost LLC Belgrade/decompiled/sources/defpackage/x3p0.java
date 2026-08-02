package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class x3p0 implements y3p0 {
    public final double a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;

    public x3p0(double d, Integer num, String str, String str2, String str3) {
        this.a = d;
        this.b = num;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3p0)) {
            return false;
        }
        x3p0 x3p0Var = (x3p0) obj;
        return Double.compare(this.a, x3p0Var.a) == 0 && jl40.l(this.b, x3p0Var.b) && jl40.l(this.c, x3p0Var.c) && jl40.l(this.d, x3p0Var.d) && jl40.l(this.e, x3p0Var.e);
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.a) * 31;
        Integer num = this.b;
        return this.e.hashCode() + unr0.b(unr0.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Visible(balance=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        g8e.D(sb, ", targetIconUrl=", this.c, ", leadingIconUrl=", this.d);
        return unr0.r(sb, ", trailingIconUrl=", this.e, Extension.C_BRAKE);
    }
}
