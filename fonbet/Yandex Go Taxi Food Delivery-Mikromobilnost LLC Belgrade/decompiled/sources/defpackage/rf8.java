package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class rf8 {
    public final int a;
    public final String b;
    public final String c;

    public rf8(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf8)) {
            return false;
        }
        rf8 rf8Var = (rf8) obj;
        return this.a == rf8Var.a && this.b.equals(rf8Var.b) && this.c.equals(rf8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(unr0.v(this.a, "CardInfo(digits=", ", cardSystem=", this.b, ", cardSuffix="), this.c, Extension.C_BRAKE);
    }
}
