package com.squareup.cash.clientrouting.routers.blockers;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.checks.CaptureCheckFacePresenter$models$2$1$1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealClientRouteRouter$route$1;
import com.squareup.cash.clientrouting.RoutesKt;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.FeatureContext;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.routers.blockers.BiometricPreauthScenarioManager$PreauthResult;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class ClientScenarioRouter {
    public final MarkwonConfiguration biometricPreauthScenarioManager;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealBlockersHelper blockersHelper;
    public final RealClientScenarioCompleter clientScenarioCompleter;
    public final FlowStarter flowStarter;
    public final Navigator navigator;

    public ClientScenarioRouter(RealClientScenarioCompleter realClientScenarioCompleter, MarkwonConfiguration markwonConfiguration, BlockersDataNavigator blockersDataNavigator, FlowStarter flowStarter, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, Navigator navigator) {
        navigator.getClass();
        this.clientScenarioCompleter = realClientScenarioCompleter;
        this.biometricPreauthScenarioManager = markwonConfiguration;
        this.blockersDataNavigator = blockersDataNavigator;
        this.flowStarter = flowStarter;
        this.navigator = navigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(navigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.PreauthedCompleteScenario preauthedCompleteScenario, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        ClientScenarioRouter$route$3 clientScenarioRouter$route$3;
        int i;
        Screen screen;
        ClientScenario clientScenario;
        BiometricPreauthScenarioManager$PreauthResult biometricPreauthScenarioManager$PreauthResult;
        ScenarioPlan scenarioPlan;
        ClientRoute.PreauthedCompleteScenario preauthedCompleteScenario2 = preauthedCompleteScenario;
        RoutingParams routingParams2 = routingParams;
        if (continuationImpl instanceof ClientScenarioRouter$route$3) {
            clientScenarioRouter$route$3 = (ClientScenarioRouter$route$3) continuationImpl;
            int i2 = clientScenarioRouter$route$3.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                clientScenarioRouter$route$3.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = clientScenarioRouter$route$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clientScenarioRouter$route$3.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Screen screen2 = routingParams2.origin;
                    if (screen2 == null) {
                        Timber.Forest.w("Preauthed complete scenario requires a requester. Make sure to set the origin on RoutingParams.", new Object[0]);
                        return Unit.INSTANCE;
                    }
                    preauthedCompleteScenario2.getClass();
                    String str = preauthedCompleteScenario2.clientScenario;
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String upperCase = str.toUpperCase(locale);
                    upperCase.getClass();
                    ClientScenario valueOf = ClientScenario.valueOf(upperCase);
                    String str2 = preauthedCompleteScenario2.flowToken;
                    clientScenarioRouter$route$3.L$0 = preauthedCompleteScenario2;
                    clientScenarioRouter$route$3.L$1 = routingParams2;
                    clientScenarioRouter$route$3.L$2 = screen2;
                    clientScenarioRouter$route$3.L$3 = valueOf;
                    clientScenarioRouter$route$3.label = 1;
                    Object preauthenticate = this.biometricPreauthScenarioManager.preauthenticate(valueOf, str2, clientScenarioRouter$route$3);
                    if (preauthenticate == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    screen = screen2;
                    obj = preauthenticate;
                    clientScenario = valueOf;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ClientScenario clientScenario2 = clientScenarioRouter$route$3.L$3;
                    Screen screen3 = clientScenarioRouter$route$3.L$2;
                    RoutingParams routingParams3 = clientScenarioRouter$route$3.L$1;
                    ClientRoute.PreauthedCompleteScenario preauthedCompleteScenario3 = clientScenarioRouter$route$3.L$0;
                    SafeTrace.throwOnFailure(obj);
                    clientScenario = clientScenario2;
                    screen = screen3;
                    preauthedCompleteScenario2 = preauthedCompleteScenario3;
                    routingParams2 = routingParams3;
                }
                biometricPreauthScenarioManager$PreauthResult = (BiometricPreauthScenarioManager$PreauthResult) obj;
                if (!(biometricPreauthScenarioManager$PreauthResult instanceof BiometricPreauthScenarioManager$PreauthResult.Success)) {
                    ResponseContext responseContext = ((BiometricPreauthScenarioManager$PreauthResult.Success) biometricPreauthScenarioManager$PreauthResult).responseContext;
                    List<BlockerDescriptor> list = (responseContext == null || (scenarioPlan = responseContext.scenario_plan) == null) ? null : scenarioPlan.blocker_descriptors;
                    if (list != null && !list.isEmpty()) {
                        BlockersData.Flow flow = BlockersData.Flow.CLIENT_SCENARIO;
                        ScenarioPlan scenarioPlan2 = responseContext.scenario_plan;
                        String str3 = preauthedCompleteScenario2.flowToken;
                        routingParams2.getClass();
                        FeatureContext featureContext = routingParams2.featureContext;
                        FeatureContext.MoneybotChatContext moneybotChatContext = featureContext instanceof FeatureContext.MoneybotChatContext ? (FeatureContext.MoneybotChatContext) featureContext : null;
                        this.navigator.goTo(this.blockersDataNavigator.getNext(null, BlockersData.copy$default(FlowStarter.startFlow$default(this.flowStarter, flow, screen, scenarioPlan2, clientScenario, str3, null, null, moneybotChatContext != null ? new BlockersData.MoneybotContext(moneybotChatContext.sessionId, moneybotChatContext.toolRequestId) : null, null, 720), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -536870913, 65535)));
                    }
                } else {
                    if (!Intrinsics.areEqual(biometricPreauthScenarioManager$PreauthResult, BiometricPreauthScenarioManager$PreauthResult.Failed.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    route(new ClientRoute.CompleteScenario(ClientRoute.CompleteScenario.spec, null, preauthedCompleteScenario2.clientScenario, preauthedCompleteScenario2.flowToken, ClientRoute.CompleteScenario.deepLinkSpecs), routingParams2, true);
                }
                return Unit.INSTANCE;
            }
        }
        clientScenarioRouter$route$3 = new ClientScenarioRouter$route$3(this, continuationImpl);
        Object obj2 = clientScenarioRouter$route$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clientScenarioRouter$route$3.label;
        if (i != 0) {
        }
        biometricPreauthScenarioManager$PreauthResult = (BiometricPreauthScenarioManager$PreauthResult) obj2;
        if (!(biometricPreauthScenarioManager$PreauthResult instanceof BiometricPreauthScenarioManager$PreauthResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    public final Object route$1(RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object route = route(new ClientRoute.ClientScenario("DEPOSIT_PAPER_CASH"), routingParams, realClientRouteRouter$route$1);
        return route == CoroutineSingletons.COROUTINE_SUSPENDED ? route : Unit.INSTANCE;
    }

    public final Object route$2(RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object route = route(new ClientRoute.ClientScenario("DEPOSIT_CHECK"), routingParams, realClientRouteRouter$route$1);
        return route == CoroutineSingletons.COROUTINE_SUSPENDED ? route : Unit.INSTANCE;
    }

    public final Object route$3(RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object route = route(new ClientRoute.ClientScenario("FIND_MONEY_RETAILERS"), routingParams, realClientRouteRouter$route$1);
        return route == CoroutineSingletons.COROUTINE_SUSPENDED ? route : Unit.INSTANCE;
    }

    public final Object route(ClientRoute.ClientScenario clientScenario, RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        BlockersData.AnalyticsData analyticsData;
        ChannelFlowTransformLatest completeClientScenario;
        String str = routingParams.source;
        String str2 = null;
        if (str != null) {
            BlockersData.AnalyticsData.Source.INSTANCE.getClass();
            BlockersData.AnalyticsData.Source fromString = BlockersData.AnalyticsData.Source.Companion.fromString(str);
            analyticsData = fromString != null ? new BlockersData.AnalyticsData(fromString, (String) null, 6) : null;
        } else {
            analyticsData = null;
        }
        ClientScenario clientScenarioProto = RoutesKt.getClientScenarioProto(clientScenario);
        Screen screen = routingParams.exitScreen;
        if (screen == null && (screen = routingParams.origin) == null) {
            screen = PaymentScreens$HomeScreens$Home.INSTANCE;
        }
        Screen screen2 = screen;
        AnalyticsParams analyticsParams = routingParams.analyticsParams;
        if (analyticsParams != null && !(analyticsParams instanceof AnalyticsParams.GenericTreeElementsParams) && !(analyticsParams instanceof AnalyticsParams.GlobalSearchAnalyticsParams) && !(analyticsParams instanceof AnalyticsParams.InAppNotificationParams) && !(analyticsParams instanceof AnalyticsParams.OffersSearchMode)) {
            if (analyticsParams instanceof AnalyticsParams.OffersTabAnalyticsParams) {
                str2 = ((AnalyticsParams.OffersTabAnalyticsParams) analyticsParams).flowToken;
            } else if (!(analyticsParams instanceof AnalyticsParams.PaymentAnalyticsParams) && !(analyticsParams instanceof AnalyticsParams.ShopHubAnalyticsParams) && !(analyticsParams instanceof AnalyticsParams.GenericAnalyticsParams) && !(analyticsParams instanceof AnalyticsParams.SupportAnalyticsParams)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        completeClientScenario = this.clientScenarioCompleter.completeClientScenario(clientScenarioProto, (r24 & 2) != 0 ? null : analyticsData, screen2, (r24 & 8) != 0 ? null : null, BlockersData.Flow.SERVER_FLOW, true, (r24 & 64) != 0 ? null : str2, (r24 & 128) != 0 ? EmptyList.INSTANCE : null, null, null, false);
        Object collect = completeClientScenario.collect(new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(15, this, clientScenario), realClientRouteRouter$route$1);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }

    public final Object route(RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        ClientRoute.ClientScenario clientScenario = new ClientRoute.ClientScenario("PROVISION_GOOGLE_PAY");
        if (routingParams.deepLinkMetadata != null) {
            routingParams = RoutingParams.copy$default(routingParams, BlockersData.AnalyticsData.Source.DEEPLINK.getAnalyticsName(), null, null, 509);
        }
        Object route = route(clientScenario, routingParams, realClientRouteRouter$route$1);
        return route == CoroutineSingletons.COROUTINE_SUSPENDED ? route : Unit.INSTANCE;
    }

    public final void route(ClientRoute.CompleteScenario completeScenario, RoutingParams routingParams, boolean z) {
        completeScenario.getClass();
        routingParams.getClass();
        String str = completeScenario.clientScenario;
        Locale locale = Locale.ROOT;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        ClientScenario valueOf = ClientScenario.valueOf(upperCase);
        Screen screen = routingParams.origin;
        if (screen == null) {
            Timber.Forest.w("Complete scenario requires a requester. Make sure to set the origin on RoutingParams.", new Object[0]);
            return;
        }
        FeatureContext featureContext = routingParams.featureContext;
        FeatureContext.MoneybotChatContext moneybotChatContext = featureContext instanceof FeatureContext.MoneybotChatContext ? (FeatureContext.MoneybotChatContext) featureContext : null;
        BlockersHelper.launchClientScenario$default(this.blockersHelper, BlockersData.Flow.CLIENT_SCENARIO, valueOf, screen, null, completeScenario.flowToken, null, false, null, moneybotChatContext != null ? new BlockersData.MoneybotContext(moneybotChatContext.sessionId, moneybotChatContext.toolRequestId) : null, z, 968);
    }
}
