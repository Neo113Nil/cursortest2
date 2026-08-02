package com.squareup.cash.crypto.scenarioplans.plans;

import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.cdf.crypto.CryptoInitiatePartnerActionStart;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.scenarioplans.models.ConfirmBitcoinDepositIntentScenarioPlanInput;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.cryptowallet.api.v2.ConfirmBitcoinDepositIntentRequest;
import com.squareup.cash.cryptowallet.api.v2.ConfirmBitcoinDepositIntentResponse;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ConfirmBitcoinDepositIntentScenarioPlan implements ScenarioPlan {
    public final Analytics analytics;
    public final CryptoService cryptoService;
    public final Screen exitScreen;
    public final FlowStarter flowStarter;
    public final CryptoInitiatePartnerActionStart.PartnerType partner;
    public final String token;

    public ConfirmBitcoinDepositIntentScenarioPlan(Screen screen, ScenarioPlanInput scenarioPlanInput, CryptoService cryptoService, FlowStarter flowStarter, Analytics analytics) {
        screen.getClass();
        this.cryptoService = cryptoService;
        this.flowStarter = flowStarter;
        this.analytics = analytics;
        this.exitScreen = screen;
        if (!(scenarioPlanInput instanceof ConfirmBitcoinDepositIntentScenarioPlanInput)) {
            Path$$ExternalSyntheticBUOutline0.m$3(Reflection.factory.getOrCreateKotlinClass(ConfirmBitcoinDepositIntentScenarioPlanInput.class), "Invalid input. Input is not of type ");
            throw null;
        }
        ConfirmBitcoinDepositIntentScenarioPlanInput confirmBitcoinDepositIntentScenarioPlanInput = (ConfirmBitcoinDepositIntentScenarioPlanInput) scenarioPlanInput;
        this.token = confirmBitcoinDepositIntentScenarioPlanInput.token;
        this.partner = Intrinsics.areEqual(confirmBitcoinDepositIntentScenarioPlanInput.partner, "bitkey") ? CryptoInitiatePartnerActionStart.PartnerType.BITKEY : CryptoInitiatePartnerActionStart.PartnerType.UNKNOWN;
    }

    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    public final BlockersData createBlockersData() {
        return FlowStarter.startFlow$default(this.flowStarter, BlockersData.Flow.CLIENT_SCENARIO, this.exitScreen, null, ClientScenario.PLASMA, null, null, null, null, new FlowStarter$$ExternalSyntheticLambda0(18), 500);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object produceResponseContext(BlockersData blockersData, ContinuationImpl continuationImpl) {
        ConfirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1 confirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof ConfirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1) {
            confirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1 = (ConfirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1) continuationImpl;
            int i2 = confirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                confirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = confirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = confirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CryptoInitiatePartnerActionStart.PartnerActionType partnerActionType = CryptoInitiatePartnerActionStart.PartnerActionType.SELL;
                    this.analytics.track(new CryptoInitiatePartnerActionStart(this.partner), null);
                    String str = blockersData.flowToken;
                    ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest = new ConfirmBitcoinDepositIntentRequest(blockersData.requestContext, this.token, ByteString.EMPTY);
                    confirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1.label = 1;
                    obj = this.cryptoService.confirmBitcoinDepositIntent(str, confirmBitcoinDepositIntentRequest, confirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1);
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
                    ResponseContext responseContext = ((ConfirmBitcoinDepositIntentResponse) ((ApiResult.Success) apiResult).response).response_context;
                    return Matcher$$ExternalSyntheticOutline0.m(responseContext, responseContext);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        confirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1 = new ConfirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1(this, continuationImpl);
        Object obj2 = confirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = confirmBitcoinDepositIntentScenarioPlan$produceResponseContext$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }
}
