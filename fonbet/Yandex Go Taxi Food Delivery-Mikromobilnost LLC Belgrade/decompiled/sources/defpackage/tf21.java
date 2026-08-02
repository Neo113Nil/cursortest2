package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class tf21 implements bnr0 {
    public final boolean a;
    public final int b;
    public final boolean c;

    public tf21(boolean z, int i, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        if (!(bnr0Var instanceof tf21)) {
            return this;
        }
        tf21 tf21Var = (tf21) bnr0Var;
        return new tf21(tf21Var.a, tf21Var.b, tf21Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf21)) {
            return false;
        }
        tf21 tf21Var = (tf21) obj;
        return this.a == tf21Var.a && this.b == tf21Var.b && this.c == tf21Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return x4e.i(xvz.p("UrbanAdsSharedData(isWhiteInventory=", this.b, ", cornerRadius=", ", showGrabber=", this.a), this.c, Extension.C_BRAKE);
    }
}
