package defpackage;

import com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService;
import com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService;
import com.yandex.go.superapp.order_tracking.common.experiments.f;
import java.util.Arrays;
import java.util.List;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class x5w0 extends xqt {
    public static final x5w0 e = new x5w0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, f.INSTANCE.serializer(), qoi0.a(f.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService.Companion.serializer(), qoi0.a(SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService.class)), new f9("external", SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService.Companion.serializer(), qoi0.a(SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService.class)));
    }
}
