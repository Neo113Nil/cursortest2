package defpackage;

import com.yandex.mapkit.transport.masstransit.Route;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ysj0 implements atj0 {
    public final Route a;

    public final boolean equals(Object obj) {
        if (obj instanceof ysj0) {
            return this.a.equals(((ysj0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResolvedScooterRoute(route=" + this.a + Extension.C_BRAKE;
    }
}
