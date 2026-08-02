package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.i1;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class w6j {
    public final FormattedText a;
    public final OrderDetailsCardResponse.CardIcon b;
    public final i1 c;

    public w6j(FormattedText formattedText, OrderDetailsCardResponse.CardIcon cardIcon, i1 i1Var) {
        this.a = formattedText;
        this.b = cardIcon;
        this.c = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6j)) {
            return false;
        }
        w6j w6jVar = (w6j) obj;
        return this.a.equals(w6jVar.a) && jl40.l(this.b, w6jVar.b) && jl40.l(this.c, w6jVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        i1 i1Var = this.c;
        return hashCode + (i1Var == null ? 0 : i1Var.hashCode());
    }

    public final String toString() {
        return "AddRoutePointContractModel(title=" + this.a + ", icon=" + this.b + ", accessory=" + this.c + Extension.C_BRAKE;
    }
}
