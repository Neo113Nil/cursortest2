package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.i1;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class x6j {
    public final FormattedText a;
    public final FormattedText b;
    public final OrderDetailsCardResponse.CardIcon c;
    public final i1 d;

    public x6j(FormattedText formattedText, FormattedText formattedText2, OrderDetailsCardResponse.CardIcon cardIcon, i1 i1Var) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = cardIcon;
        this.d = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6j)) {
            return false;
        }
        x6j x6jVar = (x6j) obj;
        return this.a.equals(x6jVar.a) && this.b.equals(x6jVar.b) && jl40.l(this.c, x6jVar.c) && jl40.l(this.d, x6jVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.c(this.a.a.hashCode() * 31, 31, this.b.a)) * 31;
        i1 i1Var = this.d;
        return hashCode + (i1Var == null ? 0 : i1Var.hashCode());
    }

    public final String toString() {
        StringBuilder r = n.r("RoutePointContractModel(title=", this.a, ", subtitle=", this.b, ", icon=");
        r.append(this.c);
        r.append(", accessory=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
