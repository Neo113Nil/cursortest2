package com.squareup.cash.investing.scenarioplans;

import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.scenarioplans.models.InitiateInvestmentOrderScenarioPlanInput;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderResponse;
import com.squareup.protos.franklin.investing.InvestingService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InitiateInvestmentOrderScenarioPlan implements ScenarioPlan {
    public final Analytics analytics;
    public final InvestingService appService;
    public final CashAccountDatabaseImpl cashDatabase;
    public final ColorModel colorModel;
    public final Screen exitScreen;
    public final FlowStarter flowStarter;
    public final CoroutineContext ioDispatcher;
    public final String referrerFlowToken;
    public final InitiateInvestmentOrderRequest request;

    public InitiateInvestmentOrderScenarioPlan(InvestingService investingService, FlowStarter flowStarter, Analytics analytics, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, ScenarioPlanInput scenarioPlanInput, Screen screen) {
        screen.getClass();
        this.appService = investingService;
        this.flowStarter = flowStarter;
        this.analytics = analytics;
        this.cashDatabase = cashAccountDatabaseImpl;
        this.ioDispatcher = coroutineContext;
        this.exitScreen = screen;
        if (!(scenarioPlanInput instanceof InitiateInvestmentOrderScenarioPlanInput)) {
            Path$$ExternalSyntheticBUOutline0.m$3(scenarioPlanInput, "Expected InitiateInvestmentOrderScenarioPlanInput, got ");
            throw null;
        }
        InitiateInvestmentOrderScenarioPlanInput initiateInvestmentOrderScenarioPlanInput = (InitiateInvestmentOrderScenarioPlanInput) scenarioPlanInput;
        this.request = initiateInvestmentOrderScenarioPlanInput.request;
        this.referrerFlowToken = initiateInvestmentOrderScenarioPlanInput.referrerFlowToken;
        this.colorModel = initiateInvestmentOrderScenarioPlanInput.colorModel;
    }

    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    public final BlockersData createBlockersData() {
        RealFlowStarter realFlowStarter = (RealFlowStarter) this.flowStarter;
        Screen screen = this.exitScreen;
        screen.getClass();
        return BlockersData.copy$default(FlowStarter.startFlow$default(realFlowStarter, BlockersData.Flow.PROFILE_BLOCKERS, screen, null, ClientScenario.EXCHANGE_EQUITY, null, null, null, null, null, 980), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, this.colorModel, null, null, null, null, false, null, null, null, -1, 65407);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r13 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object produceResponseContext(BlockersData blockersData, ContinuationImpl continuationImpl) {
        InitiateInvestmentOrderScenarioPlan$produceResponseContext$1 initiateInvestmentOrderScenarioPlan$produceResponseContext$1;
        int i;
        if (continuationImpl instanceof InitiateInvestmentOrderScenarioPlan$produceResponseContext$1) {
            initiateInvestmentOrderScenarioPlan$produceResponseContext$1 = (InitiateInvestmentOrderScenarioPlan$produceResponseContext$1) continuationImpl;
            int i2 = initiateInvestmentOrderScenarioPlan$produceResponseContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                initiateInvestmentOrderScenarioPlan$produceResponseContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = initiateInvestmentOrderScenarioPlan$produceResponseContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initiateInvestmentOrderScenarioPlan$produceResponseContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    initiateInvestmentOrderScenarioPlan$produceResponseContext$1.L$0 = blockersData;
                    initiateInvestmentOrderScenarioPlan$produceResponseContext$1.label = 1;
                    Object withContext = JobKt.withContext(this.ioDispatcher, new InitiateInvestmentOrderScenarioPlan$logOrderAnalytics$2(this.request, this, null), initiateInvestmentOrderScenarioPlan$produceResponseContext$1);
                    if (withContext != coroutineSingletons) {
                        withContext = Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ApiResult apiResult = (ApiResult) obj;
                        if (apiResult instanceof ApiResult.Success) {
                            ResponseContext responseContext = ((InitiateInvestmentOrderResponse) ((ApiResult.Success) apiResult).response).response_context;
                            return Matcher$$ExternalSyntheticOutline0.m(responseContext, responseContext);
                        }
                        if (apiResult instanceof ApiResult.Failure) {
                            return apiResult;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    blockersData = initiateInvestmentOrderScenarioPlan$produceResponseContext$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ClientScenario clientScenario = ClientScenario.EXCHANGE_EQUITY;
                String str = blockersData.flowToken;
                InitiateInvestmentOrderRequest copy$default = InitiateInvestmentOrderRequest.copy$default(this.request, blockersData.requestContext, null, null, null, 2046);
                initiateInvestmentOrderScenarioPlan$produceResponseContext$1.L$0 = null;
                initiateInvestmentOrderScenarioPlan$produceResponseContext$1.label = 2;
                obj = this.appService.initiateInvestmentOrder(clientScenario, str, copy$default, initiateInvestmentOrderScenarioPlan$produceResponseContext$1);
            }
        }
        initiateInvestmentOrderScenarioPlan$produceResponseContext$1 = new InitiateInvestmentOrderScenarioPlan$produceResponseContext$1(this, continuationImpl);
        Object obj2 = initiateInvestmentOrderScenarioPlan$produceResponseContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initiateInvestmentOrderScenarioPlan$produceResponseContext$1.label;
        if (i != 0) {
        }
        ClientScenario clientScenario2 = ClientScenario.EXCHANGE_EQUITY;
        String str2 = blockersData.flowToken;
        InitiateInvestmentOrderRequest copy$default2 = InitiateInvestmentOrderRequest.copy$default(this.request, blockersData.requestContext, null, null, null, 2046);
        initiateInvestmentOrderScenarioPlan$produceResponseContext$1.L$0 = null;
        initiateInvestmentOrderScenarioPlan$produceResponseContext$1.label = 2;
        obj2 = this.appService.initiateInvestmentOrder(clientScenario2, str2, copy$default2, initiateInvestmentOrderScenarioPlan$produceResponseContext$1);
    }
}
