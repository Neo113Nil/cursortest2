package com.squareup.cash.bitcoin.presenters;

import app.cash.broadway.navigation.Navigator;
import app.cash.passcode.backend.RealAppLockState;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.presenters.limits.util.BitcoinLimitsProvider;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.balance.RealRestrictedBalanceStore;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatusRepo;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.pools.presenters.PoolDetailsPresenter$MetroFactory;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.money.CurrencyConverter$Factory;

/* loaded from: classes.dex */
public final class RealBitcoinKeypadStateStore$Factory$Impl {
    public final PoolDetailsPresenter$MetroFactory delegateFactory;

    public RealBitcoinKeypadStateStore$Factory$Impl(PoolDetailsPresenter$MetroFactory poolDetailsPresenter$MetroFactory) {
        this.delegateFactory = poolDetailsPresenter$MetroFactory;
    }

    public final RealBitcoinKeypadStateStore create$1(Navigator navigator) {
        PoolDetailsPresenter$MetroFactory poolDetailsPresenter$MetroFactory = this.delegateFactory;
        RealBitcoinFormatter realBitcoinFormatter = (RealBitcoinFormatter) poolDetailsPresenter$MetroFactory.moneyFormatterFactory.invoke();
        RealProfileManager realProfileManager = (RealProfileManager) poolDetailsPresenter$MetroFactory.poolsRepository.invoke();
        RealBitcoinProfileRepo realBitcoinProfileRepo = (RealBitcoinProfileRepo) poolDetailsPresenter$MetroFactory.launcher.invoke();
        RealUuidGenerator realUuidGenerator = (RealUuidGenerator) poolDetailsPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
        RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) poolDetailsPresenter$MetroFactory.defaultActivityItemEventHandlerFactory.invoke();
        RealCryptoValueRepo realCryptoValueRepo = (RealCryptoValueRepo) poolDetailsPresenter$MetroFactory.stringManager.invoke();
        Analytics analytics = (Analytics) poolDetailsPresenter$MetroFactory.sessionManager.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) poolDetailsPresenter$MetroFactory.dateFormatManager.invoke();
        AndroidAccessibilityManager androidAccessibilityManager = (AndroidAccessibilityManager) poolDetailsPresenter$MetroFactory.clock.invoke();
        CryptoIdvStatusRepo cryptoIdvStatusRepo = (CryptoIdvStatusRepo) ((RealAppLockState.MetroFactory) poolDetailsPresenter$MetroFactory.uuidGenerator).invoke();
        CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) poolDetailsPresenter$MetroFactory.blockersNavigator.invoke();
        RealRestrictedBalanceStore realRestrictedBalanceStore = (RealRestrictedBalanceStore) poolDetailsPresenter$MetroFactory.analytics.invoke();
        CurrencyConverter$Factory currencyConverter$Factory = (CurrencyConverter$Factory) poolDetailsPresenter$MetroFactory.featureFlagManager.invoke();
        BitcoinLimitsProvider bitcoinLimitsProvider = (BitcoinLimitsProvider) poolDetailsPresenter$MetroFactory.activitiesCacheManager.invoke();
        realBitcoinFormatter.getClass();
        realProfileManager.getClass();
        realBitcoinProfileRepo.getClass();
        realUuidGenerator.getClass();
        realCryptoBalanceRepo.getClass();
        realCryptoValueRepo.getClass();
        analytics.getClass();
        androidStringManager.getClass();
        androidAccessibilityManager.getClass();
        cryptoFlowStarter.getClass();
        realRestrictedBalanceStore.getClass();
        currencyConverter$Factory.getClass();
        bitcoinLimitsProvider.getClass();
        return new RealBitcoinKeypadStateStore(realBitcoinFormatter, realProfileManager, realBitcoinProfileRepo, realUuidGenerator, realCryptoBalanceRepo, realCryptoValueRepo, analytics, androidStringManager, androidAccessibilityManager, cryptoIdvStatusRepo, cryptoFlowStarter, realRestrictedBalanceStore, currencyConverter$Factory, bitcoinLimitsProvider, navigator);
    }
}
