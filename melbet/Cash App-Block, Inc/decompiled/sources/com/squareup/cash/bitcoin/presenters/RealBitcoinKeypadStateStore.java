package com.squareup.cash.bitcoin.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.presenters.limits.util.BitcoinLimitsProvider;
import com.squareup.cash.bitcoin.viewmodels.keypad.BitcoinKeypadEvent;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.balance.RealRestrictedBalanceStore;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatus;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatusRepo;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.util.money.RealCurrencyConverter;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public final class RealBitcoinKeypadStateStore {
    public static BitcoinDisplayUnits lastBitcoinDisplayUnits;
    public static CurrencyCode lastCurrency;
    public static Money lastValuePerBitcoin;
    public final AndroidAccessibilityManager accessibilityManager;
    public final Analytics analytics;
    public final Flow availableBalance;
    public final DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 bitcoinDisplayUnits;
    public final Flow hasRestrictions;
    public final Flow idvStatus;
    public final Flow lightningWeeklyDepositLimitUsd;
    public final Flow minimumWithdrawalLimit;
    public final FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 mostRecentValuePerBitcoin;
    public final Navigator navigator;
    public final RealProfileManager profileManager;
    public final Flow restrictedBalanceUsd;
    public final AndroidStringManager stringManager;
    public final Flow valuePerBitcoin;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurrencyCode.values().length];
            try {
                iArr[CurrencyCode.BTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BitcoinKeypadEvent.UpdateRateStrategy.RateStrategy.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BitcoinKeypadEvent.UpdateRateStrategy.RateStrategy rateStrategy = BitcoinKeypadEvent.UpdateRateStrategy.RateStrategy.POLL;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                BitcoinKeypadEvent.UpdateRateStrategy.RateStrategy rateStrategy2 = BitcoinKeypadEvent.UpdateRateStrategy.RateStrategy.POLL;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[CryptoIdvStatus.values().length];
            try {
                iArr3[2] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                CryptoIdvStatus cryptoIdvStatus = CryptoIdvStatus.NOT_VERIFIED;
                iArr3[0] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                CryptoIdvStatus cryptoIdvStatus2 = CryptoIdvStatus.NOT_VERIFIED;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                CryptoIdvStatus cryptoIdvStatus3 = CryptoIdvStatus.NOT_VERIFIED;
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public RealBitcoinKeypadStateStore(RealBitcoinFormatter realBitcoinFormatter, RealProfileManager realProfileManager, RealBitcoinProfileRepo realBitcoinProfileRepo, RealUuidGenerator realUuidGenerator, RealCryptoBalanceRepo realCryptoBalanceRepo, RealCryptoValueRepo realCryptoValueRepo, Analytics analytics, AndroidStringManager androidStringManager, AndroidAccessibilityManager androidAccessibilityManager, CryptoIdvStatusRepo cryptoIdvStatusRepo, CryptoFlowStarter cryptoFlowStarter, RealRestrictedBalanceStore realRestrictedBalanceStore, CurrencyConverter$Factory currencyConverter$Factory, BitcoinLimitsProvider bitcoinLimitsProvider, Navigator navigator) {
        this.profileManager = realProfileManager;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.accessibilityManager = androidAccessibilityManager;
        this.navigator = navigator;
        this.bitcoinDisplayUnits = ViewShowRenderingKt.displayUnitProto(realBitcoinProfileRepo);
        Flow distinctUntilChanged = FlowKt.distinctUntilChanged(realCryptoValueRepo.valuePerBitcoin(null));
        this.valuePerBitcoin = distinctUntilChanged;
        this.mostRecentValuePerBitcoin = FlowKt.take(distinctUntilChanged, 2);
        this.availableBalance = FlowKt.distinctUntilChanged(new CardModelView$cardHeat$$inlined$map$1(realCryptoBalanceRepo.getBitcoinBalance(), 7));
        this.minimumWithdrawalLimit = bitcoinLimitsProvider.getMinimumWithdrawalLimit();
        this.idvStatus = FlowKt.distinctUntilChanged(cryptoIdvStatusRepo.idvStatus());
        this.lightningWeeklyDepositLimitUsd = bitcoinLimitsProvider.getLightningWeeklyDepositLimitUsd();
        this.hasRestrictions = FlowKt.distinctUntilChanged(new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new RealGooglePayer$createWallet$$inlined$filter$1(realRestrictedBalanceStore.syncValueReader.getSingleValue(AndroidSyncValueSpecs.CrowRestrictionsData), 1), 25));
        this.restrictedBalanceUsd = FlowKt.distinctUntilChanged(realCryptoBalanceRepo.restrictedBitcoinBalance(((RealCurrencyConverter.Factory) currencyConverter$Factory).get(CurrencyCode.USD)));
    }

    public final BitcoinKeypadStateStore$State models(BitcoinKeypadStateStore$SharedState bitcoinKeypadStateStore$SharedState, MutableSharedFlow mutableSharedFlow, GapComposer gapComposer) {
        Continuation continuation;
        MutableState mutableState;
        Object[] objArr;
        GapComposer gapComposer2;
        bitcoinKeypadStateStore$SharedState.getClass();
        mutableSharedFlow.getClass();
        gapComposer.startReplaceGroup(1372862502);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(bitcoinKeypadStateStore$SharedState.getBitcoinKeypadState());
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState2 = (MutableState) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new MLKitTitleGenerator$prepareModel$1(this, mutableState2, null, 23);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, "initialAmount", (Function2) rememberedValue2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            int ordinal = ((BitcoinKeypadStateStore$State) mutableState2.getValue()).rateStrategy.ordinal();
            if (ordinal == 0) {
                rememberedValue3 = EmptyFlow.INSTANCE;
            } else if (ordinal == 1) {
                rememberedValue3 = this.valuePerBitcoin;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                rememberedValue3 = this.mostRecentValuePerBitcoin;
            }
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Flow flow = (Flow) rememberedValue3;
        Money money = lastValuePerBitcoin;
        if (money == null) {
            money = new Money((Long) 0L, CurrencyCode.USD, 4);
        }
        MutableState collectAsState = Updater.collectAsState(flow, money, null, gapComposer, 0, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = this.bitcoinDisplayUnits;
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Flow flow2 = (Flow) rememberedValue4;
        BitcoinDisplayUnits bitcoinDisplayUnits = lastBitcoinDisplayUnits;
        if (bitcoinDisplayUnits == null) {
            bitcoinDisplayUnits = BitcoinDisplayUnits.BITCOIN;
        }
        MutableState collectAsState2 = Updater.collectAsState(flow2, bitcoinDisplayUnits, null, gapComposer, 0, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = this.availableBalance;
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue5, new Money((Long) 0L, CurrencyCode.BTC, 4), null, gapComposer, 0, 2);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = this.hasRestrictions;
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue6, Boolean.FALSE, null, gapComposer, 48, 2);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = this.restrictedBalanceUsd;
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue7, new Money((Long) 0L, CurrencyCode.USD, 4), null, gapComposer, 0, 2);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = this.minimumWithdrawalLimit;
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue8, 0L, null, gapComposer, 48, 2);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = this.idvStatus;
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue9, null, null, gapComposer, 48, 2);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == neverEqualPolicy) {
            rememberedValue10 = this.lightningWeeklyDepositLimitUsd;
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        MutableState collectAsState8 = Updater.collectAsState((Flow) rememberedValue10, null, null, gapComposer, 48, 2);
        Money money2 = (Money) collectAsState.getValue();
        BitcoinDisplayUnits bitcoinDisplayUnits2 = (BitcoinDisplayUnits) collectAsState2.getValue();
        Money money3 = (Money) collectAsState3.getValue();
        Boolean bool = (Boolean) collectAsState4.getValue();
        bool.booleanValue();
        Object[] objArr2 = {money2, bitcoinDisplayUnits2, money3, bool, (Money) collectAsState5.getValue(), Long.valueOf(((Number) collectAsState6.getValue()).longValue()), (CryptoIdvStatus) collectAsState7.getValue(), (Money) collectAsState8.getValue()};
        boolean changed = gapComposer.changed(collectAsState2) | gapComposer.changed(collectAsState) | gapComposer.changed(collectAsState4) | gapComposer.changed(collectAsState5) | gapComposer.changed(collectAsState3) | gapComposer.changed(collectAsState6) | gapComposer.changed(collectAsState7) | gapComposer.changed(collectAsState8);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changed || rememberedValue11 == neverEqualPolicy) {
            continuation = null;
            mutableState = mutableState2;
            objArr = objArr2;
            gapComposer2 = gapComposer;
            RealBitcoinKeypadStateStore$models$2$1 realBitcoinKeypadStateStore$models$2$1 = new RealBitcoinKeypadStateStore$models$2$1(collectAsState2, collectAsState, mutableState, collectAsState4, collectAsState5, collectAsState3, collectAsState6, collectAsState7, collectAsState8, (Continuation) null);
            gapComposer2.updateRememberedValue(realBitcoinKeypadStateStore$models$2$1);
            rememberedValue11 = realBitcoinKeypadStateStore$models$2$1;
        } else {
            mutableState = mutableState2;
            gapComposer2 = gapComposer;
            objArr = objArr2;
            continuation = null;
        }
        Updater.LaunchedEffect(objArr, (Function2) rememberedValue11, gapComposer2);
        Continuation continuation2 = continuation;
        MutableState mutableState3 = mutableState;
        Updater.LaunchedEffect(gapComposer, mutableSharedFlow, new BenefitsHubPresenter$models$1$1(21, mutableState3, mutableSharedFlow, this, continuation2));
        BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State = (BitcoinKeypadStateStore$State) mutableState3.getValue();
        gapComposer.end(false);
        return bitcoinKeypadStateStore$State;
    }

    public final Money toMoney(String str, CurrencyCode currencyCode, BitcoinDisplayUnits bitcoinDisplayUnits) {
        Object failure;
        if (WhenMappings.$EnumSwitchMapping$0[currencyCode.ordinal()] != 1) {
            return Moneys.parseMoneyFromString$default(str, currencyCode);
        }
        bitcoinDisplayUnits.getClass();
        if (bitcoinDisplayUnits == BitcoinDisplayUnits.BITCOIN) {
            return Moneys.parseMoneyFromString$default(str, CurrencyCode.BTC);
        }
        try {
            Result.Companion companion = Result.Companion;
            failure = Long.valueOf((long) Double.parseDouble(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Long l = (Long) failure;
        return new Money(Long.valueOf(l != null ? l.longValue() : 0L), CurrencyCode.BTC, 4);
    }
}
