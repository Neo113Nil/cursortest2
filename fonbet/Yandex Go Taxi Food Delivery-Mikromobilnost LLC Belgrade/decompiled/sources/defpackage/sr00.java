package defpackage;

import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sr00 {
    public final boolean a;
    public final PlacesMapConfig$PlacesMapScreenName b;

    public sr00(boolean z, PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName) {
        this.a = z;
        this.b = placesMapConfig$PlacesMapScreenName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr00)) {
            return false;
        }
        sr00 sr00Var = (sr00) obj;
        return this.a == sr00Var.a && this.b == sr00Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MapScreenInfo(isFirstScreen=" + this.a + ", screen=" + this.b + Extension.C_BRAKE;
    }
}
