package com.squareup.cash.investing.presenters.custom.order;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$bitcoinTaxFormsViewModel$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.ordertype.InvestingOrderTypeSelectionViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.cache.Cache;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* loaded from: classes6.dex */
public final class InvestingOrderTypeSelectionPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final InvestingScreens.OrderTypeSelectionScreen args;
    public final CashAccountDatabaseImpl database;
    public final FeatureFlagManager featureFlagManager;
    public final RealInvestingAnalytics investingAnalytics;
    public final RealInvestmentEntities investmentEntities;
    public final CoroutineContext ioDispatcher;
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public InvestingOrderTypeSelectionPresenter(Cache cache, RealInvestmentEntities realInvestmentEntities, AndroidStringManager androidStringManager, Analytics analytics, RealInvestingAnalytics realInvestingAnalytics, IntentLauncher intentLauncher, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, FeatureFlagManager featureFlagManager, InvestingScreens.OrderTypeSelectionScreen orderTypeSelectionScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        orderTypeSelectionScreen.getClass();
        this.investmentEntities = realInvestmentEntities;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.investingAnalytics = realInvestingAnalytics;
        this.launcher = intentLauncher;
        this.database = cashAccountDatabaseImpl;
        this.ioDispatcher = coroutineContext;
        this.featureFlagManager = featureFlagManager;
        this.args = orderTypeSelectionScreen;
        this.navigator = screenNavigator;
        cache.cache = null;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Flow take;
        RealCustomerStore$getCustomerForId$$inlined$map$1 realCustomerStore$getCustomerForId$$inlined$map$1;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1532096240);
        Updater.LaunchedEffect(gapComposer, flow, new InvestingHomeView$onScrollFlow$1(flow, (Continuation) null, this, 18));
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            InvestingScreens.OrderTypeSelectionScreen orderTypeSelectionScreen = this.args;
            InvestingScreens.OrderTypeSelectionScreen.Type type2 = orderTypeSelectionScreen.f1159type;
            if (type2 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin) {
                take = new AppLockMonitor$special$$inlined$map$2(null, 19);
            } else {
                if (!(type2 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                take = FlowKt.take(new InviteContactsPresenter$filterContacts$$inlined$map$1(this.investmentEntities.stockDetails(((InvestingScreens.OrderTypeSelectionScreen.Type.Equity) type2).entityToken), 9), 1);
            }
            FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(DBUtil.toFlow(this.database.investingSettingsQueries.select$2()), this.ioDispatcher);
            InvestingScreens.OrderTypeSelectionScreen.Type type3 = orderTypeSelectionScreen.f1159type;
            if (type3 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin) {
                realCustomerStore$getCustomerForId$$inlined$map$1 = new RealCustomerStore$getCustomerForId$$inlined$map$1(mapToOneOrNull, 17);
            } else {
                if (!(type3 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                realCustomerStore$getCustomerForId$$inlined$map$1 = new RealCustomerStore$getCustomerForId$$inlined$map$1(mapToOneOrNull, 18);
            }
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(take, FlowKt.distinctUntilChanged(realCustomerStore$getCustomerForId$$inlined$map$1), new AccountDocumentsPresenter$bitcoinTaxFormsViewModel$1(this, null, 1), 0);
            gapComposer.updateRememberedValue(flowKt__ZipKt$combine$$inlined$unsafeFlow$1);
            rememberedValue = flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
        }
        InvestingOrderTypeSelectionViewModel investingOrderTypeSelectionViewModel = new InvestingOrderTypeSelectionViewModel(this.stringManager.get(R.string.order_type_selection_title), (List) Updater.collectAsState((Flow) rememberedValue, EmptyList.INSTANCE, null, gapComposer, 48, 2).getValue());
        gapComposer.end(false);
        return investingOrderTypeSelectionViewModel;
    }
}
