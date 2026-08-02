package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.card.api.CardManagementSettingStatus;
import com.ybsdk.feature.card.api.CardManagementSettingTextData;
import com.ybsdk.feature.card.api.CardReissueScreenParams;
import com.ybsdk.feature.card.api.CardRenameScreenParams;
import com.ybsdk.feature.card.api.CardsSettingsTermParameter;
import com.ybsdk.feature.card.api.SuccessIssueAction;
import com.ybsdk.feature.card.internal.interactors.requisites.a;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationFragment;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationParams;
import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionFragment;
import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionScreenParams;
import com.ybsdk.feature.card.internal.presentation.cardissue.CardIssueFragment;
import com.ybsdk.feature.card.internal.presentation.cardissue.CardIssueScreenArguments;
import com.ybsdk.feature.card.internal.presentation.cardlimit.CardLimitFragment;
import com.ybsdk.feature.card.internal.presentation.cardreissue.CardReissueFragment;
import com.ybsdk.feature.card.internal.presentation.cardrename.CardRenameFragment;
import com.ybsdk.feature.card.internal.presentation.cardterm.CardSettingsTermFragment;
import com.ybsdk.feature.card.internal.presentation.processing.CardSetStatusProcessingFragment;
import com.ybsdk.feature.card.internal.presentation.processing.CardSetStatusScreenParams;
import com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardFragment;
import com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardScreenScreenParams;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.rconfig.configs.NonYbProductDetailsFlags;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class r1h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf8 b;

    public /* synthetic */ r1h(cf8 cf8Var, int i) {
        this.a = i;
        this.b = cf8Var;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        cf8 cf8Var = this.b;
        x0h x0hVar = x0h.a;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CardActivation)) {
                    return x0hVar;
                }
                DeeplinkAction.CardActivation cardActivation = (DeeplinkAction.CardActivation) baseDeeplinkAction;
                String agreementId = cardActivation.getAgreementId();
                String promoId = cardActivation.getPromoId();
                ((df8) cf8Var).c.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("CardActivation", false, new CardActivationParams(promoId, agreementId), null, qoi0.a(CardActivationFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 1:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CardDeletion)) {
                    return x0hVar;
                }
                DeeplinkAction.CardDeletion cardDeletion = (DeeplinkAction.CardDeletion) baseDeeplinkAction;
                String cardId = cardDeletion.getCardId();
                String lastPanDigits = cardDeletion.getLastPanDigits();
                ThemedImageUrlEntity headerImageModel = cardDeletion.getHeaderImageModel();
                boolean shouldExitCardScenario = cardDeletion.getShouldExitCardScenario();
                Map<CardManagementSettingStatus, CardManagementSettingTextData> cardManagementSettingTextMap = cardDeletion.getCardManagementSettingTextMap();
                pn8 pn8Var = ((df8) cf8Var).c;
                CardDeletionScreenParams cardDeletionScreenParams = new CardDeletionScreenParams(cardId, lastPanDigits, shouldExitCardScenario, headerImageModel, cardManagementSettingTextMap);
                pn8Var.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("CardDeletionScreen", false, cardDeletionScreenParams, TransitionPolicyType.POPUP, qoi0.a(CardDeletionFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null)), null, 6);
            case 2:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CardDetails)) {
                    return x0hVar;
                }
                DeeplinkAction.CardDetails cardDetails = (DeeplinkAction.CardDetails) baseDeeplinkAction;
                return new v0h(Collections.singletonList(ofb1.a(this.b, cardDetails.getAgreementId(), cardDetails.getScrollToPromo(), cardDetails.getScrollToCardById(), cardDetails.getScrollToPromoById(), cardDetails.getScrollToProductType(), null, 208)), null, 6);
            case 3:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CardIssue)) {
                    return x0hVar;
                }
                SuccessIssueAction successIssueAction = SuccessIssueAction.Back;
                String agreementId2 = ((DeeplinkAction.CardIssue) baseDeeplinkAction).getAgreementId();
                ((df8) cf8Var).c.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("CardIssue", false, new CardIssueScreenArguments(successIssueAction, null, agreementId2), null, qoi0.a(CardIssueFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 4:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CardLimit)) {
                    return x0hVar;
                }
                String cardId2 = ((DeeplinkAction.CardLimit) baseDeeplinkAction).getCardId();
                ((df8) cf8Var).c.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("CardLimitScreen", false, new CardLimitFragment.Arguments(cardId2), null, qoi0.a(CardLimitFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 5:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CardPin)) {
                    return x0hVar;
                }
                String cardId3 = ((DeeplinkAction.CardPin) baseDeeplinkAction).getCardId();
                ((df8) cf8Var).c.getClass();
                return new v0h(Collections.singletonList(pn8.a(cardId3)), null, 6);
            case 6:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CardDeletionReissueProcessing)) {
                    return x0hVar;
                }
                DeeplinkAction.CardDeletionReissueProcessing cardDeletionReissueProcessing = (DeeplinkAction.CardDeletionReissueProcessing) baseDeeplinkAction;
                String closeAction = cardDeletionReissueProcessing.getCloseAction();
                String cardId4 = cardDeletionReissueProcessing.getCardId();
                String setCardStatusActionType = cardDeletionReissueProcessing.getSetCardStatusActionType();
                String processingText = cardDeletionReissueProcessing.getProcessingText();
                String cardType = cardDeletionReissueProcessing.getCardType();
                ((df8) cf8Var).c.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("CardSetStatusProcessingScreen", false, new CardSetStatusScreenParams(closeAction, cardId4, setCardStatusActionType, processingText, cardType), null, qoi0.a(CardSetStatusProcessingFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 7:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CardReissue)) {
                    return x0hVar;
                }
                DeeplinkAction.CardReissue cardReissue = (DeeplinkAction.CardReissue) baseDeeplinkAction;
                CardReissueScreenParams cardReissueScreenParams = new CardReissueScreenParams(cardReissue.getCardId(), cardReissue.getLandingImage(), cardReissue.getTitle(), cardReissue.getMessage(), cardReissue.getShouldExitCardScenario(), cardReissue.getPrimaryButtonTitle(), cardReissue.getSecondaryButtonTitle());
                ((df8) cf8Var).c.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("CardReissueScreen", false, cardReissueScreenParams, null, qoi0.a(CardReissueFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 8:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CardRename)) {
                    return x0hVar;
                }
                CardRenameScreenParams cardRenameScreenParams = new CardRenameScreenParams(((DeeplinkAction.CardRename) baseDeeplinkAction).getTrustCardID());
                ((df8) cf8Var).c.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("CardRenameScreen", false, cardRenameScreenParams, null, qoi0.a(CardRenameFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 9:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CreditLimitSettingsTerm)) {
                    return x0hVar;
                }
                CardsSettingsTermParameter cardsSettingsTermParameter = new CardsSettingsTermParameter(((DeeplinkAction.CreditLimitSettingsTerm) baseDeeplinkAction).getInitialScreenId(), !r0.getFitWindowTop());
                ((df8) cf8Var).c.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("CardSettingTermScreen", false, cardsSettingsTermParameter, TransitionPolicyType.POPUP, qoi0.a(CardSettingsTermFragment.class), OpenScreenRequirement.WithBuid.INSTANCE)), null, 6);
            case 10:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CreditLimitSettingsTermFromCard)) {
                    return x0hVar;
                }
                DeeplinkAction.CreditLimitSettingsTermFromCard creditLimitSettingsTermFromCard = (DeeplinkAction.CreditLimitSettingsTermFromCard) baseDeeplinkAction;
                ListBuilder a = rcc.a();
                String bottomSheetDeeplink = creditLimitSettingsTermFromCard.getBottomSheetDeeplink();
                cf8 cf8Var2 = this.b;
                if (bottomSheetDeeplink != null) {
                    a.add(ofb1.a(cf8Var2, creditLimitSettingsTermFromCard.getAgreementId(), false, null, null, null, creditLimitSettingsTermFromCard.getBottomSheetDeeplink(), HProv.PP_DELETE_SAVED_PASSWD));
                } else {
                    a.add(ofb1.a(cf8Var2, creditLimitSettingsTermFromCard.getAgreementId(), false, null, null, null, null, 254));
                    CardsSettingsTermParameter cardsSettingsTermParameter2 = new CardsSettingsTermParameter(creditLimitSettingsTermFromCard.getInitialScreenId(), true);
                    ((df8) cf8Var2).c.getClass();
                    a.add(new FragmentScreen("CardSettingTermScreen", false, cardsSettingsTermParameter2, TransitionPolicyType.POPUP, qoi0.a(CardSettingsTermFragment.class), OpenScreenRequirement.WithBuid.INSTANCE));
                }
                return new v0h(a.j(), null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SingleCardDetails)) {
                    return x0hVar;
                }
                DeeplinkAction.SingleCardDetails singleCardDetails = (DeeplinkAction.SingleCardDetails) baseDeeplinkAction;
                String cardId5 = singleCardDetails.getCardId();
                String productId = singleCardDetails.getProductId();
                df8 df8Var = (df8) cf8Var;
                pn8 pn8Var2 = df8Var.c;
                OpenScreenRequirement openScreenRequirement = cardId5 == null ? OpenScreenRequirement.WithUid.INSTANCE : (((NonYbProductDetailsFlags) ((if8) df8Var.d).a.d(oe60.a).getData()).getNonYbProductsEnabled() && a.a(productId)) ? OpenScreenRequirement.WithUid.INSTANCE : OpenScreenRequirement.WithBuid.INSTANCE;
                pn8Var2.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("SingleCardDetails", false, new SingleCardScreenScreenParams(cardId5, productId), null, qoi0.a(SingleCardFragment.class), openScreenRequirement, 10, null)), null, 6);
        }
    }
}
