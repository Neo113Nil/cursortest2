package defpackage;

import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes10.dex */
public final class y7u {
    public static final qrq0 b = j73.v(new String[]{"linked_order_statuses", "eats_statuses", "logistic_statuses", "scooters_statuses", "shuttle_statuses"});
    public static final qrq0 c = j73.v(new String[]{"linked_order", "eats", "logistic", "scooters", TariffOrderFlow.ORDER_FLOW_SHUTTLE_KEY});
    public final cne0 a;

    public y7u(dne0 dne0Var) {
        this.a = dne0Var.a("ru.yandex.taxi.utils.HasOngoingOrdersRepository");
    }
}
