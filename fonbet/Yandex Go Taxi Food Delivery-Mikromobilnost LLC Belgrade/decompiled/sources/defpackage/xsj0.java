package defpackage;

import com.yandex.mapkit.transport.masstransit.Route;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xsj0 implements atj0 {
    public final Route a;

    public final boolean equals(Object obj) {
        if (obj instanceof xsj0) {
            return this.a.equals(((xsj0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResolvedMtTaxiRoute(route=" + this.a + Extension.C_BRAKE;
    }
}
