package defpackage;

import com.yandex.go.zone.dto.objects.ComboExtra;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class qjc {
    public final boolean a;
    public final ComboExtra.RouteDisplayType b;

    public qjc(boolean z, ComboExtra.RouteDisplayType routeDisplayType) {
        this.a = z;
        this.b = routeDisplayType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjc)) {
            return false;
        }
        qjc qjcVar = (qjc) obj;
        return this.a == qjcVar.a && this.b == qjcVar.b;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        ComboExtra.RouteDisplayType routeDisplayType = this.b;
        return hashCode + (routeDisplayType == null ? 0 : routeDisplayType.hashCode());
    }

    public final String toString() {
        return "ComboTariffExtra(isBufferCombo=" + this.a + ", routeDisplayType=" + this.b + Extension.C_BRAKE;
    }
}
