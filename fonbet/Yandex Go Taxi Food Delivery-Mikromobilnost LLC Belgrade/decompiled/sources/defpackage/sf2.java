package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class sf2 implements uf2 {
    public final int a;
    public final int b;

    public sf2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf2)) {
            return false;
        }
        sf2 sf2Var = (sf2) obj;
        return this.a == sf2Var.a && this.b == sf2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Gradient(startColorRes=", ", endColorRes=", Extension.C_BRAKE);
    }
}
