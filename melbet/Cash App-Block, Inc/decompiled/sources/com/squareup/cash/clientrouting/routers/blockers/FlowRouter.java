package com.squareup.cash.clientrouting.routers.blockers;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzkp;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.screens.Back;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.TransformingSequence$iterator$1;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class FlowRouter {
    public final FlowStarter flowStarter;
    public final Navigator navigator;

    public FlowRouter(FlowStarter flowStarter, Navigator navigator) {
        navigator.getClass();
        this.flowStarter = flowStarter;
        this.navigator = navigator;
    }

    public final void handleFlowRoute(String str, boolean z, RoutingParams routingParams) {
        BlockersData.AnalyticsData analyticsData;
        ScenarioInitiatorType scenarioInitiatorType = zzkp.scenarioInitiatorType(routingParams);
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        Navigator navigator = this.navigator;
        String str2 = null;
        if (z) {
            if (Intrinsics.areEqual(deepLinkMetadata != null ? deepLinkMetadata.deepLinkSource : null, "IN_APP_SCANNER")) {
                navigator.goTo(Back.INSTANCE);
            }
        }
        Screen screen = (Screen) CollectionsKt.first(ArraysKt___ArraysKt.filterNotNull(new Screen[]{routingParams.exitScreen, routingParams.origin, PaymentScreens$HomeScreens$Home.INSTANCE}));
        AnalyticsParams analyticsParams = routingParams.analyticsParams;
        boolean z2 = analyticsParams instanceof AnalyticsParams.GenericAnalyticsParams;
        AnalyticsParams.GenericAnalyticsParams genericAnalyticsParams = z2 ? (AnalyticsParams.GenericAnalyticsParams) analyticsParams : null;
        String str3 = genericAnalyticsParams != null ? genericAnalyticsParams.referrerFlowToken : null;
        AnalyticsParams.GenericAnalyticsParams genericAnalyticsParams2 = z2 ? (AnalyticsParams.GenericAnalyticsParams) analyticsParams : null;
        BlockerFlowReferrerType blockerFlowReferrerType = genericAnalyticsParams2 != null ? genericAnalyticsParams2.referrerFlowType : null;
        String str4 = routingParams.source;
        if (str4 != null) {
            BlockersData.AnalyticsData.Source.INSTANCE.getClass();
            BlockersData.AnalyticsData.Source fromString = BlockersData.AnalyticsData.Source.Companion.fromString(str4);
            analyticsData = fromString != null ? new BlockersData.AnalyticsData(fromString, str3, blockerFlowReferrerType) : null;
        } else {
            analyticsData = null;
        }
        BlockersData.MoneybotContext moneybotContext = zzkp.moneybotContext(routingParams);
        if (scenarioInitiatorType == ScenarioInitiatorType.EXTERNAL && deepLinkMetadata != null) {
            str2 = deepLinkMetadata.referrer;
        }
        navigator.goTo(FlowStarter.startPlasmaFlowWithParams$default(this.flowStarter, str, screen, scenarioInitiatorType, str2, screen, analyticsData, z, moneybotContext, 64));
        Timber.Forest.d("Client started a flow via client route with initiation data ".concat(str), new Object[0]);
    }

    public final void route(ClientRoute.FlowType flowType, RoutingParams routingParams) {
        flowType.getClass();
        String str = flowType.flowType;
        routingParams.getClass();
        try {
            Flow$Type valueOf = Flow$Type.valueOf(str);
            this.navigator.goTo(FlowStarter.startPlasmaFlow$default(this.flowStarter, valueOf, (Screen) CollectionsKt.first(ArraysKt___ArraysKt.filterNotNull(new Screen[]{routingParams.exitScreen, routingParams.origin, PaymentScreens$HomeScreens$Home.INSTANCE})), null, null, 12));
            Timber.Forest.d("Client started a flow via client route with Flow.Type " + valueOf, new Object[0]);
        } catch (IllegalArgumentException unused) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid flow_type ", str, " in client route"));
        }
    }

    public final void route(ClientRoute.ViewInviteFriends viewInviteFriends, RoutingParams routingParams) {
        viewInviteFriends.getClass();
        routingParams.getClass();
        Screen screen = routingParams.origin;
        if (screen == null) {
            screen = PaymentScreens$HomeScreens$Home.INSTANCE;
        }
        this.navigator.goTo(((RealFlowStarter) this.flowStarter).startInviteFlow(screen, null));
    }

    public final void route(ClientRoute.Flow flow, RoutingParams routingParams) {
        flow.getClass();
        routingParams.getClass();
        String str = flow.initiationData;
        TransformingSequence$iterator$1 transformingSequence$iterator$1 = (TransformingSequence$iterator$1) StringsKt.splitToSequence$default(str, new char[]{'?'}).iterator();
        if (transformingSequence$iterator$1.hasNext()) {
            handleFlowRoute(str, Intrinsics.areEqual(transformingSequence$iterator$1.next(), "CREATE_OR_EDIT_RECURRING_PAYMENT"), routingParams);
        } else {
            OptionalProvider$$ExternalSyntheticLambda0.m("Sequence is empty.");
        }
    }

    public final void route(ClientRoute.FlowHalfSheet flowHalfSheet, RoutingParams routingParams) {
        flowHalfSheet.getClass();
        routingParams.getClass();
        handleFlowRoute(flowHalfSheet.initiationData, true, routingParams);
    }
}
