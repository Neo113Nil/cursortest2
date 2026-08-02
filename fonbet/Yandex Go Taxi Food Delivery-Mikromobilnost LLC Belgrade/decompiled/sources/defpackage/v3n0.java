package defpackage;

import com.yandex.go.scooters.api.analytics.AnalyticsCameraState;
import com.yandex.go.scooters.api.analytics.CameraTappedButton;
import com.yandex.go.scooters.deposit.communication.ui.ScootersDepositCommunicationModalView;
import com.yandex.go.scooters.insurance.details.ScootersInsuranceDetailsModalView;
import com.yandex.go.scooters.misc.common_dialog.ScootersCommonDialogModalView;
import com.yandex.go.scooters.misc.error_dialog.ScootersErrorDialogModalView;
import com.yandex.go.scooters.offers.v2.details.ScootersOfferDetailsModalView;
import com.yandex.go.scooters.passes.details.ScootersPassesDetailsModalView;
import com.yandex.go.scooters.passes.purchased.ScootersPurchasedPassStatusModalView;
import com.yandex.go.scooters.preselection.loading.v2.ScootersPreselectionLoadingV2ModalView;
import com.yandex.go.scooters.promocodes.status.ScootersPromocodesStatusModalView;
import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionModalView;
import com.yandex.go.ui.a;
import org.webrtc.ScreenCapturerAndroid;
import ru.yandex.taxi.scooters.presentation.common.ui.ScootersCameraSlideableModalView;
import ru.yandex.taxi.scooters.presentation.common.ui.preview.ScootersVehiclePreviewView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.ScootersOrderSelectorView;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackCard;
import ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoModalView;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.b;
import ru.yandex.taxi.scooters.presentation.personal_goals.ScootersRideFinishPersonalGoalsModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class v3n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v3n0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 9;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ScootersCameraSlideableModalView) obj).onCloseClicked();
                break;
            case 1:
                ScootersCommonDialogModalView.onAttachedToWindow$lambda$0((ScootersCommonDialogModalView) obj);
                break;
            case 2:
                b bVar = (b) obj;
                ban0 ban0Var = bVar.n;
                CameraTappedButton cameraTappedButton = CameraTappedButton.TAKE_NEW_PHOTO;
                AnalyticsCameraState analyticsCameraState = AnalyticsCameraState.CAMERA;
                tso0 tso0Var = bVar.m;
                ban0Var.a(cameraTappedButton, analyticsCameraState, tso0Var.e, tso0Var.a);
                bVar.c();
                break;
            case 3:
                nan0 nan0Var = (nan0) obj;
                ban0 ban0Var2 = nan0Var.o;
                CameraTappedButton cameraTappedButton2 = CameraTappedButton.CLOSE;
                AnalyticsCameraState analyticsCameraState2 = AnalyticsCameraState.CAMERA;
                tso0 tso0Var2 = nan0Var.m;
                ban0Var2.a(cameraTappedButton2, analyticsCameraState2, tso0Var2.e, tso0Var2.a);
                ((o9n0) nan0Var.p.E).b.r(new qu(i2));
                break;
            case 4:
                ((com.yandex.go.scooters.misc.support.b) obj).r(new qu(i2));
                break;
            case 5:
                ScootersDepositCommunicationModalView.onAttachedToWindow$lambda$0((ScootersDepositCommunicationModalView) obj);
                break;
            case 6:
                ((fhn0) obj).run();
                break;
            case 7:
                ((fhn0) obj).run();
                break;
            case 8:
                ((mmw) obj).run();
                break;
            case 9:
                ((jin0) obj).run();
                break;
            case 10:
                ((jin0) obj).run();
                break;
            case 11:
                ScootersErrorDialogModalView.bindCloseButton$close((yjn0) obj);
                break;
            case 12:
                ScootersFeedbackCard.setupListeners$lambda$0((ScootersFeedbackCard) obj);
                break;
            case 13:
                ScootersFinishInfoModalView._init_$lambda$0((ScootersFinishInfoModalView) obj);
                break;
            case 14:
                ScootersInsuranceDetailsModalView.onAttachedToWindow$lambda$0((ScootersInsuranceDetailsModalView) obj);
                break;
            case 15:
                ScootersOfferDetailsModalView.onAttachedToWindow$lambda$0$0((ScootersOfferDetailsModalView) obj);
                break;
            case 16:
                ScootersOrderSelectorView.onAttachedToWindow$lambda$0$0((ScootersOrderSelectorView) obj);
                break;
            case 17:
                ScootersPassesDetailsModalView.onAttachedToWindow$lambda$0$closeButtonClicked((ido0) obj);
                break;
            case 18:
                sls slsVar = ((com.yandex.go.scooters.photocontrol.camera_ui.take_photo.b) obj).b;
                if (slsVar == null) {
                    slsVar = null;
                }
                slsVar.invoke();
                break;
            case 19:
                ScootersPreselectionLoadingV2ModalView._init_$lambda$2((ScootersPreselectionLoadingV2ModalView) obj);
                break;
            case 20:
                ScootersPreselectionLoadingV2ModalView._init_$geoTapped((ylo0) obj);
                break;
            case 21:
                ScootersPromocodesStatusModalView._init_$closeButtonClicked((nno0) obj);
                break;
            case 22:
                ScootersPurchasedPassStatusModalView.bindData$lambda$0$0((ScootersPurchasedPassStatusModalView) obj);
                break;
            case 23:
                ScootersRideFinishPersonalGoalsModalView.bindState$lambda$0((ScootersRideFinishPersonalGoalsModalView) obj);
                break;
            case 24:
                ScootersTariffFixSelectionModalView._init_$handleFocus((com.yandex.go.scooters.tariff_fix.selection.b) obj);
                break;
            case 25:
                ScootersVehiclePreviewView.alternativeOffer$lambda$0((ScootersVehiclePreviewView) obj);
                break;
            case 26:
                ((ScreenCapturerAndroid) obj).updateVirtualDisplay();
                break;
            case 27:
                ((a) obj).invoke();
                break;
            case 28:
                ((en7) obj).a();
                break;
            default:
                ((xlp0) obj).invoke();
                break;
        }
    }
}
