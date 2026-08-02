package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vsx {
    public final myy a;
    public final xb90 b;

    public vsx(myy myyVar, xb90 xb90Var) {
        this.a = myyVar;
        this.b = xb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsx)) {
            return false;
        }
        vsx vsxVar = (vsx) obj;
        return jl40.l(this.a, vsxVar.a) && jl40.l(this.b, vsxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LastPanoramaState(iconState=" + this.a + ", params=" + this.b + Extension.C_BRAKE;
    }
}
