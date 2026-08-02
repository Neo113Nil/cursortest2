package com.squareup.cash.offers.views.home;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.input.InputState_androidKt;
import androidx.emoji2.text.MetadataRepo;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahi;
import com.squareup.cash.activity.views.SectionHeaderScope;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinStablecoinTooltip;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.money.presenters.HypeEligibilityProvider;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModel$OffersTimelineSheet;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEventV2;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerScreen;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerOptionsMenuViewEvent$SelectOption;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerOptionsMenuViewModel;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewModel;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewEvent;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import com.squareup.cash.paychecks.viewmodels.PaycheckSectionAggregation;
import com.squareup.cash.paychecks.viewmodels.PaychecksActivityListViewEvent;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter;
import com.squareup.cash.paymentpad.presenters.MainPaymentPadPresenter;
import com.squareup.cash.paymentpad.presenters.MainPaymentPadPresenter$Factory$Impl;
import com.squareup.cash.paymentpad.presenters.RealMainPaymentPadRefresher;
import com.squareup.cash.paymentpad.presenters.RealPaymentTabSettings;
import com.squareup.cash.payments.backend.real.RealActivityPaymentManager;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.screens.PaymentConfigurationFlow;
import com.squareup.cash.payments.screens.PaymentFlowData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.MainPaymentViewEvent;
import com.squareup.cash.payments.viewmodels.MainPaymentViewModel;
import com.squareup.cash.payments.viewmodels.SchedulePaymentViewModel;
import com.squareup.cash.payments.viewmodels.SelectedRecipient;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.taptopay.backend.real.RealTapToPayEligibilityProvider;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreenFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.Orientation;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersHomeV2Kt$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ OffersHomeV2Kt$$ExternalSyntheticLambda7(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        PaymentRouterData.ShareLink shareLink;
        String str2;
        PaymentRecipient paymentRecipient;
        int i = this.$r8$classId;
        int i2 = 14;
        boolean z = false;
        Object[] objArr = 0;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke((OffersHomeViewEventV2) obj);
                return Unit.INSTANCE;
            case 1:
                ((Function1) obj2).invoke((OffersHomeListItemViewModel.CategoryPillsSectionViewModel) obj);
                return Unit.INSTANCE;
            case 2:
                ((Function1) obj2).invoke((OffersHomeListItemViewModel.HeroOffersTileViewModel) obj);
                return Unit.INSTANCE;
            case 3:
                ((Function1) obj2).invoke((OffersHomeListItemViewModel.ClusterSection.CLOClusterSectionViewModel) obj);
                return Unit.INSTANCE;
            case 4:
                ((Function1) obj2).invoke((OffersHomeListItemViewModel.ClusterSection.ClusterSectionViewModel) obj);
                return Unit.INSTANCE;
            case 5:
                ((Function1) obj2).invoke((OffersHomeListItemViewModel.CategoryTilesSectionViewModel) obj);
                return Unit.INSTANCE;
            case 6:
                OffersHomeListItemViewModel.ClusterSection clusterSection = (OffersHomeListItemViewModel.ClusterSection) obj;
                ((Function1) obj2).invoke(new OffersHomeViewEvent.OffersClusterInfoItemClicked(clusterSection.getInfoItem().actionUrl, clusterSection.getInfoItem().tapEventSpecs));
                return Unit.INSTANCE;
            case 7:
                ((Function1) obj2).invoke(((OffersTimelineViewModel$OffersTimelineSheet) obj).event);
                return Unit.INSTANCE;
            case 8:
                TabToolbarPresenter tabToolbarPresenter = (TabToolbarPresenter) obj2;
                return ((BlockersDataNavigator) tabToolbarPresenter.badger2).getNext((OnboardingAccountPickerScreen) tabToolbarPresenter.profileManager, (BlockersData) obj);
            case 9:
                ((Function1) obj2).invoke(new AccountPickerOptionsMenuViewEvent$SelectOption(((AccountPickerOptionsMenuViewModel.Option) obj).optionId));
                return Unit.INSTANCE;
            case 10:
                Context context = (Context) obj2;
                MetadataRepo metadataRepo = (MetadataRepo) obj;
                ComposeView composeView = new ComposeView(context, null, 0, 6, null);
                composeView.setContent(new ComposableLambdaImpl(new SuggestionUiKt$$ExternalSyntheticLambda8(metadataRepo, 20), true, -705103160));
                return composeView;
            case 11:
                Function1 function1 = (Function1) obj2;
                if (((AllowlistSelectionViewModel) obj).searchModel.useBackNavigation) {
                    function1.invoke(AllowlistSelectionViewEvent.TapBack.INSTANCE);
                } else {
                    function1.invoke(AllowlistSelectionViewEvent.TapClose.INSTANCE);
                }
                return Unit.INSTANCE;
            case 12:
                ((Function1) obj2).invoke(new P2PListViewEvent.TapRowButton((P2PListRowTapButtonEvent) obj));
                return Unit.INSTANCE;
            case 13:
                Function1 function12 = (Function1) obj2;
                if (((SelectCustomerViewModel) obj).useBackNavigation) {
                    function12.invoke(SelectCustomerViewEvent.TapBack.INSTANCE);
                } else {
                    function12.invoke(SelectCustomerViewEvent.TapClose.INSTANCE);
                }
                return Unit.INSTANCE;
            case 14:
                ((Function1) obj2).invoke(new PasskeyManagementViewEvent.ConfirmRemovePasskey(((PasskeyManagementViewModel.OperationState.Remove.AwaitingConfirmation) obj).passkey.id));
                return Unit.INSTANCE;
            case 15:
                ((Function1) obj2).invoke(new PasskeyManagementViewEvent.RetryRemovePasskey(((PasskeyManagementViewModel.OperationState.Remove.Error) obj).passkey.id));
                return Unit.INSTANCE;
            case 16:
                ((Function1) obj2).invoke(new PasskeyManagementViewEvent.RemovePasskeyTapped((PasskeyManagementViewModel.PasskeyItemViewModel) obj));
                return Unit.INSTANCE;
            case 17:
                ((Function1) obj2).invoke(((PaychecksHomeViewModel.Content.Section.ActiveDistribution) obj).button.action);
                return Unit.INSTANCE;
            case 18:
                ((Function1) obj2).invoke(((PaychecksHomeViewModel.Content.Section.DirectDeposit) obj).getAction());
                return Unit.INSTANCE;
            case 19:
                ((Function1) obj2).invoke(((PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel) obj).button.action);
                return Unit.INSTANCE;
            case 20:
                ((Function1) obj2).invoke(((EditDistributionViewModel.Content) obj).primaryAction.action);
                return Unit.INSTANCE;
            case 21:
                ((Function1) obj2).invoke(((MultipleAllocationViewModel.Active.Action.Prominent) ((MultipleAllocationViewModel.Active.Action) obj)).event);
                return Unit.INSTANCE;
            case 22:
                Function1 function13 = (Function1) obj2;
                Object obj3 = ((SectionHeaderScope) obj).entry.aggregation;
                PaycheckSectionAggregation paycheckSectionAggregation = obj3 instanceof PaycheckSectionAggregation ? (PaycheckSectionAggregation) obj3 : null;
                if (paycheckSectionAggregation != null) {
                    function13.invoke(new PaychecksActivityListViewEvent.AggregationSelected(paycheckSectionAggregation.payload));
                }
                return Unit.INSTANCE;
            case 23:
                BetterNavigator.ScreenNavigator screenNavigator = ((HomeViewPresenter) obj).navigator;
                TabToolbarPresenter.MetroFactory metroFactory = ((MainPaymentPadPresenter$Factory$Impl) obj2).delegateFactory;
                RealUuidGenerator realUuidGenerator = (RealUuidGenerator) ((LambdaProvider) metroFactory.moneybotAnalyticsService).lambda.invoke();
                RealMainPaymentPadRefresher realMainPaymentPadRefresher = (RealMainPaymentPadRefresher) metroFactory.sessionManager.invoke();
                RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) metroFactory.sessionFlags).invoke();
                RealPaymentTabSettings realPaymentTabSettings = (RealPaymentTabSettings) metroFactory.profileManager.invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.badges.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) metroFactory.syncValueReader).lambda.invoke();
                RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper = (RealTapToPayAnalyticsHelper) metroFactory.badger2.invoke();
                RealTapToPayEligibilityProvider realTapToPayEligibilityProvider = (RealTapToPayEligibilityProvider) metroFactory.featureFlagManager.invoke();
                RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) metroFactory.bitcoinCapabilityProvider.invoke();
                TreehouseScreenFactory treehouseScreenFactory = (TreehouseScreenFactory) ((DoubleCheck) metroFactory.p2pSettingsManager).getValue();
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((DoubleCheck) metroFactory.familyNavigatorFactory).getValue();
                RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) metroFactory.badgingStateAccessibilityHelper.invoke();
                Analytics analytics = (Analytics) ((DoubleCheck) metroFactory.familyProfileManager).getValue();
                AndroidClock androidClock = (AndroidClock) ((LambdaProvider) metroFactory.balanceSnapshotManager).lambda.invoke();
                KeyValue keyValue = (KeyValue) ((RealCurrentUserSetter.MetroFactory) metroFactory.moneyFormatterFactory).invoke();
                HypeEligibilityProvider hypeEligibilityProvider = (HypeEligibilityProvider) metroFactory.moneybotFlagsHelper.invoke();
                SyncValueReader syncValueReader = (SyncValueReader) ((DoubleCheck) metroFactory.tabToolbarOutboundNavigatorFactory).getValue();
                realUuidGenerator.getClass();
                realMainPaymentPadRefresher.getClass();
                realProfileManager.getClass();
                realPaymentTabSettings.getClass();
                factory.getClass();
                androidStringManager.getClass();
                realTapToPayAnalyticsHelper.getClass();
                realTapToPayEligibilityProvider.getClass();
                realP2pSettingsManager.getClass();
                treehouseScreenFactory.getClass();
                featureFlagManager.getClass();
                realFamilyAccountsManager.getClass();
                analytics.getClass();
                androidClock.getClass();
                hypeEligibilityProvider.getClass();
                syncValueReader.getClass();
                return new MainPaymentPadPresenter(realUuidGenerator, realMainPaymentPadRefresher, realProfileManager, realPaymentTabSettings, factory, androidStringManager, realTapToPayAnalyticsHelper, realTapToPayEligibilityProvider, realP2pSettingsManager, screenNavigator, treehouseScreenFactory, featureFlagManager, realFamilyAccountsManager, analytics, androidClock, keyValue, hypeEligibilityProvider, syncValueReader);
            case 24:
                RealActivityPaymentManager realActivityPaymentManager = (RealActivityPaymentManager) obj2;
                JobKt.launch$default(realActivityPaymentManager.scope, null, null, new OverlayKt$Overlay$1$1$1$1$1(realActivityPaymentManager, (String) obj, objArr == true ? 1 : 0, i2), 3);
                return Unit.INSTANCE;
            case 25:
                return ((CardLockPresenter) obj2).toNearbyPayers((SnapshotStateList) obj);
            case 26:
                PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) obj2;
                State state = (State) obj;
                PaymentScreens.PaymentConfiguration paymentConfiguration = paymentConfigurationPresenter.args;
                PaymentConfigurationFlow paymentConfigurationFlow = paymentConfiguration.paymentConfigurationFlow;
                paymentConfigurationFlow.getClass();
                PaymentFlowData data = paymentConfigurationFlow.getData();
                PaymentFlowData.StandardFlowData standardFlowData = data instanceof PaymentFlowData.StandardFlowData ? (PaymentFlowData.StandardFlowData) data : null;
                Redacted redacted = standardFlowData != null ? standardFlowData.recipient : null;
                RecipientViewModel recipientViewModel = (redacted == null || (paymentRecipient = (PaymentRecipient) redacted.getValue()) == null) ? null : paymentConfigurationPresenter.toRecipientViewModel(zzahi.toRecipient(paymentRecipient));
                PaymentConfigurationFlow paymentConfigurationFlow2 = paymentConfiguration.paymentConfigurationFlow;
                paymentConfigurationFlow2.getClass();
                PaymentFlowData data2 = paymentConfigurationFlow2.getData();
                PaymentFlowData.StandardFlowData standardFlowData2 = data2 instanceof PaymentFlowData.StandardFlowData ? (PaymentFlowData.StandardFlowData) data2 : null;
                Redacted redacted2 = standardFlowData2 != null ? standardFlowData2.note : null;
                String str3 = "";
                if (redacted2 == null || (str = (String) redacted2.getValue()) == null) {
                    str = "";
                }
                Orientation orientation = paymentConfiguration.orientation;
                Money money = paymentConfiguration.amount;
                boolean z2 = !PaymentConfigurationPresenter.models$lambda$1(state);
                PaymentConfigurationFlow.PayLink payLink = paymentConfigurationFlow2 instanceof PaymentConfigurationFlow.PayLink ? (PaymentConfigurationFlow.PayLink) paymentConfigurationFlow2 : null;
                String str4 = payLink != null ? payLink.link : null;
                if (str4 != null) {
                    if (StringsKt.isBlank(str4)) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        PaymentFlowData data3 = paymentConfigurationFlow2.getData();
                        PaymentFlowData.StandardFlowData standardFlowData3 = data3 instanceof PaymentFlowData.StandardFlowData ? (PaymentFlowData.StandardFlowData) data3 : null;
                        Redacted redacted3 = standardFlowData3 != null ? standardFlowData3.note : null;
                        if (redacted3 != null && (str2 = (String) redacted3.getValue()) != null) {
                            str3 = str2;
                        }
                        shareLink = new PaymentRouterData.ShareLink(str4, str3, false);
                        String payLinkToken = InputState_androidKt.getPayLinkToken(paymentConfigurationFlow2);
                        return Updater.mutableStateOf$default(new PaymentRouterData(paymentConfigurationFlow, recipientViewModel, str, orientation, money, z2, false, false, null, false, false, false, false, shareLink, (payLinkToken != null || StringsKt.isBlank(payLinkToken)) ? null : payLinkToken, !((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) paymentConfigurationPresenter.featureFlagManager).peekCurrentValue(AmplitudeExperiments$BitcoinStablecoinTooltip.INSTANCE)).enabled() && ((Number) paymentConfigurationPresenter.recipientSelectorTooltipSeenCount.blockingGet()).intValue() < 2, null, null, null, false, 16088768));
                    }
                }
                shareLink = null;
                String payLinkToken2 = InputState_androidKt.getPayLinkToken(paymentConfigurationFlow2);
                return Updater.mutableStateOf$default(new PaymentRouterData(paymentConfigurationFlow, recipientViewModel, str, orientation, money, z2, false, false, null, false, false, false, false, shareLink, (payLinkToken2 != null || StringsKt.isBlank(payLinkToken2)) ? null : payLinkToken2, !((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) paymentConfigurationPresenter.featureFlagManager).peekCurrentValue(AmplitudeExperiments$BitcoinStablecoinTooltip.INSTANCE)).enabled() && ((Number) paymentConfigurationPresenter.recipientSelectorTooltipSeenCount.blockingGet()).intValue() < 2, null, null, null, false, 16088768));
            case 27:
                MainPaymentViewModel mainPaymentViewModel = (MainPaymentViewModel) obj;
                Function1 function14 = (Function1) obj2;
                if (!mainPaymentViewModel.selectedRecipients.values().isEmpty()) {
                    function14.invoke(new MainPaymentViewEvent.ListRowClicked(new SelectedRecipient(new RedactedParcelable((Parcelable) CollectionsKt.last(mainPaymentViewModel.selectedRecipients.values()))), 14));
                }
                return Unit.INSTANCE;
            case 28:
                RecipientViewModel recipientViewModel2 = (RecipientViewModel) obj;
                List list = ((LazyListState) obj2).getLayoutInfo().visibleItemsInfo;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((LazyListMeasuredItem) it.next()).key.equals(recipientViewModel2.listUniqueId)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                ((Function1) obj2).invoke(((SchedulePaymentViewModel.FrequencyOption) obj).frequency);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ OffersHomeV2Kt$$ExternalSyntheticLambda7(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = function1;
    }
}
