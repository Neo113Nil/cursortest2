package com.squareup.cash.investingcrypto.presenters.news;

import app.cash.passcode.backend.AppLockMonitor;
import com.squareup.cash.cdf.stock.EquityType;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.capability.RealBitcoinActivityProvider;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class InvestingCryptoNewsPresenter$Factory$Impl {
    public final Profile.Adapter delegateFactory;

    public InvestingCryptoNewsPresenter$Factory$Impl(Profile.Adapter adapter) {
        this.delegateFactory = adapter;
    }

    public final MoneybotHomePresenter create(BetterNavigator.ScreenNavigator screenNavigator, NewsKind newsKind, EquityType equityType, boolean z) {
        newsKind.getClass();
        Profile.Adapter adapter = this.delegateFactory;
        CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) ((Provider) adapter.nearby_visibilityAdapter).invoke();
        AndroidClock androidClock = (AndroidClock) ((Provider) adapter.rate_planAdapter).invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) adapter.deposit_preferenceAdapter).invoke();
        RealInvestingSyncer realInvestingSyncer = (RealInvestingSyncer) ((AppLockMonitor.MetroFactory) adapter.country_codeAdapter).invoke();
        IntentLauncher intentLauncher = (IntentLauncher) ((Provider) adapter.default_currencyAdapter).invoke();
        Analytics analytics = (Analytics) ((Provider) adapter.incoming_request_policyAdapter).invoke();
        Flow flow = (Flow) ((InstanceFactory) adapter.regionAdapter).value;
        RealBitcoinActivityProvider realBitcoinActivityProvider = (RealBitcoinActivityProvider) ((Provider) adapter.bitcoin_display_unitsAdapter).invoke();
        CoroutineContext coroutineContext = (CoroutineContext) ((Provider) adapter.bitcoin_amount_entry_currency_preferenceAdapter).invoke();
        CoroutineContext coroutineContext2 = (CoroutineContext) ((Provider) adapter.addressAdapter).invoke();
        RealInvestingStateManager realInvestingStateManager = (RealInvestingStateManager) ((Provider) adapter.deposit_preference_dataAdapter).invoke();
        ErrorReporter errorReporter = (ErrorReporter) ((Provider) adapter.available_p2p_target_regionsAdapter).invoke();
        cashAccountDatabaseImpl.getClass();
        androidClock.getClass();
        androidStringManager.getClass();
        intentLauncher.getClass();
        analytics.getClass();
        flow.getClass();
        realBitcoinActivityProvider.getClass();
        coroutineContext.getClass();
        coroutineContext2.getClass();
        realInvestingStateManager.getClass();
        errorReporter.getClass();
        return new MoneybotHomePresenter(cashAccountDatabaseImpl, androidClock, androidStringManager, realInvestingSyncer, intentLauncher, analytics, flow, realBitcoinActivityProvider, coroutineContext, coroutineContext2, realInvestingStateManager, errorReporter, screenNavigator, newsKind, equityType, z);
    }
}
