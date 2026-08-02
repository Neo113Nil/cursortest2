package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class z16 implements c26 {
    public final boolean a;
    public final int b;
    public final Integer c;

    public z16(int i, Integer num, boolean z) {
        this.a = z;
        this.b = i;
        this.c = num;
    }

    public static z16 a(z16 z16Var, int i, Integer num, int i2) {
        boolean z = (i2 & 1) != 0 ? z16Var.a : true;
        if ((i2 & 2) != 0) {
            i = z16Var.b;
        }
        if ((i2 & 4) != 0) {
            num = z16Var.c;
        }
        return new z16(i, num, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z16)) {
            return false;
        }
        z16 z16Var = (z16) obj;
        return this.a == z16Var.a && this.b == z16Var.b && jl40.l(this.c, z16Var.c);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return oo31.j(xvz.p("Connected(wasServicesDiscovered=", this.b, ", mtu=", ", rssi=", this.a), this.c, Extension.C_BRAKE);
    }

    public /* synthetic */ z16(int i) {
        this(23, null, false);
    }

    public z16() {
        this(0);
    }
}
