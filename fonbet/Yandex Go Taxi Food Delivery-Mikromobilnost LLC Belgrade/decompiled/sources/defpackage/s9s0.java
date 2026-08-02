package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s9s0 {
    public final int a;
    public final int b;
    public final int c;

    public s9s0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9s0)) {
            return false;
        }
        s9s0 s9s0Var = (s9s0) obj;
        return this.a == s9s0Var.a && this.b == s9s0Var.b && this.c == s9s0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.s(this.a, this.b, "ShownCount(showCount=", ", dailyShowCount=", ", usageCount="));
    }

    public s9s0() {
        this(0, 0, 0);
    }
}
