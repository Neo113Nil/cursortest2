package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yve {
    public final zzs a;
    public final Float b;

    public yve(zzs zzsVar, Float f) {
        this.a = zzsVar;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yve)) {
            return false;
        }
        yve yveVar = (yve) obj;
        return jl40.l(this.a, yveVar.a) && jl40.l(this.b, yveVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "CorrectedGeoPointEvent(geoPoint=" + this.a + ", zoom=" + this.b + Extension.C_BRAKE;
    }
}
