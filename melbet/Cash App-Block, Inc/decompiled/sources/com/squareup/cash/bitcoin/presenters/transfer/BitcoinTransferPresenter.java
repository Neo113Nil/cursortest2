package com.squareup.cash.bitcoin.presenters.transfer;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.l2$$ExternalSyntheticLambda7;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.R;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.amountslider.presenters.AmountSelectorPresenter;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.presenters.BitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.bitcoin.presenters.featureavailability.BitcoinFeatureAvailabilityProvider;
import com.squareup.cash.bitcoin.presenters.limits.util.BitcoinLimitsProvider;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinInstrumentRecommendationScreen;
import com.squareup.cash.bitcoin.screens.BitcoinPeriodSelectionScreen;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewEvent;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.blockers.presenters.CheckmarkPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.balance.RealRestrictedBalanceStore;
import com.squareup.cash.crypto.backend.balance.RestrictedBalance;
import com.squareup.cash.crypto.backend.settings.RealBitcoinConfigRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.crypto.navigation.BitcoinExchangeType;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.data.profile.CustomerLimitsManager;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinBuyEnableCashInBankAccountInstrument;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinBuyEnableCashInInstrumentSelection;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinAchEnqueueRequirements;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinAchRecommendationAmountUsdCents;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RecurringScheduleBuilder;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda1;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.cash.transfers.backend.real.RealTransferRequirementHandler;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinTransferPresenter implements MoleculePresenter {
    public final AmountSelectorPresenter amountSelectorPresenter;
    public final Analytics analytics;
    public final BitcoinTransferScreen args;
    public final ProductionAttributionEventEmitter attributionEventEmitter;
    public final RealBalanceSnapshotManager balanceSnapshot;
    public final RealBitcoinConfigRepo bitcoinConfigRepo;
    public final boolean bitcoinEnqueueRequirementsEnabled;
    public final FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 bitcoinExchangeRate;
    public final BitcoinFeatureAvailabilityProvider bitcoinFeatureAvailabilityProvider;
    public final BitcoinLimitsProvider bitcoinLimitsProvider;
    public final BitcoinTransferTitleSubtitleProvider$Factory$Impl bitcoinTransferTitleSubtitleProviderFactory;
    public final boolean buyInstrumentSelectionBankAccountEnabled;
    public final boolean buyInstrumentSelectionEnabled;
    public final RealCryptoBalanceRepo cryptoBalanceRepo;
    public final CryptoFlowStarter cryptoFlowStarter;
    public final CardModelView$cardHeat$$inlined$map$1 currencyCodeFlow;
    public final FeatureFlagManager featureFlagManager;
    public final BitcoinTransferScreen.SavedState initialSavedState;
    public final RealInstrumentManager instrumentManager;
    public final CoroutineContext ioDispatcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RecurringScheduleBuilder recurringScheduleBuilder;
    public final RealRestrictedBalanceStore restrictedBalanceStore;
    public final String sourceAsset;
    public final AndroidStringManager stringManager;
    public final String targetAsset;
    public final ChannelFlowTransformLatest transferInstrumentFlow;
    public final RealTransferRequirementHandler transferRequirementHandler;

    public final class CashInAmountBreakdown {
        public final Money balanceAmount;
        public final Money instrumentAmount;
        public final Money restrictedBalanceAmount;

        public CashInAmountBreakdown(Money money, Money money2, Money money3) {
            this.instrumentAmount = money;
            this.balanceAmount = money2;
            this.restrictedBalanceAmount = money3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CashInAmountBreakdown)) {
                return false;
            }
            CashInAmountBreakdown cashInAmountBreakdown = (CashInAmountBreakdown) obj;
            return Intrinsics.areEqual(this.instrumentAmount, cashInAmountBreakdown.instrumentAmount) && this.balanceAmount.equals(cashInAmountBreakdown.balanceAmount) && Intrinsics.areEqual(this.restrictedBalanceAmount, cashInAmountBreakdown.restrictedBalanceAmount);
        }

        public final int hashCode() {
            Money money = this.instrumentAmount;
            int m = NavAction$$ExternalSyntheticOutline0.m(this.balanceAmount, (money == null ? 0 : money.hashCode()) * 31, 31);
            Money money2 = this.restrictedBalanceAmount;
            return m + (money2 != null ? money2.hashCode() : 0);
        }

        public final String toString() {
            return "CashInAmountBreakdown(instrumentAmount=" + this.instrumentAmount + ", balanceAmount=" + this.balanceAmount + ", restrictedBalanceAmount=" + this.restrictedBalanceAmount + ")";
        }
    }

    public BitcoinTransferPresenter(AndroidStringManager androidStringManager, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, AmountSelectorPresenter amountSelectorPresenter, BitcoinLimitsProvider bitcoinLimitsProvider, RealCryptoBalanceRepo realCryptoBalanceRepo, RealCryptoValueRepo realCryptoValueRepo, CryptoFlowStarter cryptoFlowStarter, RealBalanceSnapshotManager realBalanceSnapshotManager, RealRestrictedBalanceStore realRestrictedBalanceStore, RealInstrumentManager realInstrumentManager, RecurringScheduleBuilder recurringScheduleBuilder, Analytics analytics, ProductionAttributionEventEmitter productionAttributionEventEmitter, BinaryBitmap binaryBitmap, BitcoinTransferTitleSubtitleProvider$Factory$Impl bitcoinTransferTitleSubtitleProvider$Factory$Impl, RealJurisdictionConfigManager realJurisdictionConfigManager, RealBitcoinConfigRepo realBitcoinConfigRepo, FeatureFlagManager featureFlagManager, RealTransferRequirementHandler realTransferRequirementHandler, BitcoinFeatureAvailabilityProvider bitcoinFeatureAvailabilityProvider, CoroutineContext coroutineContext, BitcoinTransferScreen bitcoinTransferScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        String lowerCase;
        String str;
        bitcoinTransferScreen.getClass();
        this.stringManager = androidStringManager;
        this.amountSelectorPresenter = amountSelectorPresenter;
        this.bitcoinLimitsProvider = bitcoinLimitsProvider;
        this.cryptoBalanceRepo = realCryptoBalanceRepo;
        this.cryptoFlowStarter = cryptoFlowStarter;
        this.balanceSnapshot = realBalanceSnapshotManager;
        this.restrictedBalanceStore = realRestrictedBalanceStore;
        this.instrumentManager = realInstrumentManager;
        this.recurringScheduleBuilder = recurringScheduleBuilder;
        this.analytics = analytics;
        this.attributionEventEmitter = productionAttributionEventEmitter;
        this.bitcoinTransferTitleSubtitleProviderFactory = bitcoinTransferTitleSubtitleProvider$Factory$Impl;
        this.bitcoinConfigRepo = realBitcoinConfigRepo;
        this.featureFlagManager = featureFlagManager;
        this.transferRequirementHandler = realTransferRequirementHandler;
        this.bitcoinFeatureAvailabilityProvider = bitcoinFeatureAvailabilityProvider;
        this.ioDispatcher = coroutineContext;
        this.args = bitcoinTransferScreen;
        this.navigator = screenNavigator;
        boolean z = bitcoinTransferScreen.isBuy;
        Continuation continuation = null;
        if (z) {
            lowerCase = null;
        } else {
            lowerCase = "BTC".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        this.sourceAsset = lowerCase;
        if (z) {
            str = "BTC".toLowerCase(Locale.ROOT);
            str.getClass();
        } else {
            str = null;
        }
        this.targetAsset = str;
        this.transferInstrumentFlow = FlowKt.transformLatest(RealBitcoinCapabilityProvider.isBTCxFlow(), new AnchoredDraggableNode$drag$2(continuation, binaryBitmap, 6));
        this.currencyCodeFlow = new CardModelView$cardHeat$$inlined$map$1(realJurisdictionConfigManager.select(), 19);
        this.bitcoinExchangeRate = FlowKt.take(realCryptoValueRepo.valuePerBitcoin(null), 2);
        BitcoinTransferScreen.SavedState savedState = bitcoinTransferScreen.savedState;
        this.initialSavedState = savedState == null ? new BitcoinTransferScreen.SavedState(new AmountSheetSavedState.AmountSelectorState(null)) : savedState;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.buyInstrumentSelectionEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$BitcoinBuyEnableCashInInstrumentSelection.INSTANCE)).enabled();
        this.buyInstrumentSelectionBankAccountEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$BitcoinBuyEnableCashInBankAccountInstrument.INSTANCE)).enabled();
        this.bitcoinEnqueueRequirementsEnabled = Intrinsics.areEqual(((FeatureFlag$StringFeatureFlag$Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinAchEnqueueRequirements.INSTANCE)).value, "enabled_sheet");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018d  */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.squareup.protos.repeatedly.common.RecurringSchedule$Frequency, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleSubmit(BitcoinTransferPresenter bitcoinTransferPresenter, long j, BitcoinTransferScreen.SavedState savedState, AmountSelection amountSelection, CurrencyCode currencyCode, CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance, Instrument instrument, Money money, Money money2, List list, ContinuationImpl continuationImpl) {
        BitcoinTransferPresenter$handleSubmit$1 bitcoinTransferPresenter$handleSubmit$1;
        int i;
        CashInAmountBreakdown cashInAmountBreakdown;
        BitcoinTransferScreen.SavedState savedState2;
        AmountSelection amountSelection2;
        CurrencyCode currencyCode2;
        CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance2;
        Money money3;
        Object obj;
        List list2;
        Instrument instrument2;
        Money money4;
        long j2;
        CurrencyCode currencyCode3;
        String str;
        boolean z;
        BetterNavigator.ScreenNavigator screenNavigator;
        BitcoinTransferScreen bitcoinTransferScreen;
        BitcoinTransferPresenter$handleSubmit$1 bitcoinTransferPresenter$handleSubmit$12;
        BitcoinExchangeType buyBitcoin;
        Pair pair;
        CashInAmountBreakdown cashInAmountBreakdown2;
        BitcoinTransferScreen.OrderType orderType;
        Object obj2;
        BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption linkBankAccount;
        BitcoinExchangeType.ConvertToBitcoin.ConvertToBitcoinType convertSome;
        BetterNavigator.ScreenNavigator screenNavigator2 = bitcoinTransferPresenter.navigator;
        BitcoinTransferScreen bitcoinTransferScreen2 = bitcoinTransferPresenter.args;
        if (continuationImpl instanceof BitcoinTransferPresenter$handleSubmit$1) {
            bitcoinTransferPresenter$handleSubmit$1 = (BitcoinTransferPresenter$handleSubmit$1) continuationImpl;
            int i2 = bitcoinTransferPresenter$handleSubmit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bitcoinTransferPresenter$handleSubmit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj3 = bitcoinTransferPresenter$handleSubmit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitcoinTransferPresenter$handleSubmit$1.label;
                if (i != 0) {
                    cashInAmountBreakdown = null;
                    SafeTrace.throwOnFailure(obj3);
                    bitcoinTransferPresenter.attributionEventEmitter.trackEvent("Attempted Money Movement", MapsKt__MapsKt.mutableMapOf(new Pair("type", "btc")));
                    ChannelFlowTransformLatest channelFlowTransformLatest = bitcoinTransferPresenter.transferInstrumentFlow;
                    savedState2 = savedState;
                    bitcoinTransferPresenter$handleSubmit$1.L$0 = savedState2;
                    amountSelection2 = amountSelection;
                    bitcoinTransferPresenter$handleSubmit$1.L$1 = amountSelection2;
                    currencyCode2 = currencyCode;
                    bitcoinTransferPresenter$handleSubmit$1.L$2 = currencyCode2;
                    cryptoBalance$BitcoinBalance2 = cryptoBalance$BitcoinBalance;
                    bitcoinTransferPresenter$handleSubmit$1.L$3 = cryptoBalance$BitcoinBalance2;
                    bitcoinTransferPresenter$handleSubmit$1.L$4 = instrument;
                    bitcoinTransferPresenter$handleSubmit$1.L$5 = money;
                    money3 = money2;
                    bitcoinTransferPresenter$handleSubmit$1.L$6 = money3;
                    bitcoinTransferPresenter$handleSubmit$1.L$7 = list;
                    bitcoinTransferPresenter$handleSubmit$1.J$0 = j;
                    bitcoinTransferPresenter$handleSubmit$1.label = 1;
                    Object first = FlowKt.first(channelFlowTransformLatest, bitcoinTransferPresenter$handleSubmit$1);
                    if (first == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = first;
                    list2 = list;
                    instrument2 = instrument;
                    money4 = money;
                    j2 = j;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj3);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = bitcoinTransferPresenter$handleSubmit$1.J$0;
                    List list3 = bitcoinTransferPresenter$handleSubmit$1.L$7;
                    money3 = bitcoinTransferPresenter$handleSubmit$1.L$6;
                    money4 = bitcoinTransferPresenter$handleSubmit$1.L$5;
                    instrument2 = bitcoinTransferPresenter$handleSubmit$1.L$4;
                    CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance3 = bitcoinTransferPresenter$handleSubmit$1.L$3;
                    CurrencyCode currencyCode4 = bitcoinTransferPresenter$handleSubmit$1.L$2;
                    cashInAmountBreakdown = null;
                    AmountSelection amountSelection3 = bitcoinTransferPresenter$handleSubmit$1.L$1;
                    BitcoinTransferScreen.SavedState savedState3 = bitcoinTransferPresenter$handleSubmit$1.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    obj = obj3;
                    list2 = list3;
                    savedState2 = savedState3;
                    currencyCode2 = currencyCode4;
                    amountSelection2 = amountSelection3;
                    cryptoBalance$BitcoinBalance2 = cryptoBalance$BitcoinBalance3;
                }
                BitcoinTransferCurrencyInstrument bitcoinTransferCurrencyInstrument = (BitcoinTransferCurrencyInstrument) obj;
                List list4 = list2;
                CurrencyCode currencyCode5 = bitcoinTransferCurrencyInstrument.currencyCode;
                Money money5 = money4;
                currencyCode3 = bitcoinTransferCurrencyInstrument.currencyCode;
                str = bitcoinTransferCurrencyInstrument.token;
                boolean z2 = currencyCode5 != CurrencyCode.XUS;
                z = bitcoinTransferScreen2.isBuy;
                boolean z3 = z2;
                if (z || !z3) {
                    screenNavigator = screenNavigator2;
                    bitcoinTransferScreen = bitcoinTransferScreen2;
                    bitcoinTransferPresenter$handleSubmit$12 = bitcoinTransferPresenter$handleSubmit$1;
                    buyBitcoin = !z ? new BitcoinExchangeType.BuyBitcoin(new Money(new Long(j2), currencyCode3, 4), CurrencyCode.BTC) : ((amountSelection2 instanceof AmountSelection.TradeAll) && j2 == ((AmountSelection.TradeAll) amountSelection2).amount) ? new BitcoinExchangeType.SellAllBitcoin(currencyCode2, CurrencyCode.BTC) : new BitcoinExchangeType.SellBitcoin(new Money(new Long(j2), currencyCode2, 4), CurrencyCode.BTC);
                } else {
                    if (amountSelection2 instanceof AmountSelection.TradeAll) {
                        convertSome = BitcoinExchangeType.ConvertToBitcoin.ConvertToBitcoinType.ConvertAll.INSTANCE;
                        screenNavigator = screenNavigator2;
                        bitcoinTransferScreen = bitcoinTransferScreen2;
                        bitcoinTransferPresenter$handleSubmit$12 = bitcoinTransferPresenter$handleSubmit$1;
                    } else {
                        screenNavigator = screenNavigator2;
                        bitcoinTransferScreen = bitcoinTransferScreen2;
                        bitcoinTransferPresenter$handleSubmit$12 = bitcoinTransferPresenter$handleSubmit$1;
                        convertSome = new BitcoinExchangeType.ConvertToBitcoin.ConvertToBitcoinType.ConvertSome(new Money(new Long(j2 * 10000), currencyCode3, 4));
                    }
                    buyBitcoin = new BitcoinExchangeType.ConvertToBitcoin(convertSome);
                }
                if (!(buyBitcoin instanceof BitcoinExchangeType.BuyBitcoin) || (buyBitcoin instanceof BitcoinExchangeType.ConvertToBitcoin)) {
                    pair = new Pair(str, cryptoBalance$BitcoinBalance2.instrumentToken);
                } else {
                    if (!(buyBitcoin instanceof BitcoinExchangeType.SellAllBitcoin) && !(buyBitcoin instanceof BitcoinExchangeType.SellBitcoin)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return cashInAmountBreakdown;
                    }
                    pair = new Pair(cryptoBalance$BitcoinBalance2.instrumentToken, str);
                }
                String str2 = (String) pair.first;
                String str3 = (String) pair.second;
                if (instrument2 == null) {
                    cashInAmountBreakdown2 = computeCashInAmountBreakdown(new Money(new Long(j2), currencyCode2, 4), currencyCode2, money5 == null ? Moneys.zero(currencyCode2) : money5, money3, instrument2);
                } else {
                    cashInAmountBreakdown2 = cashInAmountBreakdown;
                }
                BitcoinTransferScreen bitcoinTransferScreen3 = bitcoinTransferScreen;
                orderType = bitcoinTransferScreen3.orderType;
                if (orderType instanceof BitcoinTransferScreen.OrderType.CustomOrder) {
                    BetterNavigator.ScreenNavigator screenNavigator3 = screenNavigator;
                    if (bitcoinTransferScreen3.isBuy && bitcoinTransferPresenter.buyInstrumentSelectionBankAccountEnabled) {
                        if ((instrument2 != null ? instrument2.cashInstrumentType : null) == CashInstrumentType.DEBIT_CARD) {
                            if (j2 >= ((FeatureFlag$LongFeatureFlag.Value) ((RealFeatureFlagManager) bitcoinTransferPresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinAchRecommendationAmountUsdCents.INSTANCE)).value) {
                                BitcoinExchangeType.BuyBitcoin buyBitcoin2 = (BitcoinExchangeType.BuyBitcoin) buyBitcoin;
                                Money money6 = cashInAmountBreakdown2 != null ? cashInAmountBreakdown2.instrumentAmount : null;
                                Iterator it = list4.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    Instrument instrument3 = (Instrument) obj2;
                                    if (instrument3.cashInstrumentType == CashInstrumentType.BANK_ACCOUNT && instrument3.defaultForInstrumentType) {
                                        break;
                                    }
                                }
                                Instrument instrument4 = (Instrument) obj2;
                                BitcoinTransferScreen copy$default = BitcoinTransferScreen.copy$default(bitcoinTransferScreen3, null, savedState2, null, IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO);
                                BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.ContinueBitcoinTransfer continueBitcoinTransfer = new BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.ContinueBitcoinTransfer(bitcoinTransferScreen3.exitScreen, buyBitcoin2, str2, str3, instrument2, money6, bitcoinTransferPresenter.buildRecurringSchedule());
                                if (instrument4 != null) {
                                    linkBankAccount = new BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.SwitchToBankAccount(BitcoinTransferScreen.copy$default(bitcoinTransferScreen3, null, savedState2, instrument4.token, 495));
                                } else {
                                    linkBankAccount = new BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.LinkBankAccount(new BitcoinHome(null, null, null, BitcoinTransferScreen.copy$default(bitcoinTransferScreen3, null, savedState2, null, IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO), 7), buyBitcoin2.money, instrument2 != null ? instrument2.token : null);
                                }
                                screenNavigator3.goTo(new BitcoinInstrumentRecommendationScreen(copy$default, continueBitcoinTransfer, linkBankAccount));
                            }
                        }
                    }
                    Money money7 = cashInAmountBreakdown2 != null ? cashInAmountBreakdown2.instrumentAmount : null;
                    BitcoinTransferPresenter$handleSubmit$1 bitcoinTransferPresenter$handleSubmit$13 = bitcoinTransferPresenter$handleSubmit$12;
                    bitcoinTransferPresenter$handleSubmit$13.L$0 = null;
                    bitcoinTransferPresenter$handleSubmit$13.L$1 = null;
                    bitcoinTransferPresenter$handleSubmit$13.L$2 = null;
                    bitcoinTransferPresenter$handleSubmit$13.L$3 = null;
                    bitcoinTransferPresenter$handleSubmit$13.L$4 = null;
                    bitcoinTransferPresenter$handleSubmit$13.L$5 = null;
                    bitcoinTransferPresenter$handleSubmit$13.L$6 = null;
                    bitcoinTransferPresenter$handleSubmit$13.L$7 = null;
                    bitcoinTransferPresenter$handleSubmit$13.J$0 = j2;
                    bitcoinTransferPresenter$handleSubmit$13.label = 2;
                    Unit initiateBitcoinExchange = ((RealCryptoFlowStarter) bitcoinTransferPresenter.cryptoFlowStarter).initiateBitcoinExchange(bitcoinTransferScreen3.exitScreen, screenNavigator3, buyBitcoin, str2, str3, instrument2, money7, bitcoinTransferPresenter.buildRecurringSchedule());
                    if (initiateBitcoinExchange != coroutineSingletons) {
                        initiateBitcoinExchange = Unit.INSTANCE;
                    }
                    if (initiateBitcoinExchange == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return Unit.INSTANCE;
                }
                BitcoinTransferScreen.OrderType.CustomOrder customOrder = (BitcoinTransferScreen.OrderType.CustomOrder) orderType;
                ?? r2 = cashInAmountBreakdown;
                screenNavigator.goTo(new BitcoinPeriodSelectionScreen(ColorModel.Bitcoin.INSTANCE, new BitcoinTransferScreen.OrderType.CustomOrder(customOrder.currentUsdPerBtc, customOrder.targetUsdPerBtc), buyBitcoin, str2, BitcoinTransferScreen.copy$default(bitcoinTransferScreen3, r2, savedState2, r2, IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO), bitcoinTransferScreen3.exitScreen, currencyCode2));
                return Unit.INSTANCE;
            }
        }
        bitcoinTransferPresenter$handleSubmit$1 = new BitcoinTransferPresenter$handleSubmit$1(bitcoinTransferPresenter, continuationImpl);
        Object obj32 = bitcoinTransferPresenter$handleSubmit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitcoinTransferPresenter$handleSubmit$1.label;
        if (i != 0) {
        }
        BitcoinTransferCurrencyInstrument bitcoinTransferCurrencyInstrument2 = (BitcoinTransferCurrencyInstrument) obj;
        List list42 = list2;
        CurrencyCode currencyCode52 = bitcoinTransferCurrencyInstrument2.currencyCode;
        Money money52 = money4;
        currencyCode3 = bitcoinTransferCurrencyInstrument2.currencyCode;
        str = bitcoinTransferCurrencyInstrument2.token;
        if (currencyCode52 != CurrencyCode.XUS) {
        }
        z = bitcoinTransferScreen2.isBuy;
        boolean z32 = z2;
        if (z) {
        }
        screenNavigator = screenNavigator2;
        bitcoinTransferScreen = bitcoinTransferScreen2;
        bitcoinTransferPresenter$handleSubmit$12 = bitcoinTransferPresenter$handleSubmit$1;
        if (!z) {
        }
        if (buyBitcoin instanceof BitcoinExchangeType.BuyBitcoin) {
        }
        pair = new Pair(str, cryptoBalance$BitcoinBalance2.instrumentToken);
        String str22 = (String) pair.first;
        String str32 = (String) pair.second;
        if (instrument2 == null) {
        }
        BitcoinTransferScreen bitcoinTransferScreen32 = bitcoinTransferScreen;
        orderType = bitcoinTransferScreen32.orderType;
        if (orderType instanceof BitcoinTransferScreen.OrderType.CustomOrder) {
        }
        return Unit.INSTANCE;
    }

    public static CashInAmountBreakdown computeCashInAmountBreakdown(Money money, CurrencyCode currencyCode, Money money2, Money money3, Instrument instrument) {
        Money money4 = instrument != null ? new Money(Long.valueOf((long) Moneys.displayDivisor(currencyCode)), currencyCode, 4) : Moneys.zero(currencyCode);
        Money minus = Moneys.minus(money, money4);
        if (money3 == null) {
            money3 = Moneys.zero(currencyCode);
        }
        Money min = Moneys.min(minus, Moneys.max(money3, Moneys.zero(currencyCode)));
        Money minus2 = Moneys.minus(minus, min);
        Money min2 = Moneys.min(minus2, Moneys.max(money2, Moneys.zero(currencyCode)));
        Money plus = Moneys.plus(money4, Moneys.minus(minus2, min2));
        if (Moneys.isZero(plus)) {
            plus = null;
        }
        if (Moneys.isZero(min)) {
            min = null;
        }
        return new CashInAmountBreakdown(plus, min2, min);
    }

    public final void LaunchSellAllIfNeeded(List list, CurrencyCode currencyCode, BitcoinTransferScreen.SavedState savedState, CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-857865076);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(currencyCode.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(savedState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? gapComposer.changed(cryptoBalance$BitcoinBalance) : gapComposer.changedInstance(cryptoBalance$BitcoinBalance) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 16384 : PKIFailureInfo.certRevoked;
        }
        boolean z = true;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.skipToGroupEnd();
        } else if (list.size() == 1 && (CollectionsKt.first(list) instanceof AmountSelection.TradeAll)) {
            gapComposer.startReplaceGroup(-1602831942);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(list) | gapComposer.changedInstance(this) | gapComposer.changedInstance(savedState) | ((i2 & 112) == 32);
            if ((i2 & 7168) != 2048 && ((i2 & 4096) == 0 || !gapComposer.changedInstance(cryptoBalance$BitcoinBalance))) {
                z = false;
            }
            boolean z2 = changedInstance | z;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                AndroidSecureStore$read$2 androidSecureStore$read$2 = new AndroidSecureStore$read$2(list, this, savedState, currencyCode, cryptoBalance$BitcoinBalance, null, 20);
                gapComposer.updateRememberedValue(androidSecureStore$read$2);
                rememberedValue = androidSecureStore$read$2;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1602374506);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(this, list, currencyCode, savedState, cryptoBalance$BitcoinBalance, i, 17);
        }
    }

    public final void ShowErrorIfNoBitcoinOwned(BigDecimal bigDecimal, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2128760173);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(bigDecimal) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean changedInstance = gapComposer.changedInstance(this) | ((i2 & 14) == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InteractiveCardView$flingTo$1.AnonymousClass2(bigDecimal, this, (Continuation) null, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, bigDecimal, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, bigDecimal, i, i3);
        }
    }

    public final Order.RecurringSchedule buildRecurringSchedule() {
        RecurringSchedule build;
        BitcoinTransferScreen bitcoinTransferScreen = this.args;
        Order.RecurringSchedule.Frequency frequency = null;
        if (!bitcoinTransferScreen.isBuy || (build = this.recurringScheduleBuilder.build(bitcoinTransferScreen.frequency)) == null) {
            return null;
        }
        List<Integer> list = build.days_of_period;
        Integer num = build.time_of_day;
        String str = build.timezone;
        RecurringSchedule.Frequency frequency2 = build.frequency;
        int i = frequency2 == null ? -1 : BitcoinTransferPresenterKt$WhenMappings.$EnumSwitchMapping$0[frequency2.ordinal()];
        if (i != -1) {
            if (i == 1) {
                frequency = Order.RecurringSchedule.Frequency.EVERY_WEEK;
            } else if (i == 2) {
                frequency = Order.RecurringSchedule.Frequency.EVERY_TWO_WEEKS;
            } else if (i == 3) {
                frequency = Order.RecurringSchedule.Frequency.EVERY_MONTH;
            } else {
                if (i != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                frequency = Order.RecurringSchedule.Frequency.EVERY_DAY;
            }
        }
        return new Order.RecurringSchedule(frequency, list, str, num, ByteString.EMPTY);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x06f9, code lost:
    
        if (r2 == r0) goto L185;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x07c4  */
    /* JADX WARN: Type inference failed for: r20v4, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r46v0, types: [com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Long] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        CoroutineContext coroutineContext;
        BitcoinTransferScreen bitcoinTransferScreen;
        MutableState mutableState;
        boolean z;
        CoroutineContext coroutineContext2;
        Object ziplineLoader$load$2;
        GapComposer gapComposer;
        RecurringSchedule.Frequency frequency;
        BitcoinTransferScreen bitcoinTransferScreen2;
        boolean z2;
        Object[] objArr;
        MutableState mutableState2;
        EmptyList emptyList;
        State state;
        CoroutineContext coroutineContext3;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        BitcoinTransferPresenter bitcoinTransferPresenter;
        MutableState mutableState8;
        MutableState mutableState9;
        CoroutineContext coroutineContext4;
        final MutableState mutableState10;
        State state2;
        GapComposer gapComposer2;
        final BitcoinTransferPresenter bitcoinTransferPresenter2;
        final MutableState mutableState11;
        State state3;
        Object derivedStateOf;
        Object obj;
        boolean z3;
        boolean changed;
        Object rememberedValue;
        boolean booleanValue;
        Object bottomSheetContent;
        boolean z4;
        flow.getClass();
        ?? r5 = (GapComposer) composer;
        r5.startReplaceGroup(-348244707);
        Object rememberedValue2 = r5.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue2 == obj2) {
            rememberedValue2 = this.currencyCodeFlow;
            r5.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, r5, 48, 2);
        Object rememberedValue3 = r5.rememberedValue();
        if (rememberedValue3 == obj2) {
            rememberedValue3 = this.cryptoBalanceRepo.getBitcoinBalance();
            r5.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, null, null, r5, 48, 2);
        Object rememberedValue4 = r5.rememberedValue();
        if (rememberedValue4 == obj2) {
            rememberedValue4 = this.balanceSnapshot.select();
            r5.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue4, null, null, r5, 48, 2);
        Object rememberedValue5 = r5.rememberedValue();
        if (rememberedValue5 == obj2) {
            rememberedValue5 = this.restrictedBalanceStore.select();
            r5.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue5, null, null, r5, 48, 2);
        boolean changed2 = r5.changed((BalanceSnapshot) collectAsState3.getValue()) | r5.changed((RestrictedBalance) collectAsState4.getValue());
        Object rememberedValue6 = r5.rememberedValue();
        int i2 = 1;
        if (changed2 || rememberedValue6 == obj2) {
            rememberedValue6 = Updater.derivedStateOf(new ScoreSummaryKt$$ExternalSyntheticLambda1(collectAsState3, collectAsState4, i2));
            r5.updateRememberedValue(rememberedValue6);
        }
        State state4 = (State) rememberedValue6;
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        boolean z5 = this.buyInstrumentSelectionEnabled;
        if (z5) {
            createListBuilder.add(CashInstrumentType.DEBIT_CARD);
            if (this.buyInstrumentSelectionBankAccountEnabled) {
                createListBuilder.add(CashInstrumentType.BANK_ACCOUNT);
            }
        }
        ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        boolean changed3 = r5.changed(build);
        Object rememberedValue7 = r5.rememberedValue();
        if (changed3 || rememberedValue7 == obj2) {
            if (build.isEmpty()) {
                rememberedValue7 = new AppLockMonitor$special$$inlined$map$2(EmptyList.INSTANCE, 19);
            } else {
                CashInstrumentType[] cashInstrumentTypeArr = (CashInstrumentType[]) build.toArray(new CashInstrumentType[0]);
                rememberedValue7 = this.instrumentManager.forTypes((CashInstrumentType[]) Arrays.copyOf(cashInstrumentTypeArr, cashInstrumentTypeArr.length));
            }
            r5.updateRememberedValue(rememberedValue7);
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue7, EmptyList.INSTANCE, null, r5, 48, 2);
        Object rememberedValue8 = r5.rememberedValue();
        BitcoinTransferScreen bitcoinTransferScreen3 = this.args;
        if (rememberedValue8 == obj2) {
            boolean z6 = bitcoinTransferScreen3.isBuy;
            BitcoinLimitsProvider bitcoinLimitsProvider = this.bitcoinLimitsProvider;
            rememberedValue8 = z6 ? bitcoinLimitsProvider.getBuyLimit() : bitcoinLimitsProvider.getSellLimit();
            r5.updateRememberedValue(rememberedValue8);
        }
        MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue8, null, null, r5, 48, 2);
        Object rememberedValue9 = r5.rememberedValue();
        if (rememberedValue9 == obj2) {
            rememberedValue9 = Updater.mutableStateOf$default(Boolean.FALSE);
            r5.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState12 = (MutableState) rememberedValue9;
        List listOf = CollectionsKt__CollectionsKt.listOf((CurrencyCode) collectAsState.getValue(), (CryptoBalance$BitcoinBalance) collectAsState2.getValue(), (CustomerLimitsManager.TransactionLimit) collectAsState6.getValue());
        boolean changedInstance = r5.changedInstance(this);
        Object rememberedValue10 = r5.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue10 == obj2) {
            rememberedValue10 = new AmountPickerCondensedView.AnonymousClass14(this, continuation, 20);
            r5.updateRememberedValue(rememberedValue10);
        }
        Updater.LaunchedEffect((Composer) r5, "transfer-requirement-handler", (Function2) rememberedValue10);
        Object rememberedValue11 = r5.rememberedValue();
        int i3 = 2;
        if (rememberedValue11 == obj2) {
            rememberedValue11 = new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState12, continuation, i3);
            r5.updateRememberedValue(rememberedValue11);
        }
        Updater.LaunchedEffect((Composer) r5, "time-out", (Function2) rememberedValue11);
        List list = listOf;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    r5.startReplaceGroup(2084868476);
                    if (((Boolean) mutableState12.getValue()).booleanValue()) {
                        r5.startReplaceGroup(2084888378);
                        boolean changedInstance2 = r5.changedInstance(this);
                        Object rememberedValue12 = r5.rememberedValue();
                        if (changedInstance2 || rememberedValue12 == obj2) {
                            rememberedValue12 = new MLKitTitleGenerator$1(this, continuation, 23);
                            r5.updateRememberedValue(rememberedValue12);
                        }
                        Updater.LaunchedEffect((Composer) r5, "timed-out", (Function2) rememberedValue12);
                        r5.end(false);
                    } else {
                        r5.startReplaceGroup(2084960453);
                        r5.end(false);
                    }
                    r5.end(false);
                    r5.end(false);
                    return BitcoinTransferViewModel.DefaultInitialModel.INSTANCE;
                }
            }
        }
        r5.startReplaceGroup(2085000133);
        r5.end(false);
        bitcoinTransferScreen3.getClass();
        RecurringSchedule.Frequency frequency2 = bitcoinTransferScreen3.frequency;
        boolean z7 = bitcoinTransferScreen3.isBuy;
        Object rememberedValue13 = r5.rememberedValue();
        if (rememberedValue13 == obj2) {
            rememberedValue13 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r5);
            r5.updateRememberedValue(rememberedValue13);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue13;
        Object rememberedValue14 = r5.rememberedValue();
        if (rememberedValue14 == obj2) {
            coroutineScope.getClass();
            LocalPosCheckInPresenter.MetroFactory metroFactory = this.bitcoinTransferTitleSubtitleProviderFactory.delegateFactory;
            coroutineContext = null;
            AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
            RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) metroFactory.permissionManager.invoke();
            RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) metroFactory.launcher.invoke();
            LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.store.invoke();
            androidStringManager.getClass();
            realCryptoBalanceRepo.getClass();
            realBitcoinCapabilityProvider.getClass();
            factory.getClass();
            rememberedValue14 = new BitcoinTransferTitleSubtitleProvider(androidStringManager, realCryptoBalanceRepo, realBitcoinCapabilityProvider, factory, coroutineScope, bitcoinTransferScreen3);
            bitcoinTransferScreen = bitcoinTransferScreen3;
            r5.updateRememberedValue(rememberedValue14);
        } else {
            coroutineContext = null;
            bitcoinTransferScreen = bitcoinTransferScreen3;
        }
        final BitcoinTransferTitleSubtitleProvider bitcoinTransferTitleSubtitleProvider = (BitcoinTransferTitleSubtitleProvider) rememberedValue14;
        Object rememberedValue15 = r5.rememberedValue();
        if (rememberedValue15 == obj2) {
            rememberedValue15 = Updater.mutableStateOf$default(coroutineContext);
            r5.updateRememberedValue(rememberedValue15);
        }
        MutableState mutableState13 = (MutableState) rememberedValue15;
        Object rememberedValue16 = r5.rememberedValue();
        if (rememberedValue16 == obj2) {
            rememberedValue16 = Recorder$$ExternalSyntheticOutline1.m(bitcoinTransferScreen.showKeypad, (GapComposer) r5);
        }
        MutableState mutableState14 = (MutableState) rememberedValue16;
        Object rememberedValue17 = r5.rememberedValue();
        if (rememberedValue17 == obj2) {
            mutableState = collectAsState6;
            rememberedValue17 = Updater.derivedStateOf(new ScoreSummaryKt$$ExternalSyntheticLambda1(mutableState13, mutableState14, 2));
            r5.updateRememberedValue(rememberedValue17);
        } else {
            mutableState = collectAsState6;
        }
        State state5 = (State) rememberedValue17;
        Object rememberedValue18 = r5.rememberedValue();
        if (rememberedValue18 == obj2) {
            rememberedValue18 = this.bitcoinFeatureAvailabilityProvider.isAutoInvestAvailable();
            r5.updateRememberedValue(rememberedValue18);
        }
        Boolean bool = Boolean.FALSE;
        MutableState mutableState15 = mutableState;
        boolean z8 = !bitcoinTransferScreen.hideChangeOrderType && (bitcoinTransferScreen.orderType instanceof BitcoinTransferScreen.OrderType.Standard) && ((Boolean) Updater.collectAsState((Flow) rememberedValue18, bool, null, r5, 48, 2).getValue()).booleanValue();
        boolean changed4 = r5.changed((CryptoBalance$BitcoinBalance) collectAsState2.getValue());
        Object rememberedValue19 = r5.rememberedValue();
        if (changed4 || rememberedValue19 == obj2) {
            CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) collectAsState2.getValue();
            if (cryptoBalance$BitcoinBalance != null) {
                BigDecimal valueOf = BigDecimal.valueOf(cryptoBalance$BitcoinBalance.amount.satoshi);
                valueOf.getClass();
                BigDecimal valueOf2 = BigDecimal.valueOf(100000000L);
                valueOf2.getClass();
                rememberedValue19 = valueOf.divide(valueOf2, MathContext.DECIMAL32);
            } else {
                rememberedValue19 = coroutineContext;
            }
            r5.updateRememberedValue(rememberedValue19);
        }
        BigDecimal bigDecimal = (BigDecimal) rememberedValue19;
        if (z7) {
            z = false;
            r5.startReplaceGroup(2086232197);
            r5.end(false);
        } else {
            r5.startReplaceGroup(2086176459);
            ShowErrorIfNoBitcoinOwned(bigDecimal, r5, i & 112);
            z = false;
            r5.end(false);
        }
        Object rememberedValue20 = r5.rememberedValue();
        if (rememberedValue20 == obj2) {
            if (frequency2 != null) {
                rememberedValue20 = this.bitcoinConfigRepo.minimumScheduledBitcoinBuyAmount;
                coroutineContext2 = coroutineContext;
            } else {
                coroutineContext2 = coroutineContext;
                rememberedValue20 = new AppLockMonitor$special$$inlined$map$2(coroutineContext2, 19);
            }
            r5.updateRememberedValue(rememberedValue20);
        } else {
            coroutineContext2 = coroutineContext;
        }
        CoroutineContext coroutineContext5 = coroutineContext2;
        final boolean z9 = z8;
        MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue20, null, null, r5, 48, 2);
        Object rememberedValue21 = r5.rememberedValue();
        if (rememberedValue21 == obj2) {
            rememberedValue21 = this.bitcoinExchangeRate;
            r5.updateRememberedValue(rememberedValue21);
        }
        MutableState collectAsState8 = Updater.collectAsState((Flow) rememberedValue21, null, null, r5, 48, 2);
        Object rememberedValue22 = r5.rememberedValue();
        if (rememberedValue22 == obj2) {
            rememberedValue22 = Updater.mutableStateOf$default(bool);
            r5.updateRememberedValue(rememberedValue22);
        }
        MutableState mutableState16 = (MutableState) rememberedValue22;
        EmptyList emptyList2 = EmptyList.INSTANCE;
        Money money = (Money) collectAsState7.getValue();
        Money money2 = (Money) collectAsState8.getValue();
        CurrencyCode currencyCode = (CurrencyCode) collectAsState.getValue();
        Boolean bool2 = (Boolean) mutableState16.getValue();
        bool2.getClass();
        Object[] objArr2 = {bigDecimal, money, money2, currencyCode, bool2};
        boolean changedInstance3 = r5.changedInstance(this) | r5.changed(bigDecimal) | r5.changed(collectAsState7) | r5.changed(collectAsState8) | r5.changed(collectAsState);
        Object rememberedValue23 = r5.rememberedValue();
        if (changedInstance3 || rememberedValue23 == obj2) {
            gapComposer = r5;
            frequency = frequency2;
            bitcoinTransferScreen2 = bitcoinTransferScreen;
            z2 = z5;
            objArr = objArr2;
            mutableState2 = collectAsState4;
            emptyList = emptyList2;
            state = state4;
            coroutineContext3 = coroutineContext5;
            ziplineLoader$load$2 = new ZiplineLoader$load$2((Object) this, bigDecimal, collectAsState7, collectAsState8, collectAsState, mutableState16, (Continuation) null, 14);
            mutableState3 = collectAsState7;
            mutableState4 = collectAsState;
            mutableState5 = mutableState16;
            gapComposer.updateRememberedValue(ziplineLoader$load$2);
        } else {
            mutableState3 = collectAsState7;
            ziplineLoader$load$2 = rememberedValue23;
            bitcoinTransferScreen2 = bitcoinTransferScreen;
            frequency = frequency2;
            z2 = z5;
            mutableState5 = mutableState16;
            objArr = objArr2;
            mutableState2 = collectAsState4;
            state = state4;
            mutableState4 = collectAsState;
            coroutineContext3 = coroutineContext5;
            emptyList = emptyList2;
            gapComposer = r5;
        }
        MutableState produceState = Updater.produceState(emptyList, objArr, (Function2) ziplineLoader$load$2, gapComposer);
        List list2 = (List) produceState.getValue();
        CurrencyCode currencyCode2 = (CurrencyCode) mutableState4.getValue();
        boolean changedInstance4 = gapComposer.changedInstance(this) | gapComposer.changed(produceState) | gapComposer.changed(mutableState4);
        Object rememberedValue24 = gapComposer.rememberedValue();
        if (changedInstance4 || rememberedValue24 == obj2) {
            zzmh zzmhVar = new zzmh(this, produceState, mutableState4, mutableState14, null, 23);
            mutableState6 = produceState;
            mutableState7 = mutableState14;
            gapComposer.updateRememberedValue(zzmhVar);
            rememberedValue24 = zzmhVar;
        } else {
            mutableState6 = produceState;
            mutableState7 = mutableState14;
        }
        Updater.LaunchedEffect(list2, currencyCode2, (Function2) rememberedValue24, gapComposer);
        CurrencyCode currencyCode3 = (CurrencyCode) mutableState4.getValue();
        currencyCode3.getClass();
        Money zero = Moneys.zero(currencyCode3);
        CustomerLimitsManager.TransactionLimit transactionLimit = (CustomerLimitsManager.TransactionLimit) mutableState15.getValue();
        CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance2 = (CryptoBalance$BitcoinBalance) collectAsState2.getValue();
        boolean changedInstance5 = gapComposer.changedInstance(this) | gapComposer.changed(mutableState15) | gapComposer.changed(collectAsState2) | gapComposer.changed(mutableState4);
        Object rememberedValue25 = gapComposer.rememberedValue();
        if (changedInstance5 || rememberedValue25 == obj2) {
            MutableState mutableState17 = mutableState4;
            MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1((Object) this, mutableState15, collectAsState2, mutableState17, (Continuation) null, 8);
            bitcoinTransferPresenter = this;
            mutableState8 = collectAsState2;
            mutableState9 = mutableState17;
            gapComposer.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
            rememberedValue25 = moleculeKt$immediateClockFlow$1$1$1;
        } else {
            mutableState9 = mutableState4;
            mutableState8 = collectAsState2;
            bitcoinTransferPresenter = this;
        }
        Function2 function2 = (Function2) rememberedValue25;
        GapComposer gapComposer3 = gapComposer;
        MutableState produceState2 = Updater.produceState(zero, transactionLimit, cryptoBalance$BitcoinBalance2, function2, gapComposer3, 512);
        Object rememberedValue26 = gapComposer3.rememberedValue();
        if (rememberedValue26 == obj2) {
            rememberedValue26 = bitcoinTransferTitleSubtitleProvider.title;
            gapComposer3.updateRememberedValue(rememberedValue26);
        }
        MutableState collectAsState9 = Updater.collectAsState((StateFlow) rememberedValue26, coroutineContext3, gapComposer3, 1);
        boolean changed5 = gapComposer3.changed((Money) produceState2.getValue()) | gapComposer3.changed(z9);
        Object rememberedValue27 = gapComposer3.rememberedValue();
        if (changed5 || rememberedValue27 == obj2) {
            final Money money3 = (Money) produceState2.getValue();
            bitcoinTransferTitleSubtitleProvider.getClass();
            money3.getClass();
            final AppLockMonitor$special$$inlined$map$2 isBTCxFlow = RealBitcoinCapabilityProvider.isBTCxFlow();
            rememberedValue27 = FlowKt.stateIn(new Flow() { // from class: com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation2) {
                    Object collect = AppLockMonitor$special$$inlined$map$2.this.collect(new BitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1(flowCollector, bitcoinTransferTitleSubtitleProvider, z9, money3), continuation2);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
                }
            }, bitcoinTransferTitleSubtitleProvider.scope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), coroutineContext3);
            gapComposer3.updateRememberedValue(rememberedValue27);
        }
        MutableState collectAsState10 = Updater.collectAsState((StateFlow) rememberedValue27, coroutineContext3, gapComposer3, 1);
        Object rememberedValue28 = gapComposer3.rememberedValue();
        if (rememberedValue28 == obj2) {
            rememberedValue28 = Updater.mutableStateOf$default(coroutineContext3);
            gapComposer3.updateRememberedValue(rememberedValue28);
        }
        MutableState mutableState18 = (MutableState) rememberedValue28;
        Object rememberedValue29 = gapComposer3.rememberedValue();
        if (rememberedValue29 == obj2) {
            rememberedValue29 = Updater.mutableStateOf$default(new BitcoinTransferViewEvent.AmountEntered("0", 0L));
            gapComposer3.updateRememberedValue(rememberedValue29);
        }
        MutableState mutableState19 = (MutableState) rememberedValue29;
        AmountSelection amountSelection = (AmountSelection) mutableState18.getValue();
        BitcoinTransferViewEvent.AmountEntered amountEntered = (BitcoinTransferViewEvent.AmountEntered) mutableState19.getValue();
        Boolean bool3 = (Boolean) state5.getValue();
        bool3.getClass();
        Object rememberedValue30 = gapComposer3.rememberedValue();
        if (rememberedValue30 == obj2) {
            ?? r20 = coroutineContext3;
            rememberedValue30 = new zzmh(state5, mutableState19, mutableState18, (Continuation) r20, 24);
            mutableState10 = mutableState18;
            state2 = state5;
            gapComposer3.updateRememberedValue(rememberedValue30);
            coroutineContext4 = r20;
        } else {
            coroutineContext4 = coroutineContext3;
            mutableState10 = mutableState18;
            state2 = state5;
        }
        MutableState produceState3 = Updater.produceState(bitcoinTransferPresenter.initialSavedState, amountSelection, amountEntered, bool3, (Function2) rememberedValue30, gapComposer3, 0);
        if (z7) {
            gapComposer2 = gapComposer3;
            bitcoinTransferPresenter2 = bitcoinTransferPresenter;
            gapComposer2.startReplaceGroup(2088982021);
            gapComposer2.end(false);
        } else {
            gapComposer3.startReplaceGroup(344478106);
            CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance3 = (CryptoBalance$BitcoinBalance) mutableState8.getValue();
            if (cryptoBalance$BitcoinBalance3 == null) {
                gapComposer3.startReplaceGroup(2088886695);
                z4 = false;
                gapComposer3.end(false);
                gapComposer2 = gapComposer3;
                bitcoinTransferPresenter2 = bitcoinTransferPresenter;
            } else {
                gapComposer3.startReplaceGroup(2088886696);
                List list3 = (List) mutableState6.getValue();
                CurrencyCode currencyCode4 = (CurrencyCode) mutableState9.getValue();
                currencyCode4.getClass();
                BitcoinTransferPresenter bitcoinTransferPresenter3 = bitcoinTransferPresenter;
                bitcoinTransferPresenter3.LaunchSellAllIfNeeded(list3, currencyCode4, (BitcoinTransferScreen.SavedState) produceState3.getValue(), cryptoBalance$BitcoinBalance3, gapComposer3, 4096 | ((i << 9) & 57344));
                bitcoinTransferPresenter2 = bitcoinTransferPresenter3;
                gapComposer2 = gapComposer3;
                z4 = false;
                gapComposer2.end(false);
            }
            gapComposer2.end(z4);
        }
        boolean changed6 = gapComposer2.changed((List) collectAsState5.getValue());
        Object rememberedValue31 = gapComposer2.rememberedValue();
        if (changed6 || rememberedValue31 == obj2) {
            mutableState11 = collectAsState5;
            final int i4 = 0;
            rememberedValue31 = Updater.derivedStateOf(new Function0(bitcoinTransferPresenter2) { // from class: com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter$$ExternalSyntheticLambda2
                public final /* synthetic */ BitcoinTransferPresenter f$0;

                {
                    this.f$0 = bitcoinTransferPresenter2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v6 */
                /* JADX WARN: Type inference failed for: r3v7 */
                /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Object obj3;
                    Instrument instrument;
                    int i5 = i4;
                    Instrument instrument2 = null;
                    MutableState mutableState20 = mutableState11;
                    BitcoinTransferPresenter bitcoinTransferPresenter4 = this.f$0;
                    switch (i5) {
                        case 0:
                            List list4 = (List) mutableState20.getValue();
                            BitcoinTransferScreen bitcoinTransferScreen4 = bitcoinTransferPresenter4.args;
                            List list5 = list4;
                            Iterator it2 = list5.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj3 = it2.next();
                                    Instrument instrument3 = (Instrument) obj3;
                                    if (instrument3.cashInstrumentType != CashInstrumentType.DEBIT_CARD || !instrument3.defaultForInstrumentType) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            Instrument instrument4 = (Instrument) obj3;
                            if (instrument4 == null) {
                                Iterator it3 = list5.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        instrument = it3.next();
                                        if (((Instrument) instrument).cashInstrumentType == CashInstrumentType.BANK_ACCOUNT) {
                                        }
                                    } else {
                                        instrument = 0;
                                    }
                                }
                                instrument4 = instrument;
                            }
                            if (bitcoinTransferScreen4.instrumentToken == null) {
                                return instrument4;
                            }
                            Iterator it4 = ((List) mutableState20.getValue()).iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    ?? next = it4.next();
                                    if (Intrinsics.areEqual(((Instrument) next).token, bitcoinTransferScreen4.instrumentToken)) {
                                        instrument2 = next;
                                    }
                                }
                            }
                            Instrument instrument5 = instrument2;
                            return instrument5 == null ? instrument4 : instrument5;
                        default:
                            if ((((AmountSelection) mutableState20.getValue()) instanceof AmountSelection.HasAmount) || (((AmountSelection) mutableState20.getValue()) instanceof AmountSelection.TradeCustomize)) {
                                return null;
                            }
                            BitcoinTransferScreen.SavedState savedState = bitcoinTransferPresenter4.args.savedState;
                            AmountSheetSavedState amountSheetSavedState = savedState != null ? savedState.uiState : null;
                            AmountSheetSavedState.AmountKeypadState amountKeypadState = amountSheetSavedState instanceof AmountSheetSavedState.AmountKeypadState ? (AmountSheetSavedState.AmountKeypadState) amountSheetSavedState : null;
                            if (amountKeypadState != null) {
                                return amountKeypadState.rawAmount;
                            }
                            return null;
                    }
                }
            });
            gapComposer2.updateRememberedValue(rememberedValue31);
        } else {
            mutableState11 = collectAsState5;
        }
        State state6 = (State) rememberedValue31;
        boolean changed7 = gapComposer2.changed((Money) state.getValue()) | gapComposer2.changed((BitcoinTransferViewEvent.AmountEntered) mutableState19.getValue()) | gapComposer2.changed((Instrument) state6.getValue()) | gapComposer2.changed(z2);
        Object rememberedValue32 = gapComposer2.rememberedValue();
        if (changed7 || rememberedValue32 == obj2) {
            state3 = state;
            derivedStateOf = Updater.derivedStateOf(new l2$$ExternalSyntheticLambda7(bitcoinTransferPresenter2, state3, mutableState19, state6, 17));
            gapComposer2.updateRememberedValue(derivedStateOf);
        } else {
            derivedStateOf = rememberedValue32;
            state3 = state;
        }
        State state7 = (State) derivedStateOf;
        Object rememberedValue33 = gapComposer2.rememberedValue();
        if (rememberedValue33 == obj2) {
            rememberedValue33 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
            gapComposer2.updateRememberedValue(rememberedValue33);
        }
        GapComposer gapComposer4 = gapComposer2;
        Updater.LaunchedEffect(gapComposer4, flow, new FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, (BitcoinTransferPresenter) this, (CoroutineScope) rememberedValue33, mutableState19, Updater.rememberUpdatedState(Boolean.valueOf(z9), gapComposer2), produceState3, mutableState7, mutableState13, mutableState5, mutableState10, state3, mutableState11, mutableState9, mutableState8, state6, collectAsState3, mutableState2));
        boolean changed8 = gapComposer4.changed((Money) mutableState3.getValue()) | gapComposer4.changed((BitcoinTransferViewEvent.AmountEntered) mutableState19.getValue());
        Object rememberedValue34 = gapComposer4.rememberedValue();
        if (changed8) {
            obj = obj2;
        } else {
            obj = obj2;
        }
        if (frequency != null) {
            Money money4 = (Money) mutableState3.getValue();
            ?? r8 = money4 != null ? money4.amount : coroutineContext4;
            if (r8 != null && ((BitcoinTransferViewEvent.AmountEntered) mutableState19.getValue()).amountCents < r8.longValue()) {
                z3 = true;
                rememberedValue34 = Boolean.valueOf(z3);
                gapComposer4.updateRememberedValue(rememberedValue34);
                boolean booleanValue2 = ((Boolean) rememberedValue34).booleanValue();
                changed = gapComposer4.changed((AmountSelection) mutableState10.getValue());
                rememberedValue = gapComposer4.rememberedValue();
                if (!changed || rememberedValue == obj) {
                    final int i5 = 1;
                    rememberedValue = Updater.derivedStateOf(new Function0(this) { // from class: com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter$$ExternalSyntheticLambda2
                        public final /* synthetic */ BitcoinTransferPresenter f$0;

                        {
                            this.f$0 = this;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r3v6 */
                        /* JADX WARN: Type inference failed for: r3v7 */
                        /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Object obj3;
                            Instrument instrument;
                            int i52 = i5;
                            Instrument instrument2 = null;
                            MutableState mutableState20 = mutableState10;
                            BitcoinTransferPresenter bitcoinTransferPresenter4 = this.f$0;
                            switch (i52) {
                                case 0:
                                    List list4 = (List) mutableState20.getValue();
                                    BitcoinTransferScreen bitcoinTransferScreen4 = bitcoinTransferPresenter4.args;
                                    List list5 = list4;
                                    Iterator it2 = list5.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj3 = it2.next();
                                            Instrument instrument3 = (Instrument) obj3;
                                            if (instrument3.cashInstrumentType != CashInstrumentType.DEBIT_CARD || !instrument3.defaultForInstrumentType) {
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                    }
                                    Instrument instrument4 = (Instrument) obj3;
                                    if (instrument4 == null) {
                                        Iterator it3 = list5.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                instrument = it3.next();
                                                if (((Instrument) instrument).cashInstrumentType == CashInstrumentType.BANK_ACCOUNT) {
                                                }
                                            } else {
                                                instrument = 0;
                                            }
                                        }
                                        instrument4 = instrument;
                                    }
                                    if (bitcoinTransferScreen4.instrumentToken == null) {
                                        return instrument4;
                                    }
                                    Iterator it4 = ((List) mutableState20.getValue()).iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            ?? next = it4.next();
                                            if (Intrinsics.areEqual(((Instrument) next).token, bitcoinTransferScreen4.instrumentToken)) {
                                                instrument2 = next;
                                            }
                                        }
                                    }
                                    Instrument instrument5 = instrument2;
                                    return instrument5 == null ? instrument4 : instrument5;
                                default:
                                    if ((((AmountSelection) mutableState20.getValue()) instanceof AmountSelection.HasAmount) || (((AmountSelection) mutableState20.getValue()) instanceof AmountSelection.TradeCustomize)) {
                                        return null;
                                    }
                                    BitcoinTransferScreen.SavedState savedState = bitcoinTransferPresenter4.args.savedState;
                                    AmountSheetSavedState amountSheetSavedState = savedState != null ? savedState.uiState : null;
                                    AmountSheetSavedState.AmountKeypadState amountKeypadState = amountSheetSavedState instanceof AmountSheetSavedState.AmountKeypadState ? (AmountSheetSavedState.AmountKeypadState) amountSheetSavedState : null;
                                    if (amountKeypadState != null) {
                                        return amountKeypadState.rawAmount;
                                    }
                                    return null;
                            }
                        }
                    });
                    gapComposer4.updateRememberedValue(rememberedValue);
                }
                State state8 = (State) rememberedValue;
                booleanValue = ((Boolean) state2.getValue()).booleanValue();
                InstrumentCellViewModel.Accessory.Push push = InstrumentCellViewModel.Accessory.Push.INSTANCE;
                AndroidStringManager androidStringManager2 = this.stringManager;
                if (booleanValue) {
                    String str = (String) collectAsState9.getValue();
                    BitcoinTransferViewModel.Content.Subtitle subtitle = (BitcoinTransferViewModel.Content.Subtitle) collectAsState10.getValue();
                    List list4 = (List) mutableState6.getValue();
                    String str2 = (String) state8.getValue();
                    Money money5 = (Money) produceState2.getValue();
                    String str3 = androidStringManager2.get(R.string.profile_transfer_bitcoin_button);
                    InstrumentCellViewModel instrumentCellViewModel = (InstrumentCellViewModel) state7.getValue();
                    InstrumentCellViewModel instrumentCellViewModel2 = (InstrumentCellViewModel) state7.getValue();
                    bottomSheetContent = new BitcoinTransferViewModel.Content.BottomSheetContent(str, subtitle, z9, list4, str2, money5, str3, false, booleanValue2, instrumentCellViewModel, Intrinsics.areEqual(instrumentCellViewModel2 != null ? instrumentCellViewModel2.accessory : coroutineContext4, push));
                } else {
                    if (mutableState13.getValue() != null) {
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    }
                    String str4 = (String) collectAsState9.getValue();
                    BitcoinTransferViewModel.Content.Subtitle subtitle2 = (BitcoinTransferViewModel.Content.Subtitle) collectAsState10.getValue();
                    String str5 = (String) state8.getValue();
                    Money money6 = (Money) produceState2.getValue();
                    String str6 = androidStringManager2.get(R.string.profile_transfer_bitcoin_button);
                    BitcoinTransferViewModel.Content.FullScreenContent.NavigationIconType navigationIconType = bitcoinTransferScreen2.useBackNavigationIcon ? BitcoinTransferViewModel.Content.FullScreenContent.NavigationIconType.BACK : BitcoinTransferViewModel.Content.FullScreenContent.NavigationIconType.CLOSE;
                    InstrumentCellViewModel instrumentCellViewModel3 = (InstrumentCellViewModel) state7.getValue();
                    InstrumentCellViewModel instrumentCellViewModel4 = (InstrumentCellViewModel) state7.getValue();
                    bottomSheetContent = new BitcoinTransferViewModel.Content.FullScreenContent(str4, subtitle2, z9, str5, money6, str6, false, booleanValue2, navigationIconType, instrumentCellViewModel3, Intrinsics.areEqual(instrumentCellViewModel4 != null ? instrumentCellViewModel4.accessory : coroutineContext4, push));
                }
                gapComposer4.end(false);
                return bottomSheetContent;
            }
        }
        z3 = false;
        rememberedValue34 = Boolean.valueOf(z3);
        gapComposer4.updateRememberedValue(rememberedValue34);
        boolean booleanValue22 = ((Boolean) rememberedValue34).booleanValue();
        changed = gapComposer4.changed((AmountSelection) mutableState10.getValue());
        rememberedValue = gapComposer4.rememberedValue();
        if (!changed) {
        }
        final int i52 = 1;
        rememberedValue = Updater.derivedStateOf(new Function0(this) { // from class: com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter$$ExternalSyntheticLambda2
            public final /* synthetic */ BitcoinTransferPresenter f$0;

            {
                this.f$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r3v7 */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj3;
                Instrument instrument;
                int i522 = i52;
                Instrument instrument2 = null;
                MutableState mutableState20 = mutableState10;
                BitcoinTransferPresenter bitcoinTransferPresenter4 = this.f$0;
                switch (i522) {
                    case 0:
                        List list42 = (List) mutableState20.getValue();
                        BitcoinTransferScreen bitcoinTransferScreen4 = bitcoinTransferPresenter4.args;
                        List list5 = list42;
                        Iterator it2 = list5.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                Instrument instrument3 = (Instrument) obj3;
                                if (instrument3.cashInstrumentType != CashInstrumentType.DEBIT_CARD || !instrument3.defaultForInstrumentType) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        Instrument instrument4 = (Instrument) obj3;
                        if (instrument4 == null) {
                            Iterator it3 = list5.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    instrument = it3.next();
                                    if (((Instrument) instrument).cashInstrumentType == CashInstrumentType.BANK_ACCOUNT) {
                                    }
                                } else {
                                    instrument = 0;
                                }
                            }
                            instrument4 = instrument;
                        }
                        if (bitcoinTransferScreen4.instrumentToken == null) {
                            return instrument4;
                        }
                        Iterator it4 = ((List) mutableState20.getValue()).iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                ?? next = it4.next();
                                if (Intrinsics.areEqual(((Instrument) next).token, bitcoinTransferScreen4.instrumentToken)) {
                                    instrument2 = next;
                                }
                            }
                        }
                        Instrument instrument5 = instrument2;
                        return instrument5 == null ? instrument4 : instrument5;
                    default:
                        if ((((AmountSelection) mutableState20.getValue()) instanceof AmountSelection.HasAmount) || (((AmountSelection) mutableState20.getValue()) instanceof AmountSelection.TradeCustomize)) {
                            return null;
                        }
                        BitcoinTransferScreen.SavedState savedState = bitcoinTransferPresenter4.args.savedState;
                        AmountSheetSavedState amountSheetSavedState = savedState != null ? savedState.uiState : null;
                        AmountSheetSavedState.AmountKeypadState amountKeypadState = amountSheetSavedState instanceof AmountSheetSavedState.AmountKeypadState ? (AmountSheetSavedState.AmountKeypadState) amountSheetSavedState : null;
                        if (amountKeypadState != null) {
                            return amountKeypadState.rawAmount;
                        }
                        return null;
                }
            }
        });
        gapComposer4.updateRememberedValue(rememberedValue);
        State state82 = (State) rememberedValue;
        booleanValue = ((Boolean) state2.getValue()).booleanValue();
        InstrumentCellViewModel.Accessory.Push push2 = InstrumentCellViewModel.Accessory.Push.INSTANCE;
        AndroidStringManager androidStringManager22 = this.stringManager;
        if (booleanValue) {
        }
        gapComposer4.end(false);
        return bottomSheetContent;
    }
}
