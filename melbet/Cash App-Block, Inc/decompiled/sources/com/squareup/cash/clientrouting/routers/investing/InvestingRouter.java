package com.squareup.cash.clientrouting.routers.investing;

import androidx.emoji2.text.MetadataRepo;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.cdf.stock.ScreenSource;
import com.squareup.cash.cdf.stock.StockViewViewStockDetails;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealClientRouteRouter$route$1;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.featureflags.AmplitudeExperiments$FpBitcoinGrowToolsManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.investing.presenters.navigation.RealInvestingInboundNavigator$Factory$Impl;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.savings.screens.GeneralSavingsScreen;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InvestingRouter {
    public final IssuedCardManager cardManager;
    public final CashAccountDatabaseImpl database;
    public final FeatureFlagManager featureFlagManager;
    public final FlowStarter flowStarter;
    public final MetadataRepo inboundNavigator;
    public final CoroutineContext ioDispatcher;
    public final Navigator navigator;

    public InvestingRouter(Navigator navigator, CoroutineContext coroutineContext, CashAccountDatabaseImpl cashAccountDatabaseImpl, FlowStarter flowStarter, IssuedCardManager issuedCardManager, RealInvestingInboundNavigator$Factory$Impl realInvestingInboundNavigator$Factory$Impl, FeatureFlagManager featureFlagManager) {
        navigator.getClass();
        this.navigator = navigator;
        this.ioDispatcher = coroutineContext;
        this.database = cashAccountDatabaseImpl;
        this.flowStarter = flowStarter;
        this.cardManager = issuedCardManager;
        this.featureFlagManager = featureFlagManager;
        this.inboundNavigator = realInvestingInboundNavigator$Factory$Impl.create$1(navigator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewEquity viewEquity, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        InvestingRouter$route$1 investingRouter$route$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof InvestingRouter$route$1) {
            investingRouter$route$1 = (InvestingRouter$route$1) continuationImpl;
            int i2 = investingRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                investingRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = investingRouter$route$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = investingRouter$route$1.label;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAppConfigManager$update$2$2 realAppConfigManager$update$2$2 = new RealAppConfigManager$update$2$2(this, viewEquity, objArr == true ? 1 : 0, 6);
                    investingRouter$route$1.L$0 = viewEquity;
                    investingRouter$route$1.L$1 = routingParams;
                    investingRouter$route$1.label = 1;
                    obj = JobKt.withContext(this.ioDispatcher, realAppConfigManager$update$2$2, investingRouter$route$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    routingParams = investingRouter$route$1.L$1;
                    viewEquity = investingRouter$route$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                Navigator navigator = this.navigator;
                if (booleanValue) {
                    navigator.goTo(new InvestingScreens.InvestingHome(null, null, 62, false));
                } else {
                    AnalyticsParams analyticsParams = routingParams.analyticsParams;
                    navigator.goTo(new InvestingScreens.StockDetails(null, new InvestmentEntityToken(viewEquity.entityToken), StockViewViewStockDetails.InvestingScreenOrigin.CLIENT_ROUTE, new InvestingScreens.StockDetails.Origin.Tradable(false), analyticsParams instanceof AnalyticsParams.GlobalSearchAnalyticsParams ? ((AnalyticsParams.GlobalSearchAnalyticsParams) analyticsParams).searchToken : null, false, 33));
                }
                return Unit.INSTANCE;
            }
        }
        investingRouter$route$1 = new InvestingRouter$route$1(this, continuationImpl);
        Object obj2 = investingRouter$route$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = investingRouter$route$1.label;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        Navigator navigator2 = this.navigator;
        if (booleanValue) {
        }
        return Unit.INSTANCE;
    }

    public final void route(ClientRoute.InvestingFlow investingFlow, RoutingParams routingParams) {
        investingFlow.getClass();
        routingParams.getClass();
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = new InvestingScreens.InvestingHome(null, null, 63, false);
        }
        Screen screen2 = screen;
        BlockersData startTransferFlow$default = FlowStarter.startTransferFlow$default(this.flowStarter, screen2, null, 6);
        String str = investingFlow.initiationData;
        BlockersScreens.StartFlowEntryPoint.Route route = BlockersScreens.StartFlowEntryPoint.Route.FRANKLIN;
        this.navigator.goTo(new BlockersScreens.StartFlowEntryPointScreen(startTransferFlow$default, str, screen2, (BlockersScreens.StartFlowEntryPointScreen.Origin) null, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(RoutingParams routingParams, ContinuationImpl continuationImpl) {
        InvestingRouter$route$2 investingRouter$route$2;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof InvestingRouter$route$2) {
            investingRouter$route$2 = (InvestingRouter$route$2) continuationImpl;
            int i2 = investingRouter$route$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                investingRouter$route$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = investingRouter$route$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = investingRouter$route$2.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardModelView.AnonymousClass1.C00581 c00581 = new CardModelView.AnonymousClass1.C00581(this, continuation, 22);
                    investingRouter$route$2.L$1 = routingParams;
                    investingRouter$route$2.label = 1;
                    obj = JobKt.withContext(this.ioDispatcher, c00581, investingRouter$route$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    routingParams = investingRouter$route$2.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                Navigator navigator = this.navigator;
                if (!booleanValue) {
                    Flow$Type flow$Type = Flow$Type.ROUND_UP_ONBOARDING;
                    Screen screen = routingParams.exitScreen;
                    if (screen == null && (screen = routingParams.origin) == null) {
                        screen = new WalletHomeScreen(7, (Integer) null, (String) null);
                    }
                    navigator.goTo(FlowStarter.startPlasmaFlow$default(this.flowStarter, flow$Type, screen, null, null, 12));
                } else {
                    navigator.goTo(new WalletHomeScreen(7, (Integer) null, (String) null));
                }
                return Unit.INSTANCE;
            }
        }
        investingRouter$route$2 = new InvestingRouter$route$2(this, continuationImpl);
        Object obj2 = investingRouter$route$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = investingRouter$route$2.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        Navigator navigator2 = this.navigator;
        if (!booleanValue) {
        }
        return Unit.INSTANCE;
    }

    public final void route(ClientRoute.ViewEquities viewEquities) {
        viewEquities.getClass();
        this.navigator.goTo(new InvestingScreens.InvestingHome(null, null, 62, false));
    }

    public final void route(ClientRoute.ViewInvesting viewInvesting) {
        viewInvesting.getClass();
        this.navigator.goTo(new InvestingScreens.InvestingHome(null, null, 63, false));
    }

    public final void route(ClientRoute.ViewInvestingCategory viewInvestingCategory) {
        viewInvestingCategory.getClass();
        this.navigator.goTo(new InvestingScreens.CategoryDetailScreen(new CategoryToken(viewInvestingCategory.categoryToken)));
    }

    public final void route(ClientRoute.ViewInvestingRoundups viewInvestingRoundups, RoutingParams routingParams) {
        GrowToolsManagerScreen.Origin origin;
        viewInvestingRoundups.getClass();
        routingParams.getClass();
        boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$FpBitcoinGrowToolsManager.INSTANCE)).enabled();
        Screen screen = routingParams.origin;
        if (screen instanceof GeneralSavingsScreen) {
            origin = GrowToolsManagerScreen.Origin.SAVINGS;
        } else if (screen instanceof WalletHomeScreen) {
            origin = GrowToolsManagerScreen.Origin.CARD;
        } else if (screen instanceof BitcoinHome) {
            origin = enabled ? GrowToolsManagerScreen.Origin.BITCOIN : GrowToolsManagerScreen.Origin.UNSPECIFIED;
        } else {
            origin = GrowToolsManagerScreen.Origin.UNSPECIFIED;
        }
        this.navigator.goTo(new GrowToolsManagerScreen.ManageRoundUpsScreen(origin));
    }

    public final Object route(RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object showDripSetting = this.inboundNavigator.showDripSetting(ScreenSource.ACTIVITY, realClientRouteRouter$route$1);
        return showDripSetting == CoroutineSingletons.COROUTINE_SUSPENDED ? showDripSetting : Unit.INSTANCE;
    }
}
