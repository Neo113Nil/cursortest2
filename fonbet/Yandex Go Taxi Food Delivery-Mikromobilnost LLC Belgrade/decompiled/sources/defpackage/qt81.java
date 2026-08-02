package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.yw2;

/* loaded from: classes7.dex */
public final class qt81 {
    public final long a;
    public final String b;
    public final int c;
    public final yw2 d;

    public qt81(int i, long j, String str, yw2 yw2Var) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = yw2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt81)) {
            return false;
        }
        qt81 qt81Var = (qt81) obj;
        return this.a == qt81Var.a && this.b.equals(qt81Var.b) && this.c == qt81Var.c && this.d == qt81Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + fia1.b(this.c, unr0.b(Long.hashCode(this.a) * 31, 31, this.b));
    }

    public final String toString() {
        StringBuilder k = x4e.k("ShowNotice(delay=", this.a, ", url=", this.b);
        k.append(", visibilityPercent=");
        k.append(this.c);
        k.append(", type=");
        k.append(this.d);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
