package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zr00 {
    public final uc4 a;
    public final Float b;

    public zr00(uc4 uc4Var, Float f) {
        this.a = uc4Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr00)) {
            return false;
        }
        zr00 zr00Var = (zr00) obj;
        return jl40.l(this.a, zr00Var.a) && jl40.l(this.b, zr00Var.b);
    }

    public final int hashCode() {
        uc4 uc4Var = this.a;
        int hashCode = (uc4Var == null ? 0 : uc4Var.hashCode()) * 31;
        Float f = this.b;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "MapState(currentBbox=" + this.a + ", currentZoom=" + this.b + Extension.C_BRAKE;
    }

    public zr00() {
        this(null, null);
    }
}
