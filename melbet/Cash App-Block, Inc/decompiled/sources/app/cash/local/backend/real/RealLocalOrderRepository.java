package app.cash.local.backend.real;

import app.cash.api.ApiResult;
import app.cash.local.service.LocalService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import com.squareup.protos.cash.local.client.v1.ConfirmArrivalRequest;
import com.squareup.protos.cash.local.client.v1.ConfirmArrivalResponse;
import com.squareup.protos.cash.local.client.v1.ConfirmArrivalResponse$Response$Success;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.protos.cash.local.client.v1.GetCartRequest;
import com.squareup.protos.cash.local.client.v1.GetOrderRequest;
import com.squareup.protos.cash.local.client.v1.GetOrderResponse;
import com.squareup.protos.cash.local.client.v1.GetOrderResponse$Response$Order;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class RealLocalOrderRepository {
    public List cachedActiveReorders = EmptyList.INSTANCE;
    public GetSuggestedReordersResponse.SuggestedReorders cachedSuggestedReorders;
    public final LocalService service;

    public RealLocalOrderRepository(LocalService localService) {
        this.service = localService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: confirmArrival-h2CDXeg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m1205confirmArrivalh2CDXeg(String str, ContinuationImpl continuationImpl) {
        RealLocalOrderRepository$confirmArrival$1 realLocalOrderRepository$confirmArrival$1;
        int i;
        ApiResult apiResult;
        ConfirmArrivalResponse.Success success;
        if (continuationImpl instanceof RealLocalOrderRepository$confirmArrival$1) {
            realLocalOrderRepository$confirmArrival$1 = (RealLocalOrderRepository$confirmArrival$1) continuationImpl;
            int i2 = realLocalOrderRepository$confirmArrival$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realLocalOrderRepository$confirmArrival$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realLocalOrderRepository$confirmArrival$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realLocalOrderRepository$confirmArrival$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ConfirmArrivalRequest confirmArrivalRequest = new ConfirmArrivalRequest(str, ByteString.EMPTY);
                    realLocalOrderRepository$confirmArrival$1.label = 1;
                    obj = this.service.confirmArrival(confirmArrivalRequest, realLocalOrderRepository$confirmArrival$1);
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
                    ByteArrayExtKt byteArrayExtKt = ((ConfirmArrivalResponse) ((ApiResult.Success) apiResult).response).response;
                    ConfirmArrivalResponse$Response$Success confirmArrivalResponse$Response$Success = byteArrayExtKt instanceof ConfirmArrivalResponse$Response$Success ? (ConfirmArrivalResponse$Response$Success) byteArrayExtKt : null;
                    if (confirmArrivalResponse$Response$Success == null || (success = confirmArrivalResponse$Response$Success.value) == null) {
                        return null;
                    }
                    return success.order;
                }
                if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                    Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "confirmArrival HttpFailure [", "]"), new Object[0]);
                    return null;
                }
                if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                    Timber.Forest.e("confirmArrival NetworkFailure", new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult).error);
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realLocalOrderRepository$confirmArrival$1 = new RealLocalOrderRepository$confirmArrival$1(this, continuationImpl);
        Object obj2 = realLocalOrderRepository$confirmArrival$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocalOrderRepository$confirmArrival$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable getCart(String str, ContinuationImpl continuationImpl) {
        RealLocalOrderRepository$getCart$1 realLocalOrderRepository$getCart$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealLocalOrderRepository$getCart$1) {
            realLocalOrderRepository$getCart$1 = (RealLocalOrderRepository$getCart$1) continuationImpl;
            int i2 = realLocalOrderRepository$getCart$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realLocalOrderRepository$getCart$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realLocalOrderRepository$getCart$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realLocalOrderRepository$getCart$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetCartRequest getCartRequest = new GetCartRequest(null, str, ByteString.EMPTY);
                    realLocalOrderRepository$getCart$1.label = 1;
                    obj = this.service.getCart(getCartRequest, realLocalOrderRepository$getCart$1);
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
                    return (CreateCartResponse) ((ApiResult.Success) apiResult).response;
                }
                if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                    Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "getCart HttpFailure [", "]"), new Object[0]);
                    return null;
                }
                if (!(apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Timber.Forest.e("getCart NetworkFailure", new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult).error);
                return null;
            }
        }
        realLocalOrderRepository$getCart$1 = new RealLocalOrderRepository$getCart$1(this, continuationImpl);
        Object obj2 = realLocalOrderRepository$getCart$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocalOrderRepository$getCart$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: getOrder-h2CDXeg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m1206getOrderh2CDXeg(String str, ContinuationImpl continuationImpl) {
        RealLocalOrderRepository$getOrder$1 realLocalOrderRepository$getOrder$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealLocalOrderRepository$getOrder$1) {
            realLocalOrderRepository$getOrder$1 = (RealLocalOrderRepository$getOrder$1) continuationImpl;
            int i2 = realLocalOrderRepository$getOrder$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realLocalOrderRepository$getOrder$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realLocalOrderRepository$getOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realLocalOrderRepository$getOrder$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetOrderRequest getOrderRequest = new GetOrderRequest(null, str, ByteString.EMPTY);
                    realLocalOrderRepository$getOrder$1.label = 1;
                    obj = this.service.getOrder(getOrderRequest, realLocalOrderRepository$getOrder$1);
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
                    SdkCoreExtKt sdkCoreExtKt = ((GetOrderResponse) ((ApiResult.Success) apiResult).response).response;
                    GetOrderResponse$Response$Order getOrderResponse$Response$Order = sdkCoreExtKt instanceof GetOrderResponse$Response$Order ? (GetOrderResponse$Response$Order) sdkCoreExtKt : null;
                    if (getOrderResponse$Response$Order != null) {
                        return getOrderResponse$Response$Order.value;
                    }
                    return null;
                }
                if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                    Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "HttpFailure [", "]"), new Object[0]);
                    return null;
                }
                if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                    Timber.Forest.e("NetworkFailure", new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult).error);
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realLocalOrderRepository$getOrder$1 = new RealLocalOrderRepository$getOrder$1(this, continuationImpl);
        Object obj2 = realLocalOrderRepository$getOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocalOrderRepository$getOrder$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }
}
