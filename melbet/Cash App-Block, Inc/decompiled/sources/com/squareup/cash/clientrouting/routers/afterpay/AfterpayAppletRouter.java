package com.squareup.cash.clientrouting.routers.afterpay;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzkp;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletHomeScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletPurchasesScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpaySearchScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.money.navigation.real.RealMoneyInboundNavigator$Factory$Impl;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.orderly.plasma.OmsViewApPaymentPlanRequirementParameters;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import com.squareup.scannerview.SizeMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class AfterpayAppletRouter {
    public final RealAfterpayAppletRepository afterpayAppletRepository;
    public final FlowStarter flowStarter;
    public final SizeMap moneyInboundNavigator;
    public final Navigator navigator;
    public final CoroutineScope scope;

    public AfterpayAppletRouter(Navigator navigator, RealMoneyInboundNavigator$Factory$Impl realMoneyInboundNavigator$Factory$Impl, RealAfterpayAppletRepository realAfterpayAppletRepository, RealUuidGenerator realUuidGenerator, FlowStarter flowStarter, CoroutineScope coroutineScope) {
        navigator.getClass();
        this.navigator = navigator;
        this.afterpayAppletRepository = realAfterpayAppletRepository;
        this.flowStarter = flowStarter;
        this.scope = coroutineScope;
        this.moneyInboundNavigator = new SizeMap(navigator);
    }

    public final String getReferrerTokenFromRoutingParamsAnalyticsOrCreate(RoutingParams routingParams) {
        if ((routingParams != null ? routingParams.deepLinkMetadata : null) != null) {
            return RealUuidGenerator.generate().toString();
        }
        if (!((routingParams != null ? routingParams.analyticsParams : null) instanceof AnalyticsParams.GenericAnalyticsParams)) {
            return null;
        }
        AnalyticsParams analyticsParams = routingParams.analyticsParams;
        analyticsParams.getClass();
        return ((AnalyticsParams.GenericAnalyticsParams) analyticsParams).referrerFlowToken;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void route(ClientRoute.ViewAfterpayMerchantSheet viewAfterpayMerchantSheet, RoutingParams routingParams) {
        viewAfterpayMerchantSheet.getClass();
        String referrerTokenFromRoutingParamsAnalyticsOrCreate = getReferrerTokenFromRoutingParamsAnalyticsOrCreate(routingParams);
        Object[] objArr = 0;
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams != null ? routingParams.deepLinkMetadata : null;
        Navigator navigator = this.navigator;
        if (deepLinkMetadata != null) {
            JobKt.launch$default(this.scope, null, null, new AfterpayAppletRouter$route$1(this, objArr == true ? 1 : 0, 0), 3);
            navigator.goTo(new MoneyTabScreen(null));
            navigator.goTo(new AfterpayAppletScreen$AfterpayAppletHomeScreen(referrerTokenFromRoutingParamsAnalyticsOrCreate == null ? "" : referrerTokenFromRoutingParamsAnalyticsOrCreate));
            AnalyticsParams analyticsParams = routingParams.analyticsParams;
            boolean z = analyticsParams instanceof AnalyticsParams.GenericAnalyticsParams;
            AnalyticsParams.GenericAnalyticsParams genericAnalyticsParams = z ? (AnalyticsParams.GenericAnalyticsParams) analyticsParams : null;
            String str = genericAnalyticsParams != null ? genericAnalyticsParams.fromScreen : null;
            AnalyticsParams.GenericAnalyticsParams genericAnalyticsParams2 = z ? (AnalyticsParams.GenericAnalyticsParams) analyticsParams : null;
            navigator.goTo(new AfterpayAppletScreen$AfterpaySearchScreen(referrerTokenFromRoutingParamsAnalyticsOrCreate, str, genericAnalyticsParams2 != null ? genericAnalyticsParams2.fromSection : null, null, null));
        }
        String str2 = (String) viewAfterpayMerchantSheet.parameters.get("merchant_token");
        if (str2 != null) {
            AnalyticsParams analyticsParams2 = routingParams != null ? routingParams.analyticsParams : null;
            AnalyticsParams.GenericAnalyticsParams genericAnalyticsParams3 = analyticsParams2 instanceof AnalyticsParams.GenericAnalyticsParams ? (AnalyticsParams.GenericAnalyticsParams) analyticsParams2 : null;
            String str3 = genericAnalyticsParams3 != null ? genericAnalyticsParams3.fromScreen : null;
            AnalyticsParams analyticsParams3 = routingParams != null ? routingParams.analyticsParams : null;
            AnalyticsParams.GenericAnalyticsParams genericAnalyticsParams4 = analyticsParams3 instanceof AnalyticsParams.GenericAnalyticsParams ? (AnalyticsParams.GenericAnalyticsParams) analyticsParams3 : null;
            navigator.goTo(new AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen(referrerTokenFromRoutingParamsAnalyticsOrCreate, str3, genericAnalyticsParams4 != null ? genericAnalyticsParams4.fromSection : null, str2));
        }
    }

    public final void route(ClientRoute.ViewAfterpayAppletHome viewAfterpayAppletHome, RoutingParams routingParams) {
        viewAfterpayAppletHome.getClass();
        String referrerTokenFromRoutingParamsAnalyticsOrCreate = getReferrerTokenFromRoutingParamsAnalyticsOrCreate(routingParams);
        Navigator navigator = this.navigator;
        if (referrerTokenFromRoutingParamsAnalyticsOrCreate != null) {
            navigator.goTo(new AfterpayAppletScreen$AfterpayAppletHomeScreen(referrerTokenFromRoutingParamsAnalyticsOrCreate));
            return;
        }
        if (!((routingParams != null ? routingParams.origin : null) instanceof WalletHomeScreen)) {
            ((Navigator) this.moneyInboundNavigator.mRatios).goTo(new MoneyTabScreen(null));
        }
        navigator.goTo(new AfterpayAppletScreen$AfterpayAppletHomeScreen(re$$ExternalSyntheticOutline0.m()));
    }

    public final void route(ClientRoute.ViewAfterpayAppletPurchases viewAfterpayAppletPurchases) {
        viewAfterpayAppletPurchases.getClass();
        this.navigator.goTo(AfterpayAppletScreen$AfterpayAppletPurchasesScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewAfterpayAppletOrder viewAfterpayAppletOrder, RoutingParams routingParams) {
        Screen screen;
        viewAfterpayAppletOrder.getClass();
        String referrerTokenFromRoutingParamsAnalyticsOrCreate = getReferrerTokenFromRoutingParamsAnalyticsOrCreate(routingParams);
        MoneyTabScreen moneyTabScreen = new MoneyTabScreen(null);
        Navigator navigator = this.navigator;
        navigator.goTo(moneyTabScreen);
        navigator.goTo(new AfterpayAppletScreen$AfterpayAppletHomeScreen(referrerTokenFromRoutingParamsAnalyticsOrCreate == null ? "" : referrerTokenFromRoutingParamsAnalyticsOrCreate));
        AfterpayAppletScreen$AfterpayAppletPurchasesScreen afterpayAppletScreen$AfterpayAppletPurchasesScreen = AfterpayAppletScreen$AfterpayAppletPurchasesScreen.INSTANCE;
        navigator.goTo(afterpayAppletScreen$AfterpayAppletPurchasesScreen);
        Screen screen2 = (routingParams == null || (screen = routingParams.exitScreen) == null) ? afterpayAppletScreen$AfterpayAppletPurchasesScreen : screen;
        ScenarioInitiatorType scenarioInitiatorType = routingParams != null ? zzkp.scenarioInitiatorType(routingParams) : null;
        navigator.goTo(FlowStarter.startPlasmaFlowWithParams$default(this.flowStarter, Flow$Type.VIEW_AP_PAYMENT_PLAN_FLOW, new OmsViewApPaymentPlanRequirementParameters(viewAfterpayAppletOrder.orderId, viewAfterpayAppletOrder.loanId, ByteString.EMPTY), screen2, scenarioInitiatorType, screen2, new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.MONEY_TAB, referrerTokenFromRoutingParamsAnalyticsOrCreate, BlockerFlowReferrerType.AFTERPAY_APPLET), null, 912));
    }

    public final void route(ClientRoute.ViewAfterpayAppletRetroOrderSelection viewAfterpayAppletRetroOrderSelection, RoutingParams routingParams) {
        viewAfterpayAppletRetroOrderSelection.getClass();
        String referrerTokenFromRoutingParamsAnalyticsOrCreate = getReferrerTokenFromRoutingParamsAnalyticsOrCreate(routingParams);
        Continuation continuation = null;
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams != null ? routingParams.deepLinkMetadata : null;
        Navigator navigator = this.navigator;
        if (deepLinkMetadata != null) {
            JobKt.launch$default(this.scope, null, null, new AfterpayAppletRouter$route$1(this, continuation, 1), 3);
            navigator.goTo(new MoneyTabScreen(null));
            navigator.goTo(new AfterpayAppletScreen$AfterpayAppletHomeScreen(referrerTokenFromRoutingParamsAnalyticsOrCreate == null ? "" : referrerTokenFromRoutingParamsAnalyticsOrCreate));
        }
        if (referrerTokenFromRoutingParamsAnalyticsOrCreate == null) {
            referrerTokenFromRoutingParamsAnalyticsOrCreate = "";
        }
        navigator.goTo(new AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen(referrerTokenFromRoutingParamsAnalyticsOrCreate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void route(ClientRoute.ViewAfterpayAppletSearch viewAfterpayAppletSearch, RoutingParams routingParams) {
        viewAfterpayAppletSearch.getClass();
        Map map = viewAfterpayAppletSearch.parameters;
        String str = (String) map.get("search_text");
        String str2 = (String) map.get("filter_tokens");
        String referrerTokenFromRoutingParamsAnalyticsOrCreate = getReferrerTokenFromRoutingParamsAnalyticsOrCreate(routingParams);
        Object[] objArr = 0;
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams != null ? routingParams.deepLinkMetadata : null;
        Navigator navigator = this.navigator;
        if (deepLinkMetadata != null) {
            JobKt.launch$default(this.scope, null, null, new AfterpayAppletRouter$route$1(this, objArr == true ? 1 : 0, 2), 3);
            navigator.goTo(new MoneyTabScreen(null));
            navigator.goTo(new AfterpayAppletScreen$AfterpayAppletHomeScreen(referrerTokenFromRoutingParamsAnalyticsOrCreate == null ? "" : referrerTokenFromRoutingParamsAnalyticsOrCreate));
        }
        AnalyticsParams analyticsParams = routingParams != null ? routingParams.analyticsParams : null;
        AnalyticsParams.GenericAnalyticsParams genericAnalyticsParams = analyticsParams instanceof AnalyticsParams.GenericAnalyticsParams ? (AnalyticsParams.GenericAnalyticsParams) analyticsParams : null;
        String str3 = genericAnalyticsParams != null ? genericAnalyticsParams.fromScreen : null;
        AnalyticsParams analyticsParams2 = routingParams != null ? routingParams.analyticsParams : null;
        AnalyticsParams.GenericAnalyticsParams genericAnalyticsParams2 = analyticsParams2 instanceof AnalyticsParams.GenericAnalyticsParams ? (AnalyticsParams.GenericAnalyticsParams) analyticsParams2 : null;
        navigator.goTo(new AfterpayAppletScreen$AfterpaySearchScreen(referrerTokenFromRoutingParamsAnalyticsOrCreate, str3, genericAnalyticsParams2 != null ? genericAnalyticsParams2.fromSection : null, str, str2));
    }
}
