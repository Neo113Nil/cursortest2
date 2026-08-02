package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.altpins.order.p;
import ru.yandex.taxi.order.view.walking_info.WalkingInfoView;

/* loaded from: classes14.dex */
public final /* synthetic */ class rkk0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RideCardModalView b;

    public /* synthetic */ rkk0(RideCardModalView rideCardModalView, int i) {
        this.a = i;
        this.b = rideCardModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onAttachedToWindow$lambda$2;
        zy11 onAttachedToWindow$lambda$3;
        int dp8_delegate$lambda$0;
        int dp12_delegate$lambda$0;
        int dp16_delegate$lambda$0;
        int dp48_delegate$lambda$0;
        int dp56_delegate$lambda$0;
        ukk0 ukk0Var;
        Object value;
        TaxiOrder taxiOrder;
        WalkingInfoView walkingInfoView;
        int i = this.a;
        RideCardModalView rideCardModalView = this.b;
        switch (i) {
            case 0:
                onAttachedToWindow$lambda$2 = RideCardModalView.onAttachedToWindow$lambda$2(rideCardModalView);
                return onAttachedToWindow$lambda$2;
            case 1:
                onAttachedToWindow$lambda$3 = RideCardModalView.onAttachedToWindow$lambda$3(rideCardModalView);
                return onAttachedToWindow$lambda$3;
            case 2:
                dp8_delegate$lambda$0 = RideCardModalView.dp8_delegate$lambda$0(rideCardModalView);
                return Integer.valueOf(dp8_delegate$lambda$0);
            case 3:
                dp12_delegate$lambda$0 = RideCardModalView.dp12_delegate$lambda$0(rideCardModalView);
                return Integer.valueOf(dp12_delegate$lambda$0);
            case 4:
                dp16_delegate$lambda$0 = RideCardModalView.dp16_delegate$lambda$0(rideCardModalView);
                return Integer.valueOf(dp16_delegate$lambda$0);
            case 5:
                dp48_delegate$lambda$0 = RideCardModalView.dp48_delegate$lambda$0(rideCardModalView);
                return Integer.valueOf(dp48_delegate$lambda$0);
            case 6:
                dp56_delegate$lambda$0 = RideCardModalView.dp56_delegate$lambda$0(rideCardModalView);
                return Integer.valueOf(dp56_delegate$lambda$0);
            default:
                ukk0Var = rideCardModalView.presenter;
                rpk0 rpk0Var = ukk0Var.z;
                y641 y641Var = (y641) rpk0Var.b.get();
                o2y0 o2y0Var = rpk0Var.a;
                ((p) y641Var).b(o2y0Var);
                r0 r0Var = o2y0Var.a;
                do {
                    value = r0Var.getValue();
                    taxiOrder = (TaxiOrder) value;
                    taxiOrder.getClass();
                    synchronized (taxiOrder) {
                        TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
                        taxiOrderLocalData.getClass();
                        taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -134217729, 16777215);
                    }
                } while (!r0Var.k(value, taxiOrder));
                o2y0Var.f();
                walkingInfoView = rideCardModalView.walkingInfoView;
                if (walkingInfoView != null) {
                    walkingInfoView.setVisibility(8);
                }
                rideCardModalView.setBehaviorState(7);
                return zy11.a;
        }
    }
}
