package com.squareup.cash.investing.applets.presenters;

import com.squareup.cash.history.backend.real.RealInvestmentActivity;
import com.squareup.cash.investing.backend.real.RealHistoricalPriceTickRefresher;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphCalculator;
import com.squareup.cash.ui.MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class RealStocksAppletTilePriceMovementRepository implements StocksAppletTilePriceMovementRepository {
    public static final HistoricalRange STOCKS_RANGE = HistoricalRange.DAY;
    public final StateFlow activityLifecycleStates;
    public final Lazy appletTilePriceTickFormatter;
    public final RealInvestingGraphCalculator graphCalculator;
    public final RealHistoricalPriceTickRefresher historicalPriceTickRefresher;
    public final RealInvestmentActivity investmentActivity;
    public final RealInvestmentEntities investmentEntities;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final Provider activityLifecycleStates;
        public final AttestedKeyMetrics$MetroFactory appletTilePriceTickFormatter;
        public final Provider graphCalculator;
        public final Provider historicalPriceTickRefresher;
        public final Provider investmentActivity;
        public final Provider investmentEntities;

        public MetroFactory(AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory2, MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory) {
            this.appletTilePriceTickFormatter = attestedKeyMetrics$MetroFactory;
            this.graphCalculator = doubleCheck;
            this.historicalPriceTickRefresher = doubleCheck2;
            this.investmentActivity = walletUiFactory$MetroFactory;
            this.investmentEntities = walletUiFactory$MetroFactory2;
            this.activityLifecycleStates = mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Lazy lazy = (Lazy) this.appletTilePriceTickFormatter.invoke();
            RealInvestingGraphCalculator realInvestingGraphCalculator = (RealInvestingGraphCalculator) this.graphCalculator.invoke();
            RealHistoricalPriceTickRefresher realHistoricalPriceTickRefresher = (RealHistoricalPriceTickRefresher) this.historicalPriceTickRefresher.invoke();
            RealInvestmentActivity realInvestmentActivity = (RealInvestmentActivity) this.investmentActivity.invoke();
            RealInvestmentEntities realInvestmentEntities = (RealInvestmentEntities) this.investmentEntities.invoke();
            StateFlow stateFlow = (StateFlow) this.activityLifecycleStates.invoke();
            realInvestingGraphCalculator.getClass();
            realHistoricalPriceTickRefresher.getClass();
            realInvestmentActivity.getClass();
            realInvestmentEntities.getClass();
            stateFlow.getClass();
            return new RealStocksAppletTilePriceMovementRepository(lazy, realInvestingGraphCalculator, realHistoricalPriceTickRefresher, realInvestmentActivity, realInvestmentEntities, stateFlow);
        }
    }

    public RealStocksAppletTilePriceMovementRepository(Lazy lazy, RealInvestingGraphCalculator realInvestingGraphCalculator, RealHistoricalPriceTickRefresher realHistoricalPriceTickRefresher, RealInvestmentActivity realInvestmentActivity, RealInvestmentEntities realInvestmentEntities, StateFlow stateFlow) {
        this.appletTilePriceTickFormatter = lazy;
        this.graphCalculator = realInvestingGraphCalculator;
        this.historicalPriceTickRefresher = realHistoricalPriceTickRefresher;
        this.investmentActivity = realInvestmentActivity;
        this.investmentEntities = realInvestmentEntities;
        this.activityLifecycleStates = stateFlow;
    }
}
