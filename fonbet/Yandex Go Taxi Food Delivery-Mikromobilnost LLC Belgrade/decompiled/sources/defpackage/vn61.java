package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class vn61 implements Comparable {
    public final int a;
    public final int b;

    public vn61(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        vn61 vn61Var = (vn61) obj;
        return jl40.q(this.a * this.b, vn61Var.a * vn61Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn61)) {
            return false;
        }
        vn61 vn61Var = (vn61) obj;
        return this.a == vn61Var.a && this.b == vn61Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Size(width=", ", height=", Extension.C_BRAKE);
    }
}
