package com.squareup.cash.sharesheet;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.media3.common.PlayerExtensionsKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpc;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.retro.views.SelectPaymentPlanViewKt;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.TransferringViewModel;
import com.squareup.cash.savings.viewmodels.UpsellCardModel$Loaded;
import com.squareup.cash.savings.views.ButtonGroupKt;
import com.squareup.cash.savings.views.SavingsScreenHeaderKt;
import com.squareup.cash.score.views.CalloutKt;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import com.squareup.cash.shopping.autofill.viewmodels.EditAutofillViewModel;
import com.squareup.cash.shopping.autofill.views.EditAutofillViewKt;
import com.squareup.cash.shopping.autofill.views.content.ErrorContentKt;
import com.squareup.cash.shopping.viewmodels.CashAppPayIncentiveSheetViewModel;
import com.squareup.cash.shopping.viewmodels.RestrictedItemWarningSheetViewModel;
import com.squareup.cash.shopping.views.ShopErrorKt;
import com.squareup.cash.support.chat.viewmodels.ChatAttachmentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewModel;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyViewKt;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewModel$Loaded;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewModel$Editing;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.support.viewmodels.SupportArticleIncidentsSheetViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.lending.CashCreditScoreHomeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShareSheetViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ ShareSheetViewKt$$ExternalSyntheticLambda2(SavingsScreenViewModel.Content.SavingsScreenElement.BetweenSection betweenSection, Modifier modifier, int i, int i2) {
        this.$r8$classId = 2;
        this.f$0 = betweenSection;
        this.f$1 = modifier;
        this.f$2 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                ShareSheetViewKt.ShareSheetView((ShareSheetViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                SelectPaymentPlanViewKt.TimelineSection((SelectPaymentPlanViewModel.PaymentsTimelineSection) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                SavingsScreenHeaderKt.BetweenSection((SavingsScreenViewModel.Content.SavingsScreenElement.BetweenSection) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1), i2);
                break;
            case 3:
                ((Integer) obj2).intValue();
                ButtonGroupKt.TransferringView((TransferringViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ButtonGroupKt.SavingsUpsellSheetView((UpsellCardModel$Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((KycAppletTile) obj4).UI((AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                CalloutKt.RecommendationGraphic((CashCreditScoreHomeData.Graphic) obj4, (StyledCardViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                CalloutKt.ScoreSummarySheet((CashCreditScoreHomeData.ScoreSummaryOverlayData) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                EditAutofillViewKt.EditAutofill((EditAutofillViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ErrorContentKt.ErrorContent((AutofillViewModel.Error) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((InviteErrorPresenter) obj4).m3587models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((ErrorPresenter) obj4).m3725models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ShopErrorKt.CashAppPayIncentivePromptSheet((CashAppPayIncentiveSheetViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ShopErrorKt.WarningSheetContent((RestrictedItemWarningSheetViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ((TaxReturnsPresenter) obj4).m3767models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((ShareSheetPresenter) obj4).m3744models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ((InviteErrorPresenter) obj4).m3587models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                PlayerExtensionsKt.AttachmentPreview((ChatAttachmentViewModel) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                zzpc.InputTextField((TextFieldState) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ChatSurveyKt.ChatSurvey((ChatSurveyViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ActionBodyViewKt.LoadedContent((ActivityItemViewModel) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ((InviteErrorPresenter) obj4).m3587models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.Loaded((ContactSupportEmailInputViewModel$Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.EditingMessage((ContactSupportEmailMessageViewModel$Editing) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.Loaded((ScreenshotReviewViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.ScreenshotViewed((ScreenshotReviewViewModel.ViewingScreenshot) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.Uploading((ScreenshotReviewViewModel.Uploading) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.UploadFailed((ScreenshotReviewViewModel.UploadFailed) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.Uploaded((ScreenshotReviewViewModel.Uploaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.SheetContent((SupportArticleIncidentsSheetViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ShareSheetViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}
