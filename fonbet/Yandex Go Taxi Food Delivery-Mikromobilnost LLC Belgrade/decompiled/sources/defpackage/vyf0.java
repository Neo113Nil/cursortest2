package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.yandex.go.inapp_calls.ui.fullscreenintent.RequestUseFullScreenIntentModalView;
import com.yandex.go.rida.header.ui.RidaHeaderView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardCompanionSectionView;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.timeline.i;
import com.yandex.messaging.ui.resolvelink.invitelink.ResolveInviteLinkDialogFragment;
import com.ybsdk.feature.main.internal.screens.products.views.PulsingGradientDrawable;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSubscriptionScreenParams;
import com.ybsdk.feature.qr.payments.api.data.AgreementEntity;
import com.ybsdk.feature.qr.payments.api.data.SubscriptionInfoEntity;
import com.ybsdk.feature.qr.payments.api.data.TryToRefreshEntity;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainFragment;
import com.ybsdk.feature.qr.payments.internal.screens.refresh.presentation.QrRefreshArguments;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.data.entities.SubscriptionStatus;
import com.ybsdk.feature.rebind.payment.internal.screens.RebindPaymentMethodFragment;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.QrReaderScanningConfigSchema;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceOptionSelectorView;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.component.RequiredAltChoiceComponentView;
import ru.yandex.taxi.ui.form.RequirementAddressFormModalView;

/* loaded from: classes3.dex */
public final /* synthetic */ class vyf0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vyf0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Bitmap gradientBitmapWithConfig_delegate$lambda$4;
        zy11 renderCommonScreenData$lambda$38$lambda$37$lambda$36;
        List list;
        zy11 onViewCreated$lambda$4$lambda$0;
        zy11 onViewCreated$lambda$4$lambda$1;
        View insetsType$lambda$0;
        BadgeView subtitleBadge_delegate$lambda$0;
        zy11 deliveryIntervalsClickListeners$lambda$1;
        View insetsType$lambda$02;
        zy11 DialogContent$lambda$6$lambda$5$lambda$4;
        ProtoWriter forwardWriter_delegate$lambda$0;
        zy11 _init_$lambda$0;
        ValueAnimator lottieViewFadeInAnimator_delegate$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return otb1.b(((wyf0) obj).a);
            case 1:
                gradientBitmapWithConfig_delegate$lambda$4 = PulsingGradientDrawable.gradientBitmapWithConfig_delegate$lambda$4((PulsingGradientDrawable) obj);
                return gradientBitmapWithConfig_delegate$lambda$4;
            case 2:
                renderCommonScreenData$lambda$38$lambda$37$lambda$36 = QrPaymentsMainFragment.renderCommonScreenData$lambda$38$lambda$37$lambda$36((t461) obj);
                return renderCommonScreenData$lambda$38$lambda$37$lambda$36;
            case 3:
                QrPaymentsSubscriptionScreenParams qrPaymentsSubscriptionScreenParams = (QrPaymentsSubscriptionScreenParams) obj;
                SubscriptionStatus subscriptionStatus = SubscriptionStatus.DEFAULT;
                SubscriptionInfoEntity subscriptionInfo = qrPaymentsSubscriptionScreenParams.getSubscriptionInfo();
                String redirectLink = qrPaymentsSubscriptionScreenParams.getRedirectLink();
                AgreementEntity agreementEntity = (AgreementEntity) a.R(qrPaymentsSubscriptionScreenParams.getSubscriptionInfo().getAgreements());
                return new cma0(subscriptionStatus, subscriptionInfo, agreementEntity != null ? agreementEntity.getAgreementId() : null, redirectLink, null);
            case 4:
                return new mcg0(((QrReaderScanningConfigSchema) ((b) ((y4a0) ((jdg0) obj)).c).d(gcg0.a).getData()).toEntity(), false, false, 0, false, icg0.a);
            case 5:
                TryToRefreshEntity entity = ((QrRefreshArguments) obj).getEntity();
                return new zcg0(entity.getHeader(), job1.f(entity.getThemedImage(), new cbg0(6)), entity.getMessage(), entity.getDescription(), entity.getButton());
            case 6:
                com.yandex.messaging.input.quote.a aVar = (com.yandex.messaging.input.quote.a) obj;
                xv10 xv10Var = aVar.D;
                ServerMessageRef serverMessageRef = (xv10Var == null || (list = (List) xv10Var.b) == null) ? null : (ServerMessageRef) a.R(list);
                if (serverMessageRef != null) {
                    xv10 xv10Var2 = aVar.D;
                    ((i) ((ucz0) aVar.C.get())).u(serverMessageRef.getTimestamp(), xv10Var2 != null ? (String) xv10Var2.w : null);
                }
                return zy11Var;
            case 7:
                rai0 rai0Var = (rai0) obj;
                rai0Var.b.f(rai0Var.E, false);
                bu10 bu10Var = rai0Var.J;
                if (bu10Var != null) {
                    bu10Var.onExpandReactionsChoose();
                }
                return zy11Var;
            case 8:
                ViewGroup viewGroup = ((ebi0) obj).a;
                Object systemService = viewGroup.getContext().getSystemService("layout_inflater");
                if (systemService != null) {
                    return (ViewGroup) ((LayoutInflater) systemService).inflate(olh0.msg_v_reactions_label, viewGroup, false);
                }
                ny61.t("null cannot be cast to non-null type android.view.LayoutInflater");
                return null;
            case 9:
                yf61.b((kk41) obj);
                return zy11Var;
            case 10:
                ((ydi0) obj).a();
                return zy11Var;
            case 11:
                onViewCreated$lambda$4$lambda$0 = RebindPaymentMethodFragment.onViewCreated$lambda$4$lambda$0((RebindPaymentMethodFragment) obj);
                return onViewCreated$lambda$4$lambda$0;
            case 12:
                onViewCreated$lambda$4$lambda$1 = RebindPaymentMethodFragment.onViewCreated$lambda$4$lambda$1((e661) obj);
                return onViewCreated$lambda$4$lambda$1;
            case 13:
                lui0 lui0Var = (lui0) obj;
                return new flex.core.action.remote.a((xv) lui0Var.c, (ike) lui0Var.d);
            case 14:
                insetsType$lambda$0 = RequestUseFullScreenIntentModalView.insetsType$lambda$0((RequestUseFullScreenIntentModalView) obj);
                return insetsType$lambda$0;
            case 15:
                subtitleBadge_delegate$lambda$0 = RequiredAltChoiceComponentView.subtitleBadge_delegate$lambda$0((RequiredAltChoiceComponentView) obj);
                return subtitleBadge_delegate$lambda$0;
            case 16:
                return Integer.valueOf(c.h(8, ((nj1) obj).a));
            case 17:
                deliveryIntervalsClickListeners$lambda$1 = RequiredAltChoiceOptionSelectorView.setDeliveryIntervalsClickListeners$lambda$1((RequiredAltChoiceOptionSelectorView) obj);
                return deliveryIntervalsClickListeners$lambda$1;
            case 18:
                ((ubj0) obj).a.invoke();
                return zy11Var;
            case 19:
                insetsType$lambda$02 = RequirementAddressFormModalView.insetsType$lambda$0((RequirementAddressFormModalView) obj);
                return insetsType$lambda$02;
            case 20:
                hpj0 hpj0Var = (hpj0) obj;
                gpj0 gpj0Var = hpj0.Companion;
                return new cwi0(hpj0Var.b, hpj0Var.c, hpj0Var.d);
            case 21:
                DialogContent$lambda$6$lambda$5$lambda$4 = ResolveInviteLinkDialogFragment.DialogContent$lambda$6$lambda$5$lambda$4((ResolveInviteLinkDialogFragment) obj);
                return DialogContent$lambda$6$lambda$5$lambda$4;
            case 22:
                forwardWriter_delegate$lambda$0 = ReverseProtoWriter.forwardWriter_delegate$lambda$0((ReverseProtoWriter) obj);
                return forwardWriter_delegate$lambda$0;
            case 23:
                _init_$lambda$0 = RidaHeaderView._init_$lambda$0((RidaHeaderView) obj);
                return _init_$lambda$0;
            case 24:
                return Integer.valueOf(((avj0) ((zuj0) ((q6c0) obj).b)).c(rsg0.summary_route_top_margin));
            case 25:
                return new x6k0((y6k0) obj);
            case 26:
                return ((com.yandex.go.rida.unavailable.ui.a) obj).a.a.getString(gyh0.rida_tariff_unavailable_default);
            case 27:
                ief iefVar = ((t8k0) obj).d.b().V().K;
                if (iefVar != null) {
                    return gwk0.h(iefVar);
                }
                return null;
            case 28:
                lottieViewFadeInAnimator_delegate$lambda$0 = RideCardCompanionSectionView.lottieViewFadeInAnimator_delegate$lambda$0((RideCardCompanionSectionView) obj);
                return lottieViewFadeInAnimator_delegate$lambda$0;
            default:
                return Integer.valueOf((int) ((avj0) ((ggk0) obj).c).b(wug0.driver_avatar_size));
        }
    }
}
