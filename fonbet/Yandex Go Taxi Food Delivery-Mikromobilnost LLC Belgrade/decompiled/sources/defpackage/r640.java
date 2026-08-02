package defpackage;

import com.yandex.go.masstransit.sdk.order.api.tickets.analytics.MtTicketActivationType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class r640 {
    public final String a;
    public final MtTicketActivationType b;

    public r640(String str, MtTicketActivationType mtTicketActivationType) {
        this.a = str;
        this.b = mtTicketActivationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r640)) {
            return false;
        }
        r640 r640Var = (r640) obj;
        return jl40.l(this.a, r640Var.a) && this.b == r640Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MtTicketActivationType mtTicketActivationType = this.b;
        return hashCode + (mtTicketActivationType == null ? 0 : mtTicketActivationType.hashCode());
    }

    public final String toString() {
        return "MtTicketActivationItem(ticketId=" + this.a + ", activationType=" + this.b + Extension.C_BRAKE;
    }
}
