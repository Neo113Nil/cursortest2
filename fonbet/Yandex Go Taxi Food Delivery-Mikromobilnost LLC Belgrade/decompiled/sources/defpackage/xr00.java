package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xr00 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public xr00(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr00)) {
            return false;
        }
        xr00 xr00Var = (xr00) obj;
        return this.a == xr00Var.a && this.b == xr00Var.b && this.c == xr00Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(qv10.u("MapSettings(showMap=", ", showGeoButton=", ", showZoomButtons=", this.a, this.b), this.c, Extension.C_BRAKE);
    }

    public xr00() {
        this(true, true, true);
    }
}
