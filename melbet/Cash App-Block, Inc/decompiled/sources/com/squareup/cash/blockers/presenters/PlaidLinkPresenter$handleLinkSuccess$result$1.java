package com.squareup.cash.blockers.presenters;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.PlaidLinkPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.plaid.api.PlaidLinkResult;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.internal.Util;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.OAuthResolveFlowRequest;
import com.squareup.protos.franklin.common.scenarios.OAuthConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class PlaidLinkPresenter$handleLinkSuccess$result$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ PlaidLinkResult.Success $linkSuccess;
    public int label;
    public final /* synthetic */ PlaidLinkPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidLinkPresenter$handleLinkSuccess$result$1(PlaidLinkPresenter plaidLinkPresenter, PlaidLinkResult.Success success, Continuation continuation) {
        super(1, continuation);
        this.this$0 = plaidLinkPresenter;
        this.$linkSuccess = success;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaidLinkPresenter$handleLinkSuccess$result$1(this.this$0, this.$linkSuccess, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PlaidLinkPresenter$handleLinkSuccess$result$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PlaidLinkPresenter plaidLinkPresenter = this.this$0;
        BlockersScreens.PlaidLinkScreen plaidLinkScreen = plaidLinkPresenter.args;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        AppService appService = plaidLinkPresenter.appService;
        ClientScenario clientScenario = plaidLinkScreen.blockersData.clientScenario;
        clientScenario.getClass();
        BlockersData blockersData = plaidLinkScreen.blockersData;
        String str = blockersData.flowToken;
        OAuthConfig oAuthConfig = blockersData.bankAccountOauthConfig;
        oAuthConfig.getClass();
        OAuthConfig.FlowType flowType = oAuthConfig.flow_type;
        JsonAdapter adapter = plaidLinkPresenter.moshi.adapter(PlaidLinkPresenter.PlaidLinkMetadata.class, Util.NO_ANNOTATIONS, null);
        PlaidLinkResult.Success success = this.$linkSuccess;
        Object fromJson = adapter.fromJson(success.metadataJson);
        fromJson.getClass();
        PlaidLinkPresenter.PlaidLinkMetadata plaidLinkMetadata = (PlaidLinkPresenter.PlaidLinkMetadata) fromJson;
        String m = CameraSelector$$ExternalSyntheticOutline0.m("plaidlink://connected?public_token=", success.publicToken, "&account_id=", plaidLinkMetadata.account_id);
        String str2 = plaidLinkMetadata.link_session_id;
        if (str2 != null) {
            m = Recorder$$ExternalSyntheticOutline2.m(m, "&link_session_id=", str2);
        }
        OAuthResolveFlowRequest oAuthResolveFlowRequest = new OAuthResolveFlowRequest(plaidLinkScreen.blockersData.requestContext, flowType, m, ByteString.EMPTY);
        this.label = 1;
        Object oAuthResolveFlow = appService.oAuthResolveFlow(clientScenario, str, oAuthResolveFlowRequest, this);
        return oAuthResolveFlow == coroutineSingletons ? coroutineSingletons : oAuthResolveFlow;
    }
}
