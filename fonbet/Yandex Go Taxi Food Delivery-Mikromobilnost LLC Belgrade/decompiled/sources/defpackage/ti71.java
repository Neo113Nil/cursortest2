package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class ti71 {
    public static final tf71 Companion = new tf71();
    public final String a;
    public final double b;

    public ti71(double d, int i, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, pc71.b);
            throw null;
        }
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti71)) {
            return false;
        }
        ti71 ti71Var = (ti71) obj;
        return jl40.l(this.a, ti71Var.a) && Double.compare(this.b, ti71Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallCpmFloor(networkAdUnitId=" + this.a + ", minCpm=" + this.b + Extension.C_BRAKE;
    }
}
