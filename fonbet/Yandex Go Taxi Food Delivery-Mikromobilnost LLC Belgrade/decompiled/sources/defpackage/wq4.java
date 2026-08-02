package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wq4 {
    public final int a;
    public final int b;
    public final int c;

    public wq4(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq4)) {
            return false;
        }
        wq4 wq4Var = (wq4) obj;
        return this.a == wq4Var.a && this.b == wq4Var.b && this.c == wq4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.s(this.a, this.b, "ShowPolicy(maxShowCount=", ", maxUsageCount=", ", maxDailyShowCount="));
    }

    public /* synthetic */ wq4(int i) {
        this(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public wq4() {
        this(0);
    }
}
