package com.squareup.cash.money.views;

import android.nfc.NfcAdapter;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.focus.FocusRequester;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.appmessages.views.RealTooltipTargetLoadedCallbackRegistry;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.cdf.paychecks.PaychecksShowFullHistory;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$MoneyCardIntroAnimation;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$PrimaryBankActiveFdicDisclosures;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.genie.backend.real.GenieLogger;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.money.disclosure.DisclosureRepository;
import com.squareup.cash.money.presenters.MoneyTabPresenter;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.moneybot.backend.real.managers.RealChatSessionManager;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.mooncake.components.QuickReturnHeaderLayout;
import com.squareup.cash.nfc.backend.real.RealNfcPaymentsManager;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.presenters.OffersDetailsPresenter;
import com.squareup.cash.offers.presenters.OffersHomePresenter;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.backend.api.model.MultipleAllocationBlocker;
import com.squareup.cash.paychecks.presenters.AllocationGroupWithPercentage;
import com.squareup.cash.paychecks.presenters.util.RealPaycheckSettlementDateFormatter;
import com.squareup.cash.paychecks.screens.PaycheckActivityListScreen;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.paychecks.views.MaxPercentCappedKeypadListener;
import com.squareup.cash.paymentpad.views.MainPaymentPadViewState;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PersonalizationDraft;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.viewmodels.MainPaymentViewModel;
import com.squareup.cash.payments.views.MainPaymentViewState;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.kgoose.api.v3.Message;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import xyz.block.genie.state.GenieViewState;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda5(ComposePlatform.Button button, CoroutineScope coroutineScope, GenieViewState genieViewState, GenieLogger genieLogger) {
        this.$r8$classId = 6;
        this.f$0 = button;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        int i = this.$r8$classId;
        boolean z = true;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                return Updater.mutableStateOf$default(Boolean.valueOf(((MoneyTabModel) obj2) instanceof MoneyTabModel.Loading));
            case 1:
                return Boolean.valueOf(((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) ((DisclosureRepository) obj2).featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$PrimaryBankActiveFdicDisclosures.INSTANCE)).enabled());
            case 2:
                return Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((MoneyTabPresenter) obj2).featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$MoneyCardIntroAnimation.INSTANCE)).enabled());
            case 3:
                CardNestedScrollExpander cardNestedScrollExpander = (CardNestedScrollExpander) obj2;
                Float f = (Float) cardNestedScrollExpander.transitioningCardOffset$delegate.getValue();
                float floatValue = f != null ? f.floatValue() : 0.1f * (cardNestedScrollExpander.cardRevealDistance$delegate.getFloatValue() - cardNestedScrollExpander.restingPosition);
                if (floatValue < RecyclerView.DECELERATION_RATE) {
                    floatValue = 0.0f;
                }
                return Float.valueOf(floatValue);
            case 4:
                RealTooltipTargetLoadedCallbackRegistry realTooltipTargetLoadedCallbackRegistry = (RealTooltipTargetLoadedCallbackRegistry) ((MoneyUiFactory) obj2).tooltipTargetLoadedCallbackRegistry;
                BankingDialogKt$$ExternalSyntheticLambda5 bankingDialogKt$$ExternalSyntheticLambda5 = realTooltipTargetLoadedCallbackRegistry.animateInCallback;
                if (bankingDialogKt$$ExternalSyntheticLambda5 != null) {
                    bankingDialogKt$$ExternalSyntheticLambda5.invoke();
                }
                realTooltipTargetLoadedCallbackRegistry.animateInCallback = null;
                return Unit.INSTANCE;
            case 5:
                ((RealChatSessionManager) obj2).isSubscribed.set(false);
                return Unit.INSTANCE;
            case 6:
                return ((ComposePlatform.Button) obj2).action == null ? Unit.INSTANCE : Unit.INSTANCE;
            case 7:
                return ((MoneybotChatPresenter) obj2).getDidClickStartNewChat();
            case 8:
                return _MoshiKotlinExtensionsKt.adapter((Moshi) ((WorkHomePresenter) obj2).titleBarPresenter, Reflection.typeOf(Message.class)).indent(" ");
            case 9:
                MoneybotChatViewModel.Content.Chat.InitialScrollPosition initialScrollPosition = ((MoneybotChatViewModel.Content.Chat) ((MoneybotChatViewModel.Content) obj2)).initialScrollPosition;
                return new LazyListState(initialScrollPosition.index, initialScrollPosition.offset);
            case 10:
                FocusRequester.m605requestFocus3ESFkO8$default((FocusRequester) obj2);
                return Unit.INSTANCE;
            case 11:
                int i2 = QuickReturnHeaderLayout.$r8$clinit;
                NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper((QuickReturnHeaderLayout) obj2);
                nestedScrollingChildHelper.setNestedScrollingEnabled(true);
                return nestedScrollingChildHelper;
            case 12:
                AttestedKeyService.Factory factory = (AttestedKeyService.Factory) ((AssetPublicSuffixList) obj2).readFailure;
                AttestedKeyService.GenerationMode generationMode = AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP;
                return factory.create("cashapp.ak.mri_worker");
            case 13:
                AttestedKeyService.GenerationMode generationMode2 = AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP;
                return ((AttestedKeyService.Factory) obj2).create("cashapp.ak.mri_worker");
            case 14:
                return NfcAdapter.getDefaultAdapter(((RealNfcPaymentsManager) obj2).activity);
            case 15:
                OfferType offerType = ((OfferSheetKey) obj2).offer_type;
                if (offerType != OfferType.PAY_LATER_INN && offerType != OfferType.PAY_LATER_OON) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                RealOffersAnalyticsHelper realOffersAnalyticsHelper = (RealOffersAnalyticsHelper) ((OffersDetailsPresenter) obj2).analyticsHelper;
                realOffersAnalyticsHelper.refreshFlowToken(OffersAnalyticsHelper$Flow.SHOP);
                realOffersAnalyticsHelper.refreshFlowToken(OffersAnalyticsHelper$Flow.BROWSE);
                realOffersAnalyticsHelper.refreshFlowToken(OffersAnalyticsHelper$Flow.SEARCH);
                return Unit.INSTANCE;
            case 17:
                return Updater.mutableStateOf$default(((OffersHomePresenter) obj2).args.searchPlaceholder);
            case 18:
                ((MutableTransitionState) obj2).setTargetState(Boolean.TRUE);
                return Unit.INSTANCE;
            case 19:
                long j = 0;
                for (MultipleAllocationBlocker.Allocation allocation : ((AllocationGroupWithPercentage) obj2).allocations) {
                    allocation.getClass();
                    j += allocation.destination.shareInBasisPoints;
                }
                return Long.valueOf(j);
            case 20:
                return new ParcelableSnapshotMutableFloatState(((EditDistributionConfiguration.DestinationUiConfiguration) obj2).shareInBasisPoints / 10000.0f);
            case 21:
                TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) obj2;
                ((Analytics) tapToPayPresenter.sessionManager).track(new PaychecksShowFullHistory(), null);
                ((BetterNavigator.ScreenNavigator) tapToPayPresenter.navigator).goTo(PaycheckActivityListScreen.INSTANCE);
                return Unit.INSTANCE;
            case 22:
                AndroidDateFormatManager androidDateFormatManager = ((RealPaycheckSettlementDateFormatter) obj2).dateFormatManager;
                return androidDateFormatManager.getDateFormat("MMM d", androidDateFormatManager.clock.timeZone()).formatter;
            case 23:
                ((PaychecksHomeViewModel.Content.Section.ArcadeActivity) obj2).embedded.onEvent.invoke(ActivityEmbeddedViewEvent.ShowMoreClicked.INSTANCE);
                return Unit.INSTANCE;
            case 24:
                ((MaxPercentCappedKeypadListener) obj2).onLongBackspace();
                return Unit.INSTANCE;
            case 25:
                return Updater.mutableStateOf$default((MainPaymentPadViewState) obj2);
            case 26:
                InstrumentSelectionData instrumentSelectionData = ((PaymentConfigurationPresenter) obj2).args.instrument;
                return Updater.mutableStateOf$default(instrumentSelectionData != null ? instrumentSelectionData.toSelectionProto() : null);
            case 27:
                PersonalizationDraft personalizationDraft = (PersonalizationDraft) obj2;
                if (personalizationDraft == null || (obj = personalizationDraft.elements) == null) {
                    obj = EmptyList.INSTANCE;
                }
                return Updater.mutableStateOf$default(obj);
            case 28:
                return Updater.mutableStateOf$default((MainPaymentViewState) obj2);
            default:
                return Updater.mutableStateOf$default(((MainPaymentViewModel) obj2).note);
        }
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
