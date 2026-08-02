package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rfl0 {
    public final DrivingRoute a;

    public rfl0(DrivingRoute drivingRoute) {
        this.a = drivingRoute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfl0) && jl40.l(this.a, ((rfl0) obj).a);
    }

    public final int hashCode() {
        DrivingRoute drivingRoute = this.a;
        if (drivingRoute == null) {
            return 0;
        }
        return drivingRoute.hashCode();
    }

    public final String toString() {
        return "RouteWayVo(drivingRoute=" + this.a + Extension.C_BRAKE;
    }
}
