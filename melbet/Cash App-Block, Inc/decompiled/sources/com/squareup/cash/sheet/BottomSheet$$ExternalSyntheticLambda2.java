package com.squareup.cash.sheet;

import androidx.compose.runtime.Updater;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.broadway.ui.Ui;
import app.cash.local.presenters.LocalEditorialPresenter;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ProfileCashtagRequiredViewEvent$Close;
import com.squareup.cash.account.settings.viewmodels.ProfileUnavailableViewEvent$PositiveButtonClicked;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportConsistentCsatOrder;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportHomeProminentContactEntrypoint;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$CashWebMonitoringScript;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.performance.ScrollPerformanceAnalyzer;
import com.squareup.cash.performance.ScrollPerformanceNode;
import com.squareup.cash.pools.presenters.PoolContributeWithNotePresenter;
import com.squareup.cash.pools.presenters.PoolMemberListPresenter;
import com.squareup.cash.pools.presenters.StartPoolPresenter;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import com.squareup.cash.pools.viewmodels.StartPoolViewModel;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphCalculator;
import com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen;
import com.squareup.cash.profile.presenters.trustedcontact.InvestingContactPresenter;
import com.squareup.cash.profile.presenters.trustedcontact.TrustedContactFlowPresenter;
import com.squareup.cash.profile.presenters.trustedcontact.TrustedContactFlowPresenter$Factory$Impl;
import com.squareup.cash.profile.viewmodels.AccountSelectorSectionViewModel;
import com.squareup.cash.profile.views.GenericConfirmDialogView;
import com.squareup.cash.profile.views.ProfileCashtagRequiredDialog;
import com.squareup.cash.profile.views.ProfileUnavailableDialog;
import com.squareup.cash.reactions.treehouse.ReactionDialogAnchorBinding;
import com.squareup.cash.recurring.ConfirmFirstScheduledReloadNoticeView;
import com.squareup.cash.recurring.ConfirmFirstScheduledReloadNoticeViewEvent$PositiveClick;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.viewmodels.BrandsSearchViewModel;
import com.squareup.cash.shopping.viewmodels.IncentiveErrorDialogViewEvent$Close;
import com.squareup.cash.shopping.viewmodels.ProductSearchViewModel;
import com.squareup.cash.shopping.views.CashAppPayIncentiveAuthErrorDialogView;
import com.squareup.cash.shopping.views.ProductSearchViewState;
import com.squareup.cash.support.chat.viewmodels.ChatRowViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatViewEvent;
import com.squareup.cash.support.chat.views.transcript.ErrorRowView;
import com.squareup.cash.support.chat.views.transcript.FileAttachmentView;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.pools.PoolParticipantType;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class BottomSheet$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BottomSheet$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                BottomSheet bottomSheet = (BottomSheet) obj;
                bottomSheet.moveSheetToStateAnimator(bottomSheet.currentState).start();
                return Unit.INSTANCE;
            case 1:
                String path = ((PdfScreen) ((PdfPreviewPresenter) obj).args).fileUri.getPath();
                path.getClass();
                return new File(path);
            case 2:
                return Float.valueOf(1000.0f / ((Number) ((ScrollPerformanceAnalyzer) obj).refreshRating$delegate.getValue()).intValue());
            case 3:
                return Boolean.valueOf(((ScrollPerformanceNode) obj).scrollableState.isScrollInProgress());
            case 4:
                Money money = new Money((Long) 0L, CurrencyCode.USD, 4);
                return Updater.mutableStateOf$default(new PoolContributeWithNoteViewModel.AmountAtmPicker(money, ((PoolContributeWithNotePresenter) obj).buildAmountPickerOptions(money), false, 4));
            case 5:
                Iterable iterable = (Iterable) ((PoolMemberListPresenter) obj).args.participants.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    if (((PoolParticipant) obj2).participant_type == PoolParticipantType.POOL_PARTICIPANT_TYPE_CASH_APP_USER) {
                        arrayList.add(obj2);
                    }
                }
                return Updater.mutableStateOf$default(arrayList);
            case 6:
                StartPoolPresenter startPoolPresenter = (StartPoolPresenter) obj;
                Money money2 = startPoolPresenter.args.amount;
                return Updater.mutableStateOf$default(money2 != null ? new StartPoolViewModel.Name(money2, startPoolPresenter.moneyFormatter.format(money2), "") : new StartPoolViewModel.Amount(null, null));
            case 7:
                return ((RealInvestingGraphCalculator) obj).stringManager.get(R.string.investing_graph_before_activity);
            case 8:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
                AndroidStringManager androidStringManager = (AndroidStringManager) localEditorialPresenter.stringManager;
                screenNavigator.goTo(new FailureMessageScreen(androidStringManager.get(R.string.error_messaging_title_something_went_wrong), androidStringManager.get(R.string.error_messaging_message_try_again_in_a_few_minutes), androidStringManager.get(R.string.ok), (PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent) localEditorialPresenter.clock, null, 16));
                return Unit.INSTANCE;
            case 9:
                InvestingContactPresenter investingContactPresenter = (InvestingContactPresenter) obj;
                TrustedContactFlowPresenter$Factory$Impl trustedContactFlowPresenter$Factory$Impl = investingContactPresenter.flowPresenterFactory;
                BetterNavigator.ScreenNavigator screenNavigator2 = investingContactPresenter.navigator;
                FlowStarter flowStarter = (FlowStarter) trustedContactFlowPresenter$Factory$Impl.delegateFactory.staticImageLoader.invoke();
                flowStarter.getClass();
                return new TrustedContactFlowPresenter(flowStarter, screenNavigator2);
            case 10:
                InvestingContactPresenter investingContactPresenter2 = (InvestingContactPresenter) obj;
                TrustedContactFlowPresenter$Factory$Impl trustedContactFlowPresenter$Factory$Impl2 = investingContactPresenter2.flowPresenterFactory;
                BetterNavigator.ScreenNavigator screenNavigator3 = investingContactPresenter2.navigator;
                FlowStarter flowStarter2 = (FlowStarter) trustedContactFlowPresenter$Factory$Impl2.delegateFactory.staticImageLoader.invoke();
                flowStarter2.getClass();
                return new TrustedContactFlowPresenter(flowStarter2, screenNavigator3);
            case 11:
                Ui.EventReceiver eventReceiver = ((GenericConfirmDialogView) obj).eventReceiver;
                if (eventReceiver == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
                Unit unit = Unit.INSTANCE;
                eventReceiver.sendEvent(unit);
                return unit;
            case 12:
                Ui.EventReceiver eventReceiver2 = ((ProfileCashtagRequiredDialog) obj).eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(ProfileCashtagRequiredViewEvent$Close.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 13:
                Ui.EventReceiver eventReceiver3 = ((ProfileUnavailableDialog) obj).eventReceiver;
                if (eventReceiver3 != null) {
                    eventReceiver3.sendEvent(ProfileUnavailableViewEvent$PositiveButtonClicked.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 14:
                ((AccountSelectorSectionViewModel.AccountViewModel) obj).onClicked.invoke();
                return Unit.INSTANCE;
            case 15:
                PageFetcher$generateNewPagingSource$3 pageFetcher$generateNewPagingSource$3 = ((ReactionDialogAnchorBinding) obj).onDismiss;
                if (pageFetcher$generateNewPagingSource$3 != null) {
                    pageFetcher$generateNewPagingSource$3.invoke();
                }
                return Unit.INSTANCE;
            case 16:
                Ui.EventReceiver eventReceiver4 = ((ConfirmFirstScheduledReloadNoticeView) obj).eventReceiver;
                if (eventReceiver4 != null) {
                    eventReceiver4.sendEvent(ConfirmFirstScheduledReloadNoticeViewEvent$PositiveClick.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 17:
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) obj;
                return ((RealRouter$Factory$Impl) pdfPreviewPresenter.launcher).create$1(pdfPreviewPresenter.navigator);
            case 18:
                return new RealSheetState((SheetPosition) obj, (UserDismissMode) (null == true ? 1 : 0), 6);
            case 19:
                return (JsonFeatureFlags$CashWebMonitoringScript.WebMonitoringOptions) ((FeatureFlag$JsonFeatureFlag.Options) ((RealFeatureFlagManager) ((ShoppingWebPresenter) obj).featureFlagManager).peekCurrentValue(JsonFeatureFlags$CashWebMonitoringScript.INSTANCE)).value;
            case 20:
                return Updater.mutableStateOf$default(((BrandsSearchViewModel) obj).getSearchText());
            case 21:
                Ui.EventReceiver eventReceiver5 = ((CashAppPayIncentiveAuthErrorDialogView) obj).eventReceiver;
                if (eventReceiver5 != null) {
                    eventReceiver5.sendEvent(IncentiveErrorDialogViewEvent$Close.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 22:
                return Updater.mutableStateOf$default(new ProductSearchViewState(((ProductSearchViewModel) obj).getSearchText(), true, false, false, true));
            case 23:
                ((BasicShieetScope$$ExternalSyntheticLambda10) obj).invoke();
                return Unit.INSTANCE;
            case 24:
                return Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) ((PdfPreviewPresenter) obj).fileProvider)).currentValue(AmplitudeExperiments$ClientSupportConsistentCsatOrder.INSTANCE)).enabled());
            case 25:
                ((ChatRowViewModel.MessageRowViewModel) obj).onUpdateCashAppClick.invoke();
                return Unit.INSTANCE;
            case 26:
                ((ErrorRowView) obj).onRetryClick.invoke();
                return Unit.INSTANCE;
            case 27:
                ((FileAttachmentView) obj).onClick.invoke(ChatViewEvent.RemoveAttachment.INSTANCE);
                return Unit.INSTANCE;
            case 28:
                Redacted redacted = ((SupportScreens.ContactScreens.ContactSupportEmailInputScreen) ((WorkHomePresenter) obj).payPresenter).preFilledEmail;
                String str = redacted != null ? (String) redacted.getValue() : null;
                return Updater.mutableStateOf$default(str != null ? str : "");
            default:
                return Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) obj).currentValue(AmplitudeExperiments$ClientSupportHomeProminentContactEntrypoint.INSTANCE)).enabled());
        }
    }
}
