package defpackage;

import com.yandex.go.experiment.UserPhotoUploadingExperiment;
import com.yandex.go.taxi.order.experiments.TaxiTravelerMovementExperiment;
import com.yandex.go.taxi.order.models.api.experiments.PaidWaitingTimerInCardExperiment;
import com.yandex.go.taxi.order.models.api.experiments.StatusInfoTimerSourceSelectionExperiment;
import com.yandex.go.taxi.order.models.api.experiments.UseFeedbackProposalExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.LootBoxExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.OrderShareSettingsExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.QualityQuestionExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.SearchOrderDetailsExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.SearchProgressExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment;
import com.yandex.go.telemetry.experiment.TelemetryReportConfigExperiment;
import com.yandex.go.tips.experiments.TipsSettingsModalExperiment;
import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import com.yandex.go.ugc.entities.UGCItemExperiment;
import com.yandex.go.universal_qr_scanner.experiments.config.UniversalQrScannerConfigExperiment;
import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import com.yandex.go.user_profile.settings.profile.data.LogoutAvailabilityForServiceOrdersExperiment;
import com.yandex.go.walking.navigation.impl.experiment.WalkNavExperiment;
import com.yandex.go.xiva.experiments.XivaEnabledExperiment;
import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import com.yandex.go.yb.experiments.ChangeToYbWalletExperiment;
import com.yandex.go.yb.experiments.ForceYbPromosOnSummaryExperiment;
import com.yandex.go.yb.experiments.SuggestYandexCardInRideExperiment;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class xiq implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ xiq(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return TaxiTravelerMovementExperiment.Companion.serializer();
            case 1:
                return SearchProgressExperiment.Companion.serializer();
            case 2:
                return OrderShareSettingsExperiment.Companion.serializer();
            case 3:
                return SearchOrderDetailsExperiment.Companion.serializer();
            case 4:
                return PaidWaitingTimerInCardExperiment.Companion.serializer();
            case 5:
                return QualityQuestionExperiment.Companion.serializer();
            case 6:
                return WalkRouteOrderExperiment.Companion.serializer();
            case 7:
                return LootBoxExperiment.Companion.serializer();
            case 8:
                return StatusInfoTimerSourceSelectionExperiment.Companion.serializer();
            case 9:
                return RoadObjectSettingsExperiment.Companion.serializer();
            case 10:
                return UseFeedbackProposalExperiment.Companion.serializer();
            case 11:
                return TipsSettingsModalExperiment.Companion.serializer();
            case 12:
                return TelemetryReportConfigExperiment.Companion.serializer();
            case 13:
                return soz0.Companion.serializer();
            case 14:
                return TransferRequirementExperiment.Companion.serializer();
            case 15:
                return UGCItemExperiment.Companion.serializer();
            case 16:
                return UniversalQrScannerConfigExperiment.Companion.serializer();
            case 17:
                return UserPhotoUploadingExperiment.Companion.serializer();
            case 18:
                return q8i0.Companion.serializer();
            case 19:
                return ms21.Companion.serializer();
            case 20:
                return LogoutAvailabilityForServiceOrdersExperiment.Companion.serializer();
            case 21:
                return UserProfileExperiment.Companion.serializer();
            case 22:
                return iy21.Companion.serializer();
            case 23:
                return WalkNavExperiment.Companion.serializer();
            case 24:
                return WebViewFromDeeplinkExperiment.Companion.serializer();
            case 25:
                return XivaEnabledExperiment.Companion.serializer();
            case 26:
                return YbWalletEntryPointExperiment.Companion.serializer();
            case 27:
                return ForceYbPromosOnSummaryExperiment.Companion.serializer();
            case 28:
                return ChangeToYbWalletExperiment.Companion.serializer();
            default:
                return SuggestYandexCardInRideExperiment.Companion.serializer();
        }
    }
}
