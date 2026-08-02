package defpackage;

import android.os.SystemClock;
import com.yandex.go.taxi.order.details.v2.navigation.d;
import com.yandex.go.taxi.order.infosharing.data.a;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.OrderShareSettingsExperiment;

/* loaded from: classes14.dex */
public final class v2y0 implements u2y0 {
    public final h3y a;
    public final h3y b;

    public v2y0(h3y h3yVar, h3y h3yVar2) {
        this.a = h3yVar;
        this.b = h3yVar2;
    }

    public final void a(o2y0 o2y0Var) {
        RideCardInfoResponse.PresentationsDto presentationsDto;
        TaxiOrder b = o2y0Var.b();
        RideCardInfoResponse rideCardInfoResponse = b.V().o0;
        RideCardInfoResponse.PresentationsDto.Sharing sharing = (rideCardInfoResponse == null || (presentationsDto = rideCardInfoResponse.c) == null) ? null : presentationsDto.c;
        OrderStatusInfo V = b.V();
        V.getClass();
        qn11 qn11Var = OrderShareSettingsExperiment.j;
        qn11 b2 = V.b(OrderShareSettingsExperiment.class);
        if (b2 != null) {
            qn11Var = b2;
        }
        long j = ((OrderShareSettingsExperiment) qn11Var).g;
        if (sharing == null || sharing.a.isEmpty() || j <= 0) {
            ((a) this.b.get()).a(b, msb1.W);
        } else {
            ((d) this.a.get()).g(new s9y0(o2y0Var, SystemClock.elapsedRealtime() + j, new hhs0(25, this, b)));
        }
    }
}
