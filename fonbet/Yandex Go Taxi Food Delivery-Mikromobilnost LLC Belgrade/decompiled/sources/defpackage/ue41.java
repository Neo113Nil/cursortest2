package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ue41 implements ze41 {
    public final boolean a;
    public final int b;
    public final int c;

    public ue41(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue41)) {
            return false;
        }
        ue41 ue41Var = (ue41) obj;
        return this.a == ue41Var.a && this.b == ue41Var.b && this.c == ue41Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, xvz.p("Error(isCriticalError=", this.b, ", errorCode=", ", retriesNumber=", this.a));
    }
}
