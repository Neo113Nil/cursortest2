package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class y2x {
    public final int a;
    public final int b;

    public y2x(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2x)) {
            return false;
        }
        y2x y2xVar = (y2x) obj;
        return this.a == y2xVar.a && this.b == y2xVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "ItemPosition(rows=", ", columns=", Extension.C_BRAKE);
    }
}
