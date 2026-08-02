package com.squareup.cash.score.views;

import androidx.compose.ui.unit.IntSize;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.score.viewmodels.ScoreHomeViewEvent;
import com.squareup.cash.securityhub.screens.BookletId;
import com.squareup.cash.securityhub.viewmodels.BookletViewEvent;
import com.squareup.cash.securityhub.viewmodels.EducationCardId;
import com.squareup.cash.securityhub.viewmodels.ProtectionsSectionViewEvent;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideRowId;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideViewEvent;
import com.squareup.cash.securityhub.viewmodels.SecurityEducationSupportRowId;
import com.squareup.cash.securityhub.viewmodels.SecurityHubViewEvent;
import com.squareup.cash.shopping.viewmodels.SearchResultsViewEvent;
import com.squareup.cash.shopping.viewmodels.ShoppingInfoSheetViewEvent;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptSheetViewEvents;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewEvent;
import com.squareup.cash.support.chat.views.ChatExitPromptSheetView;
import com.squareup.cash.support.viewmodels.ArticleViewEvent;
import com.squareup.cash.support.viewmodels.SupportArticleIncidentsSheetViewEvent;
import com.squareup.cash.support.viewmodels.SupportHomeViewEvent;
import com.squareup.cash.support.viewmodels.SupportHomeViewModel;
import com.squareup.cash.support.viewmodels.SupportLoadClientScenarioEvent$GoBack;
import com.squareup.cash.support.viewmodels.SupportNotification;
import com.squareup.cash.support.viewmodels.SupportSearchViewEvent;
import com.squareup.cash.support.viewmodels.SupportSearchViewModel;
import com.squareup.cash.support.views.SupportLoadClientScenarioView;
import com.squareup.cash.tax.viewmodels.TaxAuthorizationViewEvent;
import com.squareup.cash.tax.viewmodels.TaxTooltipEvent$TooltipDismissed;
import com.squareup.cash.tax.views.TaxAuthorizationView;
import com.squareup.cash.threedsdataonly.viewmodels.ThreeDsViewEvent$Exit;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewEvent;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewEvent;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.ui.widget.amount.AmountEvent;
import com.squareup.lending.CashCreditScoreHomeData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.ByteString;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes7.dex */
public final /* synthetic */ class ScoreHomeKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ScoreHomeKt$$ExternalSyntheticLambda5(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Screen screen;
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                CashCreditScoreHomeData.Action action = (CashCreditScoreHomeData.Action) obj;
                action.getClass();
                function1.invoke(new ScoreHomeViewEvent.Action(action, null));
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new ScoreHomeViewEvent.Action(new CashCreditScoreHomeData.Action(str, null, null, ByteString.EMPTY), null));
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new ScoreHomeViewEvent.Action(new CashCreditScoreHomeData.Action(str2, null, null, ByteString.EMPTY), null));
                break;
            case 3:
                AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) obj;
                error.getClass();
                function1.invoke(error.result.throwable);
                break;
            case 4:
                SecurityEducationSupportRowId securityEducationSupportRowId = (SecurityEducationSupportRowId) obj;
                securityEducationSupportRowId.getClass();
                function1.invoke(new BookletViewEvent.SupportRowTapped(securityEducationSupportRowId));
                break;
            case 5:
                BookletId bookletId = (BookletId) obj;
                bookletId.getClass();
                function1.invoke(new BookletViewEvent.RelatedBookletTapped(bookletId));
                break;
            case 6:
                SecurityEducationSupportRowId securityEducationSupportRowId2 = (SecurityEducationSupportRowId) obj;
                securityEducationSupportRowId2.getClass();
                function1.invoke(new ProtectionsSectionViewEvent.SupportRowTapped(securityEducationSupportRowId2));
                break;
            case 7:
                RecoveryGuideRowId recoveryGuideRowId = (RecoveryGuideRowId) obj;
                recoveryGuideRowId.getClass();
                function1.invoke(new RecoveryGuideViewEvent.RowTapped(recoveryGuideRowId));
                break;
            case 8:
                EducationCardId educationCardId = (EducationCardId) obj;
                educationCardId.getClass();
                function1.invoke(new RecoveryGuideViewEvent.BookletTapped(educationCardId));
                break;
            case 9:
                ProtectionsSectionViewEvent protectionsSectionViewEvent = (ProtectionsSectionViewEvent) obj;
                protectionsSectionViewEvent.getClass();
                function1.invoke(new SecurityHubViewEvent.ProtectionsEvent(protectionsSectionViewEvent));
                break;
            case 10:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new ShoppingInfoSheetViewEvent.OpenLink(str3));
                break;
            case 11:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new SearchResultsViewEvent.FooterItemClick(str4));
                break;
            case 12:
                ChatSurveyViewEvent chatSurveyViewEvent = (ChatSurveyViewEvent) obj;
                int i2 = ChatExitPromptSheetView.$r8$clinit;
                chatSurveyViewEvent.getClass();
                function1.invoke(new ChatExitPromptSheetViewEvents.SurveyEvent(chatSurveyViewEvent));
                break;
            case 13:
                function1.invoke(Integer.valueOf((int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax)));
                break;
            case 14:
                SupportNotification.Trigger trigger = (SupportNotification.Trigger) obj;
                trigger.getClass();
                function1.invoke(new SupportArticleIncidentsSheetViewEvent.IncidentNotificationClicked(trigger));
                break;
            case 15:
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                int i3 = SupportLoadClientScenarioView.$r8$clinit;
                dialogListenerEvent.getClass();
                boolean z = dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult;
                SupportLoadClientScenarioEvent$GoBack supportLoadClientScenarioEvent$GoBack = SupportLoadClientScenarioEvent$GoBack.INSTANCE;
                if (!z) {
                    if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogCanceled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        function1.invoke(supportLoadClientScenarioEvent$GoBack);
                    }
                } else {
                    function1.invoke(supportLoadClientScenarioEvent$GoBack);
                }
                break;
            case 16:
                Link link = (Link) obj;
                link.getClass();
                function1.invoke(new ArticleViewEvent.ClickSupportLink(link));
                break;
            case 17:
                SupportHomeViewModel.Category category = (SupportHomeViewModel.Category) obj;
                category.getClass();
                function1.invoke(new SupportHomeViewEvent.CategoryClicked(category.token));
                break;
            case 18:
                SupportNotification.Trigger trigger2 = (SupportNotification.Trigger) obj;
                trigger2.getClass();
                function1.invoke(new SupportHomeViewEvent.NotificationClicked(trigger2));
                break;
            case 19:
                SupportHomeViewModel.SuggestedAction suggestedAction = (SupportHomeViewModel.SuggestedAction) obj;
                suggestedAction.getClass();
                function1.invoke(new SupportHomeViewEvent.SuggestedActionClicked(suggestedAction.link));
                break;
            case 20:
                SupportSearchViewModel.SearchResultViewModel.Item item = (SupportSearchViewModel.SearchResultViewModel.Item) obj;
                item.getClass();
                function1.invoke(new SupportSearchViewEvent.ResultSelected(item.node));
                break;
            case 21:
                SupportSearchViewModel.ContactOptionType contactOptionType = (SupportSearchViewModel.ContactOptionType) obj;
                contactOptionType.getClass();
                function1.invoke(new SupportSearchViewEvent.ContactOptionSelected(contactOptionType));
                break;
            case 22:
                SupportSearchViewModel.SearchResultViewModel.Item item2 = (SupportSearchViewModel.SearchResultViewModel.Item) obj;
                item2.getClass();
                function1.invoke(new SupportSearchViewEvent.ResultSelected(item2.node));
                break;
            case 23:
                SupportSearchViewModel.ContactOptionType contactOptionType2 = (SupportSearchViewModel.ContactOptionType) obj;
                contactOptionType2.getClass();
                function1.invoke(new SupportSearchViewEvent.ContactOptionSelected(contactOptionType2));
                break;
            case 24:
                DialogListenerEvent dialogListenerEvent2 = (DialogListenerEvent) obj;
                int i4 = TaxAuthorizationView.$r8$clinit;
                dialogListenerEvent2.getClass();
                if (!(dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogResult)) {
                    if (!(dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogCanceled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screen = ((DialogListenerEvent.OnDialogCanceled) dialogListenerEvent2).screen;
                    }
                } else {
                    screen = ((DialogListenerEvent.OnDialogResult) dialogListenerEvent2).screen;
                }
                if (screen instanceof BlockersScreens.Error) {
                    function1.invoke(TaxAuthorizationViewEvent.HandleError.INSTANCE);
                }
                break;
            case 25:
                function1.invoke(TaxTooltipEvent$TooltipDismissed.INSTANCE);
                break;
            case 26:
                ((DialogListenerEvent) obj).getClass();
                function1.invoke(ThreeDsViewEvent$Exit.INSTANCE);
                break;
            case 27:
                AmountEvent amountEvent = (AmountEvent) obj;
                amountEvent.getClass();
                if (amountEvent instanceof AmountEvent.AmountChanged) {
                    function1.invoke(new AddMoneyViewEvent.AmountKeypadEntered(((AmountEvent.AmountChanged) amountEvent).rawAmount));
                }
                break;
            case 28:
                RecurringReloadConfigurationViewModel.AmountPickerItem amountPickerItem = (RecurringReloadConfigurationViewModel.AmountPickerItem) obj;
                amountPickerItem.getClass();
                function1.invoke(new RecurringReloadConfigurationViewEvent.AmountPickerItemSelected(amountPickerItem));
                break;
            default:
                RecurringReloadConfigurationViewModel.AmountPickerItem amountPickerItem2 = (RecurringReloadConfigurationViewModel.AmountPickerItem) obj;
                amountPickerItem2.getClass();
                function1.invoke(new RecurringReloadConfigurationViewEvent.AmountPickerItemSelected(amountPickerItem2));
                break;
        }
        return Unit.INSTANCE;
    }
}
