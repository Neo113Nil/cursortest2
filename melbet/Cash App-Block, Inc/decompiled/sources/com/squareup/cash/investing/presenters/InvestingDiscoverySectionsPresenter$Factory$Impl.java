package com.squareup.cash.investing.presenters;

import androidx.compose.ui.node.NodeChain;
import app.cash.local.presenters.LocalCashBalancePresenter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.familyhub.backend.real.RealDependentPortfolioStore;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.backend.real.families.RealDependentInvestmentEntities;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.preferences.EnumPreference;
import dev.zacsweers.metro.Provider;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class InvestingDiscoverySectionsPresenter$Factory$Impl {
    public final NodeChain delegateFactory;

    public InvestingDiscoverySectionsPresenter$Factory$Impl(NodeChain nodeChain) {
        this.delegateFactory = nodeChain;
    }

    public final LocalCashBalancePresenter create(String str) {
        NodeChain nodeChain = this.delegateFactory;
        RealInvestmentEntities realInvestmentEntities = (RealInvestmentEntities) ((Provider) nodeChain.layoutNode).invoke();
        RealDependentInvestmentEntities realDependentInvestmentEntities = (RealDependentInvestmentEntities) ((Provider) nodeChain.sentinelHead).invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) nodeChain.innerCoordinator).invoke();
        CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) ((Provider) nodeChain.outerCoordinator).invoke();
        RealCategoryBackend realCategoryBackend = (RealCategoryBackend) ((Provider) nodeChain.tail).invoke();
        EnumPreference enumPreference = (EnumPreference) ((RealMessageSigner.MetroFactory) nodeChain.head).invoke();
        StockMetricFactory stockMetricFactory = (StockMetricFactory) ((Provider) nodeChain.current).invoke();
        RealDependentPortfolioStore realDependentPortfolioStore = (RealDependentPortfolioStore) ((Provider) nodeChain.buffer).invoke();
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((Provider) nodeChain.stack).invoke();
        CoroutineContext coroutineContext = (CoroutineContext) ((Provider) nodeChain.cachedDiffer).invoke();
        realInvestmentEntities.getClass();
        realDependentInvestmentEntities.getClass();
        androidStringManager.getClass();
        cashAccountDatabaseImpl.getClass();
        realCategoryBackend.getClass();
        stockMetricFactory.getClass();
        realDependentPortfolioStore.getClass();
        factory.getClass();
        coroutineContext.getClass();
        return new LocalCashBalancePresenter(realInvestmentEntities, realDependentInvestmentEntities, androidStringManager, cashAccountDatabaseImpl, realCategoryBackend, enumPreference, stockMetricFactory, realDependentPortfolioStore, factory, coroutineContext, str);
    }
}
