package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sx5 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public sx5(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx5)) {
            return false;
        }
        sx5 sx5Var = (sx5) obj;
        return this.a == sx5Var.a && this.b == sx5Var.b && this.c == sx5Var.c && this.d == sx5Var.d && this.e == sx5Var.e && this.f == sx5Var.f && this.g == sx5Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder u = qv10.u("SecurityFeatures(hasStrongBox=", ", hasFingerPrint=", ", hasFace=", this.a, this.b);
        nnm.v(", hasIris=", ", hasVerifiedBoot=", u, this.c, this.d);
        nnm.v(", isDeviceSecure=", ", isDeviceLocked=", u, this.e, this.f);
        return x4e.i(u, this.g, Extension.C_BRAKE);
    }
}
