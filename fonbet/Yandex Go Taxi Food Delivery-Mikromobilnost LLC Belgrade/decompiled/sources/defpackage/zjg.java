package defpackage;

import com.yandex.go.navigator.incidents.IncidentType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zjg {
    public final IncidentType a;
    public final boolean b;

    public zjg(IncidentType incidentType, boolean z) {
        this.a = incidentType;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjg)) {
            return false;
        }
        zjg zjgVar = (zjg) obj;
        return this.a == zjgVar.a && this.b == zjgVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + unr0.e(this.a.hashCode() * 31, 31, true);
    }

    public final String toString() {
        return "IncidentButton(type=" + this.a + ", enabled=true, selected=" + this.b + Extension.C_BRAKE;
    }
}
