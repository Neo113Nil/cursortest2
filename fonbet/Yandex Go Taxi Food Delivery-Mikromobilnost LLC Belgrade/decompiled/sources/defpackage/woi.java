package defpackage;

import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class woi {
    public final c4r0 a;
    public final c8r b;

    public woi(c4r0 c4r0Var, c8r c8rVar) {
        this.a = c4r0Var;
        this.b = c8rVar;
    }

    public final pzt0 a(String str) {
        mi31 b = c8r.b(this.b, str, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, null, 4);
        if (b == null) {
            return null;
        }
        return this.a.a(new gnx0(new fnx0(b, SelectionOrigin.ACTION), true));
    }
}
