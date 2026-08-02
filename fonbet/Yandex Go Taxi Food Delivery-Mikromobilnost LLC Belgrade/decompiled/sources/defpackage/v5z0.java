package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v5z0 {
    public final int a;
    public final int b;

    public v5z0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5z0)) {
            return false;
        }
        v5z0 v5z0Var = (v5z0) obj;
        return this.a == v5z0Var.a && this.b == v5z0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Time(hours=", ", minutes=", Extension.C_BRAKE);
    }
}
