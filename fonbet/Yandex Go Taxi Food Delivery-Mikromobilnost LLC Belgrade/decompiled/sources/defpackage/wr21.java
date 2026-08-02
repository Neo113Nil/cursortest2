package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wr21 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public wr21(String str, String str2, String str3, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr21)) {
            return false;
        }
        wr21 wr21Var = (wr21) obj;
        return this.a == wr21Var.a && this.b == wr21Var.b && this.c.equals(wr21Var.c) && this.d.equals(wr21Var.d) && this.e.equals(wr21Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder u = qv10.u("UserPlacemark(isEnabled=", ", isTurnOn=", ", userArrowTag=", this.a, this.b);
        g8e.D(u, this.c, ", userArrowId=", this.d, ", userArrowToggleTitle=");
        return oyr.t(u, this.e, Extension.C_BRAKE);
    }
}
