package com.squareup.cash.sharesheet;

import android.webkit.WebView;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.ViewGroupKt;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.recurringpayments.viewmodels.DayOfCadenceOption;
import com.squareup.cash.recurringpayments.viewmodels.SelectDayOfCadenceViewEvent;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewEvent;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel;
import com.squareup.cash.savings.applets.views.SavingsAppletTile;
import com.squareup.cash.savings.backend.api.data.SavingsBalance;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.presenters.SavingsActivitySectionParams;
import com.squareup.cash.savings.presenters.SavingsScreenContentFactory;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.savings.screens.SavingsFullActivityScreen;
import com.squareup.cash.savings.viewmodels.CellDefaultViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader;
import com.squareup.cash.savings.viewmodels.TransferringViewEvent$Exit;
import com.squareup.cash.savings.viewmodels.TransferringViewModel;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.securityhub.viewmodels.BookletFeatureCardViewModel;
import com.squareup.cash.securityhub.viewmodels.BookletSummary;
import com.squareup.cash.securityhub.viewmodels.BookletViewEvent;
import com.squareup.cash.securityhub.viewmodels.ProtectionsSectionViewEvent;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideRowViewModel;
import com.squareup.cash.securityhub.viewmodels.SecurityEducationSupportRowViewModel;
import com.squareup.cash.securityhub.views.SettingsRowDefinition;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetViewEvent;
import com.squareup.cash.sharesheet.ShareSheetViewModel;
import com.squareup.cash.shopping.viewmodels.ButtonModel;
import com.squareup.cash.shopping.viewmodels.SearchResultsViewEvent;
import com.squareup.cash.shopping.viewmodels.ShoppingInfoSheetViewEvent;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeDisclosuresWidgetViewEvent$DisclosuresClicked;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeDisclosuresWidgetViewModel;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptSheetViewEvents;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptSheetViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewEvent;
import com.squareup.cash.support.chat.views.ChatExitPromptSheetView;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda6;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyView;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShareSheetViewKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ShareSheetViewKt$$ExternalSyntheticLambda5(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i = this.$r8$classId;
        ClientRoute clientRoute = null;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(new ShareSheetViewEvent.Share((ShareSheetViewModel.SharingOption) obj));
                break;
            case 1:
                DayOfCadenceOption dayOfCadenceOption = (DayOfCadenceOption) obj;
                Function1 function1 = (Function1) obj2;
                if (dayOfCadenceOption.shouldDisplayDayPicker) {
                    function1.invoke(new SelectDayOfCadenceViewEvent.SelectDayPicker(dayOfCadenceOption.dayPicker));
                } else {
                    Integer num = dayOfCadenceOption.dayOfCadence;
                    num.getClass();
                    function1.invoke(new SelectDayOfCadenceViewEvent.SelectDayOfCadenceOption(num.intValue()));
                }
                break;
            case 2:
                ((Function1) obj2).invoke(new SelectPaymentPlanViewEvent.ViewHalfSheet((SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet) obj));
                break;
            case 3:
                ((Function1) obj2).invoke(new SelectPaymentPlanViewEvent.ViewHalfSheet((SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet) obj));
                break;
            case 4:
                Function1 function12 = (Function1) obj2;
                SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet infoHalfSheet = ((SelectPaymentPlanViewModel.SummaryRow) obj).infoSheet;
                if (infoHalfSheet != null) {
                    function12.invoke(new SelectPaymentPlanViewEvent.ViewHalfSheet(infoHalfSheet));
                }
                break;
            case 5:
                SavingsAppletTileViewModel savingsAppletTileViewModel = (SavingsAppletTileViewModel) obj;
                ScoreAppletViewsModule$$ExternalSyntheticLambda1 scoreAppletViewsModule$$ExternalSyntheticLambda1 = ((SavingsAppletTile) obj2).onClickTile;
                if (!(savingsAppletTileViewModel instanceof SavingsAppletTileViewModel.Installed)) {
                    if (!(savingsAppletTileViewModel instanceof SavingsAppletTileViewModel.Loading)) {
                        if (!(savingsAppletTileViewModel instanceof SavingsAppletTileViewModel.Uninstalled)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            clientRoute = ((SavingsAppletTileViewModel.Uninstalled) savingsAppletTileViewModel).clientRoute;
                        }
                    }
                } else {
                    clientRoute = ((SavingsAppletTileViewModel.Installed) savingsAppletTileViewModel).getClientRoute();
                }
                scoreAppletViewsModule$$ExternalSyntheticLambda1.invoke(clientRoute);
                break;
            case 6:
                SessionManager sessionManager = (SessionManager) obj;
                SavingsFullActivityScreen savingsFullActivityScreen = (SavingsFullActivityScreen) ((WorkHomePresenter) obj2).shiftSection2Presenter;
                String str2 = savingsFullActivityScreen.customerToken;
                if (str2 == null) {
                    str2 = PlatformKt.activeAccountTokenOrNull(sessionManager);
                }
                break;
            case 7:
                ((SavingsScreenContentFactory) obj2).navigator.goTo(new SavingsFullActivityScreen(ActivityTokenType.CUSTOMER_TOKEN_SAVINGS_ACCOUNT, (String) null, ((SavingsActivitySectionParams) obj).activityContext.activityScope, 4));
                break;
            case 8:
                SavingsScreenPresenter savingsScreenPresenter = (SavingsScreenPresenter) obj2;
                SavingsBalance savingsBalance = (SavingsBalance) obj;
                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(savingsScreenPresenter.sessionManager);
                SavingsScreen.ScreenType screenType = (SavingsScreen.ScreenType) savingsScreenPresenter.screenType;
                boolean z = screenType instanceof SavingsScreen.ScreenType.GoalDetail;
                ActivityTokenType activityTokenType = (z || (screenType instanceof SavingsScreen.ScreenType.GeneralSavings)) ? ActivityTokenType.SAVINGS_FOLDER_TOKEN : ActivityTokenType.CUSTOMER_TOKEN_SAVINGS_ACCOUNT;
                ActivitiesManager.ActivityContext savingsActivityContext$default = z ? ViewConfigurationCompat.savingsActivityContext$default(activeAccountTokenOrNull, activityTokenType, ((SavingsScreen.ScreenType.GoalDetail) screenType).token, null, 8) : screenType instanceof SavingsScreen.ScreenType.GeneralSavings ? (savingsBalance == null || (str = savingsBalance.token) == null) ? null : ViewConfigurationCompat.savingsActivityContext$default(activeAccountTokenOrNull, activityTokenType, str, null, 8) : ViewConfigurationCompat.savingsActivityContext$default(activeAccountTokenOrNull, activityTokenType, null, null, 12);
                break;
            case 9:
                Function1 function13 = (Function1) obj2;
                SavingsScreenViewEvent savingsScreenViewEvent = ((SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup) obj).primaryButton.action;
                if (savingsScreenViewEvent != null) {
                    function13.invoke(savingsScreenViewEvent);
                }
                break;
            case 10:
                ((Function1) obj2).invoke(((SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder) obj).action);
                break;
            case 11:
                Function1 function14 = (Function1) obj2;
                SavingsScreenViewEvent savingsScreenViewEvent2 = ((CellDefaultViewModel) obj).action;
                if (savingsScreenViewEvent2 != null) {
                    function14.invoke(savingsScreenViewEvent2);
                }
                break;
            case 12:
                ((Function1) obj2).invoke(new SavingsScreenViewEvent.SavingsHeaderClicked((ViewGroupKt) obj));
                break;
            case 13:
                ((Function1) obj2).invoke(((SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer.GoalMet) ((SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer) obj)).button.action);
                break;
            case 14:
                ((Function1) obj2).invoke(new SavingsScreenViewEvent.SavingsCardEvent(((SavingsScreenViewModel.Content.SavingsScreenElement.CompactCard) ((SavingsScreenViewModel.Content.SavingsScreenElement) obj)).button.action, SavingsScreenViewEvent.SavingsCardEvent.CardType.COMPACT));
                break;
            case 15:
                ((TransferringViewModel.Error) obj).getClass();
                ((Function1) obj2).invoke(TransferringViewEvent$Exit.INSTANCE);
                break;
            case 16:
                ((Function1) obj2).invoke(((CashCreditScoreHomeData.RecommendationOverlayData) obj).primary_button_action);
                break;
            case 17:
                BookletFeatureCardViewModel bookletFeatureCardViewModel = (BookletFeatureCardViewModel) obj;
                Function1 function15 = (Function1) obj2;
                if (bookletFeatureCardViewModel.link != null) {
                    function15.invoke(new BookletViewEvent.FeatureCardLinkTapped(bookletFeatureCardViewModel.id));
                }
                break;
            case 18:
                ((Function1) obj2).invoke(new ProtectionsSectionViewEvent.SettingsRowTapped(((SettingsRowDefinition) obj).id));
                break;
            case 19:
                ((Function1) obj2).invoke(((RecoveryGuideRowViewModel) obj).id);
                break;
            case 20:
                ((Function1) obj2).invoke(((BookletSummary) obj).id);
                break;
            case 21:
                ((Function1) obj2).invoke(((SecurityEducationSupportRowViewModel) obj).id);
                break;
            case 22:
                ButtonModel buttonModel = (ButtonModel) obj;
                Function1 function16 = (Function1) obj2;
                int ordinal = buttonModel.actionType.ordinal();
                if (ordinal == 0) {
                    function16.invoke(ShoppingInfoSheetViewEvent.Close.INSTANCE);
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    String str3 = buttonModel.actionUrl;
                    if (str3 != null) {
                        function16.invoke(new ShoppingInfoSheetViewEvent.OpenLink(str3));
                    }
                }
                break;
            case 23:
                WebView webView = (WebView) obj;
                Function1 function17 = (Function1) obj2;
                if (webView.canGoBack()) {
                    webView.goBack();
                } else {
                    function17.invoke(ShoppingWebViewEvent.Close.INSTANCE);
                }
                break;
            case 24:
                Function1 function18 = (Function1) obj2;
                String str4 = ((DirectoryListItem.Footer) obj).actionButton.action_url;
                if (str4 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    break;
                } else {
                    function18.invoke(new SearchResultsViewEvent.FooterItemClick(str4));
                    break;
                }
            case 25:
                ((Function1) obj2).invoke(new StablecoinHomeDisclosuresWidgetViewEvent$DisclosuresClicked(((StablecoinHomeDisclosuresWidgetViewModel) obj).url));
                break;
            case 26:
                Function1 function19 = (Function1) obj2;
                int i2 = ChatExitPromptSheetView.$r8$clinit;
                if (((ChatExitPromptSheetViewModel) obj) instanceof ChatExitPromptSheetViewModel.Survey) {
                    function19.invoke(new ChatExitPromptSheetViewEvents.SurveyEvent(ChatSurveyViewEvent.Close.INSTANCE));
                } else {
                    function19.invoke(ChatExitPromptSheetViewEvents.Close.INSTANCE);
                }
                break;
            case 27:
                BodyViewModel$ActionBodyViewModel bodyViewModel$ActionBodyViewModel = (BodyViewModel$ActionBodyViewModel) obj;
                Function1 function110 = (Function1) ((ActionBodyView) obj2).onActionBodyClick$delegate.getValue();
                if (function110 != null) {
                    function110.invoke(bodyViewModel$ActionBodyViewModel.action);
                }
                break;
            case 28:
                ((Function1) obj2).invoke(((SupportActivityItemLoader.State.Success) obj).activityItem);
                break;
            default:
                ((ChatView$$ExternalSyntheticLambda6) obj2).invoke(((ChatContentViewModel.SuggestedRepliesViewModel.SuggestedReplyViewModel) obj).token);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ShareSheetViewKt$$ExternalSyntheticLambda5(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = function1;
    }
}
