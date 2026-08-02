package com.squareup.cash.genericelements.backend;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.cashface.api.CashFaceClientService;
import com.squareup.protos.cash.cashface.api.GetGenericElementTreeRequest;
import com.squareup.protos.cash.cashface.api.GetGenericElementTreeResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealGenericTreeElementsRepo {
    public final CashFaceClientService appService;
    public final SingleUseInMemoryTreeElementsDataSource dataSource;

    public RealGenericTreeElementsRepo(CashFaceClientService cashFaceClientService, SingleUseInMemoryTreeElementsDataSource singleUseInMemoryTreeElementsDataSource) {
        this.appService = cashFaceClientService;
        this.dataSource = singleUseInMemoryTreeElementsDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getGenericElementTree(String str, String str2, ContinuationImpl continuationImpl) {
        RealGenericTreeElementsRepo$getGenericElementTree$1 realGenericTreeElementsRepo$getGenericElementTree$1;
        int i;
        Object obj;
        ConcurrentHashMap concurrentHashMap = this.dataSource.memCache;
        if (continuationImpl instanceof RealGenericTreeElementsRepo$getGenericElementTree$1) {
            realGenericTreeElementsRepo$getGenericElementTree$1 = (RealGenericTreeElementsRepo$getGenericElementTree$1) continuationImpl;
            int i2 = realGenericTreeElementsRepo$getGenericElementTree$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGenericTreeElementsRepo$getGenericElementTree$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realGenericTreeElementsRepo$getGenericElementTree$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGenericTreeElementsRepo$getGenericElementTree$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    str.getClass();
                    GenericTreeElementsData genericTreeElementsData = (GenericTreeElementsData) concurrentHashMap.get(str);
                    if (genericTreeElementsData != null) {
                        return new ApiResult.Success(genericTreeElementsData);
                    }
                    GetGenericElementTreeRequest getGenericElementTreeRequest = new GetGenericElementTreeRequest(str2, str, ByteString.EMPTY);
                    realGenericTreeElementsRepo$getGenericElementTree$1.L$0 = str;
                    realGenericTreeElementsRepo$getGenericElementTree$1.label = 1;
                    obj2 = this.appService.getGenericElementTree(getGenericElementTreeRequest, realGenericTreeElementsRepo$getGenericElementTree$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realGenericTreeElementsRepo$getGenericElementTree$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                obj = (ApiResult) obj2;
                if (!(obj instanceof ApiResult.Success)) {
                    GetGenericElementTreeResponse getGenericElementTreeResponse = (GetGenericElementTreeResponse) ((ApiResult.Success) obj).response;
                    obj = new ApiResult.Success(new GenericTreeElementsData(getGenericElementTreeResponse.elements, getGenericElementTreeResponse.view_event, getGenericElementTreeResponse.dismiss_event, getGenericElementTreeResponse.toolbar_title));
                } else if (!(obj instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (!(obj instanceof ApiResult.Success)) {
                    str.getClass();
                    GenericTreeElementsData genericTreeElementsData2 = (GenericTreeElementsData) concurrentHashMap.get(str.concat("_ERROR"));
                    if (genericTreeElementsData2 != null) {
                        return new ApiResult.Success(genericTreeElementsData2);
                    }
                }
                return obj;
            }
        }
        realGenericTreeElementsRepo$getGenericElementTree$1 = new RealGenericTreeElementsRepo$getGenericElementTree$1(this, continuationImpl);
        Object obj22 = realGenericTreeElementsRepo$getGenericElementTree$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGenericTreeElementsRepo$getGenericElementTree$1.label;
        if (i != 0) {
        }
        obj = (ApiResult) obj22;
        if (!(obj instanceof ApiResult.Success)) {
        }
        if (!(obj instanceof ApiResult.Success)) {
        }
        return obj;
    }
}
