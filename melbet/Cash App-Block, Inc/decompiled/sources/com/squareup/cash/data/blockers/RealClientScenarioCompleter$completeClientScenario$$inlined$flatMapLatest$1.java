package com.squareup.cash.data.blockers;

import androidx.compose.ui.node.PointerInputModifierNodeKt;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealClientScenarioCompleter$completeClientScenario$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ BlockersData.AnalyticsData $analyticsData$inlined;
    public final /* synthetic */ ClientScenario $clientScenario$inlined;
    public final /* synthetic */ String $customFlowToken$inlined;
    public final /* synthetic */ Screen $exitOnSuccessScreen$inlined;
    public final /* synthetic */ Screen $exitScreen$inlined;
    public final /* synthetic */ BlockersData.Flow $flow$inlined;
    public final /* synthetic */ boolean $foreground$inlined;
    public final /* synthetic */ BlockersData.MoneybotContext $moneybotContext$inlined;
    public final /* synthetic */ List $paymentTokens$inlined;
    public final /* synthetic */ String $promotionToken$inlined;
    public final /* synthetic */ boolean $skipBiometrics$inlined;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ RealClientScenarioCompleter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealClientScenarioCompleter$completeClientScenario$$inlined$flatMapLatest$1(Continuation continuation, RealClientScenarioCompleter realClientScenarioCompleter, BlockersData.Flow flow, Screen screen, Screen screen2, ClientScenario clientScenario, String str, BlockersData.AnalyticsData analyticsData, BlockersData.MoneybotContext moneybotContext, boolean z, boolean z2, String str2, List list) {
        super(3, continuation);
        this.this$0 = realClientScenarioCompleter;
        this.$flow$inlined = flow;
        this.$exitOnSuccessScreen$inlined = screen;
        this.$exitScreen$inlined = screen2;
        this.$clientScenario$inlined = clientScenario;
        this.$customFlowToken$inlined = str;
        this.$analyticsData$inlined = analyticsData;
        this.$moneybotContext$inlined = moneybotContext;
        this.$foreground$inlined = z;
        this.$skipBiometrics$inlined = z2;
        this.$promotionToken$inlined = str2;
        this.$paymentTokens$inlined = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RealClientScenarioCompleter$completeClientScenario$$inlined$flatMapLatest$1 realClientScenarioCompleter$completeClientScenario$$inlined$flatMapLatest$1 = new RealClientScenarioCompleter$completeClientScenario$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$flow$inlined, this.$exitOnSuccessScreen$inlined, this.$exitScreen$inlined, this.$clientScenario$inlined, this.$customFlowToken$inlined, this.$analyticsData$inlined, this.$moneybotContext$inlined, this.$foreground$inlined, this.$skipBiometrics$inlined, this.$promotionToken$inlined, this.$paymentTokens$inlined);
        realClientScenarioCompleter$completeClientScenario$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        realClientScenarioCompleter$completeClientScenario$$inlined$flatMapLatest$1.L$1 = obj2;
        return realClientScenarioCompleter$completeClientScenario$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Flow safeFlow;
        ScenarioPlan scenarioPlan;
        FlowCollector flowCollector = this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            com.squareup.cash.db2.profile.ScenarioPlan scenarioPlan2 = (com.squareup.cash.db2.profile.ScenarioPlan) obj2;
            RealClientScenarioCompleter realClientScenarioCompleter = this.this$0;
            FlowStarter flowStarter = realClientScenarioCompleter.flowStarter;
            BlockersData.Flow flow = BlockersData.Flow.STATUS_RESULT;
            BlockersData.Flow flow2 = this.$flow$inlined;
            if (flow2 == flow) {
                flow2 = BlockersData.Flow.PROFILE_BLOCKERS;
            }
            BlockersData.Flow flow3 = flow2;
            Screen screen = this.$exitOnSuccessScreen$inlined;
            if (screen == null) {
                screen = this.$exitScreen$inlined;
            }
            BlockersData startFlow$default = FlowStarter.startFlow$default(flowStarter, flow3, this.$exitScreen$inlined, scenarioPlan2 != null ? scenarioPlan2.scenario_plan : null, this.$clientScenario$inlined, this.$customFlowToken$inlined, screen, this.$analyticsData$inlined, this.$moneybotContext$inlined, null, 528);
            BlockersData copy$default = BlockersData.copy$default(startFlow$default, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, this.$skipBiometrics$inlined, RequestContext.copy$default(startFlow$default.requestContext, null, this.$promotionToken$inlined, null, null, this.$paymentTokens$inlined, null, null, null, null, null, null, null, 8165), null, null, -1, 53247);
            BlockerFlowListener.onFlowStarted$default(realClientScenarioCompleter.blockerFlowAnalytics, copy$default, scenarioPlan2 != null ? scenarioPlan2.scenario_plan : null, this.$clientScenario$inlined, 2);
            List<BlockerDescriptor> list = (scenarioPlan2 == null || (scenarioPlan = scenarioPlan2.scenario_plan) == null) ? null : scenarioPlan.blocker_descriptors;
            if (list == null || list.isEmpty()) {
                if (!this.$foreground$inlined) {
                    if ((scenarioPlan2 != null ? scenarioPlan2.scenario_plan : null) != null) {
                        z = false;
                        safeFlow = new SafeFlow(new RealContactSync$syncRequest$2.AnonymousClass1(z, realClientScenarioCompleter, copy$default, this.$clientScenario$inlined, this.$paymentTokens$inlined, (Continuation) null));
                    }
                }
                z = true;
                safeFlow = new SafeFlow(new RealContactSync$syncRequest$2.AnonymousClass1(z, realClientScenarioCompleter, copy$default, this.$clientScenario$inlined, this.$paymentTokens$inlined, (Continuation) null));
            } else {
                Analytics analytics = realClientScenarioCompleter.analytics;
                String str = copy$default.flowToken;
                String nextBlockerType = copy$default.getNextBlockerType();
                BlockersData.AnalyticsData analyticsData = copy$default.analyticsData;
                PointerInputModifierNodeKt.trackBlockerSubmission(analytics, copy$default, str, nextBlockerType, analyticsData != null ? analyticsData.referrerFlowToken : null, analyticsData != null ? analyticsData.referrerFlowType : null);
                safeFlow = new AppLockMonitor$special$$inlined$map$2(new BlockersHelper.BlockersAction.ShowScreen(realClientScenarioCompleter.blockersNavigator.getNext(null, BlockersData.copy$default(copy$default, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, scenarioPlan2 != null ? scenarioPlan2.scenario_plan : null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -537133057, 65535))), 19);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, safeFlow, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
