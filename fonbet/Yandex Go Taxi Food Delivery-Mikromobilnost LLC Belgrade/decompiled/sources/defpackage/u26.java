package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class u26 {
    public static final u26 h = new u26(0);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public u26(boolean z, int i, int i2, int i3, int i4, boolean z2, boolean z3) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u26)) {
            return false;
        }
        u26 u26Var = (u26) obj;
        return this.a == u26Var.a && this.b == u26Var.b && this.c == u26Var.c && this.d == u26Var.d && this.e == u26Var.e && this.f == u26Var.f && this.g == u26Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + unr0.e(oyr.b(this.e, oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder p = xvz.p("BleScanSettings(isEnabled=", this.b, ", maxVehiclesCount=", ", batchSize=", this.a);
        vfc.u(this.c, this.d, ", beaconTtlSeconds=", ", rssiThreshold=", p);
        tse0.z(p, this.e, ", enableIbeacon=", this.f, ", enableEddystone=");
        return x4e.i(p, this.g, Extension.C_BRAKE);
    }

    public /* synthetic */ u26(int i) {
        this(false, 20, 5, 5, -95, true, false);
    }

    public u26() {
        this(0);
    }
}
