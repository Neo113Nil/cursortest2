package defpackage;

import com.yandex.go.taxi.order.experiments.TrackingTariffIconOverlayExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.objects.OriginalRequest;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.carplates.experiments.CarPlateAppearanceExperiment;

/* loaded from: classes14.dex */
public final class t48 {
    public final v880 a;

    public t48(v880 v880Var) {
        this.a = v880Var;
    }

    public final q48 a(TaxiOrder taxiOrder, boolean z) {
        Object obj;
        Object obj2;
        List list;
        List list2;
        p48 p48Var = new p48();
        OrderStatusInfo V = taxiOrder.V();
        if (z) {
            p48Var.f = taxiOrder.n();
            OriginalRequest originalRequest = taxiOrder.V().f;
            taxiOrder.N();
        }
        if (!jl40.l(V.g, Driver.v)) {
            OrderStatusInfo V2 = taxiOrder.V();
            CarPlateAppearanceExperiment.Companion.getClass();
            CarPlateAppearanceExperiment carPlateAppearanceExperiment = (CarPlateAppearanceExperiment) V2.d(CarPlateAppearanceExperiment.e);
            Driver driver = V.g;
            String x = taxiOrder.x();
            v880 v880Var = this.a;
            v880Var.a.getClass();
            rqo rqoVar = v880Var.b;
            TrackingTariffIconOverlayExperiment.Companion.getClass();
            boolean z2 = false;
            TrackingTariffIconOverlayExperiment trackingTariffIconOverlayExperiment = (TrackingTariffIconOverlayExperiment) ((jbh) rqoVar).c(new TrackingTariffIconOverlayExperiment(0)).b();
            boolean z3 = trackingTariffIconOverlayExperiment.b;
            List list3 = trackingTariffIconOverlayExperiment.c;
            List list4 = EmptyList.a;
            if (z3) {
                List list5 = list3;
                Iterator it = list5.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (jl40.l(((TrackingTariffIconOverlayExperiment.TrackingCardIconOverlayExperimentIconModel) obj2).a, "none")) {
                        break;
                    }
                }
                TrackingTariffIconOverlayExperiment.TrackingCardIconOverlayExperimentIconModel trackingCardIconOverlayExperimentIconModel = (TrackingTariffIconOverlayExperiment.TrackingCardIconOverlayExperimentIconModel) obj2;
                if (trackingCardIconOverlayExperimentIconModel == null || (list = trackingCardIconOverlayExperimentIconModel.b) == null) {
                    list = list4;
                }
                if (!list.contains(x)) {
                    Iterator it2 = list5.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (jl40.l(((TrackingTariffIconOverlayExperiment.TrackingCardIconOverlayExperimentIconModel) next).a, "tracked_order_combo")) {
                            obj = next;
                            break;
                        }
                    }
                    TrackingTariffIconOverlayExperiment.TrackingCardIconOverlayExperimentIconModel trackingCardIconOverlayExperimentIconModel2 = (TrackingTariffIconOverlayExperiment.TrackingCardIconOverlayExperimentIconModel) obj;
                    if (trackingCardIconOverlayExperimentIconModel2 == null || (list2 = trackingCardIconOverlayExperimentIconModel2.b) == null) {
                        list2 = list4;
                    }
                    z2 = list2.contains(x);
                }
            }
            p48Var.a = driver.b;
            p48Var.d = driver.a;
            p48Var.b = driver.c;
            p48Var.c = driver.d;
            p48Var.g = taxiOrder.g;
            if (carPlateAppearanceExperiment.b) {
                list4 = a.M(carPlateAppearanceExperiment.c);
            }
            p48Var.h = list4;
            p48Var.e = driver.j;
            p48Var.i = z2;
        }
        return new q48(p48Var);
    }
}
