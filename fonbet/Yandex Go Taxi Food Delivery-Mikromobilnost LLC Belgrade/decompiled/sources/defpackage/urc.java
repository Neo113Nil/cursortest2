package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class urc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public urc(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urc)) {
            return false;
        }
        urc urcVar = (urc) obj;
        return this.a == urcVar.a && this.b == urcVar.b && this.c == urcVar.c && this.d == urcVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", bottom=", Extension.C_BRAKE, b64.s(this.a, this.b, "ImagePaddings(left=", ", top=", ", right="));
    }
}
