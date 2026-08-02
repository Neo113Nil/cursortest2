package defpackage;

import com.yandex.go.navigator.incidents.IncidentType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class t3j0 implements v3j0 {
    public final IncidentType a;

    public t3j0(IncidentType incidentType) {
        this.a = incidentType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3j0) && this.a == ((t3j0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuccessWithType(incidentType=" + this.a + Extension.C_BRAKE;
    }
}
