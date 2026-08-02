package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xi50 {
    public final uc4 a;
    public final boolean b;
    public final boolean c;
    public final ndi d;

    public xi50(uc4 uc4Var, boolean z, boolean z2, ndi ndiVar) {
        this.a = uc4Var;
        this.b = z;
        this.c = z2;
        this.d = ndiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi50)) {
            return false;
        }
        xi50 xi50Var = (xi50) obj;
        return jl40.l(this.a, xi50Var.a) && this.b == xi50Var.b && this.c == xi50Var.c && jl40.l(this.d, xi50Var.d);
    }

    public final int hashCode() {
        uc4 uc4Var = this.a;
        return this.d.hashCode() + unr0.e(unr0.e((uc4Var == null ? 0 : uc4Var.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "MapAutoZoomState(optimalBbox=" + this.a + ", mapTouched=" + this.b + ", walkRouteShow=" + this.c + ", deliveryMapAutozoomExperiment=" + this.d + Extension.C_BRAKE;
    }
}
