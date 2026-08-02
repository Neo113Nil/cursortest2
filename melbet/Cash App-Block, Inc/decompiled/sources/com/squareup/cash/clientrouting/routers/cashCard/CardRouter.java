package com.squareup.cash.clientrouting.routers.cashCard;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import com.google.android.gms.internal.mlkit_vision_face.zzkp;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.fidesmo.screens.FidesmoDeprovisioningScreen;
import com.squareup.cash.fidesmo.screens.FidesmoProvisioningScreen;
import com.squareup.cash.intent.Source;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.wallet.presenters.FidesmoDeprovisionBlockerFactory;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class CardRouter {
    public final FlowStarter flowStarter;
    public final Navigator navigator;
    public final AndroidStringManager stringManager;

    public CardRouter(FlowStarter flowStarter, AndroidStringManager androidStringManager, Navigator navigator) {
        navigator.getClass();
        this.flowStarter = flowStarter;
        this.stringManager = androidStringManager;
        this.navigator = navigator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r14 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void route(ClientRoute.ViewActivateCashCard viewActivateCashCard, RoutingParams routingParams) {
        ScenarioInitiatorType scenarioInitiatorType;
        String str;
        viewActivateCashCard.getClass();
        routingParams.getClass();
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        if (deepLinkMetadata != null && (str = deepLinkMetadata.deepLinkSource) != null) {
            int ordinal = Source.valueOf(str).ordinal();
            if (ordinal == 0) {
                scenarioInitiatorType = ScenarioInitiatorType.IN_APP_SCANNER;
            } else {
                if (ordinal != 1 && ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                scenarioInitiatorType = ScenarioInitiatorType.EXTERNAL;
            }
        }
        scenarioInitiatorType = ScenarioInitiatorType.EXTERNAL;
        BlockersScreens.CardActivationScreen.CardActivationData.WithCode withCode = new BlockersScreens.CardActivationScreen.CardActivationData.WithCode(viewActivateCashCard.activationCode);
        RealFlowStarter realFlowStarter = (RealFlowStarter) this.flowStarter;
        scenarioInitiatorType.getClass();
        this.navigator.goTo(new BlockersScreens.CardActivationScreen(FlowStarter.startFlow$default(realFlowStarter, BlockersData.Flow.PROFILE_BLOCKERS, PaymentScreens$HomeScreens$Home.INSTANCE, null, ClientScenario.ACTIVATE_PHYSICAL_CARD, null, null, null, null, new StampsConfigQueries$$ExternalSyntheticLambda0(scenarioInitiatorType, 4), 500), withCode));
    }

    public final void route(ClientRoute.ViewCard viewCard) {
        viewCard.getClass();
        this.navigator.goTo(new WalletHomeScreen(7, (Integer) null, (String) null));
    }

    public final void route(ClientRoute.ViewCardNfc viewCardNfc) {
        viewCardNfc.getClass();
        this.navigator.goTo(new WalletHomeScreen(7, (Integer) null, (String) null));
    }

    public final void route(ClientRoute.ViewCashCardStylePicker viewCashCardStylePicker, RoutingParams routingParams) {
        viewCashCardStylePicker.getClass();
        routingParams.getClass();
        route(new ClientRoute.ViewRequestPhysicalCashCard(ClientRoute.ViewRequestPhysicalCashCard.spec, ClientRoute.ViewRequestPhysicalCashCard.deepLinkSpecs, null, ""), routingParams);
    }

    public final void route(ClientRoute.DeactivateTag deactivateTag, RoutingParams routingParams) {
        deactivateTag.getClass();
        routingParams.getClass();
        FidesmoDeprovisioningScreen fidesmoDeprovisioningScreen = new FidesmoDeprovisioningScreen(BlockersData.DUMMY, FidesmoDeprovisionBlockerFactory.createDeprovisionBlocker(this.stringManager, null));
        boolean z = routingParams.origin instanceof FidesmoProvisioningScreen;
        Navigator navigator = this.navigator;
        if (z) {
            navigator.goTo(Back.INSTANCE);
        }
        navigator.goTo(fidesmoDeprovisioningScreen);
    }

    public final void route(ClientRoute.ViewChangeCardDesign viewChangeCardDesign, RoutingParams routingParams) {
        BlockersData.AnalyticsData analyticsData;
        RoutingParams.DeepLinkMetadata deepLinkMetadata;
        viewChangeCardDesign.getClass();
        routingParams.getClass();
        String concat = "CHANGE_CARD_DESIGN?external_identifier=".concat(viewChangeCardDesign.styleidentifier);
        ScenarioInitiatorType scenarioInitiatorType = zzkp.scenarioInitiatorType(routingParams);
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = PaymentScreens$HomeScreens$Home.INSTANCE;
        }
        Screen screen2 = screen;
        String str = routingParams.source;
        String str2 = null;
        if (str != null) {
            BlockersData.AnalyticsData.Source.INSTANCE.getClass();
            BlockersData.AnalyticsData.Source fromString = BlockersData.AnalyticsData.Source.Companion.fromString(str);
            analyticsData = fromString != null ? new BlockersData.AnalyticsData(fromString, (String) null, 6) : null;
        } else {
            analyticsData = null;
        }
        if (scenarioInitiatorType == ScenarioInitiatorType.EXTERNAL && (deepLinkMetadata = routingParams.deepLinkMetadata) != null) {
            str2 = deepLinkMetadata.referrer;
        }
        this.navigator.goTo(FlowStarter.startPlasmaFlowWithParams$default(this.flowStarter, concat, screen2, scenarioInitiatorType, str2, screen2, analyticsData, false, null, 320));
    }

    public final void route(ClientRoute.ViewRequestPhysicalCashCard viewRequestPhysicalCashCard, RoutingParams routingParams) {
        BlockersData.AnalyticsData analyticsData;
        RoutingParams.DeepLinkMetadata deepLinkMetadata;
        viewRequestPhysicalCashCard.getClass();
        routingParams.getClass();
        String concat = "REQUEST_PHYSICAL_CARD?external_identifier=".concat(viewRequestPhysicalCashCard.styleidentifier);
        ScenarioInitiatorType scenarioInitiatorType = zzkp.scenarioInitiatorType(routingParams);
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = PaymentScreens$HomeScreens$Home.INSTANCE;
        }
        Screen screen2 = screen;
        String str = routingParams.source;
        String str2 = null;
        if (str != null) {
            BlockersData.AnalyticsData.Source.INSTANCE.getClass();
            BlockersData.AnalyticsData.Source fromString = BlockersData.AnalyticsData.Source.Companion.fromString(str);
            analyticsData = fromString != null ? new BlockersData.AnalyticsData(fromString, (String) null, 6) : null;
        } else {
            analyticsData = null;
        }
        if (scenarioInitiatorType == ScenarioInitiatorType.EXTERNAL && (deepLinkMetadata = routingParams.deepLinkMetadata) != null) {
            str2 = deepLinkMetadata.referrer;
        }
        this.navigator.goTo(FlowStarter.startPlasmaFlowWithParams$default(this.flowStarter, concat, screen2, scenarioInitiatorType, str2, screen2, analyticsData, false, null, 320));
    }
}
