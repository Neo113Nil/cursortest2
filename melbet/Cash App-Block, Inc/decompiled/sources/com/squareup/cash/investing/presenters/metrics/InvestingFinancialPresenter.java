package com.squareup.cash.investing.presenters.metrics;

import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.cache.Cache;

/* loaded from: classes6.dex */
public final class InvestingFinancialPresenter implements MoleculePresenter {
    public final ColorModel.Accented accentColor;
    public final Analytics analytics;
    public final InvestmentEntityToken entityToken;
    public final RealInvestingMetrics metrics;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Cache rangeSelectionCache;
    public final String stockTicker;
    public final AndroidStringManager stringManager;

    public InvestingFinancialPresenter(AndroidStringManager androidStringManager, RealInvestingMetrics realInvestingMetrics, Cache cache, Analytics analytics, LocalizedMoneyFormatter.Factory factory, ColorModel.Accented accented, BetterNavigator.ScreenNavigator screenNavigator, InvestmentEntityToken investmentEntityToken, String str) {
        investmentEntityToken.getClass();
        str.getClass();
        this.stringManager = androidStringManager;
        this.metrics = realInvestingMetrics;
        this.rangeSelectionCache = cache;
        this.analytics = analytics;
        this.accentColor = accented;
        this.navigator = screenNavigator;
        this.entityToken = investmentEntityToken;
        this.stockTicker = str;
        this.moneyFormatter = LocalizedMoneyFormatter.Factory.createAbbreviatedBalancedFractionDigits$default(factory);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v1 com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content, still in use, count: 3, list:
          (r9v1 com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content) from 0x00e8: MOVE (r27v1 com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content) = (r9v1 com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content)
          (r9v1 com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content) from 0x00e3: MOVE (r27v3 com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content) = (r9v1 com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content)
          (r9v1 com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content) from 0x00cd: MOVE (r27v5 com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content) = (r9v1 com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final com.nimbusds.jose.util.X509CertUtils models(kotlinx.coroutines.flow.Flow r25, androidx.compose.runtime.Composer r26, int r27) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.investing.presenters.metrics.InvestingFinancialPresenter.models(kotlinx.coroutines.flow.Flow, androidx.compose.runtime.Composer, int):com.nimbusds.jose.util.X509CertUtils");
    }
}
