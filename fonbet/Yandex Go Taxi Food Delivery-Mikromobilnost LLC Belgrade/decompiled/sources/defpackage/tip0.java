package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tip0 {
    public final int a;
    public final int b;

    public tip0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tip0)) {
            return false;
        }
        tip0 tip0Var = (tip0) obj;
        return this.a == tip0Var.a && this.b == tip0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "ScrollTargetPosition(position=", ", revision=", Extension.C_BRAKE);
    }
}
