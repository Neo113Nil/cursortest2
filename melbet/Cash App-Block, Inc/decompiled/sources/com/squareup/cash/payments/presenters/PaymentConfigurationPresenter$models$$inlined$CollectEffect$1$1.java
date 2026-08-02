package com.squareup.cash.payments.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.draw.ScaleKt;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.presenters.brand.menu.LocalBrandLocationMenuPresenter;
import app.cash.local.presenters.brand.menu.OrderLimitToasts;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuItemVariation;
import app.cash.local.primitives.MenuItemVariationToken;
import app.cash.local.screens.app.LocalBrandLocationCartScreen;
import app.cash.local.screens.app.LocalBrandLocationMenuScreen;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.MenuPickerQuestion;
import app.cash.local.viewmodels.CartItemCounterViewEvent;
import app.cash.local.viewmodels.LocalBottomModalViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewEvent;
import app.cash.local.viewmodels.LocalSearchViewEvent$SearchCleared;
import app.cash.local.viewmodels.LocalSearchViewEvent$SearchClicked;
import app.cash.local.viewmodels.LocalSearchViewEvent$SearchInput;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahg;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahh;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.navigation.BitcoinInboundNavigator;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.BitcoinStackingToolsPresenter;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation.RealPaidInBitcoinNavigator;
import com.squareup.cash.bitcoin.screens.BitcoinStackingToolsInfoScreen;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsViewEvent;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.card.onboarding.CtaAction;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationPresenter;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationPresenter$models$2$1;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationPresenter$models$2$2;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewEvent;
import com.squareup.cash.card.onboarding.screens.PaymentDeviceCustomizationScreen;
import com.squareup.cash.cdf.PaymentAssetType;
import com.squareup.cash.cdf.asset.AssetRequestDismissSheet;
import com.squareup.cash.cdf.asset.AssetRequestNavigateBack;
import com.squareup.cash.cdf.asset.AssetRequestSubmitTransaction;
import com.squareup.cash.cdf.asset.AssetRequestTapContinueOnInputNoteScreen;
import com.squareup.cash.cdf.asset.AssetSendDismissSheet;
import com.squareup.cash.cdf.asset.AssetSendNavigateBack;
import com.squareup.cash.cdf.asset.AssetSendPersonalizationButtonTapped;
import com.squareup.cash.cdf.asset.AssetSendSelectInstrument;
import com.squareup.cash.cdf.asset.AssetSendSelectStablecoinNetwork;
import com.squareup.cash.cdf.asset.AssetSendSubmitTransaction;
import com.squareup.cash.cdf.asset.AssetSendTapContinueOnInputNoteScreen;
import com.squareup.cash.cdf.asset.AssetSendTapDisabledSchedulePayment;
import com.squareup.cash.cdf.asset.EntryPoint;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.cdf.asset.PersonalizationOrigin;
import com.squareup.cash.cdf.asset.ReviewPaymentElementType;
import com.squareup.cash.cdf.asset.ScreenName;
import com.squareup.cash.cdf.contact.ContactAccessRequestPermission;
import com.squareup.cash.cdf.crypto.CryptoStackStart;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.mintpdp.MintPdpDeviceOptionSelected;
import com.squareup.cash.cdf.mintpdp.MintPdpPageCtaTapped;
import com.squareup.cash.cdf.mintpdp.MintPdpPageDismissed;
import com.squareup.cash.cdf.mintpdp.MintPdpPageViewed;
import com.squareup.cash.cdf.mintpdp.MintPdpSectionViewed;
import com.squareup.cash.cdf.mintpdp.PdpSectionType;
import com.squareup.cash.cdf.recipient.RecipientSearchOpenQRScanner;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.db.contacts.RecipientPaymentInfo;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientP2pPlatformPay;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$StablecoinDebitCardSource;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.instruments.screens.InstrumentSelectionScreen;
import com.squareup.cash.instruments.screens.WhichInstrument;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.payments.common.PaymentScheduleFrequency;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.screens.PaymentScheduleSelection;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewEvent;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.RecipientSelectedStep;
import com.squareup.cash.payments.viewmodels.RecurringDisabledInstrument;
import com.squareup.cash.payments.viewmodels.RecurringDisabledInstrumentKt$WhenMappings;
import com.squareup.cash.payments.viewmodels.TitleTapped;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.qrcodes.screens.CashtagQrScanQuestion;
import com.squareup.cash.recipients.analytics.RecipientAnalyticsKt;
import com.squareup.cash.recipients.backend.api.GenerationStrategy;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.PaymentCardGlobalConfig;
import com.squareup.protos.franklin.api.PaymentDeviceCustomizationBlockerConfig;
import com.squareup.protos.franklin.api.PaymentDeviceOption;
import com.squareup.protos.franklin.api.ProductDetailsPage;
import com.squareup.protos.franklin.common.Orientation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1 implements FlowCollector {
    public final /* synthetic */ Object $$this$LaunchedEffect;
    public final /* synthetic */ State $contactsPermissionGranted$delegate$inlined;
    public final /* synthetic */ State $hasPassedIdv$inlined;
    public final /* synthetic */ Object $instruments$delegate$inlined;
    public final /* synthetic */ Object $paymentRouterData$delegate$inlined;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $router$inlined;
    public final /* synthetic */ Object $scope$inlined;
    public final /* synthetic */ Object $searchText$inlined;
    public final /* synthetic */ MutableState $state$delegate$inlined;
    public final /* synthetic */ Object $trackedStablecoinRecipientViews$inlined;
    public final /* synthetic */ Object this$0;

    public PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, LocalBrandLocationMenuPresenter localBrandLocationMenuPresenter, CartBuilder cartBuilder, BrandSpotSyncTokens brandSpotSyncTokens, State state, State state2, State state3, State state4, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.$$this$LaunchedEffect = localBrandLocationMenuPresenter;
        this.$scope$inlined = cartBuilder;
        this.this$0 = brandSpotSyncTokens;
        this.$contactsPermissionGranted$delegate$inlined = state;
        this.$hasPassedIdv$inlined = state2;
        this.$instruments$delegate$inlined = state3;
        this.$searchText$inlined = state4;
        this.$state$delegate$inlined = mutableState;
        this.$paymentRouterData$delegate$inlined = mutableState2;
        this.$router$inlined = mutableState3;
        this.$trackedStablecoinRecipientViews$inlined = mutableState4;
    }

    private final Object emit$app$cash$local$presenters$brand$menu$LocalBrandLocationMenuPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$trackedStablecoinRecipientViews$inlined;
        MutableState mutableState2 = (MutableState) this.$router$inlined;
        CartBuilder cartBuilder = (CartBuilder) this.$scope$inlined;
        LocalBrandLocationMenuPresenter localBrandLocationMenuPresenter = (LocalBrandLocationMenuPresenter) this.$$this$LaunchedEffect;
        LocalBrandLocationMenuScreen localBrandLocationMenuScreen = localBrandLocationMenuPresenter.screen;
        BetterNavigator.ScreenNavigator screenNavigator = localBrandLocationMenuPresenter.navigator;
        LocalBrandLocationMenuViewEvent localBrandLocationMenuViewEvent = (LocalBrandLocationMenuViewEvent) obj;
        boolean z = localBrandLocationMenuViewEvent instanceof LocalBrandLocationMenuViewEvent.MenuSelectorClicked;
        State state = this.$contactsPermissionGranted$delegate$inlined;
        if (z) {
            screenNavigator.askQuestion(new MenuPickerQuestion(), new KClasses$$Lambda$2(state, 5));
        } else {
            boolean z2 = localBrandLocationMenuViewEvent instanceof LocalBrandLocationMenuViewEvent.MenuItemClicked;
            State state2 = this.$hasPassedIdv$inlined;
            if (z2) {
                LocationMenu locationMenu = (LocationMenu) state2.getValue();
                locationMenu.getClass();
                LocalBrandLocationMenuViewEvent.MenuItemClicked menuItemClicked = (LocalBrandLocationMenuViewEvent.MenuItemClicked) localBrandLocationMenuViewEvent;
                LocalBrandLocationMenuPresenter.m1212access$navigateToViewItemhqlE7tU(localBrandLocationMenuPresenter, locationMenu.m1243menuItemGvMOdU0(menuItemClicked.menuItemToken), menuItemClicked.menuCategoryToken, menuItemClicked.analyticsContext);
            } else if (localBrandLocationMenuViewEvent instanceof CartItemCounterViewEvent) {
                LocationMenu locationMenu2 = (LocationMenu) state2.getValue();
                locationMenu2.getClass();
                CartItemCounterViewEvent cartItemCounterViewEvent = (CartItemCounterViewEvent) localBrandLocationMenuViewEvent;
                String mo1291getMenuItemToken9MT7T1s = cartItemCounterViewEvent.mo1291getMenuItemToken9MT7T1s();
                mo1291getMenuItemToken9MT7T1s.getClass();
                MenuItem m1243menuItemGvMOdU0 = locationMenu2.m1243menuItemGvMOdU0(mo1291getMenuItemToken9MT7T1s);
                ArrayList arrayList = m1243menuItemGvMOdU0.variations;
                String mo1291getMenuItemToken9MT7T1s2 = cartItemCounterViewEvent.mo1291getMenuItemToken9MT7T1s();
                mo1291getMenuItemToken9MT7T1s2.getClass();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new MenuItemVariationToken(((MenuItemVariation) it.next()).token));
                }
                MenuItemVariationToken menuItemVariationToken = (MenuItemVariationToken) CollectionsKt.singleOrNull((List) arrayList2);
                CartEntry cartEntry = new CartEntry(mo1291getMenuItemToken9MT7T1s2, menuItemVariationToken != null ? menuItemVariationToken.value : null, (SortedSet) null, (SortedSet) null, (ArrayList) null, (String) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                if (cartItemCounterViewEvent instanceof CartItemCounterViewEvent.Increment) {
                    if (((Boolean) ((State) this.$instruments$delegate$inlined).getValue()).booleanValue() && ((Boolean) ((State) this.$searchText$inlined).getValue()).booleanValue() && arrayList.size() < 2 && m1243menuItemGvMOdU0.modifierListConfigs.isEmpty() && m1243menuItemGvMOdU0.comboSlots.isEmpty()) {
                        ((RealCartBuilder) cartBuilder).add(cartEntry, 1, (LocationMenu) state2.getValue(), ((CartItemCounterViewEvent.Increment) localBrandLocationMenuViewEvent).analyticsContext);
                        ((MutableState) this.$paymentRouterData$delegate$inlined).setValue(OrderLimitToasts.toastDataForOrderLimitCheck(localBrandLocationMenuPresenter.stringManager, cartBuilder, (Location.LocationDetail) state.getValue(), (LocationMenu) state2.getValue(), (FulfillmentConfiguration) this.$state$delegate$inlined.getValue(), null, null));
                    } else {
                        CartItemCounterViewEvent.Increment increment = (CartItemCounterViewEvent.Increment) localBrandLocationMenuViewEvent;
                        LocalBrandLocationMenuPresenter.m1212access$navigateToViewItemhqlE7tU(localBrandLocationMenuPresenter, m1243menuItemGvMOdU0, increment.menuCategoryToken, increment.analyticsContext);
                    }
                } else if (cartItemCounterViewEvent instanceof CartItemCounterViewEvent.Decrement) {
                    ((RealCartBuilder) cartBuilder).remove(cartEntry);
                } else {
                    if (!(cartItemCounterViewEvent instanceof CartItemCounterViewEvent.Trash)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((RealCartBuilder) cartBuilder).remove(cartEntry);
                }
            } else if (localBrandLocationMenuViewEvent instanceof LocalBrandLocationMenuViewEvent.BackClicked) {
                if (localBrandLocationMenuScreen.navigateBackToProfile) {
                    screenNavigator.goTo(new LocalBrandProfileScreen(localBrandLocationMenuScreen.brandSpot, (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, localBrandLocationMenuScreen.syncTokens, (String) null, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE));
                } else {
                    screenNavigator.goTo(Back.INSTANCE);
                }
            } else if (localBrandLocationMenuViewEvent instanceof LocalBottomModalViewEvent.CtaClicked) {
                screenNavigator.goTo(new LocalBrandLocationCartScreen(localBrandLocationMenuPresenter.brandSpot, localBrandLocationMenuScreen.attributionKey, localBrandLocationMenuScreen.isProfileSheetInline, null, null, (BrandSpotSyncTokens) this.this$0, 24));
            } else if (!(localBrandLocationMenuViewEvent instanceof LocalBottomModalViewEvent.BottomModalLinkClicked)) {
                if (localBrandLocationMenuViewEvent instanceof LocalSearchViewEvent$SearchClicked) {
                    mutableState2.setValue(Boolean.TRUE);
                } else if (localBrandLocationMenuViewEvent instanceof LocalSearchViewEvent$SearchInput) {
                    mutableState.setValue(((LocalSearchViewEvent$SearchInput) localBrandLocationMenuViewEvent).text);
                } else {
                    if (!(localBrandLocationMenuViewEvent instanceof LocalSearchViewEvent$SearchCleared)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState2.setValue(Boolean.FALSE);
                    mutableState.setValue(null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$bitcoin$presenters$applet$stackingtools$BitcoinStackingToolsPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.this$0;
        BitcoinStackingToolsPresenter bitcoinStackingToolsPresenter = (BitcoinStackingToolsPresenter) this.$scope$inlined;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        BitcoinStackingToolsViewEvent bitcoinStackingToolsViewEvent = (BitcoinStackingToolsViewEvent) obj;
        if (Intrinsics.areEqual(bitcoinStackingToolsViewEvent, BitcoinStackingToolsViewEvent.AutoInvestClicked.INSTANCE)) {
            JobKt.launch$default(coroutineScope, null, null, new AmountBlockerPresenter$models$1$2(bitcoinStackingToolsPresenter, (BitcoinInboundNavigator) this.$searchText$inlined, this.$contactsPermissionGranted$delegate$inlined, (Continuation) null, 5), 3);
        } else if (Intrinsics.areEqual(bitcoinStackingToolsViewEvent, BitcoinStackingToolsViewEvent.LearnMoreClicked.INSTANCE)) {
            Analytics analytics = bitcoinStackingToolsPresenter.analytics;
            BitcoinStackingToolsInfoScreen.Type type2 = BitcoinStackingToolsInfoScreen.Type.LEARN_MORE;
            ScaleKt.trackStackingToolStartEvent(analytics, type2, CryptoStackStart.EntryPoint.APPLET, null);
            screenNavigator.goTo(new BitcoinStackingToolsInfoScreen(type2));
        } else if (Intrinsics.areEqual(bitcoinStackingToolsViewEvent, BitcoinStackingToolsViewEvent.PaidInBitcoinClicked.INSTANCE)) {
            JobKt.launch$default(coroutineScope, null, null, new BenefitsHubPresenter$models$1$1(screenNavigator, (RealPaidInBitcoinNavigator) this.$paymentRouterData$delegate$inlined, bitcoinStackingToolsPresenter, this.$state$delegate$inlined, (Continuation) null), 3);
        } else if (Intrinsics.areEqual(bitcoinStackingToolsViewEvent, BitcoinStackingToolsViewEvent.ReceiveAsBitcoinClicked.INSTANCE)) {
            JobKt.launch$default(coroutineScope, null, null, new AmountBlockerPresenter$models$1$2(screenNavigator, bitcoinStackingToolsPresenter, this.$hasPassedIdv$inlined, (Continuation) null, 6), 3);
        } else {
            if (!Intrinsics.areEqual(bitcoinStackingToolsViewEvent, BitcoinStackingToolsViewEvent.RoundUpsClicked.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            JobKt.launch$default(coroutineScope, null, null, new AndroidSecureStore$read$2(bitcoinStackingToolsPresenter, screenNavigator, (RealRouter) this.$router$inlined, (State) this.$instruments$delegate$inlined, (State) this.$trackedStablecoinRecipientViews$inlined, null, 16), 3);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17, types: [kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r3v18 */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        Money money;
        RecurringDisabledInstrument recurringDisabledInstrument;
        CashInstrumentType cashInstrumentType;
        ReviewPaymentElementType reviewPaymentElementType;
        String str;
        String str2;
        String str3;
        Boolean bool;
        ?? r3;
        GenerationStrategy generationStrategy;
        GenerationStrategy generationStrategy2;
        LocalDate localDate;
        Recipient recipient;
        final RecipientViewModel recipient2;
        Object obj3;
        Object obj4;
        PdpSectionType pdpSectionType;
        Object obj5;
        Object obj6;
        ProductDetailsPage productDetailsPage;
        Object obj7;
        Object obj8;
        boolean z;
        int i = this.$r8$classId;
        Object obj9 = this.$trackedStablecoinRecipientViews$inlined;
        Object obj10 = this.$$this$LaunchedEffect;
        Object obj11 = this.$paymentRouterData$delegate$inlined;
        Object obj12 = this.$searchText$inlined;
        Object obj13 = this.$instruments$delegate$inlined;
        Object obj14 = this.$scope$inlined;
        Object obj15 = this.this$0;
        Object obj16 = this.$router$inlined;
        switch (i) {
            case 0:
                MutableStateFlow mutableStateFlow = (MutableStateFlow) obj12;
                CoroutineScope coroutineScope = (CoroutineScope) obj14;
                RealPaymentConfigurationRouter realPaymentConfigurationRouter = (RealPaymentConfigurationRouter) obj16;
                MutableState mutableState = (MutableState) obj11;
                final PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) obj15;
                KeyValue keyValue = paymentConfigurationPresenter.recipientSelectorTooltipSeenCount;
                AndroidClock androidClock = paymentConfigurationPresenter.clock;
                Origin origin = paymentConfigurationPresenter.analyticsOrigin;
                PaymentScreens.PaymentConfiguration paymentConfiguration = paymentConfigurationPresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator = paymentConfigurationPresenter.navigator;
                String str4 = paymentConfigurationPresenter.flowToken;
                UUID uuid = paymentConfigurationPresenter.paymentToken;
                Analytics analytics = paymentConfigurationPresenter.analytics;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj10;
                PaymentConfigurationViewEvent paymentConfigurationViewEvent = (PaymentConfigurationViewEvent) obj;
                boolean z2 = paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.DismissSheet;
                Back back = Back.INSTANCE;
                MutableState mutableState2 = this.$state$delegate$inlined;
                if (z2) {
                    Orientation orientation = paymentConfiguration.orientation;
                    String uuid2 = uuid.toString();
                    uuid2.getClass();
                    ScreenName screenName = AnalyticsHelperKt.toScreenName((PaymentConfigurationViewModel) mutableState2.getValue());
                    boolean z3 = ((PaymentRouterData) mutableState.getValue()).shareLink != null;
                    orientation.getClass();
                    int i2 = AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$1[orientation.ordinal()];
                    if (i2 == 1) {
                        analytics.track(new AssetSendDismissSheet(uuid2, screenName, str4), null);
                    } else {
                        if (i2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        analytics.track(new AssetRequestDismissSheet(screenName, Boolean.valueOf(z3), uuid2, str4), null);
                    }
                    screenNavigator.goTo(back);
                } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.Back) {
                    PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) mutableState2.getValue();
                    Orientation orientation2 = paymentConfiguration.orientation;
                    String uuid3 = uuid.toString();
                    uuid3.getClass();
                    ScreenName screenName2 = AnalyticsHelperKt.toScreenName(paymentConfigurationViewModel);
                    boolean showClose = paymentConfigurationViewModel.getShowClose();
                    boolean z4 = ((PaymentRouterData) mutableState.getValue()).shareLink != null;
                    String str5 = paymentConfigurationPresenter.flowToken;
                    orientation2.getClass();
                    int i3 = AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$1[orientation2.ordinal()];
                    if (i3 == 1) {
                        obj3 = null;
                        analytics.track(new AssetSendNavigateBack(screenName2, Boolean.valueOf(showClose), uuid3, str5), null);
                    } else {
                        if (i3 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        obj3 = null;
                        analytics.track(new AssetRequestNavigateBack(uuid3, screenName2, Boolean.valueOf(showClose), str5, Boolean.valueOf(z4)), null);
                    }
                    if (((PaymentConfigurationViewModel) mutableState2.getValue()) instanceof PaymentConfigurationViewModel.SelectRecipientMenu) {
                        StateFlowImpl stateFlowImpl = (StateFlowImpl) mutableStateFlow;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(obj3, "");
                        mutableState.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), null, null, null, false, false, false, null, "", false, null, false, false, null, null, null, null, null, null, false, 16776703));
                    }
                    JobKt.launch$default(coroutineScope2, null, null, new PaymentConfigurationPresenter$models$3$1(realPaymentConfigurationRouter, mutableState, null, 1), 3);
                } else {
                    int i4 = 23;
                    if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.SelectRecipientAndContinue) {
                        if (((PaymentConfigurationViewModel) mutableState2.getValue()) instanceof PaymentConfigurationViewModel.SelectRecipientMenu) {
                            JobKt.launch$default(coroutineScope2, null, null, new OverlayKt$Overlay$1$1$1$1$1(paymentConfigurationViewEvent, paymentConfigurationPresenter, null, 18), 3);
                            PaymentConfigurationViewEvent.SelectRecipientAndContinue selectRecipientAndContinue = (PaymentConfigurationViewEvent.SelectRecipientAndContinue) paymentConfigurationViewEvent;
                            RecipientViewModel recipientViewModel = selectRecipientAndContinue.recipient;
                            Recipient recipient3 = recipientViewModel.recipient;
                            Recipient.CryptoRecipientPayment cryptoRecipientPayment = recipient3.invoice;
                            if (cryptoRecipientPayment instanceof Recipient.CryptoRecipientPayment.Solana) {
                                JobKt.launch$default(coroutineScope2, null, null, new OverlayKt$Overlay$1$1$1$1$1(paymentConfigurationPresenter, ((Recipient.CryptoRecipientPayment.Solana) cryptoRecipientPayment).address, null, 19), 3);
                            } else if (!recipientViewModel.hasDuplicatePayment || recipient3.customerId == null) {
                                PaymentConfigurationPresenter.models$nextStep(coroutineScope, realPaymentConfigurationRouter, mutableState, PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), selectRecipientAndContinue.recipient, null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16777213));
                            } else {
                                screenNavigator.askQuestion(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.INSTANCE, new MoneyTabUIKt$$ExternalSyntheticLambda39(i4, paymentConfigurationPresenter, recipientViewModel, ((PaymentRouterData) mutableState.getValue()).amount));
                            }
                        }
                    } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.RecipientAvatarTapped) {
                        zzahg.goToProfileScreen(screenNavigator, paymentConfigurationPresenter.paymentToken, ((PaymentConfigurationViewEvent.RecipientAvatarTapped) paymentConfigurationViewEvent).recipient.recipient, CustomerProfileViewOpen.EntryPoint.P2P_PAYMENT_SHEET, new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.NONE, null), GetProfileDetailsContext.PAYMENT_FLOW);
                    } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.ScanQrCodeTapped) {
                        analytics.track(new RecipientSearchOpenQRScanner(str4), null);
                        screenNavigator.askQuestion(CashtagQrScanQuestion.INSTANCE, PaymentConfigurationPresenter$models$28$4.INSTANCE);
                    } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.RecipientSearchTextChanged) {
                        PaymentConfigurationViewEvent.RecipientSearchTextChanged recipientSearchTextChanged = (PaymentConfigurationViewEvent.RecipientSearchTextChanged) paymentConfigurationViewEvent;
                        ((StateFlowImpl) mutableStateFlow).setValue(recipientSearchTextChanged.text);
                        if (((PaymentConfigurationViewModel) mutableState2.getValue()) instanceof PaymentConfigurationViewModel.SelectRecipientMenu) {
                            mutableState.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), null, null, null, false, false, false, null, recipientSearchTextChanged.text, false, null, false, false, null, null, null, null, null, null, false, 16776703));
                        }
                    } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.NoteTextChanged) {
                        PaymentConfigurationViewEvent.NoteTextChanged noteTextChanged = (PaymentConfigurationViewEvent.NoteTextChanged) paymentConfigurationViewEvent;
                        if (noteTextChanged.text.length() <= 50) {
                            mutableState.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), null, noteTextChanged.text, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16777211));
                        }
                    } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.AmountInputChanged) {
                        PaymentConfigurationViewModel paymentConfigurationViewModel2 = (PaymentConfigurationViewModel) mutableState2.getValue();
                        PaymentConfigurationViewModel.InputAmount inputAmount = paymentConfigurationViewModel2 instanceof PaymentConfigurationViewModel.InputAmount ? (PaymentConfigurationViewModel.InputAmount) paymentConfigurationViewModel2 : null;
                        if (inputAmount != null) {
                            mutableState.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), null, null, Moneys.parseMoneyFromString$default(((PaymentConfigurationViewEvent.AmountInputChanged) paymentConfigurationViewEvent).rawAmount, inputAmount.currencyCode), false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16777199));
                        }
                    } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.NoteInputContinueTapped) {
                        PaymentConfigurationViewModel paymentConfigurationViewModel3 = (PaymentConfigurationViewModel) mutableState2.getValue();
                        PaymentConfigurationViewModel.InputNote inputNote = paymentConfigurationViewModel3 instanceof PaymentConfigurationViewModel.InputNote ? (PaymentConfigurationViewModel.InputNote) paymentConfigurationViewModel3 : null;
                        if (inputNote != null) {
                            boolean z5 = inputNote.enableNext;
                            Orientation orientation3 = paymentConfiguration.orientation;
                            String uuid4 = uuid.toString();
                            uuid4.getClass();
                            orientation3.getClass();
                            int i5 = AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$1[orientation3.ordinal()];
                            if (i5 == 1) {
                                analytics.track(new AssetSendTapContinueOnInputNoteScreen(Boolean.valueOf(z5), uuid4, str4), null);
                            } else {
                                if (i5 != 2) {
                                    obj2 = null;
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return obj2;
                                }
                                analytics.track(new AssetRequestTapContinueOnInputNoteScreen(Boolean.valueOf(z5), uuid4, str4), null);
                            }
                            if (z5) {
                                PaymentConfigurationPresenter.models$nextStep(coroutineScope, realPaymentConfigurationRouter, mutableState, PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), null, inputNote.note, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16777211));
                            }
                        }
                    } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.AmountInputContinueTapped) {
                        PaymentConfigurationViewModel paymentConfigurationViewModel4 = (PaymentConfigurationViewModel) mutableState2.getValue();
                        PaymentConfigurationViewModel.InputAmount inputAmount2 = paymentConfigurationViewModel4 instanceof PaymentConfigurationViewModel.InputAmount ? (PaymentConfigurationViewModel.InputAmount) paymentConfigurationViewModel4 : null;
                        if (inputAmount2 != null && inputAmount2.enableContinue) {
                            PaymentConfigurationPresenter.models$nextStep(coroutineScope, realPaymentConfigurationRouter, mutableState, (PaymentRouterData) mutableState.getValue());
                        }
                    } else {
                        boolean z6 = paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.GrantContactsPermissionTappedFromRow;
                        State state = this.$contactsPermissionGranted$delegate$inlined;
                        if (z6) {
                            PaymentConfigurationPresenter.access$handleContactPermissionTap(paymentConfigurationPresenter, ContactAccessRequestPermission.PermissionRequestSource.ROW_UPSELL, PaymentConfigurationPresenter.models$lambda$1(state));
                        } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.GrantContactsPermissionTappedFromCard) {
                            PaymentConfigurationPresenter.access$handleContactPermissionTap(paymentConfigurationPresenter, ContactAccessRequestPermission.PermissionRequestSource.CARD_UPSELL, PaymentConfigurationPresenter.models$lambda$1(state));
                        } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.PersonalizeTapped) {
                            PaymentConfigurationViewModel paymentConfigurationViewModel5 = (PaymentConfigurationViewModel) mutableState2.getValue();
                            PaymentConfigurationViewModel.ReviewPayment reviewPayment = paymentConfigurationViewModel5 instanceof PaymentConfigurationViewModel.ReviewPayment ? (PaymentConfigurationViewModel.ReviewPayment) paymentConfigurationViewModel5 : null;
                            if (reviewPayment != null) {
                                EntryPoint entryPoint = origin == Origin.PERSON_FIRST ? EntryPoint.PERSON_FIRST : EntryPoint.AMOUNT_FIRST;
                                boolean z7 = reviewPayment.recipient != null;
                                boolean z8 = !StringsKt.isBlank(reviewPayment.note);
                                String str6 = paymentConfigurationPresenter.flowToken;
                                String uuid5 = uuid.toString();
                                PersonalizationOrigin personalizationOrigin = PersonalizationOrigin.BOTTOM_SHEET_CORE_FLOW;
                                ExperienceType experienceType = ExperienceType.BOTTOM_SHEET;
                                Boolean valueOf = Boolean.valueOf(z7);
                                Boolean bool2 = Boolean.TRUE;
                                analytics.track(new AssetSendPersonalizationButtonTapped(uuid5, personalizationOrigin, entryPoint, valueOf, bool2, Boolean.valueOf(z8), bool2, str6, null, experienceType, 256), null);
                                JobKt.launch$default(coroutineScope2, null, null, new PaymentConfigurationPresenter$models$28$8$1(paymentConfigurationPresenter, reviewPayment, this.$hasPassedIdv$inlined, mutableState, (State) obj13, null), 3);
                            }
                        } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.SelectInstrumentRowTapped) {
                            PaymentConfigurationViewModel paymentConfigurationViewModel6 = (PaymentConfigurationViewModel) mutableState2.getValue();
                            RecipientSelectedStep recipientSelectedStep = paymentConfigurationViewModel6 instanceof RecipientSelectedStep ? (RecipientSelectedStep) paymentConfigurationViewModel6 : null;
                            if (recipientSelectedStep != null && (recipient2 = recipientSelectedStep.getRecipient()) != null) {
                                paymentConfigurationPresenter.instrumentSelectionStartTimestamp = androidClock.millis();
                                final InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = ((PaymentRouterData) mutableState.getValue()).instrumentRowModel;
                                final Money money2 = ((PaymentRouterData) mutableState.getValue()).amount;
                                final boolean z9 = ((PaymentRouterData) mutableState.getValue()).scheduleSelection != null;
                                analytics.track(new AssetSendSelectInstrument(null, null, null, null, null, null, ExperienceType.BOTTOM_SHEET, paymentConfigurationPresenter.flowToken), null);
                                final boolean z10 = recipient2.recipient.invoice instanceof Recipient.CryptoRecipientPayment.Stablecoin;
                                RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) paymentConfigurationPresenter.featureFlagManager;
                                final boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$ClientP2pPlatformPay.INSTANCE)).enabled();
                                final boolean enabled2 = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$StablecoinDebitCardSource.INSTANCE)).enabled();
                                screenNavigator.askQuestion(WhichInstrument.INSTANCE, new Function1() { // from class: com.squareup.cash.payments.presenters.PaymentConfigurationPresenter$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj17) {
                                        boolean z11;
                                        boolean z12;
                                        InstrumentSelection instrumentSelection;
                                        AskedQuestion askedQuestion = (AskedQuestion) obj17;
                                        askedQuestion.getClass();
                                        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel2 = InstrumentSelectionRowViewModel.this;
                                        String str7 = (instrumentSelectionRowViewModel2 == null || (instrumentSelection = instrumentSelectionRowViewModel2.instrumentSelection) == null) ? null : instrumentSelection.instrument_token;
                                        RecipientViewModel recipientViewModel2 = recipient2;
                                        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new RecipientPaymentInfo(recipientViewModel2.recipient.creditCardFee, recipientViewModel2.isBusiness));
                                        boolean z13 = z10;
                                        boolean z14 = z9;
                                        boolean z15 = true;
                                        if (z13 || z14) {
                                            z11 = true;
                                            z15 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        if (!z13 || enabled2) {
                                            z12 = z11;
                                        } else {
                                            z12 = z11;
                                            z11 = false;
                                        }
                                        boolean z16 = (!enabled || z13 || z14) ? false : z12;
                                        SelectPaymentInstrumentType selectPaymentInstrumentType = SelectPaymentInstrumentType.SELECT_FROM_ALL;
                                        PaymentConfigurationPresenter paymentConfigurationPresenter2 = paymentConfigurationPresenter;
                                        AndroidStringManager androidStringManager = paymentConfigurationPresenter2.stringManager;
                                        MoneyFormatter moneyFormatter = paymentConfigurationPresenter2.moneyFormatter;
                                        Money money3 = money2;
                                        String format2 = moneyFormatter.format(money3);
                                        format2.getClass();
                                        Resources resources = androidStringManager.resources;
                                        resources.getClass();
                                        String format3 = new MessageFormat(resources.getString(R.string.payment_configuration_pay_instrument_selection_title)).format(new Object[]{format2});
                                        format3.getClass();
                                        return new InstrumentSelectionScreen(money3, askedQuestion, str7, listOf, z15, z11, false, z16, format3, selectPaymentInstrumentType);
                                    }
                                });
                            }
                        } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.PayTapped) {
                            PaymentConfigurationViewModel paymentConfigurationViewModel7 = (PaymentConfigurationViewModel) mutableState2.getValue();
                            PaymentConfigurationViewModel.ReviewPayment reviewPayment2 = paymentConfigurationViewModel7 instanceof PaymentConfigurationViewModel.ReviewPayment ? (PaymentConfigurationViewModel.ReviewPayment) paymentConfigurationViewModel7 : null;
                            if (reviewPayment2 != null) {
                                PaymentScheduleSelection paymentScheduleSelection = ((PaymentRouterData) mutableState.getValue()).scheduleSelection;
                                if (!((PaymentRouterData) mutableState.getValue()).recurringP2pEligible) {
                                    paymentScheduleSelection = null;
                                }
                                Orientation orientation4 = paymentConfiguration.orientation;
                                String uuid6 = uuid.toString();
                                uuid6.getClass();
                                RecipientViewModel recipientViewModel2 = reviewPayment2.recipient;
                                Recipient.Analytics analytics2 = (recipientViewModel2 == null || (recipient = recipientViewModel2.recipient) == null) ? null : recipient.analytics;
                                StablecoinWithdrawalOption stablecoinOptionOrNull = zzahh.stablecoinOptionOrNull(recipientViewModel2);
                                PaymentAssetType paymentAssetTypeOrNull = stablecoinOptionOrNull != null ? zzahh.toPaymentAssetTypeOrNull(stablecoinOptionOrNull) : null;
                                String str7 = paymentConfigurationPresenter.flowToken;
                                Boolean bool3 = paymentScheduleSelection != null ? Boolean.TRUE : null;
                                PaymentScheduleFrequency paymentScheduleFrequency = paymentScheduleSelection != null ? paymentScheduleSelection.frequency : null;
                                Integer num = (paymentScheduleSelection == null || (localDate = paymentScheduleSelection.date) == null) ? null : new Integer((int) ChronoUnit.DAYS.between(DimensionKt.nowLocalDate(androidClock), localDate));
                                orientation4.getClass();
                                origin.getClass();
                                int i6 = AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$1[orientation4.ordinal()];
                                if (i6 == 1) {
                                    ExperienceType experienceType2 = ExperienceType.BOTTOM_SHEET;
                                    if (analytics2 != null) {
                                        str = uuid6;
                                        str2 = analytics2.entityToken;
                                    } else {
                                        str = uuid6;
                                        str2 = null;
                                    }
                                    Boolean bool4 = analytics2 != null ? analytics2.useCashCustomerSearchServiceEnabled : null;
                                    if (analytics2 != null) {
                                        str3 = str7;
                                        bool = analytics2.mlSearchEnabled;
                                    } else {
                                        str3 = str7;
                                        bool = null;
                                    }
                                    r3 = 0;
                                    analytics.track(new AssetSendSubmitTransaction(analytics2 != null ? analytics2.absoluteIndex : null, str2, str, null, origin, paymentAssetTypeOrNull, null, 1, analytics2 != null ? analytics2.remoteSuggestionType : null, null, null, analytics2 != null ? analytics2.section : null, analytics2 != null ? analytics2.sectionIndex : null, analytics2 != null ? analytics2.sectionTotal : null, null, (analytics2 == null || (generationStrategy = analytics2.generationStrategy) == null) ? null : RecipientAnalyticsKt.toAssetSuggestionStrategy(generationStrategy, analytics2.entityToken), bool4, bool, experienceType2, str3, bool3, paymentScheduleFrequency != null ? AnalyticsHelperKt.toCdfFrequency(paymentScheduleFrequency) : null, num, 2241330), null);
                                } else {
                                    if (i6 != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    AssetRequestSubmitTransaction assetRequestSubmitTransaction = new AssetRequestSubmitTransaction(analytics2 != null ? analytics2.absoluteIndex : null, uuid6, null, origin, null, 1, analytics2 != null ? analytics2.remoteSuggestionType : null, null, null, analytics2 != null ? analytics2.section : null, analytics2 != null ? analytics2.sectionIndex : null, analytics2 != null ? analytics2.sectionTotal : null, null, (analytics2 == null || (generationStrategy2 = analytics2.generationStrategy) == null) ? null : RecipientAnalyticsKt.toAssetSuggestionStrategy(generationStrategy2, analytics2.entityToken), analytics2 != null ? analytics2.useCashCustomerSearchServiceEnabled : null, analytics2 != null ? analytics2.mlSearchEnabled : null, ExperienceType.BOTTOM_SHEET, str7, 1120730);
                                    r3 = 0;
                                    analytics.track(assetRequestSubmitTransaction, null);
                                }
                                JobKt.launch$default(coroutineScope2, r3, r3, new PaymentConfigurationPresenter$models$28$10$3(paymentConfigurationPresenter, reviewPayment2, paymentConfigurationViewEvent, paymentScheduleSelection, mutableState, (State) obj13, null), 3);
                            }
                        } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.SearchTooltipDismissed) {
                            int intValue = ((Number) keyValue.blockingGet()).intValue();
                            if (intValue < 2) {
                                keyValue.blockingSet(new Integer(intValue + 1));
                            }
                            mutableState.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), null, null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16252927));
                        } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.OnSheetPeeked) {
                            if (((PaymentConfigurationViewModel) mutableState2.getValue()) instanceof PaymentConfigurationViewModel.SelectRecipientMenu) {
                                mutableState.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), null, null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16776191));
                            }
                        } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.RecipientViewed) {
                            JobKt.launch$default(coroutineScope2, null, null, new PoolsListPresenter$models$2$2(paymentConfigurationViewEvent, (Set) obj9, paymentConfigurationPresenter, mutableStateFlow, (Continuation) null, 5), 3);
                        } else if (Intrinsics.areEqual(paymentConfigurationViewEvent, PaymentConfigurationViewEvent.AddRecipientTapped.INSTANCE)) {
                            JobKt.launch$default(coroutineScope2, null, null, new PhonePlansHomePresenter$models$1$1(paymentConfigurationPresenter, (RealPaymentConfigurationRouter) obj16, mutableState2, mutableState, (Continuation) null), 3);
                        } else if (Intrinsics.areEqual(paymentConfigurationViewEvent, PaymentConfigurationViewEvent.ShareLinkTapped.INSTANCE)) {
                            JobKt.launch$default(coroutineScope2, null, null, new MoneybotChatPresenter$models$6$1(paymentConfigurationPresenter, mutableState2, mutableState, (Continuation) null), 3);
                        } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.OnTitleTapped) {
                            PaymentConfigurationViewModel paymentConfigurationViewModel8 = (PaymentConfigurationViewModel) mutableState2.getValue();
                            TitleTapped titleTapped = ((PaymentConfigurationViewEvent.OnTitleTapped) paymentConfigurationViewEvent).titleTapped;
                            if (paymentConfigurationViewModel8 instanceof PaymentConfigurationViewModel.ReviewPayment) {
                                Orientation orientation5 = paymentConfiguration.orientation;
                                String uuid7 = uuid.toString();
                                uuid7.getClass();
                                if (Intrinsics.areEqual(titleTapped, TitleTapped.AmountTapped.INSTANCE)) {
                                    reviewPaymentElementType = ReviewPaymentElementType.AMOUNT;
                                } else if (Intrinsics.areEqual(titleTapped, TitleTapped.NoteTapped.INSTANCE)) {
                                    reviewPaymentElementType = ReviewPaymentElementType.INPUT_NOTE;
                                } else {
                                    if (!(titleTapped instanceof TitleTapped.RecipientTapped)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    reviewPaymentElementType = ReviewPaymentElementType.RECIPIENT;
                                }
                                AnalyticsHelperKt.trackPaymentTapReviewPaymentScreenElement(analytics, orientation5, uuid7, reviewPaymentElementType, str4);
                            }
                            if (titleTapped instanceof TitleTapped.RecipientTapped) {
                                zzahg.goToProfileScreen(screenNavigator, paymentConfigurationPresenter.paymentToken, ((TitleTapped.RecipientTapped) titleTapped).recipient.recipient, CustomerProfileViewOpen.EntryPoint.P2P_PAYMENT_SHEET, new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.NONE, null), GetProfileDetailsContext.PAYMENT_FLOW);
                            }
                        } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.RetryLoadingTapped) {
                            JobKt.launch$default(coroutineScope2, null, null, new PaymentConfigurationPresenter$models$26$1(paymentConfigurationPresenter, mutableState, (CoroutineScope) obj14, (RealPaymentConfigurationRouter) obj16, (Continuation) null), 3);
                        } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.ScheduleTapped) {
                            Orientation orientation6 = paymentConfiguration.orientation;
                            String uuid8 = uuid.toString();
                            uuid8.getClass();
                            AnalyticsHelperKt.trackPaymentTapReviewPaymentScreenElement(analytics, orientation6, uuid8, ReviewPaymentElementType.SCHEDULE, str4);
                            screenNavigator.askQuestion(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.INSTANCE, new VerifyCheckDepositPresenter$models$3$2(23, paymentConfigurationPresenter, mutableState));
                        } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.RecurringDisabledTapped) {
                            String uuid9 = uuid.toString();
                            uuid9.getClass();
                            InstrumentSelectionRowViewModel instrumentSelectionRowViewModel2 = ((PaymentRouterData) mutableState.getValue()).instrumentRowModel;
                            CashInstrumentType cashInstrumentType2 = instrumentSelectionRowViewModel2 != null ? instrumentSelectionRowViewModel2.cashInstrumentType : null;
                            analytics.track(new AssetSendTapDisabledSchedulePayment(uuid9, str4, cashInstrumentType2 != null ? AnalyticsHelperKt.toCdfInstrumentType(cashInstrumentType2) : null), null);
                            PaymentRouterData paymentRouterData = (PaymentRouterData) mutableState.getValue();
                            InstrumentSelectionRowViewModel instrumentSelectionRowViewModel3 = ((PaymentRouterData) mutableState.getValue()).instrumentRowModel;
                            if (instrumentSelectionRowViewModel3 == null || (cashInstrumentType = instrumentSelectionRowViewModel3.cashInstrumentType) == null) {
                                recurringDisabledInstrument = null;
                            } else {
                                int i7 = RecurringDisabledInstrumentKt$WhenMappings.$EnumSwitchMapping$0[cashInstrumentType.ordinal()];
                                recurringDisabledInstrument = i7 != 1 ? i7 != 2 ? null : RecurringDisabledInstrument.GOOGLE_PAY : RecurringDisabledInstrument.CREDIT_CARD;
                            }
                            mutableState.setValue(PaymentRouterData.copy$default(paymentRouterData, null, null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, recurringDisabledInstrument, false, 12582911));
                        } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.RecurringDisabledToastDismissed) {
                            mutableState.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), null, null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 12582911));
                        } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.ReviewPaymentDisclaimerUrlTapped) {
                            paymentConfigurationPresenter.intentLauncher.launchUrlInExternalBrowser(((PaymentConfigurationViewEvent.ReviewPaymentDisclaimerUrlTapped) paymentConfigurationViewEvent).url);
                        } else if (paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.CloseOnwLinkMessage) {
                            screenNavigator.goTo(back);
                        } else {
                            if (!(paymentConfigurationViewEvent instanceof PaymentConfigurationViewEvent.StablecoinWithdrawalOptionSelected)) {
                                obj2 = null;
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return obj2;
                            }
                            if (((PaymentConfigurationViewModel) mutableState2.getValue()) instanceof PaymentConfigurationViewModel.SelectStablecoinWithdrawalOption) {
                                StablecoinWithdrawalOption stablecoinWithdrawalOption = ((PaymentConfigurationViewEvent.StablecoinWithdrawalOptionSelected) paymentConfigurationViewEvent).option;
                                PaymentAssetType paymentAssetTypeOrNull2 = zzahh.toPaymentAssetTypeOrNull(stablecoinWithdrawalOption);
                                StablecoinNetwork stablecoinNetwork = stablecoinWithdrawalOption.network;
                                if (paymentAssetTypeOrNull2 != null) {
                                    String str8 = stablecoinNetwork.chain;
                                    str8.getClass();
                                    money = null;
                                    analytics.track(new AssetSendSelectStablecoinNetwork(str8, paymentAssetTypeOrNull2, str4), null);
                                } else {
                                    money = null;
                                }
                                String uuid10 = uuid.toString();
                                uuid10.getClass();
                                AnalyticsHelperKt.trackPaymentAddStablecoinRecipient(analytics, uuid10, stablecoinNetwork.chain, str4, origin);
                                PaymentRouterData paymentRouterData2 = (PaymentRouterData) mutableState.getValue();
                                RecipientViewModel recipientViewModel3 = zzahh.toRecipientViewModel(stablecoinWithdrawalOption);
                                Money money3 = stablecoinWithdrawalOption.amount;
                                if (money3 != null) {
                                    Long l = money3.amount;
                                    if ((l != null ? l.longValue() : 0L) > 0) {
                                        money = money3;
                                    }
                                }
                                if (money == null) {
                                    money = ((PaymentRouterData) mutableState.getValue()).amount;
                                }
                                PaymentConfigurationPresenter.models$nextStep(coroutineScope, realPaymentConfigurationRouter, mutableState, PaymentRouterData.copy$default(paymentRouterData2, recipientViewModel3, null, money, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16777197));
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                return emit$app$cash$local$presenters$brand$menu$LocalBrandLocationMenuPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 2:
                return emit$com$squareup$cash$bitcoin$presenters$applet$stackingtools$BitcoinStackingToolsPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            default:
                MutableState mutableState3 = (MutableState) this.$hasPassedIdv$inlined;
                MutableState mutableState4 = (MutableState) obj12;
                MutableState mutableState5 = (MutableState) obj16;
                MutableState mutableState6 = (MutableState) obj11;
                List list = (List) obj15;
                PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter = (PaymentDeviceCustomizationPresenter) obj14;
                Analytics analytics3 = paymentDeviceCustomizationPresenter.analytics;
                PaymentDeviceCustomizationScreen paymentDeviceCustomizationScreen = paymentDeviceCustomizationPresenter.args;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj10;
                PaymentDeviceCustomizationViewEvent paymentDeviceCustomizationViewEvent = (PaymentDeviceCustomizationViewEvent) obj;
                if (Intrinsics.areEqual(paymentDeviceCustomizationViewEvent, PaymentDeviceCustomizationViewEvent.Close.INSTANCE)) {
                    paymentDeviceCustomizationPresenter.navigator.goTo(paymentDeviceCustomizationScreen.blockersData.exitScreen);
                    JobKt.launch$default(paymentDeviceCustomizationPresenter.activityScope, null, null, new PaymentDeviceCustomizationPresenter$models$2$1(paymentDeviceCustomizationPresenter, null, 0), 3);
                } else if (paymentDeviceCustomizationViewEvent instanceof PaymentDeviceCustomizationViewEvent.DeviceOptionSelected) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj8 = it.next();
                            if (Intrinsics.areEqual(((PaymentDeviceOption) obj8).payment_device_id, ((PaymentDeviceCustomizationViewEvent.DeviceOptionSelected) paymentDeviceCustomizationViewEvent).paymentDeviceId)) {
                            }
                        } else {
                            obj8 = null;
                        }
                    }
                    PaymentDeviceOption paymentDeviceOption = (PaymentDeviceOption) obj8;
                    boolean z11 = (paymentDeviceOption != null ? paymentDeviceOption.product_details_page : null) != null;
                    MutableState mutableState7 = this.$state$delegate$inlined;
                    if (!((Boolean) mutableState7.getValue()).booleanValue()) {
                        String str9 = ((PaymentDeviceCustomizationViewEvent.DeviceOptionSelected) paymentDeviceCustomizationViewEvent).paymentDeviceId;
                        PaymentDeviceCustomizationBlockerConfig paymentDeviceCustomizationBlockerConfig = paymentDeviceCustomizationScreen.blocker.blocker_config;
                        if (Intrinsics.areEqual(str9, paymentDeviceCustomizationBlockerConfig != null ? paymentDeviceCustomizationBlockerConfig.pre_selected_payment_device_id : null)) {
                            z = true;
                            mutableState7.setValue(Boolean.TRUE);
                            if (z11 && !z) {
                                paymentDeviceOption.getClass();
                                String str10 = paymentDeviceOption.payment_device_name;
                                analytics3.track(new MintPdpDeviceOptionSelected(str10 != null ? str10 : "", ((PaymentDeviceCustomizationViewEvent.DeviceOptionSelected) paymentDeviceCustomizationViewEvent).paymentDeviceId, paymentDeviceCustomizationScreen.blockersData.flowToken), null);
                            }
                            mutableState6.setValue(!z11 ? ((PaymentDeviceCustomizationViewEvent.DeviceOptionSelected) paymentDeviceCustomizationViewEvent).paymentDeviceId : null);
                            mutableState4.setValue(EmptySet.INSTANCE);
                        }
                    }
                    z = false;
                    mutableState7.setValue(Boolean.TRUE);
                    if (z11) {
                        paymentDeviceOption.getClass();
                        String str102 = paymentDeviceOption.payment_device_name;
                        analytics3.track(new MintPdpDeviceOptionSelected(str102 != null ? str102 : "", ((PaymentDeviceCustomizationViewEvent.DeviceOptionSelected) paymentDeviceCustomizationViewEvent).paymentDeviceId, paymentDeviceCustomizationScreen.blockersData.flowToken), null);
                    }
                    mutableState6.setValue(!z11 ? ((PaymentDeviceCustomizationViewEvent.DeviceOptionSelected) paymentDeviceCustomizationViewEvent).paymentDeviceId : null);
                    mutableState4.setValue(EmptySet.INSTANCE);
                } else if (paymentDeviceCustomizationViewEvent instanceof PaymentDeviceCustomizationViewEvent.ProductDetailsPageShown) {
                    mutableState5.setValue(Long.valueOf(System.currentTimeMillis()));
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj7 = it2.next();
                            if (Intrinsics.areEqual(((PaymentDeviceOption) obj7).payment_device_id, ((PaymentDeviceCustomizationViewEvent.ProductDetailsPageShown) paymentDeviceCustomizationViewEvent).paymentDeviceId)) {
                            }
                        } else {
                            obj7 = null;
                        }
                    }
                    PaymentDeviceOption paymentDeviceOption2 = (PaymentDeviceOption) obj7;
                    String str11 = paymentDeviceOption2 != null ? paymentDeviceOption2.payment_device_name : null;
                    analytics3.track(new MintPdpPageViewed(str11 != null ? str11 : "", ((PaymentDeviceCustomizationViewEvent.ProductDetailsPageShown) paymentDeviceCustomizationViewEvent).paymentDeviceId, paymentDeviceCustomizationScreen.blockersData.flowToken), null);
                } else if (paymentDeviceCustomizationViewEvent instanceof PaymentDeviceCustomizationViewEvent.TapProductDetailsPageButton) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj6 = it3.next();
                            if (Intrinsics.areEqual(((PaymentDeviceOption) obj6).payment_device_id, ((PaymentDeviceCustomizationViewEvent.TapProductDetailsPageButton) paymentDeviceCustomizationViewEvent).paymentDeviceId)) {
                            }
                        } else {
                            obj6 = null;
                        }
                    }
                    PaymentDeviceOption paymentDeviceOption3 = (PaymentDeviceOption) obj6;
                    String str12 = paymentDeviceOption3 != null ? paymentDeviceOption3.payment_device_name : null;
                    if (str12 == null) {
                        str12 = "";
                    }
                    PaymentDeviceCustomizationViewEvent.TapProductDetailsPageButton tapProductDetailsPageButton = (PaymentDeviceCustomizationViewEvent.TapProductDetailsPageButton) paymentDeviceCustomizationViewEvent;
                    String str13 = tapProductDetailsPageButton.paymentDeviceId;
                    String str14 = (paymentDeviceOption3 == null || (productDetailsPage = paymentDeviceOption3.product_details_page) == null) ? null : productDetailsPage.cta_label;
                    analytics3.track(new MintPdpPageCtaTapped(str12, str13, str14 != null ? str14 : "", paymentDeviceCustomizationScreen.blockersData.flowToken), null);
                    CtaAction ctaAction = tapProductDetailsPageButton.ctaAction;
                    if (Intrinsics.areEqual(ctaAction, CtaAction.Submit.INSTANCE)) {
                        JobKt.launch$default(coroutineScope3, null, null, new PaymentDeviceCustomizationPresenter$models$2$2(paymentDeviceCustomizationPresenter, paymentDeviceCustomizationViewEvent, null, 0), 3);
                    } else if (Intrinsics.areEqual(ctaAction, CtaAction.Notify.INSTANCE)) {
                        if (!((Set) mutableState3.getValue()).contains(str13)) {
                            mutableState3.setValue(SetsKt___SetsKt.plus((Set) mutableState3.getValue(), str13));
                            JobKt.launch$default(coroutineScope3, null, null, new PaymentDeviceCustomizationPresenter$models$2$2(paymentDeviceCustomizationPresenter, paymentDeviceCustomizationViewEvent, null, 1), 3);
                        }
                    } else if (!Intrinsics.areEqual(ctaAction, CtaAction.Disabled.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                } else if (Intrinsics.areEqual(paymentDeviceCustomizationViewEvent, PaymentDeviceCustomizationViewEvent.CloseProductDetailsPage.INSTANCE)) {
                    if (((String) mutableState6.getValue()) != null) {
                        Iterator it4 = list.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj5 = it4.next();
                                if (Intrinsics.areEqual(((PaymentDeviceOption) obj5).payment_device_id, (String) mutableState6.getValue())) {
                                }
                            } else {
                                obj5 = null;
                            }
                        }
                        PaymentDeviceOption paymentDeviceOption4 = (PaymentDeviceOption) obj5;
                        Long l2 = ((Number) mutableState5.getValue()).longValue() > 0 ? new Long(System.currentTimeMillis() - ((Number) mutableState5.getValue()).longValue()) : null;
                        String str15 = paymentDeviceOption4 != null ? paymentDeviceOption4.payment_device_name : null;
                        if (str15 == null) {
                            str15 = "";
                        }
                        String str16 = (String) mutableState6.getValue();
                        analytics3.track(new MintPdpPageDismissed(str15, str16 != null ? str16 : "", paymentDeviceCustomizationScreen.blockersData.flowToken, l2), null);
                        mutableState6.setValue(null);
                        mutableState5.setValue(0L);
                    }
                } else if (paymentDeviceCustomizationViewEvent instanceof PaymentDeviceCustomizationViewEvent.TapProductDetailsPageLink) {
                    paymentDeviceCustomizationPresenter.router.route(new RoutingParams(null, null, null, null, null, null, 511), ((PaymentDeviceCustomizationViewEvent.TapProductDetailsPageLink) paymentDeviceCustomizationViewEvent).url);
                } else if (paymentDeviceCustomizationViewEvent instanceof PaymentDeviceCustomizationViewEvent.SectionViewed) {
                    Set set = (Set) mutableState4.getValue();
                    PaymentDeviceCustomizationViewEvent.SectionViewed sectionViewed = (PaymentDeviceCustomizationViewEvent.SectionViewed) paymentDeviceCustomizationViewEvent;
                    String str17 = sectionViewed.paymentDeviceId;
                    String str18 = sectionViewed.sectionType;
                    if (!set.contains(str18)) {
                        mutableState4.setValue(SetsKt___SetsKt.plus((Set) mutableState4.getValue(), str18));
                        Iterator it5 = list.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                obj4 = it5.next();
                                if (Intrinsics.areEqual(((PaymentDeviceOption) obj4).payment_device_id, str17)) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        PaymentDeviceOption paymentDeviceOption5 = (PaymentDeviceOption) obj4;
                        String str19 = paymentDeviceOption5 != null ? paymentDeviceOption5.payment_device_name : null;
                        String str20 = str19 != null ? str19 : "";
                        switch (str18.hashCode()) {
                            case -2057088001:
                                if (str18.equals("LABELS")) {
                                    pdpSectionType = PdpSectionType.LABELS;
                                    break;
                                }
                                pdpSectionType = null;
                                break;
                            case -1265738799:
                                if (str18.equals("TILE_CAROUSEL")) {
                                    pdpSectionType = PdpSectionType.TILE_CAROUSEL;
                                    break;
                                }
                                pdpSectionType = null;
                                break;
                            case 2213882:
                                if (str18.equals("HERO")) {
                                    pdpSectionType = PdpSectionType.HERO;
                                    break;
                                }
                                pdpSectionType = null;
                                break;
                            case 930698733:
                                if (str18.equals("DISCLOSURE")) {
                                    pdpSectionType = PdpSectionType.DISCLOSURE;
                                    break;
                                }
                                pdpSectionType = null;
                                break;
                            case 1172971213:
                                if (str18.equals("COLLAPSIBLE_DETAILS")) {
                                    pdpSectionType = PdpSectionType.COLLAPSIBLE_DETAILS;
                                    break;
                                }
                                pdpSectionType = null;
                                break;
                            case 1425337164:
                                if (str18.equals("ICON_GRID")) {
                                    pdpSectionType = PdpSectionType.ICON_GRID;
                                    break;
                                }
                                pdpSectionType = null;
                                break;
                            case 1899168740:
                                if (str18.equals("IMAGE_CAROUSEL")) {
                                    pdpSectionType = PdpSectionType.IMAGE_CAROUSEL;
                                    break;
                                }
                                pdpSectionType = null;
                                break;
                            case 2127025805:
                                if (str18.equals("HEADER")) {
                                    pdpSectionType = PdpSectionType.HEADER;
                                    break;
                                }
                                pdpSectionType = null;
                                break;
                            default:
                                pdpSectionType = null;
                                break;
                        }
                        analytics3.track(new MintPdpSectionViewed(str20, str17, pdpSectionType, paymentDeviceCustomizationScreen.blockersData.flowToken), null);
                    }
                } else {
                    if (!(paymentDeviceCustomizationViewEvent instanceof PaymentDeviceCustomizationViewEvent.PersonalizeCard)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope3, null, null, new RealIdvPresenter$models$1$1(paymentDeviceCustomizationViewEvent, paymentDeviceCustomizationPresenter, (List) obj15, (PaymentCardGlobalConfig) obj13, (MutableState) obj9, this.$contactsPermissionGranted$delegate$inlined, (Continuation) null), 3);
                }
                return Unit.INSTANCE;
        }
    }

    public PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, BitcoinStackingToolsPresenter bitcoinStackingToolsPresenter, BetterNavigator.ScreenNavigator screenNavigator, BitcoinInboundNavigator bitcoinInboundNavigator, State state, RealPaidInBitcoinNavigator realPaidInBitcoinNavigator, MutableState mutableState, State state2, RealRouter realRouter, State state3, State state4) {
        this.$scope$inlined = bitcoinStackingToolsPresenter;
        this.this$0 = screenNavigator;
        this.$searchText$inlined = bitcoinInboundNavigator;
        this.$contactsPermissionGranted$delegate$inlined = state;
        this.$paymentRouterData$delegate$inlined = realPaidInBitcoinNavigator;
        this.$state$delegate$inlined = mutableState;
        this.$hasPassedIdv$inlined = state2;
        this.$router$inlined = realRouter;
        this.$instruments$delegate$inlined = state3;
        this.$trackedStablecoinRecipientViews$inlined = state4;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    public PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter, List list, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, PaymentCardGlobalConfig paymentCardGlobalConfig, MutableState mutableState6, State state) {
        this.$scope$inlined = paymentDeviceCustomizationPresenter;
        this.this$0 = list;
        this.$state$delegate$inlined = mutableState;
        this.$paymentRouterData$delegate$inlined = mutableState2;
        this.$searchText$inlined = mutableState3;
        this.$router$inlined = mutableState4;
        this.$hasPassedIdv$inlined = mutableState5;
        this.$instruments$delegate$inlined = paymentCardGlobalConfig;
        this.$trackedStablecoinRecipientViews$inlined = mutableState6;
        this.$contactsPermissionGranted$delegate$inlined = state;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    public PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, PaymentConfigurationPresenter paymentConfigurationPresenter, MutableStateFlow mutableStateFlow, MutableState mutableState, MutableState mutableState2, RealPaymentConfigurationRouter realPaymentConfigurationRouter, CoroutineScope coroutineScope2, State state, State state2, State state3, Set set) {
        this.this$0 = paymentConfigurationPresenter;
        this.$searchText$inlined = mutableStateFlow;
        this.$state$delegate$inlined = mutableState;
        this.$paymentRouterData$delegate$inlined = mutableState2;
        this.$router$inlined = realPaymentConfigurationRouter;
        this.$scope$inlined = coroutineScope2;
        this.$contactsPermissionGranted$delegate$inlined = state;
        this.$hasPassedIdv$inlined = state2;
        this.$instruments$delegate$inlined = state3;
        this.$trackedStablecoinRecipientViews$inlined = set;
        this.$$this$LaunchedEffect = coroutineScope;
    }
}
