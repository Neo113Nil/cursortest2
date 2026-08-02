package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sbf0 {
    public final int a;
    public final int b;

    public sbf0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbf0)) {
            return false;
        }
        sbf0 sbf0Var = (sbf0) obj;
        return this.a == sbf0Var.a && this.b == sbf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "ScrollPositions(firstViewTopInWindow=", ", toolbarBottomInWindow=", Extension.C_BRAKE);
    }
}
