package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class v3t0 implements y3t0 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public v3t0(String str, int i, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3t0)) {
            return false;
        }
        v3t0 v3t0Var = (v3t0) obj;
        return this.a == v3t0Var.a && this.b.equals(v3t0Var.b) && this.c.equals(v3t0Var.c) && this.d == v3t0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b(unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nnm.i(this.c, ", isSelected=", Extension.C_BRAKE, unr0.v(this.a, "Pedestrian(iconRes=", ", contentDescription=", this.b, ", distance="), this.d);
    }
}
