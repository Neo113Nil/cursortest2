package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vsj0 implements atj0 {
    public final DrivingRoute a;

    public final boolean equals(Object obj) {
        if (obj instanceof vsj0) {
            return this.a.equals(((vsj0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResolvedCarRoute(route=" + this.a + Extension.C_BRAKE;
    }
}
