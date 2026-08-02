package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.altpins.models.b;

/* loaded from: classes5.dex */
public final class s2e {
    public final b a;
    public final DrivingRoute b;

    static {
        new b(0);
    }

    public s2e(b bVar, DrivingRoute drivingRoute) {
        this.a = bVar;
        this.b = drivingRoute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2e)) {
            return false;
        }
        s2e s2eVar = (s2e) obj;
        return jl40.l(this.a, s2eVar.a) && jl40.l(this.b, s2eVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        DrivingRoute drivingRoute = this.b;
        return hashCode + (drivingRoute == null ? 0 : drivingRoute.hashCode());
    }

    public final String toString() {
        return "State(confirmationScreen=" + this.a + ", drivingRoute=" + this.b + Extension.C_BRAKE;
    }
}
