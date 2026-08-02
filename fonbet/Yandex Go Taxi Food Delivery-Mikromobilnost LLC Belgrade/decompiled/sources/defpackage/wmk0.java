package defpackage;

import android.os.SystemClock;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wmk0 implements c6y0 {
    public final TaxiOrderSessionCheckpoint a;
    public final long b;
    public final long c;
    public final RideCardPresentationType d;
    public final vfk0 e;

    public wmk0(TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint, long j, RideCardPresentationType rideCardPresentationType, vfk0 vfk0Var, int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        vfk0Var = (i & 16) != 0 ? null : vfk0Var;
        this.a = taxiOrderSessionCheckpoint;
        this.b = elapsedRealtime;
        this.c = j;
        this.d = rideCardPresentationType;
        this.e = vfk0Var;
    }

    @Override // defpackage.c6y0
    public final TaxiOrderSessionCheckpoint a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmk0)) {
            return false;
        }
        wmk0 wmk0Var = (wmk0) obj;
        return this.a == wmk0Var.a && this.b == wmk0Var.b && this.c == wmk0Var.c && this.d == wmk0Var.d && jl40.l(this.e, wmk0Var.e);
    }

    @Override // defpackage.c6y0
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        vfk0 vfk0Var = this.e;
        return hashCode + (vfk0Var == null ? 0 : vfk0Var.hashCode());
    }

    public final String toString() {
        return "RideCardSessionEvent(checkpoint=" + this.a + ", timestamp=" + this.b + ", frameTime=" + qv10.k(this.c, "FrameTime(value=", Extension.C_BRAKE) + ", presentationType=" + this.d + ", sourceType=" + this.e + Extension.C_BRAKE;
    }
}
