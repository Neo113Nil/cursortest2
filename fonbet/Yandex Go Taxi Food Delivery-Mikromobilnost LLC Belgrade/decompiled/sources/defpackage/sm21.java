package defpackage;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class sm21 {
    public static final sm21 c = new sm21(null, null);
    public final GnssMeasurementsEvent a;
    public final GnssStatus b;

    public sm21(GnssMeasurementsEvent gnssMeasurementsEvent, GnssStatus gnssStatus) {
        this.a = gnssMeasurementsEvent;
        this.b = gnssStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm21)) {
            return false;
        }
        sm21 sm21Var = (sm21) obj;
        return jl40.l(this.a, sm21Var.a) && jl40.l(this.b, sm21Var.b);
    }

    public final int hashCode() {
        GnssMeasurementsEvent gnssMeasurementsEvent = this.a;
        int hashCode = (gnssMeasurementsEvent == null ? 0 : gnssMeasurementsEvent.hashCode()) * 31;
        GnssStatus gnssStatus = this.b;
        return hashCode + (gnssStatus != null ? gnssStatus.hashCode() : 0);
    }

    public final String toString() {
        return "GnssSnapshot(event=" + this.a + ", gnssStatus=" + this.b + Extension.C_BRAKE;
    }
}
