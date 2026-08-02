package defpackage;

import androidx.core.location.LocationListenerCompat;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class u9z {
    public final String a;
    public final LocationListenerCompat b;

    public u9z(String str, LocationListenerCompat locationListenerCompat) {
        y5e.H(str, "invalid null provider");
        this.a = str;
        this.b = locationListenerCompat;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u9z)) {
            return false;
        }
        u9z u9zVar = (u9z) obj;
        return this.a.equals(u9zVar.a) && this.b.equals(u9zVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
