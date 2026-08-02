package com.squareup.cash.crypto.scenarioplans.plans;

import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.crypto.scenarioplans.models.InitiateStablecoinWithdrawalScenarioPlanInput;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.protos.cash.blockstable.api.v1.BlockStableService;
import com.squareup.protos.cash.blockstable.api.v1.InitiateWithdrawalRequest;
import com.squareup.protos.cash.blockstable.api.v1.InitiateWithdrawalResponse;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InitiateStablecoinWithdrawalScenarioPlan implements ScenarioPlan {
    public final Money amount;
    public final BlockStableService blockStableService;
    public final String destinationAddress;
    public final Screen exitScreen;
    public final FlowStarter flowStarter;
    public final String flowToken;
    public final InstrumentSelectionData instrumentSelectionData;
    public final String paymentId;
    public final StablecoinWithdrawalOption withdrawalOption;

    public InitiateStablecoinWithdrawalScenarioPlan(BlockStableService blockStableService, FlowStarter flowStarter, RealUuidGenerator realUuidGenerator, ScenarioPlanInput scenarioPlanInput, Screen screen) {
        String str;
        StablecoinNetwork stablecoinNetwork;
        screen.getClass();
        this.blockStableService = blockStableService;
        this.flowStarter = flowStarter;
        this.exitScreen = screen;
        Money money = null;
        if (!(scenarioPlanInput instanceof InitiateStablecoinWithdrawalScenarioPlanInput)) {
            Path$$ExternalSyntheticBUOutline0.m$3(Reflection.factory.getOrCreateKotlinClass(InitiateStablecoinWithdrawalScenarioPlanInput.class), "Invalid input. Input is not of type ");
            throw null;
        }
        InitiateStablecoinWithdrawalScenarioPlanInput initiateStablecoinWithdrawalScenarioPlanInput = (InitiateStablecoinWithdrawalScenarioPlanInput) scenarioPlanInput;
        StablecoinWithdrawalOption stablecoinWithdrawalOption = initiateStablecoinWithdrawalScenarioPlanInput.withdrawalOption;
        this.withdrawalOption = stablecoinWithdrawalOption;
        if (stablecoinWithdrawalOption == null || (stablecoinNetwork = stablecoinWithdrawalOption.network) == null || (str = stablecoinNetwork.address) == null) {
            SolanaAddress solanaAddress = initiateStablecoinWithdrawalScenarioPlanInput.address;
            if (solanaAddress == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Either withdrawalOption or address must be provided");
                throw null;
            }
            str = solanaAddress.address;
        }
        this.destinationAddress = StringsKt.trim(str).toString();
        Money money2 = initiateStablecoinWithdrawalScenarioPlanInput.amount;
        if (money2 != null) {
            money = money2;
        } else if (stablecoinWithdrawalOption != null) {
            money = stablecoinWithdrawalOption.amount;
        }
        this.amount = money;
        String str2 = initiateStablecoinWithdrawalScenarioPlanInput.paymentId;
        this.paymentId = str2 == null ? re$$ExternalSyntheticOutline0.m() : str2;
        String str3 = initiateStablecoinWithdrawalScenarioPlanInput.flowToken;
        if (str3 == null) {
            BlockersData.Flow.INSTANCE.getClass();
            str3 = BlockersData.Flow.Companion.generateToken();
        }
        this.flowToken = str3;
        this.instrumentSelectionData = initiateStablecoinWithdrawalScenarioPlanInput.instrumentSelectionData;
    }

    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    public final BlockersData createBlockersData() {
        return FlowStarter.startFlow$default(this.flowStarter, BlockersData.Flow.CLIENT_SCENARIO, this.exitScreen, null, ClientScenario.PLASMA, this.flowToken, null, null, null, new FlowStarter$$ExternalSyntheticLambda0(22), 468);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object produceResponseContext(BlockersData blockersData, ContinuationImpl continuationImpl) {
        InitiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1 initiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1;
        int i;
        StablecoinNetwork stablecoinNetwork;
        StablecoinNetwork stablecoinNetwork2;
        ApiResult apiResult;
        if (continuationImpl instanceof InitiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1) {
            initiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1 = (InitiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1) continuationImpl;
            int i2 = initiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                initiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = initiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = blockersData.flowToken;
                    RequestContext requestContext = blockersData.requestContext;
                    StablecoinWithdrawalOption stablecoinWithdrawalOption = this.withdrawalOption;
                    String str2 = (stablecoinWithdrawalOption == null || (stablecoinNetwork2 = stablecoinWithdrawalOption.network) == null) ? null : stablecoinNetwork2.chain;
                    String str3 = (stablecoinWithdrawalOption == null || (stablecoinNetwork = stablecoinWithdrawalOption.network) == null) ? null : stablecoinNetwork.asset;
                    InstrumentSelectionData instrumentSelectionData = this.instrumentSelectionData;
                    InitiateWithdrawalRequest initiateWithdrawalRequest = new InitiateWithdrawalRequest(this.paymentId, requestContext, this.destinationAddress, this.amount, str2, str3, instrumentSelectionData != null ? instrumentSelectionData.token : null, null, ByteString.EMPTY);
                    initiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1.label = 1;
                    obj = this.blockStableService.initiateWithdrawal(str, initiateWithdrawalRequest, initiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1);
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
                if (!(apiResult instanceof ApiResult.Success)) {
                    ResponseContext responseContext = ((InitiateWithdrawalResponse) ((ApiResult.Success) apiResult).response).response_context;
                    return Matcher$$ExternalSyntheticOutline0.m(responseContext, responseContext);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        initiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1 = new InitiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1(this, continuationImpl);
        Object obj2 = initiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initiateStablecoinWithdrawalScenarioPlan$produceResponseContext$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }
}
