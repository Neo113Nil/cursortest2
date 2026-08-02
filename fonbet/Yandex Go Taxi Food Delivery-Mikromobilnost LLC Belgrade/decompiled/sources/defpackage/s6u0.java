package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.map_common.image.StaticMapImageConfig$MapType;

/* loaded from: classes5.dex */
public final class s6u0 {
    public final int a;
    public final int b;
    public final int c;
    public final StaticMapImageConfig$MapType d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s6u0(Integer num, Integer num2, Integer num3, StaticMapImageConfig$MapType staticMapImageConfig$MapType) {
        this(r2, r3, r4, staticMapImageConfig$MapType == null ? StaticMapImageConfig$MapType.MAP : staticMapImageConfig$MapType);
        int i;
        int intValue = num != null ? num.intValue() : 500;
        int intValue2 = num2 != null ? num2.intValue() : 1000;
        if (num3 != null) {
            i = num3.intValue();
        } else {
            i = (staticMapImageConfig$MapType == null ? -1 : q6u0.a[staticMapImageConfig$MapType.ordinal()]) == 1 ? 16 : 18;
        }
    }

    public final int a() {
        return this.a;
    }

    public final StaticMapImageConfig$MapType b() {
        return this.d;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6u0)) {
            return false;
        }
        s6u0 s6u0Var = (s6u0) obj;
        return this.a == s6u0Var.a && this.b == s6u0Var.b && this.c == s6u0Var.c && this.d == s6u0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "StaticMapImageConfig(height=", ", width=", ", zoom=");
        s.append(this.c);
        s.append(", type=");
        s.append(this.d);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }

    public s6u0(int i, int i2, int i3, StaticMapImageConfig$MapType staticMapImageConfig$MapType) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = staticMapImageConfig$MapType;
    }
}
