package com.squareup.cash.instruments.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.instruments.backend.api.InstrumentVerifier$Args;
import com.squareup.cash.instruments.backend.api.InstrumentVerifier$Result;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.VerifyInstrumentRequest;
import com.squareup.protos.franklin.app.VerifyInstrumentResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealInstrumentVerifier {
    public final AppService appService;

    public RealInstrumentVerifier(AppService appService) {
        this.appService = appService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object verify(InstrumentVerifier$Args instrumentVerifier$Args, ContinuationImpl continuationImpl) {
        RealInstrumentVerifier$verify$1 realInstrumentVerifier$verify$1;
        int i;
        ApiResult apiResult;
        InstrumentVerifier$Result.NotSuccessful.Status status;
        if (continuationImpl instanceof RealInstrumentVerifier$verify$1) {
            realInstrumentVerifier$verify$1 = (RealInstrumentVerifier$verify$1) continuationImpl;
            int i2 = realInstrumentVerifier$verify$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInstrumentVerifier$verify$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realInstrumentVerifier$verify$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInstrumentVerifier$verify$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    VerifyInstrumentRequest verifyInstrumentRequest = new VerifyInstrumentRequest(null, instrumentVerifier$Args.pan, instrumentVerifier$Args.routingNumber, instrumentVerifier$Args.accountNumber, ByteString.EMPTY);
                    ClientScenario clientScenario = instrumentVerifier$Args.clientScenario;
                    String str = instrumentVerifier$Args.flowToken;
                    realInstrumentVerifier$verify$1.label = 1;
                    obj = this.appService.verifyInstrument(clientScenario, str, verifyInstrumentRequest, realInstrumentVerifier$verify$1);
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
                if (!(apiResult instanceof ApiResult.Failure)) {
                    return new InstrumentVerifier$Result.NetworkFailure((ApiResult.Failure) apiResult);
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                VerifyInstrumentResponse verifyInstrumentResponse = (VerifyInstrumentResponse) ((ApiResult.Success) apiResult).response;
                VerifyInstrumentResponse.Status status2 = verifyInstrumentResponse.status;
                ResponseContext responseContext = verifyInstrumentResponse.response_context;
                if (status2 == VerifyInstrumentResponse.Status.SUCCESS) {
                    responseContext.getClass();
                    return new InstrumentVerifier$Result.Successful(responseContext);
                }
                int i3 = status2 == null ? -1 : RealInstrumentVerifierKt$WhenMappings.$EnumSwitchMapping$0[status2.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    OptionalProvider$$ExternalSyntheticLambda0.m((Object) status2, "Unsupported VerifyInstrumentResponse.Status ");
                    return null;
                }
                if (i3 == 2) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                if (i3 == 3) {
                    status = InstrumentVerifier$Result.NotSuccessful.Status.FAILURE;
                } else if (i3 == 4) {
                    status = InstrumentVerifier$Result.NotSuccessful.Status.TOO_MANY_ATTEMPTS;
                } else {
                    if (i3 != 5) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    status = InstrumentVerifier$Result.NotSuccessful.Status.CONCURRENT_MODIFICATION;
                }
                responseContext.getClass();
                return new InstrumentVerifier$Result.NotSuccessful(status, responseContext);
            }
        }
        realInstrumentVerifier$verify$1 = new RealInstrumentVerifier$verify$1(this, continuationImpl);
        Object obj2 = realInstrumentVerifier$verify$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInstrumentVerifier$verify$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }
}
