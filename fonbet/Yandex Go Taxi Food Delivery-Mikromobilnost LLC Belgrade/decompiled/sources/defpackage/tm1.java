package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class tm1 {
    public final int a;
    public final int b;

    public tm1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm1)) {
            return false;
        }
        tm1 tm1Var = (tm1) obj;
        return this.a == tm1Var.a && this.b == tm1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "OffsetsHelper(startOffset=", ", endOffset=", Extension.C_BRAKE);
    }
}
