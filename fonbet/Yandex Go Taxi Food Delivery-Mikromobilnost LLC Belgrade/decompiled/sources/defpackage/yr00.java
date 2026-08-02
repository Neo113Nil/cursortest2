package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class yr00 {
    public final int a;
    public final int b;

    public yr00(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr00)) {
            return false;
        }
        yr00 yr00Var = (yr00) obj;
        return this.a == yr00Var.a && this.b == yr00Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "MapSize(width=", ", height=", Extension.C_BRAKE);
    }
}
