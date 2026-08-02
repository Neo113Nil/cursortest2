package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class v29 {
    public final int a;
    public final int b;

    public v29(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v29)) {
            return false;
        }
        v29 v29Var = (v29) obj;
        return this.a == v29Var.a && this.b == v29Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Key(start=", ", end=", Extension.C_BRAKE);
    }
}
