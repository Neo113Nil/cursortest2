package defpackage;

import android.view.View;
import com.yandex.go.inapp_calls.ui.select.CallTypeSelectModalView;
import com.yandex.go.payments.cards.ui.CardNumberPadView;
import com.yandex.go.payments.shared.business.accountcreation.BusinessAccountCreationView;
import com.yandex.go.taxi.order.cancel.reasons.view.v1.CancelReasonsV1View;
import com.yandex.go.taxi.order.cancel.reasons.view.v2.CancelReasonsV2View;
import com.yandex.messaging.ui.calllist.info.c;
import com.yandex.voip_calls.calls_go.CallsGoActivity;
import com.yandex.xplat.payment.sdk.Scenario;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.card.api.CardReissueScreenParams;
import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionOperationState;
import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionScreenParams;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsScreenArguments;
import com.ybsdk.feature.card.internal.presentation.cardissue.CardIssueFragment;
import com.ybsdk.feature.card.internal.presentation.cardissue.CardIssueScreenArguments;
import com.ybsdk.feature.card.internal.presentation.cardlimit.CardLimitFragment;
import com.ybsdk.feature.card.internal.presentation.processing.CardSetStatusScreenParams;
import com.ybsdk.feature.card.internal.samsungpay.SamsungPayState;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.input.BudgetChargesUinInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search.BudgetChargesSearchStatusFragment;
import ru.yandex.taxi.banners.CardBannerV1ModalView;
import ru.yandex.taxi.bugreport.router.b;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes10.dex */
public final /* synthetic */ class rk6 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rk6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 viewBinding$lambda$3$lambda$2;
        zy11 viewBinding$lambda$5$lambda$4;
        View insetsType$lambda$0;
        View insetsType$lambda$02;
        ll7 notificationsInteractor_delegate$lambda$0;
        zy11 listeners$lambda$1;
        zy11 adapter$lambda$0;
        View view;
        rbv nbvVar;
        zy11 onViewCreated$lambda$0;
        zy11 viewBinding$lambda$6$lambda$3;
        zy11 bindClickListeners$lambda$0;
        int i = this.a;
        int i2 = 7;
        int i3 = 1;
        String str = null;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (zii0) obj;
            case 1:
                ((en6) obj).c.a();
                return zy11Var;
            case 2:
                viewBinding$lambda$3$lambda$2 = BudgetChargesSearchStatusFragment.getViewBinding$lambda$3$lambda$2((BudgetChargesSearchStatusFragment) obj);
                return viewBinding$lambda$3$lambda$2;
            case 3:
                viewBinding$lambda$5$lambda$4 = BudgetChargesUinInputFragment.getViewBinding$lambda$5$lambda$4((BudgetChargesUinInputFragment) obj);
                return viewBinding$lambda$5$lambda$4;
            case 4:
                return ((b) obj).F.a();
            case 5:
                insetsType$lambda$0 = BusinessAccountCreationView.insetsType$lambda$0((BusinessAccountCreationView) obj);
                return insetsType$lambda$0;
            case 6:
                String str2 = ((c) obj).w;
                return Boolean.valueOf(!(str2 == null || evu0.J(str2)));
            case 7:
                com.yandex.go.call_order_fallback.c cVar = (com.yandex.go.call_order_fallback.c) obj;
                cVar.J.a();
                cVar.i();
                return zy11Var;
            case 8:
                insetsType$lambda$02 = CallTypeSelectModalView.insetsType$lambda$0((CallTypeSelectModalView) obj);
                return insetsType$lambda$02;
            case 9:
                notificationsInteractor_delegate$lambda$0 = CallsGoActivity.notificationsInteractor_delegate$lambda$0((CallsGoActivity) obj);
                return notificationsInteractor_delegate$lambda$0;
            case 10:
                return new wp7(i3, (jr7) obj);
            case 11:
                ((ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.c) obj).b();
                return zy11Var;
            case 12:
                ((dr7) obj).r(new qu(9));
                return zy11Var;
            case 13:
                listeners$lambda$1 = CancelReasonsV1View.setListeners$lambda$1((CancelReasonsV1View) obj);
                return listeners$lambda$1;
            case 14:
                adapter$lambda$0 = CancelReasonsV2View.adapter$lambda$0((CancelReasonsV2View) obj);
                return adapter$lambda$0;
            case 15:
                ((f28) obj).r(new wk6(23));
                return zy11Var;
            case 16:
                z88 z88Var = (z88) obj;
                z88Var.h = null;
                if (z88Var.i / 100 == 4) {
                    z88Var.a();
                } else {
                    z88Var.b.setVisibility(0);
                    z88Var.c.setVisibility(8);
                    z88Var.a.a.webView.reload();
                }
                return zy11Var;
            case 17:
                view = ((CardBannerV1ModalView) obj).contentContainer;
                return view;
            case 18:
                ((lh8) obj).invoke("Pmd or psd is null or blank");
                return zy11Var;
            case 19:
                return new rc8((zrt) obj);
            case 20:
                CardDeletionScreenParams cardDeletionScreenParams = (CardDeletionScreenParams) obj;
                String cardId = cardDeletionScreenParams.getCardId();
                String lastPanDigits = cardDeletionScreenParams.getLastPanDigits();
                CardDeletionOperationState cardDeletionOperationState = CardDeletionOperationState.CONFIRMATION;
                ThemedImageUrlEntity themedHeaderImage = cardDeletionScreenParams.getThemedHeaderImage();
                if (themedHeaderImage == null || (nbvVar = job1.f(themedHeaderImage, new wk6(27))) == null) {
                    nbvVar = new nbv(zxg0.ybsdk_ic_card_removal_header, null);
                }
                return new zc8(cardId, lastPanDigits, cardDeletionOperationState, nbvVar, null);
            case 21:
                CardDetailsScreenArguments cardDetailsScreenArguments = (CardDetailsScreenArguments) obj;
                return new bq8(null, kotlin.collections.b.f(), false, kotlin.collections.b.f(), new nhq0(0, false), cardDetailsScreenArguments.getInitialPosition(), cardDetailsScreenArguments.getPlasticPromoAvailable(), new e7r0(str, str, i2), kotlin.collections.b.f(), new SamsungPayState(0), null, false, false);
            case 22:
                qg8 qg8Var = (qg8) obj;
                rwo rwoVar = qg8Var.a;
                bg8 bg8Var = qg8Var.c;
                if (bg8Var == null) {
                    ny61.r("Null card input");
                    return null;
                }
                int i4 = og8.a[qg8Var.g.ordinal()];
                if (i4 == 1) {
                    sv90 sv90Var = qv90.a;
                    Scenario d = r891.d(bg8Var.getMode());
                    sv90Var.getClass();
                    String concat = "Пользователь нажал на кнопку Продолжить на экране ввода новой карты в сценарии ".concat(sv90.r(d));
                    wj00 wj00Var = new wj00(0);
                    wj00Var.k("scenario", d.getValue());
                    wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
                    ((y22) rwoVar).a(y891.c("card_data_form_next_button-tapped", wj00Var));
                    bg8Var.proceedToCardDetails();
                } else {
                    if (i4 != 2) {
                        ny61.r("Illegal card input state");
                        return null;
                    }
                    sv90 sv90Var2 = qv90.a;
                    Scenario d2 = r891.d(bg8Var.getMode());
                    sv90Var2.getClass();
                    String concat2 = "Пользователь нажал на кнопку Оплатить на экране ввода новой карты в сценарии ".concat(sv90.r(d2));
                    wj00 wj00Var2 = new wj00(0);
                    wj00Var2.k("scenario", d2.getValue());
                    wj00Var2.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat2);
                    ((y22) rwoVar).a(y891.c("new_card_pay_button-tapped", wj00Var2));
                    qg8Var.b();
                }
                return zy11Var;
            case 23:
                onViewCreated$lambda$0 = CardIssueFragment.onViewCreated$lambda$0((CardIssueFragment) obj);
                return onViewCreated$lambda$0;
            case 24:
                return new sh8(((CardIssueScreenArguments) obj).getAgreementId(), i2);
            case 25:
                viewBinding$lambda$6$lambda$3 = CardLimitFragment.getViewBinding$lambda$6$lambda$3((CardLimitFragment) obj);
                return viewBinding$lambda$6$lambda$3;
            case 26:
                bindClickListeners$lambda$0 = CardNumberPadView.bindClickListeners$lambda$0((CardNumberPadView) obj);
                return bindClickListeners$lambda$0;
            case 27:
                CardReissueScreenParams cardReissueScreenParams = (CardReissueScreenParams) obj;
                return new fm8(cardReissueScreenParams.getTitle(), cardReissueScreenParams.getMessage(), cardReissueScreenParams.getLandingImage());
            case 28:
                return new bo8(((CardSetStatusScreenParams) obj).getProcessingText(), i3);
            default:
                ((lz40) obj).g(zy11Var);
                return zy11Var;
        }
    }
}
