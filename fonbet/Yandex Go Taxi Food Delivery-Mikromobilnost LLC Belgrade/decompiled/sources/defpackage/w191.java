package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class w191 {
    public final int a;
    public final int b;

    public w191(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w191)) {
            return false;
        }
        w191 w191Var = (w191) obj;
        return this.a == w191Var.a && this.b == w191Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "ViewSize(width=", ", height=", Extension.C_BRAKE);
    }
}
