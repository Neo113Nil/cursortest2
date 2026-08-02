package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wn9 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public wn9(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static wn9 a(wn9 wn9Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            z = wn9Var.a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = wn9Var.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = wn9Var.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = wn9Var.d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = wn9Var.e;
        }
        wn9Var.getClass();
        return new wn9(z6, z7, z8, z9, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn9)) {
            return false;
        }
        wn9 wn9Var = (wn9) obj;
        return this.a == wn9Var.a && this.b == wn9Var.b && this.c == wn9Var.c && this.d == wn9Var.d && this.e == wn9Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder u = qv10.u("ChargersBackgroundDelegateState(withFade=", ", withToolbar=", ", withPlusPlaque=", this.a, this.b);
        nnm.v(", withSurge=", ", plusPlaqueExpanded=", u, this.c, this.d);
        return x4e.i(u, this.e, Extension.C_BRAKE);
    }

    public /* synthetic */ wn9(int i) {
        this(false, false, false, false, false);
    }

    public wn9() {
        this(0);
    }
}
