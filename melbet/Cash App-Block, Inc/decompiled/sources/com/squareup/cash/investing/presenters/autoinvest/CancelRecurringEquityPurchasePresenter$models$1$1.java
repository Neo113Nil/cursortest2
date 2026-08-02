package com.squareup.cash.investing.presenters.autoinvest;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Finish;
import com.squareup.protos.cash.investflow.flows.DisableRecurringEquityBuyParams;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetFlowRequest;
import com.squareup.protos.franklin.app.GetFlowResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CancelRecurringEquityPurchasePresenter$models$1$1 extends SuspendLambda implements Function2 {
    public int label;
    public final /* synthetic */ LocalPosCheckInPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelRecurringEquityPurchasePresenter$models$1$1(LocalPosCheckInPresenter localPosCheckInPresenter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = localPosCheckInPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancelRecurringEquityPurchasePresenter$models$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CancelRecurringEquityPurchasePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object flow;
        LocalPosCheckInPresenter localPosCheckInPresenter = this.this$0;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
        InvestingScreens.CancelRecurringPurchase.Equity equity = (InvestingScreens.CancelRecurringPurchase.Equity) localPosCheckInPresenter.cameraPermissions;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        RequestContext requestContext = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            String base64 = DisableRecurringEquityBuyParams.ADAPTER.encodeByteString(new DisableRecurringEquityBuyParams(equity.token.value, equity.amount, new RecurringSchedule(equity.frequency, (List) null, (String) null, (Integer) null, 30), ByteString.EMPTY)).base64();
            AppService appService = (AppService) localPosCheckInPresenter.launcher;
            GetFlowRequest getFlowRequest = new GetFlowRequest(requestContext, new GetFlowRequest.Input.InitiationData(Recorder$$ExternalSyntheticOutline2.m("DISABLE_RECURRING_EQUITY_BUY_V2?params=", base64)), 5);
            this.label = 1;
            flow = appService.getFlow("/2.0/cash/get-flow", null, null, getFlowRequest, this);
            if (flow == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            flow = obj;
        }
        ApiResult apiResult = (ApiResult) flow;
        if (apiResult instanceof ApiResult.Failure) {
            screenNavigator.goTo(new Finish(null));
            screenNavigator.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging((AndroidStringManager) localPosCheckInPresenter.stringManager, (ApiResult.Failure) apiResult, null).message, null, 14));
        } else {
            if (!(apiResult instanceof ApiResult.Success)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            GetFlowResponse getFlowResponse = (GetFlowResponse) ((ApiResult.Success) apiResult).response;
            FlowStarter flowStarter = (FlowStarter) localPosCheckInPresenter.store;
            String str = getFlowResponse.token;
            str.getClass();
            Finish finish = new Finish(null);
            ColorModel colorModel = equity.accentColor;
            ResponseContext responseContext = getFlowResponse.response_context;
            responseContext.getClass();
            ClientScenario clientScenario = getFlowResponse.client_scenario;
            clientScenario.getClass();
            RealFlowStarter realFlowStarter = (RealFlowStarter) flowStarter;
            screenNavigator.goTo(realFlowStarter.blockersDataNavigator.getNext(null, FlowStarter.startFlow$default(realFlowStarter, BlockersData.Flow.PROFILE_BLOCKERS, finish, null, clientScenario, str, null, null, null, new BadgedBoxKt$$ExternalSyntheticLambda0(13, colorModel, responseContext), 468)));
        }
        return Unit.INSTANCE;
    }
}
