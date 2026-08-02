package com.squareup.cash.directdeposit.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.protos.cash.postbank.api.DdaAccountNumbers;
import com.squareup.protos.cash.postbank.api.GetCustomerPrimaryDdaDetailsRequest;
import com.squareup.protos.cash.postbank.api.GetCustomerPrimaryDdaDetailsResponse;
import com.squareup.protos.cash.postbank.api.PostbankAppService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealDdaManager {
    public final StateFlowImpl ddaAccountNumbers = FlowKt.MutableStateFlow(null);
    public final PostbankAppService postbankAppService;

    public RealDdaManager(PostbankAppService postbankAppService, SyncValueReader syncValueReader) {
        this.postbankAppService = postbankAppService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchDdaAccountDetails(ContinuationImpl continuationImpl) {
        RealDdaManager$fetchDdaAccountDetails$1 realDdaManager$fetchDdaAccountDetails$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealDdaManager$fetchDdaAccountDetails$1) {
            realDdaManager$fetchDdaAccountDetails$1 = (RealDdaManager$fetchDdaAccountDetails$1) continuationImpl;
            int i2 = realDdaManager$fetchDdaAccountDetails$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDdaManager$fetchDdaAccountDetails$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDdaManager$fetchDdaAccountDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDdaManager$fetchDdaAccountDetails$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetCustomerPrimaryDdaDetailsRequest getCustomerPrimaryDdaDetailsRequest = new GetCustomerPrimaryDdaDetailsRequest(null, ByteString.EMPTY);
                    realDdaManager$fetchDdaAccountDetails$1.label = 1;
                    obj = this.postbankAppService.getCustomerPrimaryDdaDetails(getCustomerPrimaryDdaDetailsRequest, realDdaManager$fetchDdaAccountDetails$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    DdaAccountNumbers ddaAccountNumbers = ((GetCustomerPrimaryDdaDetailsResponse) ((ApiResult.Success) apiResult).response).dda_account_numbers;
                    if (ddaAccountNumbers != null) {
                        String str = ddaAccountNumbers.account_number;
                        str.getClass();
                        String str2 = ddaAccountNumbers.routing_number;
                        str2.getClass();
                        Pair pair = new Pair(str, str2);
                        realDdaManager$fetchDdaAccountDetails$1.label = 2;
                        StateFlowImpl stateFlowImpl = this.ddaAccountNumbers;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, pair);
                    }
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            }
        }
        realDdaManager$fetchDdaAccountDetails$1 = new RealDdaManager$fetchDdaAccountDetails$1(this, continuationImpl);
        Object obj2 = realDdaManager$fetchDdaAccountDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDdaManager$fetchDdaAccountDetails$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }
}
