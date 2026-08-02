package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import ru.CryptoPro.JCP.ProviderParameters;

/* loaded from: classes8.dex */
public final class wuz {
    public static void a(TaxiOrder taxiOrder, isq isqVar, int i, int i2) {
        TaxiOrderTipsState y;
        if (uga1.d(i2) || i2 == i) {
            return;
        }
        if (taxiOrder == null || (y = taxiOrder.y()) == null || diz0.e(y)) {
            isqVar.h = ProviderParameters.DEFAULT_PRODUCT_VER;
            isqVar.i = true;
            if (taxiOrder != null) {
                synchronized (taxiOrder) {
                    taxiOrder.l = taxiOrder.l.V();
                }
                taxiOrder.S(diz0.c());
            }
        }
    }
}
