package defpackage;

import com.yandex.go.navigator.incidents.report.IncidentReportType;
import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uov {
    public final IncidentReportType a;
    public final Point b;

    public uov(IncidentReportType incidentReportType, Point point) {
        this.a = incidentReportType;
        this.b = point;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uov)) {
            return false;
        }
        uov uovVar = (uov) obj;
        return this.a == uovVar.a && jl40.l(this.b, uovVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 961);
    }

    public final String toString() {
        return "IncidentEvent(type=" + this.a + ", comment=, point=" + this.b + Extension.C_BRAKE;
    }
}
