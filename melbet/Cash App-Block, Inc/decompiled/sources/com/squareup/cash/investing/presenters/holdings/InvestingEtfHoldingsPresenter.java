package com.squareup.cash.investing.presenters.holdings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingsViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.protos.cash.marketdata.model.HoldingsDetails;
import com.squareup.protos.cash.marketdata.server.GetETFDetailsResponse;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.platform.AndroidPlatform;

/* loaded from: classes6.dex */
public final class InvestingEtfHoldingsPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final InvestingScreens.StockDetails args;
    public final RealInvestingMetrics investingMetrics;
    public final RealInvestmentEntities investmentEntities;
    public final StateFlow lifecycleState;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final DoubleCheck investingMetrics;
        public final Provider investmentEntities;
        public final Provider lifecycleState;
        public final LambdaProvider stringManager;

        public MetroFactory(WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory, DoubleCheck doubleCheck2) {
            this.investmentEntities = walletUiFactory$MetroFactory;
            this.investingMetrics = doubleCheck;
            this.stringManager = lambdaProvider;
            this.lifecycleState = mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
            this.analytics = doubleCheck2;
        }
    }

    public InvestingEtfHoldingsPresenter(RealInvestmentEntities realInvestmentEntities, RealInvestingMetrics realInvestingMetrics, AndroidStringManager androidStringManager, StateFlow stateFlow, Analytics analytics, InvestingScreens.StockDetails stockDetails, BetterNavigator.ScreenNavigator screenNavigator) {
        stockDetails.getClass();
        this.investmentEntities = realInvestmentEntities;
        this.investingMetrics = realInvestingMetrics;
        this.stringManager = androidStringManager;
        this.lifecycleState = stateFlow;
        this.analytics = analytics;
        this.args = stockDetails;
        this.navigator = screenNavigator;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final InvestingEtfHoldingsViewModel models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(2070905860);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj = rememberedValue;
        if (rememberedValue == neverEqualPolicy) {
            InviteContactsPresenter$filterContacts$$inlined$map$1 inviteContactsPresenter$filterContacts$$inlined$map$1 = new InviteContactsPresenter$filterContacts$$inlined$map$1(this.lifecycleState, 10);
            gapComposer.updateRememberedValue(inviteContactsPresenter$filterContacts$$inlined$map$1);
            obj = inviteContactsPresenter$filterContacts$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) obj, Boolean.TRUE, null, gapComposer, 48, 2);
        Boolean bool = (Boolean) collectAsState.getValue();
        bool.getClass();
        boolean changed = gapComposer.changed(collectAsState) | gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        boolean z = false;
        boolean z2 = false;
        Object obj2 = rememberedValue2;
        if (changed || rememberedValue2 == neverEqualPolicy) {
            GLThread$start$2 gLThread$start$2 = new GLThread$start$2((Object) this, (Object) collectAsState, (Continuation) (z ? 1 : 0), 24);
            gapComposer.updateRememberedValue(gLThread$start$2);
            obj2 = gLThread$start$2;
        }
        MutableState produceState = Updater.produceState(null, bool, (Function2) obj2, gapComposer, 6);
        if (((StockDetails) produceState.getValue()) == null) {
            gapComposer.end(false);
            return InvestingEtfHoldingsViewModel.Loading.INSTANCE;
        }
        StockDetails stockDetails = (StockDetails) produceState.getValue();
        stockDetails.getClass();
        InvestmentEntityType investmentEntityType = stockDetails.f1150type;
        InvestmentEntityType investmentEntityType2 = InvestmentEntityType.ETF;
        InvestingEtfHoldingsViewModel.Empty empty = InvestingEtfHoldingsViewModel.Empty.INSTANCE;
        if (investmentEntityType != investmentEntityType2) {
            gapComposer.end(false);
            return empty;
        }
        Object rememberedValue3 = gapComposer.rememberedValue();
        Object obj3 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy) {
            Flow eTFMetrics = this.investingMetrics.getETFMetrics(this.args.investmentEntityToken);
            gapComposer.updateRememberedValue(eTFMetrics);
            obj3 = eTFMetrics;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) obj3, null, null, gapComposer, 48, 2);
        Updater.LaunchedEffect(gapComposer, flow, new GLThread$start$2((Object) flow, (Continuation) (z2 ? 1 : 0), (MoleculePresenter) this, (Object) produceState, 23));
        if (((GetETFDetailsResponse) collectAsState2.getValue()) == null) {
            gapComposer.end(false);
            return empty;
        }
        GetETFDetailsResponse getETFDetailsResponse = (GetETFDetailsResponse) collectAsState2.getValue();
        HoldingsDetails holdingsDetails = getETFDetailsResponse != null ? getETFDetailsResponse.holdings_details : null;
        if (holdingsDetails == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        Integer num = holdingsDetails.num_holdings_display_on_equity_page;
        num.getClass();
        List take = CollectionsKt.take(holdingsDetails.holdings, num.intValue());
        if (take.isEmpty()) {
            gapComposer.end(false);
            return empty;
        }
        AndroidStringManager androidStringManager = this.stringManager;
        InvestingEtfHoldingsViewModel.Content content = new InvestingEtfHoldingsViewModel.Content(androidStringManager.get(R.string.investing_etf_holdings_module_title), androidStringManager.get(R.string.investing_etf_holdings_module_description), AndroidPlatform.Companion.toViewModel(take));
        gapComposer.end(false);
        return content;
    }
}
