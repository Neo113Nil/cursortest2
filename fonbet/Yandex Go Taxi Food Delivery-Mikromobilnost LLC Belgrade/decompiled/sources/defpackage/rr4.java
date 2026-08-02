package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rr4 {
    public final Integer a;
    public final Integer b;

    public rr4(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr4)) {
            return false;
        }
        rr4 rr4Var = (rr4) obj;
        return jl40.l(this.a, rr4Var.a) && jl40.l(this.b, rr4Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "BannerCarouselState(topPadding=" + this.a + ", bottomPadding=" + this.b + Extension.C_BRAKE;
    }

    public rr4() {
        this(null, null);
    }
}
