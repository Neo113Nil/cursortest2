package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vdy0 implements ydy0 {
    public final int a;
    public final int b;
    public final String c;

    public vdy0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdy0)) {
            return false;
        }
        vdy0 vdy0Var = (vdy0) obj;
        return this.a == vdy0Var.a && this.b == vdy0Var.b && this.c.equals(vdy0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.t(b64.s(this.a, this.b, "Loading(progress=", ", all=", ", partialReport="), this.c, Extension.C_BRAKE);
    }
}
