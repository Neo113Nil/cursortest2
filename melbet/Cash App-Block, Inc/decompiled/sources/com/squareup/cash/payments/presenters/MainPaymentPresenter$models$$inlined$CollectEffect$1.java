package com.squareup.cash.payments.presenters;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotMapKeySet;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.StateMapMutableKeysIterator;
import androidx.core.net.UriKt;
import androidx.glance.session.SessionWorkerKt$runSession$4$1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.presenters.brand.menu.FreeTextInput;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter$models$5$3;
import app.cash.local.presenters.brand.menu.OrderLimitToasts;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuItemModifierListToken;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.screens.app.LocalMenuItemDetailsScreen;
import app.cash.local.screens.app.SchedulingDayTimeQuestion;
import app.cash.local.viewmodels.CartItemCounterViewEvent;
import app.cash.local.viewmodels.LocalBottomModalViewEvent;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewEvent;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.ViewSizeResolver$size$3$1;
import com.fillr.core.validator.CreditcardTypeValidator;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahg;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSender$submitBugReport$2;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.CryptoTradeSide;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.cdf.asset.PersonalizationOrigin;
import com.squareup.cash.cdf.cash.CashRequestCancel;
import com.squareup.cash.cdf.cash.CashSendCancel;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionTermsAccepted;
import com.squareup.cash.cdf.cashtagprovisioning.DeviceType;
import com.squareup.cash.cdf.crypto.CryptoTradeChangeOrderType;
import com.squareup.cash.cdf.crypto.CryptoTradeClose;
import com.squareup.cash.cdf.crypto.CryptoTradeSelectCustomAmount;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.localclient.LocalClientCartMenuItemAddFailure;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RestrictedBalance;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.api.FidesmoShutdownReason;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningFlowContext;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.fidesmo.screens.FidesmoProvisioningScreen;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewEvent;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.screens.InstrumentSelectionLoadingScreen;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentResult;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.payments.presenters.MainPaymentPresenter;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PersonalizePaymentResult;
import com.squareup.cash.payments.viewmodels.MainPaymentViewEvent;
import com.squareup.cash.payments.viewmodels.SelectedRecipient;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.utils.RecipientSelectionResult;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.transfers.screens.InstrumentLinkingOption;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsScreen;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.withpersona.sdk2.camera.camera2.Camera2Controller;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Okio;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class MainPaymentPresenter$models$$inlined$CollectEffect$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ State $availableP2pTargetRegions$delegate$inlined;
    public final /* synthetic */ State $balanceSnapshot$delegate$inlined;
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ State $hasPassedIdv$inlined;
    public final /* synthetic */ State $instrumentLinkingConfig$inlined;
    public final /* synthetic */ MutableState $instrumentSelection$delegate$inlined;
    public final /* synthetic */ State $instruments$delegate$inlined;
    public final /* synthetic */ MutableState $isInstrumentSelectionOpen$delegate$inlined;
    public final /* synthetic */ MutableState $note$delegate$inlined;
    public final /* synthetic */ State $profile$delegate$inlined;
    public final /* synthetic */ State $sections$delegate$inlined;
    public final /* synthetic */ MutableState $selectedRecipients$delegate$inlined;
    public final /* synthetic */ MutableState $shouldClearFocus$delegate$inlined;
    public final /* synthetic */ MutableState $shouldRequestNoteFocus$delegate$inlined;
    public final /* synthetic */ MutableState $touchEvents$delegate$inlined;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ MainPaymentPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainPaymentPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, MainPaymentPresenter mainPaymentPresenter, State state, MutableState mutableState, State state2, State state3, State state4, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, State state5, State state6, MutableState mutableState5, State state7, MutableState mutableState6, MutableState mutableState7) {
        super(2, continuation);
        this.$flow = flow;
        this.this$0 = mainPaymentPresenter;
        this.$instrumentLinkingConfig$inlined = state;
        this.$selectedRecipients$delegate$inlined = mutableState;
        this.$sections$delegate$inlined = state2;
        this.$profile$delegate$inlined = state3;
        this.$availableP2pTargetRegions$delegate$inlined = state4;
        this.$shouldRequestNoteFocus$delegate$inlined = mutableState2;
        this.$note$delegate$inlined = mutableState3;
        this.$touchEvents$delegate$inlined = mutableState4;
        this.$instruments$delegate$inlined = state5;
        this.$hasPassedIdv$inlined = state6;
        this.$instrumentSelection$delegate$inlined = mutableState5;
        this.$balanceSnapshot$delegate$inlined = state7;
        this.$isInstrumentSelectionOpen$delegate$inlined = mutableState6;
        this.$shouldClearFocus$delegate$inlined = mutableState7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainPaymentPresenter$models$$inlined$CollectEffect$1 mainPaymentPresenter$models$$inlined$CollectEffect$1 = new MainPaymentPresenter$models$$inlined$CollectEffect$1(this.$flow, continuation, this.this$0, this.$instrumentLinkingConfig$inlined, this.$selectedRecipients$delegate$inlined, this.$sections$delegate$inlined, this.$profile$delegate$inlined, this.$availableP2pTargetRegions$delegate$inlined, this.$shouldRequestNoteFocus$delegate$inlined, this.$note$delegate$inlined, this.$touchEvents$delegate$inlined, this.$instruments$delegate$inlined, this.$hasPassedIdv$inlined, this.$instrumentSelection$delegate$inlined, this.$balanceSnapshot$delegate$inlined, this.$isInstrumentSelectionOpen$delegate$inlined, this.$shouldClearFocus$delegate$inlined);
        mainPaymentPresenter$models$$inlined$CollectEffect$1.L$0 = obj;
        return mainPaymentPresenter$models$$inlined$CollectEffect$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MainPaymentPresenter$models$$inlined$CollectEffect$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, this.this$0, this.$instrumentLinkingConfig$inlined, this.$selectedRecipients$delegate$inlined, this.$sections$delegate$inlined, this.$profile$delegate$inlined, this.$availableP2pTargetRegions$delegate$inlined, this.$shouldRequestNoteFocus$delegate$inlined, this.$note$delegate$inlined, this.$touchEvents$delegate$inlined, this.$instruments$delegate$inlined, this.$hasPassedIdv$inlined, this.$instrumentSelection$delegate$inlined, this.$balanceSnapshot$delegate$inlined, this.$isInstrumentSelectionOpen$delegate$inlined, this.$shouldClearFocus$delegate$inlined);
            this.L$0 = null;
            this.label = 1;
            if (this.$flow.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.payments.presenters.MainPaymentPresenter$models$$inlined$CollectEffect$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ Object $$this$LaunchedEffect;
        public final /* synthetic */ Object $availableP2pTargetRegions$delegate$inlined;
        public final /* synthetic */ Object $balanceSnapshot$delegate$inlined;
        public final /* synthetic */ Object $hasPassedIdv$inlined;
        public final /* synthetic */ State $instrumentLinkingConfig$inlined;
        public final /* synthetic */ Object $instrumentSelection$delegate$inlined;
        public final /* synthetic */ Object $instruments$delegate$inlined;
        public final /* synthetic */ Object $isInstrumentSelectionOpen$delegate$inlined;
        public final /* synthetic */ Object $note$delegate$inlined;
        public final /* synthetic */ State $profile$delegate$inlined;
        public final /* synthetic */ int $r8$classId = 1;
        public final /* synthetic */ State $sections$delegate$inlined;
        public final /* synthetic */ MutableState $selectedRecipients$delegate$inlined;
        public final /* synthetic */ MutableState $shouldClearFocus$delegate$inlined;
        public final /* synthetic */ MutableState $shouldRequestNoteFocus$delegate$inlined;
        public final /* synthetic */ Object $touchEvents$delegate$inlined;
        public final /* synthetic */ Object this$0;

        public AnonymousClass1(CoroutineScope coroutineScope, LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter, List list, MenuItem menuItem, SnapshotStateMap snapshotStateMap, CartEntryWithQuantity cartEntryWithQuantity, SnapshotStateMap snapshotStateMap2, SnapshotStateMap snapshotStateMap3, CartBuilder cartBuilder, LocationMenu locationMenu, LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData menuItemAddedContextComboData, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, State state, MutableState mutableState, State state2, State state3, MutableState mutableState2) {
            this.$$this$LaunchedEffect = localMenuItemDetailsPresenter;
            this.this$0 = list;
            this.$availableP2pTargetRegions$delegate$inlined = menuItem;
            this.$instruments$delegate$inlined = snapshotStateMap;
            this.$hasPassedIdv$inlined = cartEntryWithQuantity;
            this.$balanceSnapshot$delegate$inlined = snapshotStateMap2;
            this.$note$delegate$inlined = snapshotStateMap3;
            this.$touchEvents$delegate$inlined = cartBuilder;
            this.$instrumentSelection$delegate$inlined = locationMenu;
            this.$isInstrumentSelectionOpen$delegate$inlined = menuItemAddedContextComboData;
            this.$shouldClearFocus$delegate$inlined = parcelableSnapshotMutableIntState;
            this.$instrumentLinkingConfig$inlined = state;
            this.$selectedRecipients$delegate$inlined = mutableState;
            this.$sections$delegate$inlined = state2;
            this.$profile$delegate$inlined = state3;
            this.$shouldRequestNoteFocus$delegate$inlined = mutableState2;
        }

        private final Object emit$com$squareup$cash$bitcoin$presenters$transfer$BitcoinTransferPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            Money zero;
            MutableState mutableState = (MutableState) this.$balanceSnapshot$delegate$inlined;
            MutableState mutableState2 = (MutableState) this.$hasPassedIdv$inlined;
            MutableState mutableState3 = (MutableState) this.$availableP2pTargetRegions$delegate$inlined;
            MutableState mutableState4 = (MutableState) this.$isInstrumentSelectionOpen$delegate$inlined;
            MutableState mutableState5 = (MutableState) this.$note$delegate$inlined;
            BitcoinTransferPresenter bitcoinTransferPresenter = (BitcoinTransferPresenter) this.this$0;
            String str = bitcoinTransferPresenter.targetAsset;
            String str2 = bitcoinTransferPresenter.sourceAsset;
            Analytics analytics = bitcoinTransferPresenter.analytics;
            BetterNavigator.ScreenNavigator screenNavigator = bitcoinTransferPresenter.navigator;
            BitcoinTransferScreen bitcoinTransferScreen = bitcoinTransferPresenter.args;
            BitcoinTransferViewEvent bitcoinTransferViewEvent = (BitcoinTransferViewEvent) obj;
            boolean z = bitcoinTransferViewEvent instanceof BitcoinTransferViewEvent.AmountEntered;
            MutableState mutableState6 = this.$selectedRecipients$delegate$inlined;
            if (z) {
                mutableState6.setValue((BitcoinTransferViewEvent.AmountEntered) bitcoinTransferViewEvent);
            } else {
                boolean areEqual = Intrinsics.areEqual(bitcoinTransferViewEvent, BitcoinTransferViewEvent.ChangeOrderTypeClicked.INSTANCE);
                State state = this.$instrumentLinkingConfig$inlined;
                if (areEqual) {
                    if (((Boolean) this.$shouldRequestNoteFocus$delegate$inlined.getValue()).booleanValue()) {
                        BitcoinTransferScreen.SavedState savedState = (BitcoinTransferScreen.SavedState) state.getValue();
                        analytics.track(new CryptoTradeChangeOrderType(bitcoinTransferScreen.isBuy ? CryptoTradeSide.BUY : CryptoTradeSide.SELL, str, str2), null);
                        OrderSide orderSide = bitcoinTransferScreen.isBuy ? OrderSide.BUY : OrderSide.SELL;
                        BitcoinTransferScreen copy$default = BitcoinTransferScreen.copy$default(bitcoinTransferScreen, null, savedState, null, IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO);
                        Screen screen = bitcoinTransferScreen.originScreen;
                        if (screen == null) {
                            screen = bitcoinTransferScreen.exitScreen;
                        }
                        screenNavigator.goTo(new InvestingScreens.OrderTypeSelectionScreen(orderSide, InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin.INSTANCE, ColorModel.Bitcoin.INSTANCE, copy$default, screen));
                    }
                } else if (Intrinsics.areEqual(bitcoinTransferViewEvent, BitcoinTransferViewEvent.DialogDismissed.INSTANCE)) {
                    mutableState5.setValue(Boolean.TRUE);
                    ((MutableState) this.$touchEvents$delegate$inlined).setValue(null);
                } else if (Intrinsics.areEqual(bitcoinTransferViewEvent, BitcoinTransferViewEvent.Expanded.INSTANCE)) {
                    mutableState5.setValue(Boolean.TRUE);
                } else if (Intrinsics.areEqual(bitcoinTransferViewEvent, BitcoinTransferViewEvent.Peeking.INSTANCE)) {
                    ((MutableState) this.$instrumentSelection$delegate$inlined).setValue(Boolean.TRUE);
                    mutableState5.setValue(Boolean.FALSE);
                } else if (bitcoinTransferViewEvent instanceof BitcoinTransferViewEvent.ItemSelected) {
                    mutableState4.setValue(((BitcoinTransferViewEvent.ItemSelected) bitcoinTransferViewEvent).selection);
                    if (((AmountSelection) mutableState4.getValue()) instanceof AmountSelection.TradeCustomize) {
                        analytics.track(new CryptoTradeSelectCustomAmount(bitcoinTransferScreen.isBuy ? CryptoTradeSide.BUY : CryptoTradeSide.SELL, str, str2), null);
                    }
                } else if (Intrinsics.areEqual(bitcoinTransferViewEvent, BitcoinTransferViewEvent.CloseButtonClicked.INSTANCE) || Intrinsics.areEqual(bitcoinTransferViewEvent, BitcoinTransferViewEvent.OnBackPressed.INSTANCE)) {
                    if (Intrinsics.areEqual(bitcoinTransferScreen.orderType, BitcoinTransferScreen.OrderType.Standard.INSTANCE)) {
                        analytics.track(new CryptoTradeClose(), null);
                    }
                    screenNavigator.goTo(Back.INSTANCE);
                } else {
                    boolean z2 = bitcoinTransferViewEvent instanceof BitcoinTransferViewEvent.Submit;
                    State state2 = this.$profile$delegate$inlined;
                    if (z2) {
                        boolean z3 = bitcoinTransferScreen.isBuy;
                        MutableState mutableState7 = this.$shouldClearFocus$delegate$inlined;
                        State state3 = this.$sections$delegate$inlined;
                        if (z3 && bitcoinTransferPresenter.buyInstrumentSelectionEnabled) {
                            Money money = (Money) state3.getValue();
                            money.getClass();
                            if (Moneys.isZero(money) && ((List) mutableState7.getValue()).isEmpty()) {
                                BitcoinTransferScreen.SavedState savedState2 = (BitcoinTransferScreen.SavedState) state.getValue();
                                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                AndroidStringManager androidStringManager = bitcoinTransferPresenter.stringManager;
                                String str3 = androidStringManager.get(R.string.bitcoin_buy_instrument_linking_options_debit_option_title);
                                String str4 = androidStringManager.get(R.string.bitcoin_buy_instrument_linking_options_debit_option_subtitle);
                                InstrumentLinkingOption.Link link = new InstrumentLinkingOption.Link(CashInstrumentType.DEBIT_CARD);
                                zzd zzdVar = Icons.Companion;
                                createListBuilder.add(new InstrumentLinkingOptionsScreen.Option(str3, str4, link, new InstrumentLinkingOptionsScreen.Option.Icon.LocalIcon("ueUsQA")));
                                if (bitcoinTransferPresenter.buyInstrumentSelectionBankAccountEnabled) {
                                    createListBuilder.add(new InstrumentLinkingOptionsScreen.Option(androidStringManager.get(R.string.bitcoin_buy_instrument_linking_options_bank_account_option_title), androidStringManager.get(R.string.bitcoin_buy_instrument_linking_options_bank_account_option_subtitle), new InstrumentLinkingOption.Link(CashInstrumentType.BANK_ACCOUNT), new InstrumentLinkingOptionsScreen.Option.Icon.LocalIcon("Sf5x0o")));
                                }
                                screenNavigator.goTo(new InstrumentLinkingOptionsScreen(androidStringManager.get(R.string.bitcoin_buy_instrument_linking_options_header), null, CollectionsKt__CollectionsJVMKt.build(createListBuilder), new InstrumentLinkingOptionsScreen.Mode.Navigation(new BitcoinHome(null, null, null, BitcoinTransferScreen.copy$default(bitcoinTransferScreen, null, savedState2, null, IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO), 7)), false));
                            }
                        }
                        JobKt.launch$default((CoroutineScope) this.$$this$LaunchedEffect, null, null, new RealBugReportSender$submitBugReport$2(bitcoinTransferPresenter, mutableState6, this.$instrumentLinkingConfig$inlined, mutableState4, mutableState3, (MutableState) this.$instruments$delegate$inlined, state2, state3, mutableState2, mutableState, mutableState7, null, 3), 3);
                    } else {
                        String str5 = null;
                        if (bitcoinTransferViewEvent instanceof BitcoinTransferViewEvent.PercentageSelected) {
                            throw new NotImplementedError("An operation is not implemented: Percentage selector is not implemented for bitcoin transfers.");
                        }
                        if (!Intrinsics.areEqual(bitcoinTransferViewEvent, BitcoinTransferViewEvent.ChangeInstrumentClicked.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Money money2 = new Money(new Long(((BitcoinTransferViewEvent.AmountEntered) mutableState6.getValue()).amountCents), (CurrencyCode) null, 6);
                        CurrencyCode currencyCode = (CurrencyCode) mutableState3.getValue();
                        currencyCode.getClass();
                        BalanceSnapshot balanceSnapshot = (BalanceSnapshot) mutableState2.getValue();
                        if (balanceSnapshot == null || (zero = balanceSnapshot.balance) == null) {
                            CurrencyCode currencyCode2 = (CurrencyCode) mutableState3.getValue();
                            currencyCode2.getClass();
                            zero = Moneys.zero(currencyCode2);
                        }
                        RestrictedBalance restrictedBalance = (RestrictedBalance) mutableState.getValue();
                        BitcoinTransferPresenter.CashInAmountBreakdown computeCashInAmountBreakdown = BitcoinTransferPresenter.computeCashInAmountBreakdown(money2, currencyCode, zero, restrictedBalance != null ? restrictedBalance.amount : null, (Instrument) state2.getValue());
                        CryptoFlowStarter cryptoFlowStarter = bitcoinTransferPresenter.cryptoFlowStarter;
                        BitcoinTransferScreen.SavedState savedState3 = (BitcoinTransferScreen.SavedState) state.getValue();
                        Instrument instrument = (Instrument) state2.getValue();
                        BitcoinHome bitcoinHome = new BitcoinHome(null, null, null, BitcoinTransferScreen.copy$default(bitcoinTransferScreen, null, savedState3, instrument != null ? instrument.token : null, 495), 7);
                        Instrument instrument2 = (Instrument) state2.getValue();
                        String str6 = instrument2 != null ? instrument2.token : null;
                        Money money3 = computeCashInAmountBreakdown.instrumentAmount;
                        BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) mutableState2.getValue();
                        String str7 = balanceSnapshot2 != null ? balanceSnapshot2.token : null;
                        Money money4 = computeCashInAmountBreakdown.balanceAmount;
                        RestrictedBalance restrictedBalance2 = (RestrictedBalance) mutableState.getValue();
                        if (restrictedBalance2 != null) {
                            str5 = restrictedBalance2.token;
                        }
                        screenNavigator.goTo(new InstrumentSelectionLoadingScreen(FlowStarter.startFlow$default(((RealCryptoFlowStarter) cryptoFlowStarter).flowStarter, BlockersData.Flow.INSTRUMENT_SELECTION, bitcoinHome, null, ClientScenario.PLASMA, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO), new InstrumentSelectionLoadingScreen.InstrumentSelectionParams.BitcoinBuy(money2, str6, money3, money4, str7, computeCashInAmountBreakdown.restrictedBalanceAmount, str5, bitcoinTransferPresenter.buyInstrumentSelectionBankAccountEnabled)));
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Long l;
            Event cashSendCancel;
            CashInstrumentType cashInstrumentType;
            CashInstrumentType cashInstrumentType2;
            ProfileScreens.ProfileScreen.Action.ActionType actionType;
            String str;
            Region region;
            Set access$updateQuantity;
            Set of;
            LocalMoney localMoney;
            int i = this.$r8$classId;
            Back back = Back.INSTANCE;
            State state = this.$profile$delegate$inlined;
            State state2 = this.$sections$delegate$inlined;
            State state3 = this.$instrumentLinkingConfig$inlined;
            Object obj2 = this.$$this$LaunchedEffect;
            MutableState mutableState = this.$selectedRecipients$delegate$inlined;
            MutableState mutableState2 = this.$shouldRequestNoteFocus$delegate$inlined;
            Object obj3 = this.$isInstrumentSelectionOpen$delegate$inlined;
            MutableState mutableState3 = this.$shouldClearFocus$delegate$inlined;
            Object obj4 = this.$instruments$delegate$inlined;
            Object obj5 = this.$balanceSnapshot$delegate$inlined;
            Object obj6 = this.$availableP2pTargetRegions$delegate$inlined;
            Object obj7 = this.$instrumentSelection$delegate$inlined;
            Object obj8 = this.this$0;
            Object obj9 = this.$hasPassedIdv$inlined;
            Object obj10 = this.$note$delegate$inlined;
            Object obj11 = this.$touchEvents$delegate$inlined;
            switch (i) {
                case 0:
                    MutableState mutableState4 = (MutableState) obj3;
                    State state4 = (State) obj5;
                    MutableState mutableState5 = (MutableState) obj7;
                    State state5 = (State) obj4;
                    MutableState mutableState6 = (MutableState) obj10;
                    MainPaymentPresenter mainPaymentPresenter = (MainPaymentPresenter) obj8;
                    StateFlowImpl stateFlowImpl = mainPaymentPresenter.query;
                    StateFlowImpl stateFlowImpl2 = mainPaymentPresenter.hideSections;
                    ArrayList arrayList = mainPaymentPresenter.recipientsSelectedFromSearchResult;
                    AndroidClock androidClock = mainPaymentPresenter.clock;
                    Analytics analytics = mainPaymentPresenter.analytics;
                    BetterNavigator.ScreenNavigator screenNavigator = mainPaymentPresenter.navigator;
                    PaymentScreens.MainPayment mainPayment = mainPaymentPresenter.args;
                    CoroutineScope coroutineScope = (CoroutineScope) obj2;
                    MainPaymentViewEvent mainPaymentViewEvent = (MainPaymentViewEvent) obj;
                    if (mainPaymentViewEvent instanceof MainPaymentViewEvent.ClearClicked) {
                        mutableState.setValue(new LinkedHashMap());
                        arrayList.clear();
                        MainPaymentPresenter.models$updateSections(state2, mutableState);
                        if (mainPayment.isFiatPayment) {
                            Boolean bool = Boolean.FALSE;
                            stateFlowImpl2.getClass();
                            stateFlowImpl2.updateState(null, bool);
                        }
                    } else if (mainPaymentViewEvent instanceof MainPaymentViewEvent.ListRowClicked) {
                        MainPaymentViewEvent.ListRowClicked listRowClicked = (MainPaymentViewEvent.ListRowClicked) mainPaymentViewEvent;
                        SelectedRecipient selectedRecipient = listRowClicked.recipient;
                        Recipient copy$default = Recipient.copy$default((Recipient) selectedRecipient.recipient.getValue(), null, null, null, null, (String) selectedRecipient.displayName.getValue(), null, null, false, false, -33554433, 3);
                        String customerId = UriKt.getCustomerId(copy$default);
                        if (!((Map) mutableState.getValue()).containsKey(customerId) || listRowClicked.shouldRemoveIfAlreadySelected) {
                            if ((mainPayment.isFiatPayment || ((Map) mutableState.getValue()).size() == 1) && ((Map) mutableState.getValue()).containsKey(customerId)) {
                                arrayList.remove(customerId);
                                mutableState.setValue(MapsKt__MapsKt.minus((Map) mutableState.getValue(), customerId));
                                MainPaymentPresenter.models$updateSections(state2, mutableState);
                            } else {
                                if (copy$default.invoice != null) {
                                    Boolean bool2 = Boolean.TRUE;
                                    stateFlowImpl2.getClass();
                                    stateFlowImpl2.updateState(null, bool2);
                                }
                                Profile profile = (Profile) state.getValue();
                                Region region2 = profile != null ? profile.region : null;
                                com.squareup.cash.db.contacts.Recipient transform = RecipientMapper.transform(copy$default);
                                Iterable iterable = (List) ((State) obj6).getValue();
                                if (iterable == null) {
                                    iterable = EmptyList.INSTANCE;
                                }
                                boolean z = mainPayment.isFiatPayment;
                                iterable.getClass();
                                RecipientSelectionResult recipientSelectionResult = !((region2 == null || (region = transform.region) == null || region2 == region || !z) ? true : CollectionsKt.contains(iterable, region)) ? RecipientSelectionResult.CROSS_BORDER_NOT_ALLOWED : RecipientSelectionResult.SUCCESS;
                                if (recipientSelectionResult == RecipientSelectionResult.SUCCESS) {
                                    JobKt.launch$default(coroutineScope, null, null, new DbSessionManager$updateDb$2(customerId, copy$default, mainPaymentViewEvent, mainPaymentPresenter, this.$selectedRecipients$delegate$inlined, this.$shouldRequestNoteFocus$delegate$inlined, this.$sections$delegate$inlined, null, 19), 3);
                                } else {
                                    AndroidStringManager androidStringManager = mainPaymentPresenter.stringManager;
                                    int ordinal = recipientSelectionResult.ordinal();
                                    if (ordinal == 0) {
                                        a$$ExternalSyntheticBUOutline0.m$1("Unexpected");
                                        return null;
                                    }
                                    if (ordinal == 1) {
                                        str = androidStringManager.get(R.string.payment_cannot_send_to_recipient);
                                    } else if (ordinal == 2) {
                                        str = androidStringManager.get(R.string.payment_cannot_send_to_business_fiat);
                                    } else if (ordinal == 3) {
                                        str = androidStringManager.get(R.string.payment_cannot_send_international_fiat);
                                    } else {
                                        if (ordinal != 4) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        str = androidStringManager.get(R.string.credit_card_payment_not_allowed_message);
                                    }
                                    screenNavigator.goTo(new PaymentScreens.RecipientSelectionWarningScreen(null, new RedactedString(str), null, null));
                                }
                            }
                        }
                    } else if (mainPaymentViewEvent instanceof MainPaymentViewEvent.SearchTextChanged) {
                        String str2 = ((MainPaymentViewEvent.SearchTextChanged) mainPaymentViewEvent).text;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, str2);
                        mainPaymentPresenter.searchQueryStartTimestamp = new Long(androidClock.millis());
                    } else if (mainPaymentViewEvent instanceof MainPaymentViewEvent.NoteTextChanged) {
                        mutableState6.setValue(((MainPaymentViewEvent.NoteTextChanged) mainPaymentViewEvent).note);
                    } else if (mainPaymentViewEvent instanceof MainPaymentViewEvent.GrantContactsPermissionClicked) {
                        JobKt.launch$default(coroutineScope, null, null, new MusicPresenter$models$3$1(mainPaymentPresenter, null, 19), 3);
                    } else if (mainPaymentViewEvent instanceof MainPaymentViewEvent.AvatarClicked) {
                        CustomerProfileViewOpen.EntryPoint entryPoint = CustomerProfileViewOpen.EntryPoint.CELL_AVATAR;
                        Recipient recipient = ((MainPaymentViewEvent.AvatarClicked) mainPaymentViewEvent).recipient;
                        UUID uuid = mainPayment.paymentToken;
                        Orientation orientation = mainPayment.orientation;
                        recipient.getClass();
                        GetProfileDetailsContext getProfileDetailsContext = GetProfileDetailsContext.PAYMENT_FLOW;
                        uuid.getClass();
                        orientation.getClass();
                        int i2 = NavigationHelperKt$WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
                        if (i2 == 1) {
                            actionType = ProfileScreens.ProfileScreen.Action.ActionType.PAY;
                        } else {
                            if (i2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            actionType = ProfileScreens.ProfileScreen.Action.ActionType.REQUEST;
                        }
                        zzahg.goToProfileScreen(screenNavigator, uuid, recipient, entryPoint, new ProfileScreens.ProfileScreen.Action(actionType, new SelectedRecipient(new RedactedParcelable(Recipient.copy$default(recipient, null, null, null, null, null, null, null, false, false, -100663297, 3)), new RedactedString(recipient.fullName))), getProfileDetailsContext);
                    } else if ((mainPaymentViewEvent instanceof MainPaymentViewEvent.CloseClicked) || Intrinsics.areEqual(mainPaymentViewEvent, MainPaymentViewEvent.HandleBack.INSTANCE)) {
                        int i3 = MainPaymentPresenter.WhenMappings.$EnumSwitchMapping$0[mainPayment.orientation.ordinal()];
                        if (i3 == 1) {
                            l = null;
                            cashSendCancel = new CashSendCancel(null, null, null, null);
                        } else {
                            if (i3 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            l = null;
                            cashSendCancel = new CashRequestCancel(null, null, null, null);
                        }
                        analytics.track(cashSendCancel, l);
                        screenNavigator.goTo(back);
                    } else if (mainPaymentViewEvent instanceof MainPaymentViewEvent.ActionClicked) {
                        ((MutableState) obj11).setValue(((MainPaymentViewEvent.ActionClicked) mainPaymentViewEvent).lastGesturesSignal);
                        Profile profile2 = (Profile) state.getValue();
                        List list = (List) state5.getValue();
                        Object value = state3.getValue();
                        if (profile2 != null && list != null && value != null) {
                            InstrumentLinkingConfig instrumentLinkingConfig = (InstrumentLinkingConfig) value;
                            if (mainPaymentPresenter.args.isFiatPayment) {
                                JobKt.launch$default(coroutineScope, null, null, new SessionWorkerKt$runSession$4$1(mainPaymentPresenter, profile2, list, instrumentLinkingConfig, (State) obj9, this.$selectedRecipients$delegate$inlined, (MutableState) obj10, (MutableState) obj7, (State) obj5, (MutableState) obj11, null, 8), 3);
                            } else {
                                JobKt.launch$default(coroutineScope, null, null, new MainPaymentPresenter$models$4$4((Recipient) CollectionsKt.first(((Map) mutableState.getValue()).values()), mainPaymentPresenter, mainPayment.amountInProfileCurrency, (Continuation) null), 3);
                            }
                        }
                    } else {
                        Continuation continuation2 = null;
                        if (mainPaymentViewEvent instanceof MainPaymentViewEvent.RecipientViewed) {
                            JobKt.launch$default(coroutineScope, null, null, new MainPaymentPresenter$models$4$4(mainPaymentViewEvent, mainPaymentPresenter, continuation2, 0), 3);
                        } else {
                            boolean z2 = false;
                            if (mainPaymentViewEvent instanceof MainPaymentViewEvent.SelectInstrument) {
                                mutableState4.setValue(Boolean.valueOf(!((Boolean) mutableState4.getValue()).booleanValue()));
                                mainPaymentPresenter.instrumentsSheetDisplayStartDate = new Long(androidClock.millis());
                                List list2 = CollectionsKt.toList(((Map) mutableState.getValue()).values());
                                List listOf = CollectionsKt__CollectionsKt.listOf((List) state5.getValue(), (BalanceSnapshot) state4.getValue());
                                if (!(listOf instanceof Collection) || !listOf.isEmpty()) {
                                    Iterator it = listOf.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (it.next() != null) {
                                                InstrumentLinkingConfig instrumentLinkingConfig2 = (InstrumentLinkingConfig) state3.getValue();
                                                if (instrumentLinkingConfig2 != null) {
                                                    mutableState3.setValue(VersionedKt.update((Versioned) mutableState3.getValue(), Boolean.TRUE));
                                                    Money money = mainPayment.amountInProfileCurrency;
                                                    BalanceSnapshot balanceSnapshot = (BalanceSnapshot) state4.getValue();
                                                    List list3 = (List) state5.getValue();
                                                    if (list3 == null) {
                                                        list3 = EmptyList.INSTANCE;
                                                    }
                                                    GoogleMapKt.goToSelectInstrument$default(screenNavigator, analytics, money, list2, balanceSnapshot, list3, instrumentLinkingConfig2, (InstrumentSelection) mutableState5.getValue());
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (mainPaymentViewEvent instanceof MainPaymentViewEvent.OnDialogResult) {
                                MainPaymentViewEvent.OnDialogResult onDialogResult = (MainPaymentViewEvent.OnDialogResult) mainPaymentViewEvent;
                                Screen screen = onDialogResult.screenArgs;
                                Object obj12 = onDialogResult.result;
                                if (screen instanceof PaymentScreens.ConfirmDuplicate) {
                                    if (obj12 == AlertDialogResult.POSITIVE) {
                                        Profile profile3 = (Profile) state.getValue();
                                        InstrumentSelection instrumentSelection = (InstrumentSelection) mutableState5.getValue();
                                        BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) state4.getValue();
                                        List list4 = (List) state5.getValue();
                                        Object value2 = state3.getValue();
                                        if (profile3 != null && instrumentSelection != null && balanceSnapshot2 != null && list4 != null && value2 != null) {
                                            JobKt.launch$default(coroutineScope, null, null, new SessionWorkerKt$runSession$4$1(mainPaymentPresenter, profile3, instrumentSelection, balanceSnapshot2, list4, (InstrumentLinkingConfig) value2, (State) obj9, this.$selectedRecipients$delegate$inlined, (MutableState) obj10, (MutableState) obj11, null, 9), 3);
                                        }
                                    }
                                } else if (screen instanceof PaymentScreens.ContactSyncPermissionScreen) {
                                    if (obj12 == AlertDialogResult.POSITIVE) {
                                        mainPaymentPresenter.contactsPermission.request();
                                    }
                                } else if (screen instanceof PaymentScreens.SelectPaymentInstrument) {
                                    mutableState4.setValue(Boolean.FALSE);
                                    SelectPaymentInstrumentResult selectPaymentInstrumentResult = obj12 instanceof SelectPaymentInstrumentResult ? (SelectPaymentInstrumentResult) obj12 : null;
                                    if (selectPaymentInstrumentResult == null || (cashInstrumentType = selectPaymentInstrumentResult.selectedInstrumentType) == null) {
                                        cashInstrumentType = mainPaymentPresenter.currentSelectedInstrumentType;
                                    }
                                    if (cashInstrumentType != null) {
                                        String uuid2 = mainPayment.paymentToken.toString();
                                        uuid2.getClass();
                                        GoogleMapKt.logSelectedInstrument(analytics, cashInstrumentType, mainPaymentPresenter.autoSelectedInstrumentType, mainPaymentPresenter.currentSelectedInstrumentType, mainPaymentPresenter.instrumentsSheetDisplayStartDate, new Long(androidClock.millis()), uuid2, ExperienceType.LEGACY, null);
                                    }
                                    SelectPaymentInstrumentResult.Status status = selectPaymentInstrumentResult != null ? selectPaymentInstrumentResult.status : null;
                                    int i4 = status == null ? -1 : MainPaymentPresenter.WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
                                    if (i4 == 1) {
                                        mutableState5.setValue(new InstrumentSelection(selectPaymentInstrumentResult.token, selectPaymentInstrumentResult.acceptedAmount, (CashInstrumentType) null, 12));
                                    } else if (i4 == 2 && (cashInstrumentType2 = ((SelectPaymentInstrumentResult) obj12).linkType) != null) {
                                        FlowStarter flowStarter = mainPaymentPresenter.flowStarter;
                                        Orientation orientation2 = mainPayment.orientation;
                                        Recipient recipient2 = (Recipient) CollectionsKt.singleOrNull(CollectionsKt.toList(((Map) mutableState.getValue()).values()));
                                        if (recipient2 != null && CreditcardTypeValidator.getPaymentInfo(RecipientMapper.transform(recipient2)).isBusinessCustomer) {
                                            z2 = true;
                                        }
                                        ClientScenario clientScenario = ClientScenario.PROFILE;
                                        String str3 = (String) mutableState6.getValue();
                                        Money money2 = mainPayment.amountInProfileCurrency;
                                        Orientation orientation3 = mainPayment.orientation;
                                        AppCreationActivity appCreationActivity = mainPayment.appCreationActivity;
                                        String str4 = mainPayment.referrer;
                                        String str5 = mainPayment.launchUrl;
                                        List list5 = mainPayment.recipients;
                                        InstrumentSelection instrumentSelection2 = mainPayment.instrumentSelection;
                                        UUID uuid3 = mainPayment.paymentToken;
                                        String str6 = mainPayment.exchangeRatesToken;
                                        Money money3 = mainPayment.amountInSelectedCurrency;
                                        PaymentScreens.MainPayment.SendCryptoCurrencyType sendCryptoCurrencyType = mainPayment.sendCryptoCurrencyType;
                                        CryptoPaymentOrigin cryptoPaymentOrigin = mainPayment.cryptoPaymentOrigin;
                                        String str7 = mainPayment.depositReversalToken;
                                        Screen screen2 = mainPayment.exitScreen;
                                        boolean z3 = mainPayment.isFiatPaymentPadEntryPoint;
                                        money2.getClass();
                                        orientation3.getClass();
                                        appCreationActivity.getClass();
                                        str3.getClass();
                                        list5.getClass();
                                        uuid3.getClass();
                                        money3.getClass();
                                        screenNavigator.goTo(((RealFlowStarter) flowStarter).startInstrumentLinkingFlow(cashInstrumentType2, orientation2, z2, clientScenario, new PaymentScreens.MainPayment(money2, orientation3, appCreationActivity, str3, cashInstrumentType2, str4, str5, list5, instrumentSelection2, uuid3, str6, money3, sendCryptoCurrencyType, cryptoPaymentOrigin, str7, screen2, z3)));
                                    }
                                } else if (screen instanceof PaymentScreens.NoteRequired) {
                                    if (mainPayment.isFiatPayment) {
                                        mutableState6.setValue("");
                                        mutableState2.setValue(VersionedKt.update((Versioned) mutableState2.getValue(), Boolean.TRUE));
                                    }
                                } else if (obj12 instanceof PersonalizePaymentResult) {
                                    mutableState6.setValue((String) ((PersonalizePaymentResult) obj12).note.getValue());
                                }
                            } else if (mainPaymentViewEvent instanceof MainPaymentViewEvent.ContactSyncPermission) {
                                mainPaymentPresenter.askedContactsPaymentPreference.set(true);
                                screenNavigator.goTo(PaymentScreens.ContactSyncPermissionScreen.INSTANCE);
                            } else if (mainPaymentViewEvent instanceof MainPaymentViewEvent.RestoreState) {
                                mainPaymentPresenter.isRestoreState = true;
                                MainPaymentViewEvent.RestoreState restoreState = (MainPaymentViewEvent.RestoreState) mainPaymentViewEvent;
                                stateFlowImpl.setValue(restoreState.query);
                                mutableState6.setValue(restoreState.note);
                                mutableState.setValue(restoreState.selectedRecipients);
                                InstrumentSelection instrumentSelection3 = restoreState.instrumentSelected;
                                if (instrumentSelection3 != null) {
                                    mutableState5.setValue(instrumentSelection3);
                                }
                            } else {
                                if (!Intrinsics.areEqual(mainPaymentViewEvent, MainPaymentViewEvent.PersonalizePaymentClick.INSTANCE)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                Profile profile4 = (Profile) state.getValue();
                                List list6 = (List) state5.getValue();
                                Object value3 = state3.getValue();
                                if (profile4 != null && list6 != null && value3 != null) {
                                    InstrumentLinkingConfig instrumentLinkingConfig3 = (InstrumentLinkingConfig) value3;
                                    InstrumentSelection instrumentSelection4 = (InstrumentSelection) mutableState5.getValue();
                                    List list7 = CollectionsKt.toList(((Map) mutableState.getValue()).values());
                                    BalanceSnapshot balanceSnapshot3 = (BalanceSnapshot) state4.getValue();
                                    Boolean bool3 = (Boolean) ((State) obj9).getValue();
                                    boolean booleanValue = bool3 != null ? bool3.booleanValue() : false;
                                    String str8 = (String) mutableState6.getValue();
                                    MoneyFormatter moneyFormatter = mainPaymentPresenter.moneyFormatter;
                                    RealNetworkInfo realNetworkInfo = mainPaymentPresenter.networkInfo;
                                    AndroidStringManager androidStringManager2 = mainPaymentPresenter.stringManager;
                                    String str9 = mainPaymentPresenter.personalizedPaymentFlowToken;
                                    PersonalizationOrigin personalizationOrigin = PersonalizationOrigin.BUTTON;
                                    mainPayment.getClass();
                                    list7.getClass();
                                    str8.getClass();
                                    moneyFormatter.getClass();
                                    str9.getClass();
                                    UUID uuid4 = mainPayment.paymentToken;
                                    Money money4 = mainPayment.amountInProfileCurrency;
                                    zzahg.openPersonalizePayments$default(screenNavigator, uuid4, money4, money4, mainPayment.orientation, mainPayment.instrumentType, instrumentSelection4, list7, profile4, balanceSnapshot3, list6, instrumentLinkingConfig3, booleanValue, str8, moneyFormatter, realNetworkInfo, androidStringManager2, str9, analytics, mainPayment.referrer, mainPayment.launchUrl, mainPayment.appCreationActivity, mainPayment.exchangeRatesToken, personalizationOrigin, null, 121634816);
                                }
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                    SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj4;
                    List list8 = (List) obj8;
                    LocationMenu locationMenu = (LocationMenu) obj7;
                    MenuItem menuItem = (MenuItem) obj6;
                    List list9 = (List) obj8;
                    CartBuilder cartBuilder = (CartBuilder) obj11;
                    SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj5;
                    CartEntryWithQuantity cartEntryWithQuantity = (CartEntryWithQuantity) obj9;
                    SnapshotStateMap snapshotStateMap3 = (SnapshotStateMap) obj4;
                    SnapshotStateMap snapshotStateMap4 = (SnapshotStateMap) obj10;
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) mutableState3;
                    LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter = (LocalMenuItemDetailsPresenter) obj2;
                    BetterNavigator.ScreenNavigator screenNavigator2 = localMenuItemDetailsPresenter.navigator;
                    LocalMenuItemDetailsScreen localMenuItemDetailsScreen = localMenuItemDetailsPresenter.screen;
                    LocalMenuItemDetailsViewEvent localMenuItemDetailsViewEvent = (LocalMenuItemDetailsViewEvent) obj;
                    if (localMenuItemDetailsViewEvent instanceof LocalMenuItemDetailsViewEvent.BackClicked) {
                        screenNavigator2.goTo(back);
                    } else if (localMenuItemDetailsViewEvent instanceof LocalMenuItemDetailsViewEvent.SelectModifier) {
                        LocalMenuItemDetailsViewEvent.SelectModifier selectModifier = (LocalMenuItemDetailsViewEvent.SelectModifier) localMenuItemDetailsViewEvent;
                        LocalMenuItemDetailsPresenter.access$performSelection(localMenuItemDetailsPresenter, list9, (MenuItem) obj6, snapshotStateMap3, selectModifier.token, null, cartEntryWithQuantity != null ? cartEntryWithQuantity.getCartEntry() : null);
                        LocalMenuItemDetailsPresenter.validateSelections(list8, menuItem, snapshotStateMap, snapshotStateMap2, selectModifier.token);
                    } else if (localMenuItemDetailsViewEvent instanceof LocalMenuItemDetailsViewEvent.FreeTextEntryChanged) {
                        LocalMenuItemDetailsViewEvent.FreeTextEntryChanged freeTextEntryChanged = (LocalMenuItemDetailsViewEvent.FreeTextEntryChanged) localMenuItemDetailsViewEvent;
                        String str10 = freeTextEntryChanged.token;
                        MenuItemModifierListToken menuItemModifierListToken = new MenuItemModifierListToken(str10);
                        String str11 = freeTextEntryChanged.input;
                        FreeTextInput freeTextInput = (FreeTextInput) snapshotStateMap4.get(new MenuItemModifierListToken(str10));
                        snapshotStateMap4.put(menuItemModifierListToken, new FreeTextInput(str11, freeTextInput != null ? freeTextInput.error : null));
                        LocalMenuItemDetailsPresenter.m1215validateFreeTextEntriesN9MCIc4(list9, snapshotStateMap4, snapshotStateMap2, str10);
                    } else if (localMenuItemDetailsViewEvent instanceof CartItemCounterViewEvent.Increment) {
                        NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                        Location.LocationDetail locationDetail = (Location.LocationDetail) state3.getValue();
                        FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) mutableState.getValue();
                        Integer num = new Integer(parcelableSnapshotMutableIntState.getIntValue() - (cartEntryWithQuantity != null ? cartEntryWithQuantity.getQuantity() : 0));
                        LocalMoney localMoney2 = (LocalMoney) state2.getValue();
                        if (localMoney2 != null) {
                            LocalMoney localMoney3 = (LocalMoney) state.getValue();
                            if (localMoney3 == null) {
                                localMoney3 = LocalMoneysKt.zero(LocalCurrencyCode.USD);
                            }
                            localMoney = LocalMoneysKt.minus(localMoney2, localMoney3);
                        } else {
                            localMoney = null;
                        }
                        mutableState2.setValue(localMenuItemDetailsScreen.comboData != null ? null : OrderLimitToasts.toastDataForOrderLimitCheck(localMenuItemDetailsPresenter.stringManager, cartBuilder, locationDetail, locationMenu, fulfillmentConfiguration, num, localMoney));
                    } else if (localMenuItemDetailsViewEvent instanceof CartItemCounterViewEvent.Decrement) {
                        int intValue = parcelableSnapshotMutableIntState.getIntValue();
                        parcelableSnapshotMutableIntState.setIntValue(intValue - 1);
                        Okio.boxInt(intValue);
                    } else if (localMenuItemDetailsViewEvent instanceof CartItemCounterViewEvent.Trash) {
                        screenNavigator2.goTo(back);
                    } else if (localMenuItemDetailsViewEvent instanceof LocalBottomModalViewEvent.CtaClicked) {
                        LocalMenuItemDetailsPresenter.validateSelections(list9, menuItem, snapshotStateMap3, snapshotStateMap2, null);
                        LocalMenuItemDetailsPresenter.m1215validateFreeTextEntriesN9MCIc4(list9, snapshotStateMap4, snapshotStateMap2, null);
                        SnapshotMapKeySet snapshotMapKeySet = snapshotStateMap2.values;
                        if (snapshotMapKeySet == null || !snapshotMapKeySet.isEmpty()) {
                            Iterator it2 = snapshotMapKeySet.iterator();
                            while (((StateMapMutableKeysIterator) it2).hasNext()) {
                                if (!((Boolean) ((StateMapMutableKeysIterator) it2).next()).booleanValue()) {
                                }
                            }
                        }
                        CartEntry createCartEntry = LocalMenuItemDetailsPresenter.createCartEntry(menuItem, snapshotStateMap3, snapshotStateMap4);
                        if (localMenuItemDetailsScreen.automaticallyAddToCart) {
                            LocalMenuItemDetailsScreen.Mode mode = localMenuItemDetailsScreen.mode;
                            if ((mode instanceof LocalMenuItemDetailsScreen.Mode.Add) || (mode instanceof LocalMenuItemDetailsScreen.Mode.Update)) {
                                ((RealCartBuilder) cartBuilder).add(createCartEntry, parcelableSnapshotMutableIntState.getIntValue(), locationMenu, localMenuItemDetailsScreen.analyticsContext);
                            } else {
                                if (!(mode instanceof LocalMenuItemDetailsScreen.Mode.EditFromCart)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                CartEntry cartEntry = cartEntryWithQuantity != null ? cartEntryWithQuantity.getCartEntry() : null;
                                if (cartEntry != null) {
                                    ((RealCartBuilder) cartBuilder).update(cartEntry, createCartEntry, parcelableSnapshotMutableIntState.getIntValue(), locationMenu);
                                } else {
                                    Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((LocalMenuItemDetailsScreen.Mode.EditFromCart) mode).itemIndexInCart, "Failed to find entry for "), new Object[0]);
                                }
                            }
                        }
                        int intValue2 = parcelableSnapshotMutableIntState.getIntValue();
                        LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext = localMenuItemDetailsScreen.analyticsContext;
                        AskedQuestion askedQuestion = localMenuItemDetailsScreen.question;
                        if (askedQuestion != null) {
                            screenNavigator2.giveAnswer(askedQuestion, new CartEntryWithQuantity.ClientCartEntryWithQuantity(createCartEntry, intValue2, localClientCartMenuItemAddedContext));
                        } else {
                            screenNavigator2.goTo(back);
                        }
                    } else if (localMenuItemDetailsViewEvent instanceof LocalBottomModalViewEvent.BottomModalLinkClicked) {
                        screenNavigator2.askQuestion(new SchedulingDayTimeQuestion(), new ViewSizeResolver$size$3$1(2, localMenuItemDetailsPresenter, cartBuilder, mutableState));
                    } else if (localMenuItemDetailsViewEvent instanceof LocalMenuItemDetailsViewEvent.IncrementModifier) {
                        LocalMenuItemDetailsViewEvent.IncrementModifier incrementModifier = (LocalMenuItemDetailsViewEvent.IncrementModifier) localMenuItemDetailsViewEvent;
                        String str12 = incrementModifier.token;
                        String str13 = incrementModifier.listToken;
                        MenuItemModifierListToken menuItemModifierListToken2 = new MenuItemModifierListToken(str13);
                        Set set = (Set) snapshotStateMap3.get(new MenuItemModifierListToken(str13));
                        if (set == null || (of = LocalMenuItemDetailsPresenter.access$updateQuantity(localMenuItemDetailsPresenter, set, str12, LocalMenuItemDetailsPresenter$models$5$3.INSTANCE)) == null) {
                            of = SetsKt__SetsJVMKt.setOf(new LocalMenuItemDetailsPresenter.TokenWithQuantity(str12, 1));
                        }
                        snapshotStateMap3.put(menuItemModifierListToken2, of);
                        LocalMenuItemDetailsPresenter.validateSelections(list8, menuItem, snapshotStateMap, snapshotStateMap2, str12);
                    } else if (localMenuItemDetailsViewEvent instanceof LocalMenuItemDetailsViewEvent.DecrementModifier) {
                        LocalMenuItemDetailsViewEvent.DecrementModifier decrementModifier = (LocalMenuItemDetailsViewEvent.DecrementModifier) localMenuItemDetailsViewEvent;
                        String str14 = decrementModifier.listToken;
                        Set set2 = (Set) snapshotStateMap3.get(new MenuItemModifierListToken(str14));
                        if (set2 != null && (access$updateQuantity = LocalMenuItemDetailsPresenter.access$updateQuantity(localMenuItemDetailsPresenter, set2, decrementModifier.token, LocalMenuItemDetailsPresenter$models$5$3.INSTANCE$3)) != null) {
                            snapshotStateMap3.put(new MenuItemModifierListToken(str14), access$updateQuantity);
                        }
                    } else {
                        if (!Intrinsics.areEqual(localMenuItemDetailsViewEvent, LocalMenuItemDetailsViewEvent.MissingSelections.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        localMenuItemDetailsPresenter.analytics.track(new LocalClientCartMenuItemAddFailure(Boolean.FALSE, Boolean.valueOf(((LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData) obj3) instanceof LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboSlotItemContextData), localMenuItemDetailsScreen.itemToken, null), null);
                    }
                    return Unit.INSTANCE;
                case 2:
                    return emit$com$squareup$cash$bitcoin$presenters$transfer$BitcoinTransferPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                default:
                    MutableState mutableState7 = (MutableState) obj8;
                    MutableState mutableState8 = (MutableState) obj3;
                    MutableState mutableState9 = (MutableState) obj7;
                    MutableState mutableState10 = (MutableState) obj11;
                    MutableState mutableState11 = (MutableState) obj10;
                    FidesmoProvisioningPresenter fidesmoProvisioningPresenter = (FidesmoProvisioningPresenter) obj2;
                    BetterNavigator.ScreenNavigator screenNavigator3 = fidesmoProvisioningPresenter.navigator;
                    FidesmoProvisioningScreen fidesmoProvisioningScreen = fidesmoProvisioningPresenter.args;
                    FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = fidesmoProvisioningPresenter.flowContext;
                    FidesmoProvisioningViewEvent fidesmoProvisioningViewEvent = (FidesmoProvisioningViewEvent) obj;
                    if (fidesmoProvisioningViewEvent instanceof FidesmoProvisioningViewEvent.ActivityReady) {
                        mutableState.setValue(((FidesmoProvisioningViewEvent.ActivityReady) fidesmoProvisioningViewEvent).activity);
                    } else if (fidesmoProvisioningViewEvent instanceof FidesmoProvisioningViewEvent.ActivityResumed) {
                        mutableState2.setValue(Boolean.valueOf(((FidesmoProvisioningViewEvent.ActivityResumed) fidesmoProvisioningViewEvent).isNfcEnabled));
                    } else if (Intrinsics.areEqual(fidesmoProvisioningViewEvent, FidesmoProvisioningViewEvent.OpenNfcSettings.INSTANCE)) {
                        Activity activity = (Activity) mutableState.getValue();
                        if (activity != null) {
                            activity.startActivity(new Intent("android.settings.NFC_SETTINGS").addFlags(268435456));
                        }
                    } else if (Intrinsics.areEqual(fidesmoProvisioningViewEvent, FidesmoProvisioningViewEvent.PreScanInstructionsCompleted.INSTANCE)) {
                        DeviceType models$resolveFlowDeviceType = FidesmoProvisioningPresenter.models$resolveFlowDeviceType(fidesmoProvisioningPresenter, mutableState11);
                        String str15 = Build.MODEL;
                        if (fidesmoProvisioningFlowContext.flowType == FidesmoFlowType.PROVISION) {
                            fidesmoProvisioningFlowContext.analytics.track(new CashTagProvisioningProvisionTermsAccepted(fidesmoProvisioningFlowContext.flowToken, models$resolveFlowDeviceType, fidesmoProvisioningFlowContext.getJourneyToken(), fidesmoProvisioningFlowContext.tagCIN, fidesmoProvisioningFlowContext.tagThemeToken), null);
                        }
                        mutableState10.setValue(Boolean.TRUE);
                    } else {
                        boolean areEqual = Intrinsics.areEqual(fidesmoProvisioningViewEvent, FidesmoProvisioningViewEvent.Retry.INSTANCE);
                        FidesmoProvisioningPresenter.ProvisioningResultSubmission.NotStarted notStarted = FidesmoProvisioningPresenter.ProvisioningResultSubmission.NotStarted.INSTANCE;
                        if (areEqual) {
                            fidesmoProvisioningPresenter.endJourneyIfNeeded$1(UserJourney$Outcome.Failed.INSTANCE);
                            Boolean bool4 = Boolean.FALSE;
                            mutableState10.setValue(bool4);
                            mutableState2.setValue(bool4);
                            mutableState9.setValue(FidesmoProvisioningPresenter.ActivationPhase.Activating.INSTANCE);
                            mutableState8.setValue(null);
                            mutableState3.setValue(notStarted);
                            mutableState7.setValue(bool4);
                            ((MutableState) state3).setValue(null);
                            ((MutableState) state2).setValue(null);
                            ((MutableState) state).setValue(bool4);
                            ((MutableState) obj6).setValue(null);
                            Camera2Controller camera2Controller = fidesmoProvisioningPresenter.loggingHandler;
                            camera2Controller.recordingOngoing = false;
                            ((ArrayList) camera2Controller.currentStateCollectJob).clear();
                            ((RealFidesmoClient) fidesmoProvisioningPresenter.fidesmoClient).setProvisioningData(null);
                            fidesmoProvisioningPresenter.isRetryAttempt = true;
                            fidesmoProvisioningPresenter.journeyStarted = false;
                            fidesmoProvisioningPresenter.journeyEnded = false;
                            fidesmoProvisioningPresenter.scanAttempts = 0;
                            FidesmoFlowType fidesmoFlowType = fidesmoProvisioningScreen.flowType;
                            DeviceType models$resolveFlowDeviceType2 = FidesmoProvisioningPresenter.models$resolveFlowDeviceType(fidesmoProvisioningPresenter, mutableState11);
                            String str16 = Build.MODEL;
                            FidesmoProvisioningBlocker.PreScanUiConfig preScanUiConfig = fidesmoProvisioningScreen.blocker.pre_scan;
                            fidesmoProvisioningFlowContext.logFlowStarted(fidesmoFlowType, models$resolveFlowDeviceType2, preScanUiConfig != null ? preScanUiConfig.tag_theme_token : null);
                        } else {
                            boolean areEqual2 = Intrinsics.areEqual(fidesmoProvisioningViewEvent, FidesmoProvisioningViewEvent.ContactSupport.INSTANCE);
                            Back back2 = Back.INSTANCE;
                            if (areEqual2) {
                                screenNavigator3.goTo(RealSupportNavigator.startSupportFlow$default(fidesmoProvisioningPresenter.supportNavigator, null, null, back2, SupportNavigator$Source.CARD, null, null, 103));
                            } else {
                                if (!(fidesmoProvisioningViewEvent instanceof FidesmoProvisioningViewEvent.OpenUrl)) {
                                    if (Intrinsics.areEqual(fidesmoProvisioningViewEvent, FidesmoProvisioningViewEvent.Close.INSTANCE)) {
                                        Activity activity2 = (Activity) mutableState.getValue();
                                        if (activity2 != null) {
                                            Set set3 = (Set) obj5;
                                            FidesmoShutdownReason fidesmoShutdownReason = (FidesmoShutdownReason) ((MutableState) obj4).getValue();
                                            fidesmoShutdownReason.getClass();
                                            if (fidesmoShutdownReason == FidesmoShutdownReason.STREAM_DISPOSED) {
                                                fidesmoShutdownReason = FidesmoShutdownReason.FLOW_CLOSED;
                                            }
                                            FidesmoProvisioningPresenter.access$models$shutdownFidesmo(obj9, fidesmoProvisioningPresenter, set3, activity2, fidesmoShutdownReason);
                                        }
                                        FidesmoDeviceState.ServiceDelivered serviceDelivered = (FidesmoDeviceState.ServiceDelivered) mutableState8.getValue();
                                        FidesmoProvisioningPresenter.ActivationPhase activationPhase = (FidesmoProvisioningPresenter.ActivationPhase) mutableState9.getValue();
                                        FidesmoProvisioningPresenter.ProvisioningResultSubmission provisioningResultSubmission = (FidesmoProvisioningPresenter.ProvisioningResultSubmission) mutableState3.getValue();
                                        FidesmoFlowType fidesmoFlowType2 = fidesmoProvisioningScreen.flowType;
                                        if (fidesmoFlowType2 == FidesmoFlowType.DEPROVISION && serviceDelivered != null) {
                                            screenNavigator3.goTo(back2);
                                        } else if (serviceDelivered == null || fidesmoFlowType2 != FidesmoFlowType.PROVISION || !(activationPhase instanceof FidesmoProvisioningPresenter.ActivationPhase.ActivationCompleted) || ((FidesmoProvisioningPresenter.ActivationPhase.ActivationCompleted) activationPhase).successScreen == null) {
                                            fidesmoProvisioningPresenter.endJourneyIfNeeded$1(UserJourney$Outcome.UserCanceled.INSTANCE);
                                            fidesmoProvisioningFlowContext.logFlowDismissed();
                                            screenNavigator3.goTo(back2);
                                        } else if (provisioningResultSubmission instanceof FidesmoProvisioningPresenter.ProvisioningResultSubmission.Succeeded) {
                                            screenNavigator3.goTo(fidesmoProvisioningPresenter.blockersDataNavigator.getNext(fidesmoProvisioningScreen, ((FidesmoProvisioningPresenter.ProvisioningResultSubmission.Succeeded) provisioningResultSubmission).blockersData));
                                        } else if (Intrinsics.areEqual(provisioningResultSubmission, FidesmoProvisioningPresenter.ProvisioningResultSubmission.Failed.INSTANCE)) {
                                            screenNavigator3.goTo(new FailureMessageBlockerScreen(fidesmoProvisioningScreen.blockersData, null, null, 6));
                                        } else if (Intrinsics.areEqual(provisioningResultSubmission, FidesmoProvisioningPresenter.ProvisioningResultSubmission.InFlight.INSTANCE) || Intrinsics.areEqual(provisioningResultSubmission, notStarted)) {
                                            mutableState7.setValue(Boolean.TRUE);
                                        } else {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                        }
                                    } else {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                    }
                                    return null;
                                }
                                fidesmoProvisioningPresenter.router.route(new RoutingParams(fidesmoProvisioningPresenter.args, null, null, null, null, null, 510), ((FidesmoProvisioningViewEvent.OpenUrl) fidesmoProvisioningViewEvent).url);
                            }
                        }
                    }
                    return Unit.INSTANCE;
            }
        }

        public AnonymousClass1(CoroutineScope coroutineScope, BitcoinTransferPresenter bitcoinTransferPresenter, CoroutineScope coroutineScope2, MutableState mutableState, MutableState mutableState2, State state, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, State state2, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, State state3, MutableState mutableState10, MutableState mutableState11) {
            this.this$0 = bitcoinTransferPresenter;
            this.$$this$LaunchedEffect = coroutineScope2;
            this.$selectedRecipients$delegate$inlined = mutableState;
            this.$shouldRequestNoteFocus$delegate$inlined = mutableState2;
            this.$instrumentLinkingConfig$inlined = state;
            this.$note$delegate$inlined = mutableState3;
            this.$touchEvents$delegate$inlined = mutableState4;
            this.$instrumentSelection$delegate$inlined = mutableState5;
            this.$isInstrumentSelectionOpen$delegate$inlined = mutableState6;
            this.$sections$delegate$inlined = state2;
            this.$shouldClearFocus$delegate$inlined = mutableState7;
            this.$availableP2pTargetRegions$delegate$inlined = mutableState8;
            this.$instruments$delegate$inlined = mutableState9;
            this.$profile$delegate$inlined = state3;
            this.$hasPassedIdv$inlined = mutableState10;
            this.$balanceSnapshot$delegate$inlined = mutableState11;
        }

        public AnonymousClass1(CoroutineScope coroutineScope, FidesmoProvisioningPresenter fidesmoProvisioningPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, Object obj, Set set) {
            this.$$this$LaunchedEffect = fidesmoProvisioningPresenter;
            this.$selectedRecipients$delegate$inlined = mutableState;
            this.$shouldRequestNoteFocus$delegate$inlined = mutableState2;
            this.$note$delegate$inlined = mutableState3;
            this.$touchEvents$delegate$inlined = mutableState4;
            this.$instrumentSelection$delegate$inlined = mutableState5;
            this.$isInstrumentSelectionOpen$delegate$inlined = mutableState6;
            this.$shouldClearFocus$delegate$inlined = mutableState7;
            this.this$0 = mutableState8;
            this.$instrumentLinkingConfig$inlined = mutableState9;
            this.$sections$delegate$inlined = mutableState10;
            this.$profile$delegate$inlined = mutableState11;
            this.$availableP2pTargetRegions$delegate$inlined = mutableState12;
            this.$instruments$delegate$inlined = mutableState13;
            this.$hasPassedIdv$inlined = obj;
            this.$balanceSnapshot$delegate$inlined = set;
        }

        public AnonymousClass1(CoroutineScope coroutineScope, MainPaymentPresenter mainPaymentPresenter, State state, MutableState mutableState, State state2, State state3, State state4, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, State state5, State state6, MutableState mutableState5, State state7, MutableState mutableState6, MutableState mutableState7) {
            this.this$0 = mainPaymentPresenter;
            this.$instrumentLinkingConfig$inlined = state;
            this.$selectedRecipients$delegate$inlined = mutableState;
            this.$sections$delegate$inlined = state2;
            this.$profile$delegate$inlined = state3;
            this.$availableP2pTargetRegions$delegate$inlined = state4;
            this.$shouldRequestNoteFocus$delegate$inlined = mutableState2;
            this.$note$delegate$inlined = mutableState3;
            this.$touchEvents$delegate$inlined = mutableState4;
            this.$instruments$delegate$inlined = state5;
            this.$hasPassedIdv$inlined = state6;
            this.$instrumentSelection$delegate$inlined = mutableState5;
            this.$balanceSnapshot$delegate$inlined = state7;
            this.$isInstrumentSelectionOpen$delegate$inlined = mutableState6;
            this.$shouldClearFocus$delegate$inlined = mutableState7;
            this.$$this$LaunchedEffect = coroutineScope;
        }
    }
}
