package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.tickets.analyticks.MasstransitTicketsAnalytics$TicketActivationType;

/* loaded from: classes15.dex */
public final class v510 {
    public final String a;
    public final MasstransitTicketsAnalytics$TicketActivationType b;
    public final MapBuilder c;

    public v510(String str, MasstransitTicketsAnalytics$TicketActivationType masstransitTicketsAnalytics$TicketActivationType) {
        this.a = str;
        this.b = masstransitTicketsAnalytics$TicketActivationType;
        MapBuilder y = qv10.y("ticket_id", str);
        if (masstransitTicketsAnalytics$TicketActivationType != null) {
            y.put("activation_type", masstransitTicketsAnalytics$TicketActivationType.getEventValue());
        }
        this.c = y.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v510)) {
            return false;
        }
        v510 v510Var = (v510) obj;
        return jl40.l(this.a, v510Var.a) && this.b == v510Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MasstransitTicketsAnalytics$TicketActivationType masstransitTicketsAnalytics$TicketActivationType = this.b;
        return hashCode + (masstransitTicketsAnalytics$TicketActivationType == null ? 0 : masstransitTicketsAnalytics$TicketActivationType.hashCode());
    }

    public final String toString() {
        return "TicketActivationItem(ticketId=" + this.a + ", activationType=" + this.b + Extension.C_BRAKE;
    }
}
