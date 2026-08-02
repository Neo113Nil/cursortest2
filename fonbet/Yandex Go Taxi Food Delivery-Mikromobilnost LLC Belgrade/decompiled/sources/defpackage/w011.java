package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.paymentcards.TransportCardStatus;

/* loaded from: classes6.dex */
public final class w011 {
    public final String a;
    public final TransportCardStatus b;
    public final r011 c;

    public w011(String str, TransportCardStatus transportCardStatus, r011 r011Var) {
        this.a = str;
        this.b = transportCardStatus;
        this.c = r011Var;
        MapBuilder mapBuilder = new MapBuilder();
        if (str != null) {
            mapBuilder.put("card_id", str);
        }
        if (transportCardStatus != null) {
            mapBuilder.put("card_status", transportCardStatus.getEventValue());
        }
        if (r011Var != null) {
            mapBuilder.put("card_balance", r011Var.d);
        }
        mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w011)) {
            return false;
        }
        w011 w011Var = (w011) obj;
        return jl40.l(this.a, w011Var.a) && this.b == w011Var.b && jl40.l(this.c, w011Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TransportCardStatus transportCardStatus = this.b;
        int hashCode2 = (hashCode + (transportCardStatus == null ? 0 : transportCardStatus.hashCode())) * 31;
        r011 r011Var = this.c;
        return hashCode2 + (r011Var != null ? r011Var.hashCode() : 0);
    }

    public final String toString() {
        return "TransportCardItem(cardId=" + this.a + ", cardStatus=" + this.b + ", cardBalance=" + this.c + Extension.C_BRAKE;
    }

    public w011() {
        this(null, null, null);
    }
}
