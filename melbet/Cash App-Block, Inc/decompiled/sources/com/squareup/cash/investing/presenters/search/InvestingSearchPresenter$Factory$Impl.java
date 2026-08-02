package com.squareup.cash.investing.presenters.search;

import androidx.compose.runtime.internal.RememberEventDispatcher;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.presenters.FilterConfigurationCacheMap;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.cache.Cache;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class InvestingSearchPresenter$Factory$Impl {
    public final RememberEventDispatcher delegateFactory;

    public InvestingSearchPresenter$Factory$Impl(RememberEventDispatcher rememberEventDispatcher) {
        this.delegateFactory = rememberEventDispatcher;
    }

    public final InvestingSearchPresenter create(CategoryToken categoryToken, BetterNavigator.ScreenNavigator screenNavigator, boolean z) {
        RememberEventDispatcher rememberEventDispatcher = this.delegateFactory;
        Cache cache = (Cache) ((Provider) rememberEventDispatcher.abandoning).invoke();
        FilterConfigurationCacheMap filterConfigurationCacheMap = (FilterConfigurationCacheMap) ((DoubleCheck) rememberEventDispatcher.traceContext).getValue();
        RealCategoryBackend realCategoryBackend = (RealCategoryBackend) ((Provider) rememberEventDispatcher.remembering).invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) rememberEventDispatcher.currentRememberingList).invoke();
        RealInvestingAnalytics realInvestingAnalytics = (RealInvestingAnalytics) ((Provider) rememberEventDispatcher.leaving).invoke();
        Analytics analytics = (Analytics) ((Provider) rememberEventDispatcher.sideEffects).invoke();
        RealInvestmentEntities realInvestmentEntities = (RealInvestmentEntities) ((Provider) rememberEventDispatcher.rememberSet).invoke();
        CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) ((Provider) rememberEventDispatcher.releasing).invoke();
        IntentLauncher intentLauncher = (IntentLauncher) ((Provider) rememberEventDispatcher.ignoreLeavingSet).invoke();
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((Provider) rememberEventDispatcher.pausedPlaceholders).invoke();
        CoroutineContext coroutineContext = (CoroutineContext) ((Provider) rememberEventDispatcher.nestedRemembersLists).invoke();
        cache.getClass();
        filterConfigurationCacheMap.getClass();
        realCategoryBackend.getClass();
        androidStringManager.getClass();
        realInvestingAnalytics.getClass();
        analytics.getClass();
        realInvestmentEntities.getClass();
        cashAccountDatabaseImpl.getClass();
        intentLauncher.getClass();
        factory.getClass();
        coroutineContext.getClass();
        return new InvestingSearchPresenter(cache, filterConfigurationCacheMap, realCategoryBackend, androidStringManager, realInvestingAnalytics, analytics, realInvestmentEntities, cashAccountDatabaseImpl, intentLauncher, factory, coroutineContext, categoryToken, screenNavigator, z);
    }
}
