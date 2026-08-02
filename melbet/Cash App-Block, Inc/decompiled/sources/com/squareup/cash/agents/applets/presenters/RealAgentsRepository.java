package com.squareup.cash.agents.applets.presenters;

import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.paging.MulticastedPagingData$asPagingData$2;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.agents.applets.presenters.AgentsState;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.agentcore.api.v1.AgentAccount;
import com.squareup.protos.cash.agentcore.api.v1.AgentCoreService;
import com.squareup.protos.cash.agentcore.api.v1.GetAgentsRequest;
import com.squareup.protos.cash.agentcore.api.v1.GetAgentsResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealAgentsRepository {
    public final StateFlowImpl refreshSignals;
    public final AgentCoreService service;
    public final ReadonlyStateFlow state;
    public final AndroidStringManager stringManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/squareup/cash/agents/applets/presenters/RealAgentsRepository$GetAgentsException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class GetAgentsException extends RuntimeException {
    }

    public RealAgentsRepository(AgentCoreService agentCoreService, SessionManager sessionManager, AndroidStringManager androidStringManager, CoroutineScope coroutineScope) {
        this.service = agentCoreService;
        this.stringManager = androidStringManager;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(0);
        this.refreshSignals = MutableStateFlow;
        int i = 3;
        Continuation continuation = null;
        this.state = FlowKt.stateIn(FlowKt.transformLatest(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(sessionManager.getSessionState(), MutableStateFlow, new MulticastedPagingData$asPagingData$2(i, continuation, i), 0), new AnchoredDraggableNode$drag$2(continuation, this, 4)), coroutineScope, new StartedWhileSubscribed(5000L, Long.MAX_VALUE), AgentsState.Loading.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$fetchAgents(RealAgentsRepository realAgentsRepository, String str, ContinuationImpl continuationImpl) {
        RealAgentsRepository$fetchAgents$1 realAgentsRepository$fetchAgents$1;
        int i;
        ApiResult apiResult;
        Agent agent;
        String str2;
        if (continuationImpl instanceof RealAgentsRepository$fetchAgents$1) {
            realAgentsRepository$fetchAgents$1 = (RealAgentsRepository$fetchAgents$1) continuationImpl;
            int i2 = realAgentsRepository$fetchAgents$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAgentsRepository$fetchAgents$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAgentsRepository$fetchAgents$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAgentsRepository$fetchAgents$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AgentCoreService agentCoreService = realAgentsRepository.service;
                    GetAgentsRequest getAgentsRequest = new GetAgentsRequest(str, ByteString.EMPTY);
                    realAgentsRepository$fetchAgents$1.label = 1;
                    obj = agentCoreService.getAgents(getAgentsRequest, realAgentsRepository$fetchAgents$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    return new AgentsState.Failure(new GetAgentsException("getAgents failed: " + ((ApiResult.Failure) apiResult)));
                }
                List<AgentAccount> list = ((GetAgentsResponse) ((ApiResult.Success) apiResult).response).agents;
                ArrayList arrayList = new ArrayList();
                for (AgentAccount agentAccount : list) {
                    String str3 = agentAccount.agent_account_token;
                    if (str3 == null && (str3 = agentAccount.sponsorship_token) == null) {
                        agent = null;
                    } else {
                        String str4 = agentAccount.display_name;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = StringsKt.isBlank(str4) ? realAgentsRepository.stringManager.get(R.string.agents_home_card_default_title) : str4;
                        String str6 = agentAccount.cashtag;
                        if (str6 != null && (str2 = StringsKt.trim(str6).toString()) != null) {
                            if (StringsKt.isBlank(str2)) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                if (!StringsKt__StringsJVMKt.startsWith(str2, "$", false)) {
                                    str2 = "$".concat(str2);
                                }
                                String str7 = str2 != null ? str2 : "";
                                str5.getClass();
                                agent = new Agent(str3, str4, str7, new StackedAvatarViewModel.Avatar(null, null, str5, null, new StackedAvatarViewModel.Avatar.AvatarDrawableRes(R.drawable.agents_installed_applet_agent, true, 0), null, null, null, false, false, null, false, null, null, 131051));
                            }
                        }
                        str2 = null;
                        if (str2 != null) {
                        }
                        str5.getClass();
                        agent = new Agent(str3, str4, str7, new StackedAvatarViewModel.Avatar(null, null, str5, null, new StackedAvatarViewModel.Avatar.AvatarDrawableRes(R.drawable.agents_installed_applet_agent, true, 0), null, null, null, false, false, null, false, null, null, 131051));
                    }
                    if (agent != null) {
                        arrayList.add(agent);
                    }
                }
                return new AgentsState.Installed(arrayList);
            }
        }
        realAgentsRepository$fetchAgents$1 = new RealAgentsRepository$fetchAgents$1(realAgentsRepository, continuationImpl);
        Object obj2 = realAgentsRepository$fetchAgents$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAgentsRepository$fetchAgents$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }
}
