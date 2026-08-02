package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wti0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public wti0(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wti0)) {
            return false;
        }
        wti0 wti0Var = (wti0) obj;
        return this.a == wti0Var.a && this.b == wti0Var.b && this.c == wti0Var.c && this.d == wti0Var.d && this.e == wti0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "RemainingTime(days=", ", hours=", ", minutes=");
        vfc.u(this.c, this.d, ", seconds=", ", milliseconds=", s);
        return oyr.m(this.e, Extension.C_BRAKE, s);
    }
}
