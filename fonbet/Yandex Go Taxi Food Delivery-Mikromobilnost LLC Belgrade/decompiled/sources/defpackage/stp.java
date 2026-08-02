package defpackage;

import com.yandex.go.image.loader.experiments.ImagesParametersExperiment;
import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import com.yandex.go.inapp_calls.experiment.RegsConnectionRetryExperiment;
import com.yandex.go.inapp_calls.experiment.VoipCallHangupConfirmationExperiment;
import com.yandex.go.inapp_calls.experiment.VoipCallUiRedesignExperiment;
import com.yandex.go.payments.badges.PaymentMethodsBadgesExperiment;
import com.yandex.go.payments.cards.nfc.experiments.NfcScanCardExperiment;
import com.yandex.go.payments.experiments.RidePaymentMethodSelectAfterBindingExperiment;
import com.yandex.go.payments.paymentlist.experiments.ExtraTipsPaymentMethodsExperiment;
import com.yandex.go.payments.paymentlist.experiments.ForcedPaymentMethodChangeExperiment;
import com.yandex.go.payments.paymentlist.experiments.MaasPaymentOptionExperiment;
import com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperiment;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCashIconExperiment;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCustomSubtitlesExperiment;
import com.yandex.go.payments.paymentlist.experiments.YbWalletTopUpRuleExperiment;
import com.yandex.go.payments.paymentlist.experiments.change_payment_modal.ShowChangePaymentMethodOnSummaryExperiment;
import com.yandex.go.payments.shared.antifraud.experiments.CorpAntiFraudExperiment;
import com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import com.yandex.go.payments.shared.details.experiments.ForceZaloginForFamilyExperiment;
import com.yandex.go.payments.yb.experiments.YbInPaymentsPromotionExperiment;
import com.yandex.go.taxi.intercity.dashboard.impl.experiment.IntercityDashboardFeedbackExperiment;
import com.yandex.go.taxi.intercity.dashboard.impl.experiment.IntercityDashboardWaitingContentTimeExperiment;
import ru.yandex.taxi.jobs.push.ToggleJobsExperiment;
import ru.yandex.taxi.layers.experiments.LayersObjectsAnimationParamsExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class stp implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ stp(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ShowChangePaymentMethodOnSummaryExperiment.Companion.serializer();
            case 1:
                return ForceZaloginForFamilyExperiment.Companion.serializer();
            case 2:
                return ExtraTipsPaymentMethodsExperiment.Companion.serializer();
            case 3:
                return PaymentMethodsCustomSubtitlesExperiment.Companion.serializer();
            case 4:
                return PaymentMethodsBadgesExperiment.Companion.serializer();
            case 5:
                return NfcScanCardExperiment.Companion.serializer();
            case 6:
                return CorpAccountFlowExperiment.Companion.serializer();
            case 7:
                return YbInPaymentsPromotionExperiment.Companion.serializer();
            case 8:
                return RidePaymentMethodSelectAfterBindingExperiment.Companion.serializer();
            case 9:
                return BusinessAccountFlowExperiment.Companion.serializer();
            case 10:
                return ForcedPaymentMethodChangeExperiment.Companion.serializer();
            case 11:
                return CorpAntiFraudExperiment.Companion.serializer();
            case 12:
                return YbWalletTopUpRuleExperiment.Companion.serializer();
            case 13:
                return MainMenuPaymentMethodsSelectorExperiment.Companion.serializer();
            case 14:
                return PaymentMethodsCashIconExperiment.Companion.serializer();
            case 15:
                return MaasPaymentOptionExperiment.Companion.serializer();
            case 16:
                return eku.Companion.serializer();
            case 17:
                return b660.Companion.serializer();
            case 18:
                return ImagesParametersExperiment.Companion.serializer();
            case 19:
                return RegsConnectionRetryExperiment.Companion.serializer();
            case 20:
                return VoipCallUiRedesignExperiment.Companion.serializer();
            case 21:
                return InAppCallExperiment.Companion.serializer();
            case 22:
                return VoipCallHangupConfirmationExperiment.Companion.serializer();
            case 23:
                return IntercityDashboardWaitingContentTimeExperiment.Companion.serializer();
            case 24:
                return IntercityDashboardFeedbackExperiment.Companion.serializer();
            case 25:
                return ylw.Companion.serializer();
            case 26:
                return ToggleJobsExperiment.Companion.serializer();
            case 27:
                return xsa0.Companion.serializer();
            case 28:
                return LayersObjectsAnimationParamsExperiment.Companion.serializer();
            default:
                return lf11.Companion.serializer();
        }
    }
}
