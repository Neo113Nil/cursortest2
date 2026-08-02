package app.cash.local.navigation.api;

import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.local.primitives.ShortlinkKey;
import app.cash.local.screens.app.LocalEducationalSheet;
import app.cash.local.screens.app.LocalPosBrandOnboardingScreen;
import app.cash.local.screens.app.LocalPosLocalCashRedemptionScreen;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.local.service.LocalService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.protos.cash.local.client.app.v1.GetAppShortlinkRequest;
import com.squareup.protos.cash.local.client.app.v1.GetAppShortlinkResponse;
import com.squareup.protos.cash.local.client.v1.EducationalSheet;
import com.squareup.protos.cash.local.client.v1.GetShortlinkRequest;
import com.squareup.protos.cash.local.client.v1.GetShortlinkResponse;
import com.squareup.protos.cash.local.client.v1.GetShortlinkResponse$Action$EducationalSheet;
import com.squareup.protos.cash.local.client.v1.GetShortlinkResponse$Action$InvokeClientRoute;
import com.squareup.protos.cash.local.client.v1.GetShortlinkResponse$Action$NoAction;
import com.squareup.protos.cash.local.client.v1.GetShortlinkResponse$Action$PosBrandOnboarding;
import com.squareup.protos.cash.local.client.v1.GetShortlinkResponse$Action$PosLocalCashRedemption;
import com.squareup.protos.cash.local.client.v1.GetShortlinkResponse$Action$RedirectToWeb;
import com.squareup.protos.cash.local.client.v1.GetShortlinkResponse$Action$StartPlasmaFlow;
import com.squareup.protos.cash.local.client.v1.ShortlinkAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealCashLocalShortlinkHandler {
    public final BlockersDataNavigator blockersDataNavigator;
    public final FlowStarter flowStarter;
    public final RealRouter$Factory$Impl routerFactory;
    public final LocalService service;

    public RealCashLocalShortlinkHandler(FlowStarter flowStarter, BlockersDataNavigator blockersDataNavigator, RealRouter$Factory$Impl realRouter$Factory$Impl, LocalService localService) {
        this.flowStarter = flowStarter;
        this.blockersDataNavigator = blockersDataNavigator;
        this.routerFactory = realRouter$Factory$Impl;
        this.service = localService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleShortlink(ShortlinkAction shortlinkAction, Navigator navigator, GetShortlinkRequest.InvocationContext invocationContext, Function0 function0, ContinuationImpl continuationImpl) {
        RealCashLocalShortlinkHandler$handleShortlink$1 realCashLocalShortlinkHandler$handleShortlink$1;
        int i;
        Function0 function02;
        String str;
        Navigator navigator2;
        ApiResult apiResult;
        RealCashLocalShortlinkHandler realCashLocalShortlinkHandler = this;
        ShortlinkAction shortlinkAction2 = shortlinkAction;
        if (continuationImpl instanceof RealCashLocalShortlinkHandler$handleShortlink$1) {
            realCashLocalShortlinkHandler$handleShortlink$1 = (RealCashLocalShortlinkHandler$handleShortlink$1) continuationImpl;
            int i2 = realCashLocalShortlinkHandler$handleShortlink$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realCashLocalShortlinkHandler$handleShortlink$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realCashLocalShortlinkHandler$handleShortlink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCashLocalShortlinkHandler$handleShortlink$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    String str2 = shortlinkAction2.shortlink_key;
                    String str3 = shortlinkAction2.next_shortlink_flow_state;
                    ByteString byteString = ByteString.EMPTY;
                    GetAppShortlinkRequest getAppShortlinkRequest = new GetAppShortlinkRequest(null, new GetShortlinkRequest(str2, str3, invocationContext, byteString), byteString);
                    realCashLocalShortlinkHandler$handleShortlink$1.L$0 = shortlinkAction2;
                    realCashLocalShortlinkHandler$handleShortlink$1.L$1 = navigator;
                    realCashLocalShortlinkHandler$handleShortlink$1.L$3 = function0;
                    realCashLocalShortlinkHandler$handleShortlink$1.L$4 = generateToken;
                    realCashLocalShortlinkHandler$handleShortlink$1.L$5 = realCashLocalShortlinkHandler;
                    realCashLocalShortlinkHandler$handleShortlink$1.label = 1;
                    Object appShortlink = realCashLocalShortlinkHandler.service.getAppShortlink(generateToken, getAppShortlinkRequest, realCashLocalShortlinkHandler$handleShortlink$1);
                    if (appShortlink == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    function02 = function0;
                    str = generateToken;
                    obj = appShortlink;
                    navigator2 = navigator;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    realCashLocalShortlinkHandler = realCashLocalShortlinkHandler$handleShortlink$1.L$5;
                    String str4 = realCashLocalShortlinkHandler$handleShortlink$1.L$4;
                    function02 = realCashLocalShortlinkHandler$handleShortlink$1.L$3;
                    navigator2 = realCashLocalShortlinkHandler$handleShortlink$1.L$1;
                    ShortlinkAction shortlinkAction3 = realCashLocalShortlinkHandler$handleShortlink$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str = str4;
                    shortlinkAction2 = shortlinkAction3;
                }
                apiResult = (ApiResult) obj;
                RealRouter$Factory$Impl realRouter$Factory$Impl = realCashLocalShortlinkHandler.routerFactory;
                if (!(apiResult instanceof ApiResult.Success)) {
                    GetAppShortlinkResponse getAppShortlinkResponse = (GetAppShortlinkResponse) ((ApiResult.Success) apiResult).response;
                    ResponseContext responseContext = getAppShortlinkResponse.response_context;
                    ScenarioPlan scenarioPlan = responseContext != null ? responseContext.scenario_plan : null;
                    if (scenarioPlan != null) {
                        FlowStarter flowStarter = realCashLocalShortlinkHandler.flowStarter;
                        BlockersData.Flow flow = BlockersData.Flow.CLIENT_SCENARIO;
                        ClientScenario clientScenario = ClientScenario.PLASMA;
                        LocalTabScreen localTabScreen = LocalTabScreen.INSTANCE;
                        navigator2.goTo(realCashLocalShortlinkHandler.blockersDataNavigator.getNext(localTabScreen, FlowStarter.startFlow$default(flowStarter, flow, localTabScreen, scenarioPlan, clientScenario, str, null, null, null, null, 976)));
                    }
                    GetShortlinkResponse getShortlinkResponse = getAppShortlinkResponse.response;
                    if (getShortlinkResponse != null) {
                        ViewUtilsKt viewUtilsKt = getShortlinkResponse.action;
                        if (!(viewUtilsKt instanceof GetShortlinkResponse$Action$StartPlasmaFlow)) {
                            if (viewUtilsKt instanceof GetShortlinkResponse$Action$RedirectToWeb) {
                                RealRouter create$1 = realRouter$Factory$Impl.create$1(navigator2);
                                String str5 = ((GetShortlinkResponse$Action$RedirectToWeb) viewUtilsKt).getValue().url;
                                str5.getClass();
                                create$1.route(new RoutingParams(null, null, null, null, null, null, 511), str5);
                            } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$InvokeClientRoute) {
                                RealRouter create$12 = realRouter$Factory$Impl.create$1(navigator2);
                                String str6 = ((GetShortlinkResponse$Action$InvokeClientRoute) viewUtilsKt).getValue().client_route;
                                str6.getClass();
                                create$12.route(new RoutingParams(null, null, null, null, null, null, 511), str6);
                            } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$EducationalSheet) {
                                EducationalSheet value = ((GetShortlinkResponse$Action$EducationalSheet) viewUtilsKt).getValue();
                                String str7 = shortlinkAction2.shortlink_key;
                                ShortlinkKey.m1284constructorimpl(str7);
                                navigator2.goTo(new LocalEducationalSheet(value, str7, shortlinkAction2.next_shortlink_flow_state, str));
                            } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$NoAction) {
                                function02.invoke();
                            } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$PosBrandOnboarding) {
                                navigator2.goTo(new LocalPosBrandOnboardingScreen(((GetShortlinkResponse$Action$PosBrandOnboarding) viewUtilsKt).getValue()));
                            } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$PosLocalCashRedemption) {
                                navigator2.goTo(new LocalPosLocalCashRedemptionScreen(((GetShortlinkResponse$Action$PosLocalCashRedemption) viewUtilsKt).getValue()));
                            } else {
                                if (viewUtilsKt != null) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                Timber.Forest.e("No action set for " + getShortlinkResponse + ". Failing silently.", new Object[0]);
                                function02.invoke();
                            }
                        }
                    }
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    if (failure instanceof ApiResult.Failure.HttpFailure) {
                        Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "HttpFailure [", "]"), new Object[0]);
                    } else {
                        if (!(failure instanceof ApiResult.Failure.NetworkFailure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.e("NetworkFailure", new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult).error);
                    }
                    function02.invoke();
                }
                return Unit.INSTANCE;
            }
        }
        realCashLocalShortlinkHandler$handleShortlink$1 = new RealCashLocalShortlinkHandler$handleShortlink$1(realCashLocalShortlinkHandler, continuationImpl);
        Object obj2 = realCashLocalShortlinkHandler$handleShortlink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCashLocalShortlinkHandler$handleShortlink$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        RealRouter$Factory$Impl realRouter$Factory$Impl2 = realCashLocalShortlinkHandler.routerFactory;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }
}
