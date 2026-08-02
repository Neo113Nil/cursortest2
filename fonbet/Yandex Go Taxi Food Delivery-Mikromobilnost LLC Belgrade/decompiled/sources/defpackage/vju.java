package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vju {
    public final int a;
    public final int b;

    public vju(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vju)) {
            return false;
        }
        vju vjuVar = (vju) obj;
        return this.a == vjuVar.a && this.b == vjuVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "HintState(stringRes=", ", colorAttr=", Extension.C_BRAKE);
    }
}
