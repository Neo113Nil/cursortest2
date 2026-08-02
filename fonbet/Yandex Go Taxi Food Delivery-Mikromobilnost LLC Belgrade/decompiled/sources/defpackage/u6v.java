package defpackage;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class u6v implements w6v {
    public final GasStationSearchType a;

    public u6v(GasStationSearchType gasStationSearchType) {
        this.a = gasStationSearchType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u6v) && this.a == ((u6v) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NoResult(searchType=" + this.a + Extension.C_BRAKE;
    }
}
