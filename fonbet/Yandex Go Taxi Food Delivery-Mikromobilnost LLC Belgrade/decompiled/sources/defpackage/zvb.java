package defpackage;

import defpackage.now;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class zvb {
    public static final zvb c = new zvb(false, null);
    public final boolean a;
    public final now.a b;

    public zvb(boolean z, now.a aVar) {
        this.a = z;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvb)) {
            return false;
        }
        zvb zvbVar = (zvb) obj;
        return this.a == zvbVar.a && jl40.l(this.b, zvbVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        now.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "CitiesOnSummary(showCitiesOnSummary=" + this.a + ", citiesOnSummaryFormat=" + this.b + Extension.C_BRAKE;
    }
}
