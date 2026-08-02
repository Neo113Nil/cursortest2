package com.squareup.cash.bitcoin.applets.presenters.data;

import androidx.webkit.internal.WebViewGlueCommunicator;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.cdp.integration.CashCdpConfigProvider;
import app.cash.passcode.backend.RealAppLockState;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelProvider;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.capability.RealBitcoinActivityProvider;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.invitations.InviteContactsPresenter$includingEmail$$inlined$map$1;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$UptoDateData;
import com.squareup.cash.support.presenters.SupportHomePresenter$models$lambda$5$$inlined$map$1;
import com.squareup.cash.ui.MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import com.squareup.cash.util.money.RealCurrencyConverter;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes5.dex */
public final class RealBitcoinAppletTileRepository implements BitcoinAppletTileRepository {
    public final StateFlow activityLifecycleStates;
    public final ReadonlyStateFlow availabilityState;
    public final ReadonlyStateFlow bitcoinModel;
    public final ChannelFlowTransformLatest bitcoinValue;
    public final SupportHomePresenter$models$lambda$5$$inlined$map$1 convertedBitcoinBalance;
    public final ReadonlyStateFlow graphModels;
    public final MoneyFormatter moneyFormatter;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final Provider activityLifecycleStates;
        public final Provider bitcoinActivityProvider;
        public final Provider bitcoinGraphModelProvider;
        public final Provider cryptoBalanceRepo;
        public final CashCdpConfigProvider.MetroFactory cryptoValueRepo;
        public final Provider currencyConverterFactory;
        public final Provider familyProfileManager;
        public final Provider featureEligibilityRepository;
        public final Provider moneyFormatterFactory;
        public final InstanceFactory scope;

        public MetroFactory(RealAppLockState.MetroFactory metroFactory, RealAppMessageManager.MetroFactory metroFactory2, CashCdpConfigProvider.MetroFactory metroFactory3, DoubleCheck doubleCheck, RealMessageSigner.MetroFactory metroFactory4, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, Provider provider, MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory, InstanceFactory instanceFactory) {
            this.bitcoinActivityProvider = metroFactory;
            this.cryptoBalanceRepo = metroFactory2;
            this.cryptoValueRepo = metroFactory3;
            this.currencyConverterFactory = doubleCheck;
            this.moneyFormatterFactory = metroFactory4;
            this.bitcoinGraphModelProvider = doubleCheck2;
            this.featureEligibilityRepository = doubleCheck3;
            this.familyProfileManager = provider;
            this.activityLifecycleStates = mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
            this.scope = instanceFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            RealBitcoinActivityProvider realBitcoinActivityProvider = (RealBitcoinActivityProvider) this.bitcoinActivityProvider.invoke();
            RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) this.cryptoBalanceRepo.invoke();
            RealCryptoValueRepo realCryptoValueRepo = (RealCryptoValueRepo) this.cryptoValueRepo.invoke();
            CurrencyConverter$Factory currencyConverter$Factory = (CurrencyConverter$Factory) this.currencyConverterFactory.invoke();
            LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) this.moneyFormatterFactory.invoke();
            RealBitcoinGraphModelProvider realBitcoinGraphModelProvider = (RealBitcoinGraphModelProvider) this.bitcoinGraphModelProvider.invoke();
            RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) this.featureEligibilityRepository.invoke();
            RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) this.familyProfileManager.invoke();
            StateFlow stateFlow = (StateFlow) this.activityLifecycleStates.invoke();
            CoroutineScope coroutineScope = (CoroutineScope) this.scope.value;
            realBitcoinActivityProvider.getClass();
            realCryptoBalanceRepo.getClass();
            currencyConverter$Factory.getClass();
            factory.getClass();
            realBitcoinGraphModelProvider.getClass();
            realFeatureEligibilityRepository.getClass();
            realFamilyProfileManager.getClass();
            stateFlow.getClass();
            coroutineScope.getClass();
            return new RealBitcoinAppletTileRepository(realBitcoinActivityProvider, realCryptoBalanceRepo, realCryptoValueRepo, currencyConverter$Factory, factory, realBitcoinGraphModelProvider, realFeatureEligibilityRepository, realFamilyProfileManager, stateFlow, coroutineScope);
        }
    }

    public RealBitcoinAppletTileRepository(RealBitcoinActivityProvider realBitcoinActivityProvider, RealCryptoBalanceRepo realCryptoBalanceRepo, RealCryptoValueRepo realCryptoValueRepo, CurrencyConverter$Factory currencyConverter$Factory, LocalizedMoneyFormatter.Factory factory, RealBitcoinGraphModelProvider realBitcoinGraphModelProvider, RealFeatureEligibilityRepository realFeatureEligibilityRepository, RealFamilyProfileManager realFamilyProfileManager, StateFlow stateFlow, CoroutineScope coroutineScope) {
        this.activityLifecycleStates = stateFlow;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        CurrencyCode currencyCode = CurrencyCode.USD;
        this.convertedBitcoinBalance = new SupportHomePresenter$models$lambda$5$$inlined$map$1(WebViewGlueCommunicator.convert(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new CardModelView$cardHeat$$inlined$map$1(realCryptoBalanceRepo.getBitcoinBalance(), 5), 24), ((RealCurrencyConverter.Factory) currencyConverter$Factory).get(currencyCode)), 2);
        this.bitcoinValue = realCryptoValueRepo.valuePerBitcoin(currencyCode);
        this.graphModels = FlowKt.stateIn(new InviteContactsPresenter$includingEmail$$inlined$map$1(realBitcoinGraphModelProvider.bitcoinGraphModel(HistoricalRange.DAY), 1), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(), new InvestingGraphContentModel.Loading(new InvestingGraphContentModel$AccentColorType$UptoDateData(ColorModel.Bitcoin.INSTANCE), 15));
        Flow distinctUntilChanged = FlowKt.distinctUntilChanged(realBitcoinActivityProvider.hasBitcoinActivity());
        Continuation continuation = null;
        int i = 0;
        this.availabilityState = FlowKt.stateIn(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realFeatureEligibilityRepository.currentEligibleFeatures(), realFamilyProfileManager.familyProfile, new CardModelView.AnonymousClass1.AnonymousClass4(3, continuation, 4), i), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(), AppletAvailabilityState.LOADING);
        this.bitcoinModel = FlowKt.stateIn(FlowKt.transformLatest(distinctUntilChanged, new RealBitcoinAppletTileRepository$special$$inlined$flatMapLatest$1(continuation, this, i)), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(), null);
    }
}
