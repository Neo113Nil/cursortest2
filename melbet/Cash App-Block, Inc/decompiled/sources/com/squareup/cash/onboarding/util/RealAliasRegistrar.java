package com.squareup.cash.onboarding.util;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersDataKt;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import com.squareup.cash.onboarding.util.AliasRegistrar$Result;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.RegisterEmailRequest;
import com.squareup.protos.franklin.app.RegisterEmailResponse;
import com.squareup.protos.franklin.app.RegisterSmsRequest;
import com.squareup.protos.franklin.app.RegisterSmsResponse;
import com.squareup.protos.franklin.common.DeviceLocationHeuristics;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SmsDeliveryMechanism;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealAliasRegistrar {
    public final AppService appService;
    public final DeviceLocationHeuristics deviceLocationHeuristics;

    public RealAliasRegistrar(AppService appService, DeviceLocationHeuristics deviceLocationHeuristics) {
        this.appService = appService;
        this.deviceLocationHeuristics = deviceLocationHeuristics;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x007e, code lost:
    
        if (r1 == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0102, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
    
        if (r1 == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object register(AliasRegistrar$Args aliasRegistrar$Args, ContinuationImpl continuationImpl) {
        RealAliasRegistrar$register$1 realAliasRegistrar$register$1;
        int i;
        if (continuationImpl instanceof RealAliasRegistrar$register$1) {
            realAliasRegistrar$register$1 = (RealAliasRegistrar$register$1) continuationImpl;
            int i2 = realAliasRegistrar$register$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAliasRegistrar$register$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAliasRegistrar$register$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAliasRegistrar$register$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        ApiResult apiResult = (ApiResult) obj;
                        if (apiResult instanceof ApiResult.Failure) {
                            return new AliasRegistrar$Result.NetworkFailure((ApiResult.Failure) apiResult);
                        }
                        if (!(apiResult instanceof ApiResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        RegisterSmsResponse registerSmsResponse = (RegisterSmsResponse) ((ApiResult.Success) apiResult).response;
                        RegisterSmsResponse.Status status = registerSmsResponse.status;
                        ResponseContext responseContext = registerSmsResponse.response_context;
                        return status == RegisterSmsResponse.Status.SUCCESS ? new AliasRegistrar$Result.Successful(responseContext) : new AliasRegistrar$Result.NotSuccessful(BlockersDataKt.access$toStatus(status), responseContext);
                    }
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    ApiResult apiResult2 = (ApiResult) obj;
                    if (apiResult2 instanceof ApiResult.Failure) {
                        return new AliasRegistrar$Result.NetworkFailure((ApiResult.Failure) apiResult2);
                    }
                    if (!(apiResult2 instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RegisterEmailResponse registerEmailResponse = (RegisterEmailResponse) ((ApiResult.Success) apiResult2).response;
                    RegisterEmailResponse.Status status2 = registerEmailResponse.status;
                    ResponseContext responseContext2 = registerEmailResponse.response_context;
                    return status2 == RegisterEmailResponse.Status.SUCCESS ? new AliasRegistrar$Result.Successful(responseContext2) : new AliasRegistrar$Result.NotSuccessful(BlockersDataKt.access$toStatus(status2), responseContext2);
                }
                SafeTrace.throwOnFailure(obj);
                int ordinal = aliasRegistrar$Args.getDeliveryMechanism().ordinal();
                DeviceLocationHeuristics deviceLocationHeuristics = this.deviceLocationHeuristics;
                AppService appService = this.appService;
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        ClientScenario clientScenario = aliasRegistrar$Args.getClientScenario();
                        String flowToken = aliasRegistrar$Args.getFlowToken();
                        RegisterEmailRequest registerEmailRequest = new RegisterEmailRequest(aliasRegistrar$Args.getRequestContext(), aliasRegistrar$Args.getAlias(), null, aliasRegistrar$Args.getRequestContext().payment_tokens, null, null, deviceLocationHeuristics, aliasRegistrar$Args.getAccountToken(), ByteString.EMPTY);
                        realAliasRegistrar$register$1.label = 2;
                        obj = appService.registerEmail(clientScenario, flowToken, registerEmailRequest, realAliasRegistrar$register$1);
                    } else if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                ClientScenario clientScenario2 = aliasRegistrar$Args.getClientScenario();
                String flowToken2 = aliasRegistrar$Args.getFlowToken();
                String alias = aliasRegistrar$Args.getAlias();
                boolean prefilledFromPhone = aliasRegistrar$Args.getPrefilledFromPhone();
                SmsDeliveryMechanism smsDeliveryMechanism = aliasRegistrar$Args.getDeliveryMechanism() == AliasRegistrar$Args.DeliveryMechanism.SMS ? SmsDeliveryMechanism.SMS_TEXT : SmsDeliveryMechanism.VOICE;
                RegisterSmsRequest registerSmsRequest = new RegisterSmsRequest(aliasRegistrar$Args.getRequestContext(), alias, smsDeliveryMechanism, null, Boolean.valueOf(prefilledFromPhone), aliasRegistrar$Args.getRequestContext().payment_tokens, null, deviceLocationHeuristics, null, aliasRegistrar$Args.getAccountToken(), null, null, null, ByteString.EMPTY);
                realAliasRegistrar$register$1.label = 1;
                obj = appService.registerSms(clientScenario2, flowToken2, registerSmsRequest, realAliasRegistrar$register$1);
            }
        }
        realAliasRegistrar$register$1 = new RealAliasRegistrar$register$1(this, continuationImpl);
        Object obj2 = realAliasRegistrar$register$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAliasRegistrar$register$1.label;
        if (i == 0) {
        }
    }
}
