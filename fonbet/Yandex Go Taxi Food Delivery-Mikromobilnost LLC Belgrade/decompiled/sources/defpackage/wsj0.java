package defpackage;

import com.yandex.mapkit.transport.masstransit.Route;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wsj0 implements atj0 {
    public final Route a;

    public final boolean equals(Object obj) {
        if (obj instanceof wsj0) {
            return this.a.equals(((wsj0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResolvedMtRoute(route=" + this.a + Extension.C_BRAKE;
    }
}
